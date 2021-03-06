package com.icloud.service;

import com.icloud.common.ServiceUrlContants;
import com.icloud.dto.BaseDto;
import com.icloud.dto.MessageQueryDto;

/**
 * 
 * @author luoqw
 *2016年9月14日 上午9:12:34
 */
public interface MerchantsMessageService {


	public MessageQueryDto list(String data);
	
	public BaseDto add(String jsonParams);
	
	public BaseDto markRead(Integer messageId);

}
