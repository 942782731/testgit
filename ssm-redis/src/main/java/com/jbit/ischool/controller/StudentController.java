package com.jbit.ischool.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jbit.ischool.pojo.Student;
import com.jbit.ischool.service.StudentService;

/**
 * 	控制器类
 * @author Administrator
 *
 */
@Controller
@RequestMapping("/stu")
public class StudentController {
	//调用业务接口的方法
	@Autowired
	@Qualifier("studentService")
	private StudentService studentService;
	
	@RequestMapping("/findStudents")
	@ResponseBody
	public List<Student> findStudents(){
		List<Student> list = studentService.findStudents();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
}
