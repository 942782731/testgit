package com.jbit.ischool.service;
/**
 * 	业务接口
 * @author Administrator
 *
 */

import java.util.List;

import com.jbit.ischool.pojo.Student;

public interface StudentService {
	List<Student> findStudents();
}
