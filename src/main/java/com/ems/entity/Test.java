package com.ems.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * 
 * @author gjp
 *考试记录实体
 */
@Entity
@Table(name = "ems_test",catalog = "ems")
public class Test implements java.io.Serializable{
	private String id;
	private String userId;
	private String questionId;
	private String selectOption;
	private int currentTiems;
	
	@Id
	@Column(name = "id",nullable=false,unique=true,length =36)
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getQuestionId() {
		return questionId;
	}
	public void setQuestionId(String questionId) {
		this.questionId = questionId;
	}
	public String getSelectOption() {
		return selectOption;
	}
	public void setSelectOption(String selectOption) {
		this.selectOption = selectOption;
	}
	public int getCurrentTiems() {
		return currentTiems;
	}
	public void setCurrentTiems(int currentTiems) {
		this.currentTiems = currentTiems;
	}
}
