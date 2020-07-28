package org.asjy.users.dao.impl;

import org.asjy.users.bean.Users;
import org.asjy.users.dao.UsersDao;
import org.asjy.util.JDBCUtil;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.ResultSet;

public class UsersDaoImpl implements UsersDao{

	@Override
	public Users getUsersByUserName(String username) {
		java.sql.Connection connection = null;
		PreparedStatement pstm = null;
		ResultSet rs =null;
		try {
			connection=JDBCUtil.getMySelfConnection();
			String sql="select user_id,user_name,password,user_type from users where user_name =?";
			pstm=(PreparedStatement)connection.prepareStatement(sql);
			pstm.setString(1, username);
			rs=(ResultSet) pstm.executeQuery();
			if(rs.next()) {
				Users user=new Users(rs.getInt("user_id"),rs.getString("user_name"),rs.getString("password"),rs.getInt("USER_TYPE"));
			return user;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}	finally {
			JDBCUtil.myselfClose(connection, pstm, rs);
		}	
		return null;
	}

	@Override
	public int addUser(Users user) {
		java.sql.Connection connection=JDBCUtil.getMySelfConnection();
		PreparedStatement pstm = null;
		
		try {
			
			String sql = "insert into users(user_name,password) VALUE(?,?)";
			pstm= (PreparedStatement) connection.prepareStatement(sql);
			pstm.setString(1, user.getUsername());
			pstm.setString(2, user.getPassword());
			int ret =pstm.executeUpdate();
			return ret;
			
		} catch (Exception e) {
			e.printStackTrace();
			return -1;
		}finally {
			JDBCUtil.myselfClose(connection, pstm, null);
		}
	}
}
