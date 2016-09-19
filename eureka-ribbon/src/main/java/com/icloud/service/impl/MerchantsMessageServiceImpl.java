package com.icloud.service.impl;

import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.icloud.common.ServiceUrlContants;
import com.icloud.dto.BaseDto;
import com.icloud.dto.MessageDetailDto;
import com.icloud.dto.MessageQueryDto;
import com.icloud.model.MerchantsMessage;
import com.icloud.service.MerchantsMessageService;


@Service
public class MerchantsMessageServiceImpl extends BaseServiceImple implements MerchantsMessageService{

	@Override
	public MessageQueryDto list(String data) {
		MessageQueryDto dto = doPost(ServiceUrlContants.mct_message_list, data,MessageQueryDto.class);
		return dto;
	}
	@Override
	public BaseDto add(String jsonParams) {
		BaseDto addDto = doPost(ServiceUrlContants.mct_message_add, jsonParams,BaseDto.class);
		return addDto;
	}
	@Override
	public BaseDto markRead(Integer messageId) {
		BaseDto baseDto = null;
		String rType = "";
		String rCode = "";  

		MessageDetailDto detailDto = doGet(ServiceUrlContants.mct_message_query+"?id="+messageId,
				MessageDetailDto.class);//查询
		rType = detailDto.getResultType();
		rCode = detailDto.getResultCode();  
		if ("success".endsWith(rType) && "10000".endsWith(rCode) ) { 
			MerchantsMessage message = detailDto.getMessage();
			if (message != null) {
				message.setReadState("1");//标记已读
				JSONObject jsonObj = (JSONObject) JSONObject.toJSON(message);
				baseDto = doPost(ServiceUrlContants.mct_message_update, jsonObj,BaseDto.class);//更新
			}else{
				baseDto = new BaseDto(rType, rCode,detailDto.getErrorMsg());
			}
		}else{
			baseDto = new BaseDto(rType, rCode,detailDto.getErrorMsg());
		}
		return baseDto;
	}



}