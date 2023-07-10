package jspservlet.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jspservlet.dao.RobotDAO;
import jspservlet.dao.UserDAO;
import jspservlet.dao.impl.LoginImpl;
import jspservlet.dao.impl.RobotDAOImpl;
import jspservlet.vo.Robot;
import jspservlet.vo.User;

public class Buy2Servlet extends HttpServlet {
	 public void doGet(HttpServletRequest req, HttpServletResponse res)
			    throws IOException, ServletException{
			 }
			
			 public void doPost(HttpServletRequest req, HttpServletResponse res)
			    throws IOException, ServletException{
				 HttpSession session=req.getSession();   
				 User user = new User();
				 user.setUsername((String)session.getAttribute("username"));
				 System.out.println(user.getUsername());
				 
		  if(user.getUsername() != null){
			  
				 Robot robot = new Robot();
				 robot.setName(req.getParameter("name"));
				 System.out.println(robot.getNum());
				 
				 RobotDAO dao = new RobotDAOImpl();   
			     ArrayList<Robot> flag = null;
			     try {
			    	 flag = dao.queryByRobotNature(robot.getName(),robot);
					} catch (Exception e) {
						e.printStackTrace();
				} 
				 if(flag != null){     
			         session.setAttribute("robotlist", flag);   
			         res.sendRedirect("./Buy2.jsp");
			        } else {   
			         res.sendRedirect("./search failed.jsp");
			        }
			 }
		  else {
				res.sendRedirect("./Loginfirst.jsp"); }
			 }
}

