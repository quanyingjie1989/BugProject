package org.asjy.users.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.asjy.users.bean.Users;
import org.asjy.users.service.UsersService;
import org.asjy.users.service.impl.UsersServiceImpl;

@WebServlet("/addusersservlet")
public class Adduser extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		System.out.println("11");
		String username =request.getParameter("username");
		String password	=request.getParameter("password");
		
		UsersService service=new UsersServiceImpl();
		int ret=service.addUsers(new Users(null, username, password, 1));
		System.out.println(ret);
		
		if(ret == -1) {
			request.setAttribute("msg", "×¢²áÊ§°Ü");
			request.getRequestDispatcher("addusersservlet").forward(request, response);
		}else {
			request.getRequestDispatcher("success.jsp").forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
