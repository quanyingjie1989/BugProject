package org.asjy.users.bean;

public class Users {
	
	private Integer id;
	
	private String username;
	
	private String password;
	
	private Integer type;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Users(Integer id, String username, String password, Integer type) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.type = type;
	}
	
	

}
