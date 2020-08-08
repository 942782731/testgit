package com.jbit.ischool.pojo;

import java.io.Serializable;

/**
 * 	实体类
 * @author Administrator
 *
 */
public class Student implements Serializable {
	private int stuNo;
	private String stuName;
	private String sex;
	private String gradeId;
	private String phone;
	private String addr;
	private String bornDay;
	private String email;
	public int getStuNo() {
		return stuNo;
	}
	public void setStuNo(int stuNo) {
		this.stuNo = stuNo;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getGradeId() {
		return gradeId;
	}
	public void setGradeId(String gradeId) {
		this.gradeId = gradeId;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getBornDay() {
		return bornDay;
	}
	public void setBornDay(String bornDay) {
		this.bornDay = bornDay;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Student(int stuNo, String stuName, String sex, String gradeId, String phone, String addr, String bornDay,
			String email) {
		super();
		this.stuNo = stuNo;
		this.stuName = stuName;
		this.sex = sex;
		this.gradeId = gradeId;
		this.phone = phone;
		this.addr = addr;
		this.bornDay = bornDay;
		this.email = email;
	}
	public Student() {
		super();
	}
	@Override
	public String toString() {
		return "Student [stuNo=" + stuNo + ", stuName=" + stuName + ", sex=" + sex + ", gradeId=" + gradeId + ", phone="
				+ phone + ", addr=" + addr + ", bornDay=" + bornDay + ", email=" + email + "]";
	}
	
}
