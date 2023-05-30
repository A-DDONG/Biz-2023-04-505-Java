package com.callor.shop.service.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.callor.shop.config.DBConnection;
import com.callor.shop.config.DBContract;
import com.callor.shop.models.ProductDto;
import com.callor.shop.service.ProductService;

public class ProductServiceImplV1 implements ProductService {
	
	protected final Connection dbConn;
	
	public ProductServiceImplV1() {
		dbConn = DBConnection.getDBConn();
	}
	
	protected ProductDto result2Dto(ResultSet result) {
		ProductDto productDto = new ProductDto();
		try {
			productDto.pCode = result.getString(DBContract.PRODUCT.PCODE);
			productDto.pName = result.getString(DBContract.PRODUCT.PNAME);
			productDto.pItem = result.getString(DBContract.PRODUCT.PITEM);
			productDto.pIPrice = result.getInt(DBContract.PRODUCT.PIPRICE);
			productDto.pOPrice = result.getInt(DBContract.PRODUCT.POPRICE);
			return productDto;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<ProductDto> selectAll() {
		List<ProductDto> productList = new ArrayList<>();
		String sql = " SELECT pCode, pName, pItem, pIPrice, pOPrice "
				+ " FROM tbl_product "
				+ " ORDER BY pCode " ;
		try {
			PreparedStatement pStr = dbConn.prepareStatement(sql);
			ResultSet result = pStr.executeQuery();
			
			while(result.next()) {
				ProductDto productDto = result2Dto(result);
				productList.add(productDto);
			}
			return productList;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public ProductDto findById(String pCode) {
		String sql = " SELECT pCode, pName, pItem, pIPrice, pOPrice "
				+ " FROM tbl_product "
				+ " WHERE pCode = ? ";
		try {
			PreparedStatement pStr = dbConn.prepareStatement(sql);
			pStr.setString(1, pCode);
			ResultSet result = pStr.executeQuery();
			if(result.next()) {
				return result2Dto(result);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public int insert(ProductDto dto) {
		String sql = " INSERT INTO tbl_product(pCode, pName, pItem, pIPrice, pOPrice) "
				+ " VALUES(?,?,?,?,?) ";
		try {
			PreparedStatement pStr = dbConn.prepareStatement(sql);
			pStr.setString(1, dto.pCode);
			pStr.setString(2, dto.pName);
			pStr.setString(3, dto.pItem);
			pStr.setInt(4, dto.pIPrice);
			pStr.setInt(5, dto.pOPrice);
			int result = pStr.executeUpdate();
			return result;
		} catch (SQLException e) {
			e.printStackTrace();
		}
				
		return 0;
	}

	@Override
	public int update(ProductDto dto) {
		String sql = " UPDATE tbl_product "
				+ " SET pName = ? ,"
				+ " pItem = ? ,"
				+ " pIPrice = ? ,"
				+ " pOPrice = ? "
				+ " WHERE pCode = ? ";
		try {
			PreparedStatement pStr = dbConn.prepareStatement(sql);
			pStr.setString(1, dto.pName);
			pStr.setString(2, dto.pItem);
			pStr.setInt(3, dto.pIPrice);
			pStr.setInt(4, dto.pOPrice);
			pStr.setString(5, dto.pCode);
			return pStr.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return 0;
		
	}

}
