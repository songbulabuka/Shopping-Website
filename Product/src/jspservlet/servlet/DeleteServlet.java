package jspservlet.servlet;


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jspservlet.dao.UserDAO4;
import jspservlet.dao.impl.ShopImpl;
import jspservlet.vo.Shopping;

public class DeleteServlet extends HttpServlet {
	
	 public void doGet(HttpServletRequest req, HttpServletResponse res)
	    throws IOException, ServletException{
	 }
	
	 public void doPost(HttpServletRequest req, HttpServletResponse res)
	     throws IOException, ServletException{
		 
		 HttpSession session = req.getSession();
		 Shopping shop = new Shopping();
		 
		 shop.setUsername((String)session.getAttribute("username"));
		System.out.println(shop.getUsername());
		 shop.setKey(Integer.parseInt(req.getParameter("key")));
		 System.out.println(shop.getKey());
		 UserDAO4 dao = new ShopImpl();
	     int flag = 0;
	     int flag2 = 0;
	     try {
				flag = dao.deleteOne(shop);
				flag2 = dao.queryByUsername(shop);
				System.out.println(flag);
			} catch (Exception e) {
				
				e.printStackTrace();
		} 
		 if(flag == 1){   
			 try {
				 
				 	System.out.println("yunxingshanyige");
				 	dao.deleteOne(shop);
				 	res.sendRedirect("./delete.jsp");
			 } catch (Exception e) {
		// TODO Auto-generated catch block
				 e.printStackTrace();
			 }
	    
	    } else if(flag2==1&&flag==0){   
	    	
	    	try {
	    		System.out.println("yunxingshanquanbu");
				dao.delete(shop);
				res.sendRedirect("./delete.jsp");
			} catch (Exception e) {
				
				e.printStackTrace();
			  }
			
	      }
	 }
}
