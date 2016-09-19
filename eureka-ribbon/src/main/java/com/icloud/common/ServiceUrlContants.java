package com.icloud.common;

/**
 * 服务接口地址
 * @author luoqw
 *2016年9月18日 上午9:46:40
 */
public class ServiceUrlContants { 
	
	public static final String server_domain = "http://MERCHANT-SERVICE";
	
	public static final String token_server_domain = "http:tokenservername.com/";
	
	public static final String userInfo_get = token_server_domain+"/Token/userInfo";//获取token地址

	
	/**公众号请求接口**/
	public static final String mct_mp_add = server_domain+"/mp/add";//添加公众号地址
	
	public static final String mct_mp_list = server_domain+"/mp/list";//获取公众号列表
	
	public static final String mct_mp_list_forMerchant = server_domain+"/mp/list/forMerchant";//根据商户号获取公众号列表
	
	public static final String mct_mp_update = server_domain+"/mp/update";// 更新
	 
	public static final String mct_mp_query = server_domain+"/mp/query";//通过ID获取公众号详情接口
	
	public static final String mct_mp_merchants_del = server_domain+"/mp_merchants/del";// 

	
	/**商户账户请求接口**/
	public static final String mct_account_add = server_domain+"/accout/add"; //添加商户账户
	
	public static final String mct_account_update = server_domain+"/accout/update"; //修改商户账户

	public static final String mct_account_list = server_domain+"/accout/list"; //获取商户账户

	public static final String mct_account_query  = server_domain+"/accout/query"; //获取商户账户
	 
	
	/**商户消息请求接口**/
	public static final String mct_message_add = server_domain+"/message/add"; //添加商户消息列表
	
	public static final String mct_message_update = server_domain+"/message/update"; //更新商户消息列表
	
	public static final String mct_message_list = server_domain+"/message/list"; //获取商户消息列表
	
	public static final String mct_message_query = server_domain+"/message/query"; //获取单个商户消息详情
	
	
	
	/**商户门店 请求接口**/
	public static final String mct_supplier_add = server_domain+"/supplier/add"; //添加商户账户
	
	public static final String mct_supplier_update = server_domain+"/supplier/update"; //更新商户账户
	
	public static final String mct_supplier_query = server_domain+"/supplier/query"; //查询商户账户
	
	public static final String mct_supplier_list = server_domain+"/supplier/list"; //商户账户列表
	
	public static final String mct_supplier_list_forAccount = server_domain+"/supplier/list/forAccount"; //根据账户查询商户账户列表
	
	
	/**商户账户_商户门店 请求接口**/
	public static final String mct_accountMerchants_add = server_domain+"/accountMerchants/add"; //添加商户账户_商户门店
	
	public static final String mct_accountMerchants_del = server_domain+"/accountMerchants/del"; //删除商户账户_商户门店
}
