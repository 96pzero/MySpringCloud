package com.zero.service;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
			
@FeignClient("service-member")
public interface MemberFeign {
	
	@RequestMapping("/getMemberAll")
	public List<String> getToOrderMemberAll();
}
