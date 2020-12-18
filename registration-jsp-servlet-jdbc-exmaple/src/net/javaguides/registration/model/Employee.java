package net.javaguides.registration.model;

public class Employee {
	
	private String admin_id;
	private String name;
	private String username;
	private String password;
	
	public String getId() {
		return admin_id;
	}
	public void setId(String admin_id) {
		this.admin_id = admin_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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

	
}
