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
  
        // 下面是针对数据库的具体操作   
        try{   
            // 连接数据库   
            dbc = new DBConnect() ;   
            pstmt = dbc.getConnection().prepareStatement(sql) ; 
            pstmt.setString(1,user.getUsername1()) ;
            // 进行数据库查询操作   
            ResultSet rs = pstmt.executeQuery();
            System.out.println(user.getUsername1());
            while(rs.next()){  
                // 查询出内容，之后将查询出的内容赋值给person对象   
                if(rs.getString("username").equals(user.getUsername1())){
                	
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
