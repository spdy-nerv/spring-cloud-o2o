package com.icloud.service;

import com.icloud.dto.BaseDto;
import com.icloud.dto.AccountCheckDto;
import com.icloud.dto.AccountDetailDto;
import com.icloud.dto.AccountQueryDto;

/**
 * 
 * @author luoqw
 *
 */
public interface MerchantsAccountService {

	public BaseDto  add(String data);

	public BaseDto update(String data);
	
	public AccountQueryDto list(String data);
	
	public AccountCheckDto has(String account);
	
	public AccountDetailDto get(Integer id);
}
