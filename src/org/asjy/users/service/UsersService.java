package org.asjy.users.service;

import org.asjy.users.bean.Users;

public interface UsersService {
	
	Users login(String username,String password) throws Exception;
	
	int addUsers(Users user);

}
