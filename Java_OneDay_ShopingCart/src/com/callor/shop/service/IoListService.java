package com.callor.shop.service;

import java.util.List;

import com.callor.shop.models.BuyerDto;
import com.callor.shop.models.IoListDto;

public interface IoListService {
	
	public List<IoListDto> selectAll();
	
	public List<IoListDto> findByDate(String date);
	
	public List<IoListDto> findByBuyer(String buId);
	
	public List<IoListDto> findByProduct(String pName);
	
	public List<IoListDto> findByBuyerAndDate(String buyer, String date);
	
	public int insert(IoListDto dto);
	
	public int update(IoListDto dto);



}
