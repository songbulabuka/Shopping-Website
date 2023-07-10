package jspservlet.dao.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import jspservlet.dao.RobotDAO;
import jspservlet.db.DBConnect;
import jspservlet.vo.Robot;

public class RobotDAOImpl implements RobotDAO {

	public ArrayList<Robot> queryByRobotNature(String i ,Robot robot) throws Exception {
		ArrayList<Robot> list = new ArrayList<Robot> () ;
		if(i=="0"){
			String sql = "select * from product where brand like? or name like? or command like?  or material like? or size like? or battery like? or workingtime like? or chargingtime like? or hardware like?";
			System.out.println(sql);
	        PreparedStatement pstmt = null ;   
	        DBConnect dbc = null;   
	  
	        // 下面是针对数据库的具体操作   
	        try{   
	            // 连接数据库   
	            dbc = new DBConnect() ;   
	            pstmt = dbc.getConnection().prepareStatement(sql) ; 
	            pstmt.setString(1,robot.getNature()) ; 
	            pstmt.setString(2,robot.getNature()) ; 
	            pstmt.setString(3,robot.getNature()) ; 
	            pstmt.setString(4,robot.getNature()) ; 
	            pstmt.setString(5,robot.getNature()) ; 
	            pstmt.setString(6,robot.getNature()) ; 
	            pstmt.setString(7,robot.getNature()) ; 
	            pstmt.setString(8,robot.getNature()) ; 
	            pstmt.setString(9,robot.getNature()) ; 
	            // 进行数据库查询操作   
	            ResultSet rs = pstmt.executeQuery();
	            while(rs.next()){  
	            	
	                // 查询出内容，之后将查询出的内容赋值给rb对象   
	            	Robot rb = new Robot();
	            	rb.setName(rs.getString("name"));
	            	rb.setCommand(rs.getString("command"));
	            	rb.setMaterial(rs.getString("material"));
	            	rb.setSize(rs.getString("size"));
	            	rb.setBattery(rs.getString("battery"));
	            	rb.setWorkingtime(rs.getString("workingtime"));
	            	rb.setChargingtime(rs.getString("chargingtime"));
	            	rb.setHardware(rs.getString("hardware"));
	            	rb.setPicture0(rs.getString("picture0"));
	            	rb.setPrice(rs.getString("price"));
	            	rb.setPicture1(rs.getString("picture1"));
	            	rb.setPicture2(rs.getString("picture2"));
	            	rb.setDescribe(rs.getString("describe"));
	            	list.add(rb);
	            }   
	            rs.close() ; 
	            pstmt.close() ;   
	        }catch (SQLException e){   
	            System.out.println(e.getMessage());   
	        }finally{   
	            // 关闭数据库连接   
	            dbc.close() ;   
	        }  
	        
		
		}else{
		String sql = "select * from product where name like?";
		
        PreparedStatement pstmt = null ;   
        DBConnect dbc = null;   
  
        // 下面是针对数据库的具体操作   
        try{   
            // 连接数据库   
            dbc = new DBConnect() ;   
            pstmt = dbc.getConnection().prepareStatement(sql) ; 
            pstmt.setString(1,robot.getName()) ; 
            System.out.println(sql);
            // 进行数据库查询操作   
            ResultSet rs = pstmt.executeQuery();
            System.out.println(robot.getName());
            while(rs.next()){  
                // 查询出内容，之后将查询出的内容赋值给rb对象   
            	Robot rb = new Robot();
            	rb.setName(rs.getString("name"));
            	rb.setCommand(rs.getString("command"));
            	rb.setMaterial(rs.getString("material"));
            	rb.setSize(rs.getString("size"));
            	rb.setBattery(rs.getString("battery"));
            	rb.setWorkingtime(rs.getString("workingtime"));
            	rb.setChargingtime(rs.getString("chargingtime"));
            	rb.setHardware(rs.getString("hardware"));
            	rb.setPicture0(rs.getString("picture0"));
            	rb.setPrice(rs.getString("price"));
            	rb.setPicture1(rs.getString("picture1"));
            	rb.setPicture2(rs.getString("picture2"));
            	rb.setDescribe(rs.getString("describe"));
            	list.add(rb);
            }   
            rs.close() ; 
            pstmt.close() ;   
        }catch (SQLException e){   
            System.out.println(e.getMessage());   
        }finally{   
            // 关闭数据库连接   
            dbc.close() ;   
        }  }
		
		return list; }
}
