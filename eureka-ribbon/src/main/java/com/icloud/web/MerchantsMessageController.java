package com.icloud.web;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.icloud.service.MerchantsMessageService;


@RestController
@SuppressWarnings("rawtypes")
public class MerchantsMessageController  {
	@Autowired
	 private MerchantsMessageService mtsMessageService;  
	
	/**添加消息**/
	@RequestMapping(value = "/message/add")
	public ResponseEntity add(String data) throws Exception {
		return Optional.ofNullable(mtsMessageService.add(data))
				.map(event -> new ResponseEntity(HttpStatus.NO_CONTENT))
				.orElseThrow(() -> new Exception("add message fail"));
	}
	
	
	/**查询消息列表**/
	@RequestMapping(value = "/message/list")
	 public ResponseEntity list(String data) throws Exception {
        return Optional.ofNullable(mtsMessageService.list(data))
                .map(event -> new ResponseEntity(HttpStatus.NO_CONTENT))
                .orElseThrow(() -> new Exception("list message fail "));
    }
	
	/**更新消息已读**/ 
	@RequestMapping(value = "/message/update")
	public ResponseEntity update(Integer messageId) throws Exception {
		return Optional.ofNullable(mtsMessageService.markRead(messageId))
				.map(event -> new ResponseEntity(HttpStatus.NO_CONTENT))
				.orElseThrow(() -> new Exception("update message fail"));
	}
	
	

	 
}