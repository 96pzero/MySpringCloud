package com.zero.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberController {
	
	@Value("${server.port}")
	private String port;
	@RequestMapping("/getMemberAll")
	public List<String> getMemberAll(){
		List<String> userlist = new ArrayList<String>();
		userlist.add("张三1");
		userlist.add("张三2");
		userlist.add("张三3");
		userlist.add("serverPort:"+port);
		return userlist;
	}
}
