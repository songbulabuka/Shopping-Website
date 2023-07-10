package jspservlet.dao;

import java.util.ArrayList;

import jspservlet.vo.Order;
import jspservlet.vo.Robot;
import jspservlet.vo.Shopping;

public interface UserDAO3 {
	
	//
	public int queryByUsername(Order order) throws Exception;
	
	public ArrayList<Order> queryOrder(String username) throws Exception;
	
	public void add(Shopping shop) throws Exception;
	
	public void add2(Order order,Robot robot) throws Exception;

}
