package jspservlet.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jspservlet.dao.UserDAO2;
import jspservlet.dao.impl.RegisterImpl;
import jspservlet.vo.User;

public class RegisterServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse res)throws IOException,ServletException{
		
	}
	
	public void doPost(HttpServletRequest req, HttpServletResponse res)throws IOException,ServletException{
		User user = new User();
		user.setUsername1(req.getParameter("username1"));
		user.setPassword1(req.getParameter("password1"));
		user.setPassword2(req.getParameter("password2"));
			UserDAO2 dao = new RegisterImpl();
			int flag = 0;
			try{
				flag = dao.queryByUsername(user);
			}  catch(Exception e){
			 
			   e.printStackTrace();
			}
			
		if(user.getPassword1().equals(user.getPassword2())&&flag==0){
			HttpSession session = req.getSession();
			session.setAttribute("username1",user.getUsername1());
			try {
				dao.add(user);
			} catch (Exception e) {
			
				e.printStackTrace();
			}
			res.sendRedirect("./Register success.jsp");
			
		} else if(flag==1){
			res.sendRedirect("./exist.jsp");
			
		} else{
			HttpSession session = req.getSession();
			session.setAttribute("username1",user.getUsername1());
			res.sendRedirect("./different.jsp");
		}
		
	}

}