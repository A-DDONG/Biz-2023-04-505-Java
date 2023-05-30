package com.callor.shop.service.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.callor.shop.config.DBConnection;
import com.callor.shop.config.DBContract;
import com.callor.shop.models.IoListDto;
import com.callor.shop.service.IoListService;

public class IoListServiceImplV1 implements IoListService{
	
	protected Connection dbConn;
	
	public IoListServiceImplV1() {
		dbConn = DBConnection.getDBConn();
	}
	
	protected IoListDto result2Dto(ResultSet result) {
		IoListDto ioListDto = new IoListDto();
		try {
			ioListDto.ioSEQ = result.getInt(DBContract.IOLIST.IOSEQ);
			ioListDto.ioDate = result.getString(DBContract.IOLIST.IODATE);
			ioListDto.ioTime = result.getString(DBContract.IOLIST.IOTIME);
			ioListDto.ioBuid = result.getString(DBContract.IOLIST.IOBUID);
			ioListDto.ioPCode = result.getString(DBContract.IOLIST.IOPCODE);
			ioListDto.ioQuan = result.getInt(DBContract.IOLIST.IOQUAN);
			ioListDto.ioPrice = result.getInt(DBContract.IOLIST.IOPRICE);
			return ioListDto;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	public List<IoListDto> io2List(PreparedStatement pStr) throws SQLException {
		ResultSet result = pStr.executeQuery();
		List<IoListDto> ioList = new ArrayList<>();
		while (result.next()) {
			IoListDto ioListDto = result2Dto(result);
			ioList.add(ioListDto);
		}
		pStr.close();
		result.close();
		return ioList;
	}
	
	@Override
	public List<IoListDto> selectAll() {
//		List<IoListDto> ioList = new ArrayList<>();
		String sql = " SELECT ioseq, iodate, iotime, iobuid, iopcode, ioquan, ioprice "
				+ " FROM tbl_iolist "
				+ " ORDER BY ioseq ";
		try {
			PreparedStatement pStr = dbConn.prepareStatement(sql);
			List<IoListDto> ioList = io2List(pStr);
//			while(result.next()) {
//				IoListDto ioListDto = result2Dto(result);
//				ioList.add(ioListDto);
//			}
			return ioList;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public List<IoListDto> findByDate(String date) {
		String sql = " SELECT * FROM tbl_buyer "
				+ " WHERE ioDate BETWEEN "
				+ " '2023-05-01' AND '2023-05-31' ";
		
		PreparedStatement pStr;
		
		try {
			pStr = dbConn.prepareStatement(sql);
			pStr.setString(1, date);
			List<IoListDto> ioList = io2List(pStr);
			return ioList;
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}

	@Override
	public List<IoListDto> findByBuyer(String buId) {
		
		String sql = " SELECT * FROM tbl_buyer "
				+ " WHERE buName "
				+ " LIKE '%' || '홍길동' || '%' ";
		PreparedStatement pStr;
		
		try {
			pStr = dbConn.prepareStatement(sql);
			pStr.setString(1, buId);
			List<IoListDto> ioList = io2List(pStr);
			return ioList;
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}

	@Override
	public List<IoListDto> findByProduct(String pName) {
		String sql = " SELECT * FROM tbl_buyer "
				+ " WHERE pName "
				+ " LIKE '%' || '크래커' || '%' ";
		PreparedStatement pStr;
		
		try {
			pStr = dbConn.prepareStatement(sql);
			pStr.setString(1, pName);
			List<IoListDto> ioList = io2List(pStr);
			return ioList;
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}

	@Override
	public List<IoListDto> findByBuyerAndDate(String buyer, String date) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insert(IoListDto dto) {
		String sql = " INSERT INTO tbl_iolist "
				+ " (ioSEQ, iodate, iotime, iobuid, iopcode, ioquan, ioprice) "
				+ " VALUES(seq_iolist.nextVAL, "
				+ "?," // 거래일자
				+ "?," // 거래시각
				+ "?," // 고객ID
				+ "?," // 상품코드
				+ "?," // 수량
				+ "? ) "; // 판매단가
		try {
			PreparedStatement pStr = dbConn.prepareStatement(sql);
			pStr.setString(1, dto.ioDate);
			pStr.setString(2, dto.ioTime);
			pStr.setString(3, dto.ioBuid);
			pStr.setString(4, dto.ioPCode);
			pStr.setInt(5, dto.ioQuan);
			pStr.setInt(6, dto.ioPrice);
			return pStr.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		return 0;
	}

	@Override
	public int update(IoListDto dto) {
		// TODO Auto-generated method stub
		return 0;
	}

}
