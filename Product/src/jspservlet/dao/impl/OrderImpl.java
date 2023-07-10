package jspservlet.dao.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.*;

import jspservlet.dao.RobotDAO;
import jspservlet.dao.UserDAO3;
import jspservlet.dao.UserDAO4;
import jspservlet.db.DBConnect;
import jspservlet.vo.Order;
import jspservlet.vo.Robot;
import jspservlet.vo.Shopping;

public class OrderImpl implements UserDAO3 {

	public int queryByUsername(Order order) throws Exception {
		
		int flag = 0;
		String sql = "select * from user_order where username=?";
		PreparedStatement pstmt = null ;   
		DBConnect dbc = null;   
		  
		        // 下面是针对数据库的具体操作   
		try{   
		            // 连接数据库   
				dbc = new DBConnect() ;   
		        pstmt = dbc.getConnection().prepareStatement(sql) ; 
		        pstmt.setString(1,order.getUsername()) ;
		       
		        // 进行数据库查询操作   
		        ResultSet rs = pstmt.executeQuery();
		       
		        while(rs.next()){  
		         // 查询出内容，之后将查询出的内容赋值给person对象   
		        	
		            if(rs.getString("username").equals(order.getUsername())){
		            	
		            	flag = 1;
		             } 
		          }   
		            rs.close() ; 
		            pstmt.close() ;   
		     } catch (SQLException e){   
		            System.out.println(e.getMessage());   
		       } finally{   
		            // 关闭数据库连接   
		            dbc.close() ;   
		        }   
				return flag;
		
	}
	public ArrayList<Order> queryOrder(String username) throws Exception{

		ArrayList<Order> list=new ArrayList<Order>();
		String sql = "select * from user_order where username='"+username+"'";
		PreparedStatement pstmt = null ;   
		DBConnect dbc = null;   
	
		        // 下面是针对数据库的具体操作   
		 try{   
		            // 连接数据库   
				dbc = new DBConnect() ;   
		        pstmt = dbc.getConnection().prepareStatement(sql) ; 
		       
		       
		         // 进行数据库查询操作   
		        ResultSet rs = pstmt.executeQuery();
		       
		        while(rs.next()){  
		         // 查询出内容，之后将查询出的内容赋值给person对象   
		        		Order order=new Order();
		            	order.setOrder(rs.getString("orderID"));
		            	order.setProduct(rs.getString("product"));
		            	order.setNumber(rs.getString("number"));
		            	order.setTime(rs.getString("time"));
		            	order.setAddress(rs.getString("address"));
		            	order.setTelephone(rs.getString("telephone"));
		            	order.setPrice(rs.getString("price"));
		            	order.setPicture(rs.getString("picture"));
		            	
		            	list.add(order);
		           
		          }   
		           
		            
		     } catch (SQLException e){   
		            System.out.println(e.getMessage());   
		       } finally{   
		            // 关闭数据库连接   
		            dbc.close() ;   
		            pstmt.close() ;   
		        } 
		 
				return list;
		
	}
	
	public void add(Shopping shop) throws Exception {
		
		  
		   ArrayList<Shopping> list = new ArrayList<Shopping>();
		   PreparedStatement pstmt = null;
		   DBConnect dbc = null;
		   String sql = "insert into user_order(username,orderID,product,number,time,address,telephone,price,picture) values(?,?,?,?,?,?,?,?,?)";
		 
		   try{
			
			   dbc = new DBConnect();
			   
			       pstmt = dbc.getConnection().prepareStatement(sql);
				   
				   UserDAO4 dao = new ShopImpl();
				   list = dao.queryShop(shop.getUsername());
			    for(int i=0;i<list.size();i++){
				  
				   String num =  String.valueOf((int)(Math.random() *10000000));
				   SimpleDateFormat time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				   shop.setTime(time.format(new Date()));
				   shop.setOrder(num);
				   String s = Integer.toString(1); 
					   
				   pstmt.setString(1, shop.getUsername()); 
				   pstmt.setString(2, shop.getOrder());
				   pstmt.setString(3, list.get(i).getProduct());
				   pstmt.setString(4, s);
				   pstmt.setString(5,shop.getTime());
				   pstmt.setString(6,shop.getAddress());
				   pstmt.setString(7,shop.getTelephone());
				   pstmt.setString(8, list.get(i).getPrice());
				   pstmt.setString(9, list.get(i).getPicture());
				   pstmt.executeUpdate();
				  
			  }
			   
			   
		   } catch(SQLException e){
			   System.out.println(e.getMessage());
		     } finally{
			   
			   dbc.close();
		     }
		
	}
	public void add2(Order order,Robot robot) throws Exception {
		
		  
		   ArrayList<Robot> flag = null;
		   RobotDAO dao = new RobotDAOImpl(); 
		   PreparedStatement pstmt = null;
		   DBConnect dbc = null;
		   String sql = "insert into user_order(username,orderID,product,number,time,address,telephone,price,picture) values(?,?,?,?,?,?,?,?,?)";
		 
		   try{
			
			   	   dbc = new DBConnect();
			   
			       pstmt = dbc.getConnection().prepareStatement(sql);
				   
			       flag = dao.queryByRobotNature(robot.getName(),robot);
					   
			       for(int i=0;i<flag.size();i++){
						  
					   String num =  String.valueOf((int)(Math.random() *10000000));
					   SimpleDateFormat time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
					   order.setTime(time.format(new Date()));
					   order.setOrder(num);
					   String s = Integer.toString(1); 
						   
					   pstmt.setString(1, order.getUsername()); 
					   pstmt.setString(2, order.getOrder());
					   pstmt.setString(3, flag.get(i).getName());
					   pstmt.setString(4, s);
					   pstmt.setString(5,order.getTime());
					   pstmt.setString(6,order.getAddress());
					   pstmt.setString(7,order.getTelephone());
					   pstmt.setString(8, flag.get(i).getPrice());
					   pstmt.setString(9, flag.get(i).getPicture0());
					   pstmt.executeUpdate();
					  
				  }
				   
				
			   
		 } catch(SQLException e){
			 
			   System.out.println(e.getMessage());
			   
		     } finally{
			   
		    	 dbc.close();
		       }
		
		
	}
	
	
	
}