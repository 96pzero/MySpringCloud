﻿package com.zero.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberController {
	
	@Value("${server.port}")
	private String port;
	private static int count = 0;
	@RequestMapping("/getMemberAll")
	public List<String> getMemberAll(){
		// 模拟雪崩用的线程休眠
 		try {
		     Thread.sleep(3000);
 		} catch (InterruptedException e) {
 		     e.printStackTrace();
 		}
		count++;
		List<String> userlist = new ArrayList<String>();
		userlist.add("张三1");
		userlist.add("张三2");
		userlist.add("张三3");
		userlist.add("serverPort:"+port);
		userlist.add("count" + count);
		return userlist;
	}
	
	@RequestMapping("/getMemberServiceApi")
	public String getMemberServiceApi() {
		return "this is 会员 服务工程";
	}
}
