package com.imooc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.imooc.pojo.Course;

@RestController
public class testCourse {
	@Autowired
	private Course course;

	@RequestMapping("getCourse1")
	public String getCourse() {
		Course course1=new Course();
		course1 = course;
		return course1.toString();
	}
}
