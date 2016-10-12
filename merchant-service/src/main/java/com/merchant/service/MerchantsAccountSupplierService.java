package com.merchant.service;

import com.merchant.dto.ResultMessage;
import com.merchant.model.MerchantsAccountSupplier;



public interface MerchantsAccountSupplierService {

	ResultMessage add(MerchantsAccountSupplier data);


	ResultMessage delete(String accountId, String merchantsId);
 
	 
	
}
