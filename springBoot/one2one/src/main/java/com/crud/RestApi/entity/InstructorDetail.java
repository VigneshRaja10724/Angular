package com.crud.RestApi.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="instructor_detail")
public class InstructorDetail{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="hobby")
	private String hobbie;
	@Column(name="home_town")
	private String homeTown;
	
	public InstructorDetail() {}
	
	public InstructorDetail(String hobby, String homeTown) {
		super();
		this.hobbie = hobby;
		this.homeTown = homeTown;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getHobby() {
		return hobbie;
	}
	public void setHobby(String hobby) {
		this.hobbie = hobby;
	}
	public String getHomeTown() {
		return homeTown;
	}
	public void setHomeTown(String homeTown) {
		this.homeTown = homeTown;
	}

	@Override
	public String toString() {
		return "InstructorDetails [id=" + id + ", hobby=" + hobbie + ", homeTown=" + homeTown + "]";
	}
}
