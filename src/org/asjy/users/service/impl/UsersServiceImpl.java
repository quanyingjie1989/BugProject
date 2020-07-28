package org.asjy.users.service.impl;

import org.asjy.users.bean.Users;
import org.asjy.users.dao.UsersDao;
import org.asjy.users.dao.impl.UsersDaoImpl;
import org.asjy.users.service.UsersService;


public class UsersServiceImpl implements UsersService{
	
	UsersDao dao=new UsersDaoImpl();

	@Override
	public Users login(String username, String password) throws Exception {
		
		Users user =dao.getUsersByUserName(username);
		
		if(user == null) {
			throw new Exception("���û�������");
		}
		
		if(password.equals(user.getPassword())) {
			return user;
		}else {
			throw new Exception("���������");
		}
	}

	@Override
	public int addUsers(Users user) {
		return dao.addUser(user);
	}
}
