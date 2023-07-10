package jspservlet.dao;

import jspservlet.vo.User;
//To process information user submit.
public interface UserDAO {	
	public int queryByUsername(User user) throws Exception;
	
}
