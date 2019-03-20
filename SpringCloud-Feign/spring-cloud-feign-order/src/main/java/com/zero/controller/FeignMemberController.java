package com.zero.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zero.service.MemberFeign;

@RestController
public class FeignMemberController {
	
	@Autowired
	private MemberFeign memberFeign;
	@RequestMapping("/getToOrderMemberAll")
	public List<String> getToOrderMemberAll(){
		System.out.println("order feign 工程调用 member 工程");
		return memberFeign.getToOrderMemberAll();
	}
}
