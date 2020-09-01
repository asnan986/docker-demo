package org.dxc.docker.model;

public class User {

	
	private String name;
	private String email;
	private String id;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String name, String email, String id) {
		super();
		this.name = name;
		this.email = email;
		this.id = id;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", email=" + email + ", id=" + id + "]";
	}
	
}
