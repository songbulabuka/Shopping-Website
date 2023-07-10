package jspservlet.dao;

import jspservlet.vo.User;
//To process information user submit.
public interface UserDAO2 {	
	//
	public int queryByUsername(User user) throws Exception;
	
	public void add(User user) throws Exception; 
	
}
