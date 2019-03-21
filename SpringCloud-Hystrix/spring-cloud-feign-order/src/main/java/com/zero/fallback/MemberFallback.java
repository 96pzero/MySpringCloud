package com.zero.fallback;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.zero.service.MemberFeign;

@Component
public class MemberFallback implements MemberFeign {

	@Override
	public List<String> getToOrderMemberAll() {
		System.out.println("weishenme");
	    //服务降级处理
		List<String> list = new ArrayList<String>();
		list.add("服务发生异常...");
		return list;
	}

}
