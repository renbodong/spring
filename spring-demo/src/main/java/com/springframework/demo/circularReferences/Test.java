package com.springframework.demo.circularReferences;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
		AddressVo bean = context.getBean(AddressVo.class);
		System.out.println(bean.toString());
		UserVo vo = context.getBean(UserVo.class);
		System.out.println(vo.getClass());
	}
}
