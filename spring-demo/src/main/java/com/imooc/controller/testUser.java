package com.imooc.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.imooc.pojo.Course;
import com.imooc.pojo.User;

@RestController
public class testUser {
	@Autowired
	private Course course;
	
	
	@RequestMapping("getUser")
	public User getUser() {
		User user = new User();
		user.setName("张三");
		user.setBirthday(new Date());
		user.setAge(18);
		user.setPassword("123456");
		user.setDes("这是一个描述~~~~");
		return user;
	}

	@RequestMapping("getCourse")
	public Course getCourse() {
		//Course course = new Course();
		return course;
	}
}
