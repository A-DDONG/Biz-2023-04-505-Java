package com.callor.shop.service.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.callor.shop.config.DBConnection;
import com.callor.shop.config.DBContract;
import com.callor.shop.models.BuyerDto;
import com.callor.shop.service.BuyerService;

public class BuyerServiceImplV1 implements BuyerService{
	
	protected final Connection dbConn;

	public BuyerServiceImplV1() {
		dbConn = DBConnection.getDBConn();
	}
	
	protected BuyerDto result2Dto(ResultSet result) {
		BuyerDto buyerDto = new BuyerDto();
		try {
			buyerDto.buId = result.getString(DBContract.BUYER.BUID);
			buyerDto.buName = result.getString(DBContract.BUYER.BUNAME);
			buyerDto.buTel = result.getString(DBContract.BUYER.BUTEL);
			buyerDto.buAddr = result.getString(DBContract.BUYER.BUADDR);
			return buyerDto;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	@Override
	public List<BuyerDto> selectAll() {
		List<BuyerDto> buyerList = new ArrayList<>();
		String sql = " SELECT buid, buname, butel, buaddr "
				+ " FROM tbl_buyer "
				+ " ORDER BY buname ";
		try {
			PreparedStatement pStr = dbConn.prepareStatement(sql);
			ResultSet result = pStr.executeQuery();
			
			while(result.next()) {
				BuyerDto buyerDto = result2Dto(result);
				buyerList.add(buyerDto);
			}
			return buyerList;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public BuyerDto findById(String buId) {
		String sql = " SELECT buid, buname, butel, buaddr "
				+ " FROM tbl_buyer "
				+ " WHERE buid = ? ";
		try {
			PreparedStatement pStr = dbConn.prepareStatement(sql);
			pStr.setString(1, buId);
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
	public int insert(BuyerDto dto) {
		String sql = " INSERT INTO tbl_buyer(buid, buname, butel, buaddr) "
				+ " VALUES(?,?,?,?) ";
		
		try {
			PreparedStatement pStr = dbConn.prepareStatement(sql);
			pStr.setString(1, dto.buId);
			pStr.setString(2, dto.buName);
			pStr.setString(3, dto.buTel);
			pStr.setString(4, dto.buAddr);
			
			int result = pStr.executeUpdate();
			return result;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return 0;
	}

	@Override
	public int update(BuyerDto dto) {
		String sql = " UPDATE tbl_buyer "
				+ " SET buname = ? ,"
				+ " butel = ? ,"
				+ " buaddr = ? ,"
				+ " WHERE buid = ?";
		
		try {
			PreparedStatement pStr = dbConn.prepareStatement(sql);
			pStr.setString(1, dto.buName);
			pStr.setString(2, dto.buTel);
			pStr.setString(3, dto.buAddr);
			pStr.setString(4, dto.buId);
			return pStr.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return 0;
	}

}
