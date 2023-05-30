package com.callor.shop.service;

import java.util.List;

import com.callor.shop.models.BuyerDto;


public interface BuyerService {
	
	public List<BuyerDto> selectAll();
	
	public BuyerDto findById(String buId);
	
	public int insert(BuyerDto dto);
	
	public int update(BuyerDto dto);
}
