package com.icloud.service.impl;

import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.icloud.common.ServiceUrlContants;
import com.icloud.dto.BaseDto;
import com.icloud.dto.AccountCheckDto;
import com.icloud.dto.AccountDetailDto;
import com.icloud.dto.AccountQueryDto;
import com.icloud.service.MerchantsAccountService;


@Service
public class MerchantsAccountServiceImpl extends BaseServiceImple implements MerchantsAccountService{

	@Override
	public BaseDto add(String data) {
		BaseDto dto = doPost(ServiceUrlContants.mct_account_add, data,BaseDto.class);
		return dto;
	}
	
	
	@Override
	public BaseDto update(String data) {
		JSONObject obj = JSONObject.parseObject(data);
		Integer id = obj.getInteger("id");
		if (id == null) {
			return new BaseDto("success", "10001","id不能为空");
		}
		BaseDto dto = doPost(ServiceUrlContants.mct_account_add, data,BaseDto.class);
		return dto;
	}

	
	@Override
	public AccountQueryDto list(String data) {
		AccountQueryDto dto = doPost(ServiceUrlContants.mct_account_list, data,AccountQueryDto.class);
		return dto;
	}
	
	@Override
	public AccountCheckDto has(String account) {
		AccountCheckDto dto = doGet(ServiceUrlContants.mct_account_list+"?accoount="+account,
				AccountCheckDto.class);
		return dto;
	}
	
	@Override
	public AccountDetailDto get(Integer id) {
		AccountDetailDto dto = doGet(ServiceUrlContants.mct_account_query+"?id="+id,
				AccountDetailDto.class);
		return dto;
	}




}