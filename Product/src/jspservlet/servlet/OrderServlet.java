package jspservlet.servlet;


import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jspservlet.dao.UserDAO3;
import jspservlet.dao.impl.OrderImpl;
import jspservlet.vo.Order;

public class OrderServlet extends HttpServlet {
	
	 public void doGet(HttpServletRequest req, HttpServletResponse res)
	    throws IOException, ServletException{
	 }
	
	 public void doPost(HttpServletRequest req, HttpServletResponse res)
	     throws IOException, ServletException{
		 System.out.println("zheshiorder");
		 HttpSession session = req.getSession();
		 Order order = new Order();
		 order.setUsername((String)session.getAttribute("username"));		 
		 UserDAO3 dao = new OrderImpl();
	     System.out.println("1"+order.getUsername());
	     if(order.getUsername()!= null){
			 ArrayList<Order> ar=new ArrayList<Order>();
			 	try {
			 			ar=dao.queryOrder((String)session.getAttribute("username"));
			 			session.setAttribute("username", order.getUsername());
			 			session.setAttribute("order", ar);
			 	} catch (Exception e) {

			 		e.printStackTrace();
			 	}
	  
			 	res.sendRedirect("./order form.jsp");
			 	
	     } else{
	    	 
	    	 res.sendRedirect("./Loginfirst.jsp");
			 	
	      }
	    
	 }
}
	 