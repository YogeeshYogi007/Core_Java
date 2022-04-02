package com.cg.placement.entities;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
@Entity
@Table(name="college")
@Inheritance(strategy=InheritanceType.JOINED)
public class College {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int Id;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="id")
	private User user;
	
	private User collegeAdmin;
	private String collegeName;
	private String location;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public User getCollegeAdmin() {
		return collegeAdmin;
	}
	public void setCollegeAdmin(User collegeAdmin) {
		this.collegeAdmin = collegeAdmin;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}

}
