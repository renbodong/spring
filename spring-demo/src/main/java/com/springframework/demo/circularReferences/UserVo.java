package com.springframework.demo.circularReferences;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class UserVo {
	@Resource
	private AddressVo addressVo;
}
