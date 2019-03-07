package com.zero.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zero.service.OrderMemberService;

@RestController
public class OrderMemberController {

	@Autowired
	private OrderMemberService orderMemberService;
	@RequestMapping("/getOrderAll")
	public List<String> getOrderAll(){
		System.out.println("订单服务开始调用会员服务");
		return orderMemberService.getOrderAll();
	}
}
