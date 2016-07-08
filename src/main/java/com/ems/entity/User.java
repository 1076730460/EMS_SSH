package com.ems.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ems_user",catalog = "ems")
public class User implements java.io.Serializable{
	private static final long serialVersionUID = 6980093847795726310L;
	private String userName;
	private String password;
	private String name;
	private String cellPhone;
	private String mailAddress;
	private String deptName;
	private String title;
	private String post;
	private String userType;
	private int submitTimes;
	//记录最高分数
	private int score;
	public User() {
		super();
	}
	@Id
	@Column(name = "id", unique = true, nullable = false, length = 36)
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCellPhone() {
		return cellPhone;
	}

	public void setCellPhone(String cellPhone) {
		this.cellPhone = cellPhone;
	}

	public String getMailAddress() {
		return mailAddress;
	}

	public void setMailAddress(String mailAddress) {
		this.mailAddress = mailAddress;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	public String getPost() {
		return post;
	}
	public void setPost(String post) {
		this.post = post;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	public int getSubmitTimes() {
		return submitTimes;
	}
	public void setSubmitTimes(int submitTimes) {
		this.submitTimes = submitTimes;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	@Override
	public String toString() {
		return "User [userName=" + userName + ", password=" + password
				+ ", name=" + name + ", cellPhone=" + cellPhone
				+ ", mailAddress=" + mailAddress + ", deptName=" + deptName
				+ ", title=" + title + "]";
	}
	
}