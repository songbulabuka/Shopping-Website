package jspservlet.servlet;


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jspservlet.dao.UserDAO3;
import jspservlet.dao.impl.OrderImpl;
import jspservlet.vo.Order;
import jspservlet.vo.Robot;

public class DirectBuyServlet extends HttpServlet {
	
	 public void doGet(HttpServletRequest req, HttpServletResponse res)
	    throws IOException, ServletException{
	 }
	
	 public void doPost(HttpServletRequest req, HttpServletResponse res)
	     throws IOException, ServletException{
		 
		 HttpSession session = req.getSession();
		 Order order = new Order();
		 
		 order.setUsername((String)session.getAttribute("username"));
		 order.setTelephone((String)(req.getParameter("telephone")));
		 order.setAddress((String)(req.getParameter("address")));
		 Robot robot = new Robot();
		 robot.setName(req.getParameter("name"));
         
		 UserDAO3 dao = new OrderImpl();
	     int flag = 0;
	     
	     try {
				flag = dao.queryByUsername(order);
			} catch (Exception e) {
				
				e.printStackTrace();
		} 
		 if(flag == 1){   
			 try {
				 	dao.add2(order,robot);
				 	
			 } catch (Exception e) {
		// TODO Auto-generated catch block
				 e.printStackTrace();
			 }
			 res.sendRedirect("./buy success.jsp");
	    
	    } else {   
	         res.sendRedirect("./Loginfirst.jsp");
	        }
	 }
}