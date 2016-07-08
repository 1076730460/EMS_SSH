package com.ems.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Table(name = "ems_testquestion")
public class Testquestion implements java.io.Serializable {
	private String id;
	private String name;
	private TestquestionType testquestionType;
	private Post post;
	private String rightOption;
	private String create_person;
	private Date create_time;
	private String update_person;
	private Date update_time;
	private Set<TestParper> parper = new HashSet<TestParper>();
	private Option option;

	@Id
	@Column(name = "id", unique = true, nullable = false, length = 36)
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@ManyToOne(cascade = { CascadeType.PERSIST, CascadeType.MERGE,
			CascadeType.REFRESH }, optional = false)
	@JoinColumn(name = "type", referencedColumnName = "id")
	public TestquestionType getTestquestionType() {
		return testquestionType;
	}

	public void setTestquestionType(TestquestionType testquestionType) {
		this.testquestionType = testquestionType;
	}

	@ManyToOne(cascade = { CascadeType.PERSIST, CascadeType.MERGE,
			CascadeType.REFRESH }, optional = false)
	@JoinColumn(name = "post", referencedColumnName = "id")
	public Post getPost() {
		return post;
	}

	public void setPost(Post post) {
		this.post = post;
	}

	public String getRightOption() {
		return rightOption;
	}

	public void setRightOption(String rightOption) {
		this.rightOption = rightOption;
	}

	public String getCreate_person() {
		return create_person;
	}

	public void setCreate_person(String create_person) {
		this.create_person = create_person;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "create_time", length = 19)
	public Date getCreate_time() {
		return create_time;
	}

	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}

	public String getUpdate_person() {
		return update_person;
	}

	public void setUpdate_person(String update_person) {
		this.update_person = update_person;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "update_time", length = 19)
	public Date getUpdate_time() {
		return update_time;
	}

	public void setUpdate_time(Date update_time) {
		this.update_time = update_time;
	}


	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "ems_parper_question", catalog = "ems", joinColumns = { @JoinColumn(name = "questionId", nullable = false, updatable = false) }, inverseJoinColumns = { @JoinColumn(name = "parperId", nullable = false, updatable = false) })
	public Set<TestParper> getParper() {
		return parper;
	}

	public void setParper(Set<TestParper> parper) {
		this.parper = parper;
	}
	@OneToOne(optional=false,cascade = CascadeType.ALL)
	@JoinColumn(name="optionId",referencedColumnName="id",unique=true)
	public Option getOption() {
		return option;
	}

	public void setOption(Option option) {
		this.option = option;
	}

	@Override
	public String toString() {
		return "Testquestion [id=" + id + ", name=" + name
				+ ", testquestionType=" + testquestionType + ", post=" + post
				+ ", rightOption=" + rightOption + ", create_person="
				+ create_person + ", create_time=" + create_time
				+ ", update_person=" + update_person + ", update_time="
				+ update_time + ", parper=" + parper + ", option=" + option
				+ "]";
	}

}
