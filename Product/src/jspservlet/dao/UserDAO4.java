package jspservlet.dao;

import java.util.ArrayList;

import jspservlet.vo.Robot;
import jspservlet.vo.Shopping;

public interface UserDAO4 {
	
	public int queryByUsername(Shopping shop) throws Exception;
	
	public ArrayList<Shopping> queryShop(String username) throws Exception;
	
	public void add(Shopping shop,Robot robot) throws Exception; 
	
	public void delete(Shopping shop) throws Exception; 

	public int deleteOne(Shopping shop) throws Exception;

}
