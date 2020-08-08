package com.jbit.ischool.mapper;
/**
 * 	学生数据的映射器接口
 * @author Administrator
 *
 */

import java.util.List;

import com.jbit.ischool.pojo.Student;

public interface StudentMapper {
	//查询所有
	List<Student> findStudents();
	
}
