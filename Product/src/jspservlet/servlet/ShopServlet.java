package jspservlet.servlet;


import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jspservlet.dao.UserDAO4;
import jspservlet.dao.impl.ShopImpl;
import jspservlet.vo.Shopping;

public class ShopServlet extends HttpServlet {
	
	 public void doGet(HttpServletRequest req, HttpServletResponse res)
	    throws IOException, ServletException{
	 }
	
	 public void doPost(HttpServletRequest req, HttpServletResponse res)
	     throws IOException, ServletException{
		 
		 HttpSession session = req.getSession();
		 Shopping shop = new Shopping();
		 shop.setUsername((String)session.getAttribute("username"));
		 UserDAO4 dao = new ShopImpl();

		 if(shop.getUsername() != null){
			 ArrayList<Shopping> ar=new ArrayList<Shopping>();
			 try {
				 	ar=dao.queryShop((String)session.getAttribute("username"));
				 	session.setAttribute("username", shop.getUsername());
				 	session.setAttribute("shop", ar);
				 
			 } catch (Exception e) {
		// TODO Auto-generated catch block
				 e.printStackTrace();
			 }
	  
	    
	         res.sendRedirect("./Shopping cart.jsp");
		 } else {
			 
			 res.sendRedirect("./Loginfirst.jsp");
		 }
	 }
		 
}
