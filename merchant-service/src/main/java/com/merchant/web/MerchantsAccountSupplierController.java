package com.merchant.web;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.alibaba.fastjson.JSONObject;
import com.merchant.dto.BaseAddDto;
import com.merchant.dto.BaseDto;
import com.merchant.dto.ResultMessage;
import com.merchant.model.MerchantsAccountSupplier;
import com.merchant.service.MerchantsAccountSupplierService;
import com.merchant.util.RequestUtil;

@RestController
public class MerchantsAccountSupplierController {

	private final Logger logger = Logger.getLogger(getClass());


	@Autowired
	private MerchantsAccountSupplierService accountMerchantsService;

	@RequestMapping(value = "/accountMerchants/add")
	public Object add(HttpServletRequest request){
		String jsonText = RequestUtil.readPostContent(request);  
		MerchantsAccountSupplier data = JSONObject.parseObject(jsonText, MerchantsAccountSupplier.class);
		
		if( data==null || data.getAccountId()==null || data.getMerchants()==null){
			return new BaseDto("success","10001","参数不全");
		}else{
			ResultMessage result = accountMerchantsService.add(data);
			if (result.isSuccess()) {
				Integer id = (Integer) result.getData();
				return new BaseAddDto("success", "10000",id);
			}
		}
		
		return new BaseAddDto("success","90001");
	}
	
	 
	
	@RequestMapping(value = "/accountMerchants/del")
	public Object del(String merchantsId,String accountId) {
		if (StringUtils.isBlank(merchantsId) && StringUtils.isBlank(accountId)) {
			return new BaseDto("success","10001","参数不全");
		}   
		ResultMessage result = accountMerchantsService.delete(accountId,merchantsId);
		if (result.isSuccess()) {
			Integer id = (Integer) result.getData();
			return new BaseDto("success", "10000");
		}
		return new BaseDto("success", "90001");

	}
	 
	

}