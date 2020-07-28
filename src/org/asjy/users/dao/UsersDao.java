package org.asjy.users.dao;

import org.asjy.users.bean.Users;

public interface UsersDao {
	
	Users getUsersByUserName(String username);
	
	int addUser(Users user);

}
