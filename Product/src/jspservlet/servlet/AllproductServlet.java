package jspservlet.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jspservlet.dao.RobotDAO;
import jspservlet.dao.impl.RobotDAOImpl;
import jspservlet.vo.Robot;

public class AllproductServlet extends HttpServlet {
	
	 public void doGet(HttpServletRequest req, HttpServletResponse res)
	    throws IOException, ServletException{
	 }
	
	 public void doPost(HttpServletRequest req, HttpServletResponse res)
	    throws IOException, ServletException{
		 Robot robot = new Robot();
		 robot.setNature(req.getParameter("robotnature"));
		 
		 RobotDAO dao = new RobotDAOImpl();   
	     ArrayList<Robot> flag = null;
	     try {
				flag = dao.queryByRobotNature("0",robot);
			} catch (Exception e) {
				e.printStackTrace();
		} 
		 if(flag != null&&flag.size()!=0){   
			 HttpSession session=req.getSession();   
	         session.setAttribute("robotlist", flag);   
	         res.sendRedirect("./Hikeeper Product.jsp");
	        } else {   
	         res.sendRedirect("./search failed.jsp");
	        }
	 }
}
