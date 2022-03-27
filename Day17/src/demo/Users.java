package demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="users")
@Table(name="users")

public class Users {
	@Id
	@Column(name="users_id")
	int users_id;
	@Column(name="username")
	String username;
	@Column(name="password")
	String password;
	@Column(name="firstname")
	String firstname;
	@Column(name="lastname")
	String lastname;
	/*
	 * public Users(int users_id, String usernamr, String password, String
	 * firstname, String lastname) { // TODO Auto-generated constructor stub }
	 */
	
	public Users() {
		
	}

	public Users(int users_id, String username, String password, String firstname, String lastname) {
		this.users_id = users_id;
		this.username = username;
		this.password = password;
		this.firstname = firstname;
		this.lastname = lastname;
	}

	public int getUsers_id() {
		return users_id;
	}
	public void setUsers_id(int users_id) {
		this.users_id = users_id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	
}
