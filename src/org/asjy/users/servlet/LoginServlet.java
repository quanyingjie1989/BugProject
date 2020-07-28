package org.asjy.users.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import org.asjy.users.bean.Users;
import org.asjy.users.service.UsersService;
import org.asjy.users.service.impl.UsersServiceImpl;
import org.asjy.users.service.impl.UsersServiceImpl;

@WebServlet("/loginservelet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		System.out.println(username);
		
		UsersService service= new UsersServiceImpl();
		try {
			Users user=service.login(username, password);
			HttpSession session=request.getSession();
			session.setAttribute("user", user);
			
			request.getRequestDispatcher("success.jsp").forward(request, response);
		} catch (Exception e) {
			request.setAttribute("msg", e.getMessage());
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
