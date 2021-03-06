package com.merchant;

import java.util.HashMap;
import java.util.Map;

import org.codehaus.jettison.json.JSONException;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.TestRestTemplate;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.context.WebApplicationContext;

import com.alibaba.fastjson.JSONObject;

//import com.merchant.dao.MerchantsSupplierMapper;

/**
 * 测试应用
 * 
 * @author luoqw 2016-9-8下午1:13:03
 */
//@RunWith(SpringJUnit4ClassRunner.class)
//@SpringApplicationConfiguration(classes = MerchantServiceApplication.class)
//@WebIntegrationTest("server.port:0")
public class AccountTest {/*

//	@Value("${local.server.port}")
	private int port = 3101;

//	@Autowired
	private RestTemplate restTemplate = new TestRestTemplate();

//	public String serverhost = "http://localhost:" + port;
	public String serverhost = "http://localhost:4004/api-ribbon/";

	@Test
	public void add() throws JSONException {
		String url = "http://localhost:" + port + "/account/add";
		// restTemplate post map参数传输
		JSONObject form = new JSONObject();
		form.put("account", "admin_0080002");
		form.put("password", "1267d#%^&&*008");
		form.put("useStatus", "1");
		form.put("allowCount", "3");
		form.put("passKeyword", "888_8");
		form.put("accountType", "1");

		String result = restTemplate.postForObject(url, form.toString(), String.class);
		System.out.println("	>>  add result= " + result);
	}

	@Test
	public void update() throws JSONException {
		String url = "http://localhost:" + port + "/account/update";
		JSONObject form = new JSONObject();
		form.put("id", "3");
		form.put("account", "admin_5005");
		form.put("account", "admin_5005");
		form.put("password", "1267d#%^5005");
		form.put("useStatus", "5");
		form.put("allowCount", "5");
		form.put("passKeyword", "888_5005");
		form.put("accountType", "5");

		String result = restTemplate.postForObject(url, form, String.class);
		System.out.println("	>>  update result= " + result);
	}

	
	@Test
	public void get() throws JSONException {
		String url = "http://localhost:" + port + "/account/query?id="+1;
		 
		String result = restTemplate.getForObject(url,  String.class);
		System.out.println("	>>  get result= " + result);
	}
	
	@Test
	public void has() throws JSONException {
		String url = "http://localhost:" + port + "/account/has?account=admin_5005";
		String result = restTemplate.getForObject(url,  String.class);
		System.out.println("	>>  has result= " + result);
	}

	@Test
	public void list() throws JSONException {
		String url = "http://localhost:" + port + "/account/list";
		String result = "";

		// restTemplate post 写入流的方式
		HttpHeaders headers = new HttpHeaders();
		MediaType type = MediaType.parseMediaType("application/json; charset=UTF-8");
		headers.setContentType(type);
		headers.add("Accept", MediaType.APPLICATION_JSON.toString());

		JSONObject form = new JSONObject();
		JSONObject queryConditions = new JSONObject();
		form.put("offset", "0");
		form.put("pageSize", "2");
		queryConditions.put("account", "1");
		// queryConditions.put("accountType", "0");
		form.put("queryConditions", queryConditions);

		HttpEntity<String> formEntity = new HttpEntity<String>(form.toString(), headers);
		result = restTemplate.postForObject(url, formEntity, String.class);

		System.out.println("	>>  list result= " + result);
	}

	@Test
	public void validation() throws JSONException {
		String url = "http://localhost:" + port + "/account/validation";

		// restTemplate post 写入流的方式
		HttpHeaders headers = new HttpHeaders();
		MediaType type = MediaType.parseMediaType("application/json; charset=UTF-8");
		headers.setContentType(type);
		headers.add("Accept", MediaType.APPLICATION_JSON.toString());

		JSONObject form = new JSONObject();
		JSONObject queryConditions = new JSONObject();
		form.put("account", "admin_5");
		form.put("password", "1267d#%^&&*_5");
		queryConditions.put("account", "1");
		// queryConditions.put("accountType", "0");
		form.put("queryConditions", queryConditions);

		HttpEntity<String> formEntity = new HttpEntity<String>(form.toString(), headers);
		String result = restTemplate.postForObject(url, formEntity, String.class);

		System.out.println("	>>  validation result= " + result);
	}

*/}
