package jspservlet.servlet;


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jspservlet.dao.UserDAO3;
import jspservlet.dao.UserDAO4;
import jspservlet.dao.impl.OrderImpl;
import jspservlet.dao.impl.ShopImpl;
import jspservlet.vo.Shopping;

public class AddOrderServlet extends HttpServlet {
	
	 public void doGet(HttpServletRequest req, HttpServletResponse res)
	    throws IOException, ServletException{
	 }
	
	 public void doPost(HttpServletRequest req, HttpServletResponse res)
	     throws IOException, ServletException{
		 
		 HttpSession session = req.getSession();
		 Shopping shop = new Shopping();
		 
		 shop.setUsername((String)session.getAttribute("username"));
		 shop.setTelephone((String)(req.getParameter("telephone")));
		 shop.setAddress((String)(req.getParameter("address")));
		 UserDAO3 dao = new OrderImpl();
		 UserDAO4 dao2 = new ShopImpl();
	     int flag = 0;
	     
	     try {
				flag = dao2.queryByUsername(shop);
			} catch (Exception e) {
				
				e.printStackTrace();
		} 
		 if(flag == 1){   
			 try {
				 	dao.add(shop);
				 	dao2.delete(shop);
			 } catch (Exception e) {
		// TODO Auto-generated catch block
				 e.printStackTrace();
			 }
			 res.sendRedirect("./buy success.jsp");
	    
	    } else {   
	         res.sendRedirect("./error.jsp");
	        }
	 }
}
