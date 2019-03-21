package com.zero.service;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zero.fallback.MemberFallback;
			
@FeignClient(value="service-member",fallback=MemberFallback.class)
public interface MemberFeign {
	
	@RequestMapping("/getMemberAll")
	public List<String> getToOrderMemberAll();
}
