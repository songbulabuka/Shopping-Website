package jspservlet.dao.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import jspservlet.dao.UserDAO2;
import jspservlet.db.DBConnect;
import jspservlet.vo.User;


public class RegisterImpl implements UserDAO2 {

	
	public int queryByUsername(User user) throws Exception {
		// TODO Auto-generated method stub
		int flag = 0;
		String sql = "select * from userinfo where username=?";
        PreparedStatement pstmt = null ;   
        DBConnect dbc = null;   
  
        // ������������ݿ�ľ������   
        try{   
            // �������ݿ�   
            dbc = new DBConnect() ;   
            pstmt = dbc.getConnection().prepareStatement(sql) ; 
            pstmt.setString(1,user.getUsername1()) ;
            // �������ݿ��ѯ����   
            ResultSet rs = pstmt.executeQuery();
            System.out.println(user.getUsername1());
            while(rs.next()){  
                // ��ѯ�����ݣ�֮�󽫲�ѯ�������ݸ�ֵ��person����   
                if(rs.getString("username").equals(user.getUsername1())){
                	
                	flag = 1;
                } 
            }   
            rs.close() ; 
            pstmt.close() ;   
        } catch (SQLException e){   
            System.out.println(e.getMessage());   
        } finally{   
            // �ر����ݿ�����   
            dbc.close() ;   
        }   
		return flag;
	}
	
	public void add(User user) throws Exception{
		   PreparedStatement pstmt = null;
		   DBConnect dbc = null;
		   String sql = "insert into userinfo(username,password)values(?,?)";
		   try{
			   
			   dbc = new DBConnect();
			   pstmt = dbc.getConnection().prepareStatement(sql);
			   pstmt.setString(1, user.getUsername1());
			   pstmt.setString(2, user.getPassword1());
			   pstmt.executeUpdate();
			   
		   } catch(SQLException e){
			   System.out.println(e.getMessage());
		   } finally{
			   
			   dbc.close();
		   }
		 
	   }
}
