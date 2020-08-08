package com.jbit.ischool.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jbit.ischool.mapper.StudentMapper;
import com.jbit.ischool.pojo.Student;

/**
 * 	业务接口的实现类
 * @author Administrator
 *
 */
@Service("studentService")
@Transactional
public class StudentServiceImp implements StudentService {
	//使用ioc容器注入一个redisTemplate模型对象
	@Autowired
	@Qualifier("redisTemplate")
	private RedisTemplate<String,List<Student>> redisTemplate;
	//调用数据库访问层的方法,也就是徐调用Mapper接口的方法
	@Autowired
	private StudentMapper studentMapper;
	public List<Student> findStudents() {
		//先从缓存服务器中获取指定的数据
		List<Student> list = redisTemplate.opsForValue().get("stuList");
		//显示观察缓存中取到的信息
//		if (list != null) {
//			for (Student student : list) {
//				System.out.println(student);
//			}
//		}
		//判断该数据是否有效
		if (list == null || list.isEmpty()) {
			//真正执行数据库的查询,得到数据再存入redis缓存
			list = studentMapper.findStudents();
			redisTemplate.opsForValue().set("stuList", list);
		}
		return list;
	}
	
}
