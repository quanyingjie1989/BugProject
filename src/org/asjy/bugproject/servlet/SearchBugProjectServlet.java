package org.asjy.bugproject.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.asjy.bugproject.BugProject;
import org.asjy.bugproject.service.BugProjectService;
import org.asjy.bugproject.service.impl.BugProjectServiceImpl;

@WebServlet("/searchbugprojectservlet")
public class SearchBugProjectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		BugProjectService service=new BugProjectServiceImpl();
		
//		int pageNum=0;
//		if(request.getParameter("pageNum")==null) {
//			pageNum =1;
//			System.out.println(pageNum);
//		}else {
//			pageNum=Integer.parseInt(request.getParameter("pageNum"));
//			System.out.println(pageNum);
//		}
		
		String proName=request.getParameter("proName");
		
		BugProject bugProjects=new BugProject(null, proName, null, null, null, null, null);
		
		List<BugProject> buList=service.searchBugProjects(bugProjects);
		request.setAttribute("buList", buList);
		//request.setAttribute("pageNum", pageNum);
		
		request.getRequestDispatcher("searchbugproject.jsp").forward(request, response);
	
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
