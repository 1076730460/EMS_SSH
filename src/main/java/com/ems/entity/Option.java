package com.ems.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="ems_option",catalog="ems")
public class Option implements Serializable{
	private String Id;
	private String optionA;
	private String optionB;
	private String optionC;
	private String optionD;
	private String optionE;
	private String optionF;
	private Testquestion question;
	@Id
	@Column(name="id",unique=true,nullable=false,length=36)
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getOptionA() {
		return optionA;
	}
	public void setOptionA(String optionA) {
		this.optionA = optionA;
	}
	public String getOptionB() {
		return optionB;
	}
	public void setOptionB(String optionB) {
		this.optionB = optionB;
	}
	public String getOptionC() {
		return optionC;
	}
	public void setOptionC(String optionC) {
		this.optionC = optionC;
	}
	public String getOptionD() {
		return optionD;
	}
	public void setOptionD(String optionD) {
		this.optionD = optionD;
	}
	public String getOptionE() {
		return optionE;
	}
	public void setOptionE(String optionE) {
		this.optionE = optionE;
	}
	public String getOptionF() {
		return optionF;
	}
	public void setOptionF(String optionF) {
		this.optionF = optionF;
	}
	@OneToOne(optional = true, cascade = CascadeType.ALL, mappedBy = "option")
	public Testquestion getQuestion() {
		return question;
	}
	public void setQuestion(Testquestion question) {
		this.question = question;
	}
	@Override
	public String toString() {
		return "Option [Id=" + Id + ", optionA=" + optionA + ", optionB="
				+ optionB + ", optionC=" + optionC + ", optionD=" + optionD
				+ ", optionE=" + optionE + ", optionF=" + optionF
				+ ", question=" + question + "]";
	}
}
