package com.imooc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.imooc.pojo.Course;

@Controller
@RequestMapping("ftl")
public class testCourseByfreemarker {
	@Autowired
	private Course course;

	@RequestMapping("getCourse2")
	public String getCourse(ModelMap map) {
		map.put("course", course);
		//request.setAttribute("course", course);
		return "index";
	}
}
