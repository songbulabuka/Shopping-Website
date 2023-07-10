package jspservlet.dao.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import jspservlet.dao.RobotDAO;
import jspservlet.dao.UserDAO4;
import jspservlet.db.DBConnect;
import jspservlet.vo.Robot;
import jspservlet.vo.Shopping;

public class ShopImpl implements UserDAO4 {

	public int queryByUsername(Shopping shop) throws Exception {
		int flag = 0;
		String sql = "select * from userinfo where username=?";
		PreparedStatement pstmt = null ;   
		DBConnect dbc = null;   
		  
		        // 下面是针对数据库的具体操作   
		try{   
		            // 连接数据库   
				dbc = new DBConnect() ;   
		        pstmt = dbc.getConnection().prepareStatement(sql) ;
		        System.out.println(shop.getUsername());
		        pstmt.setString(1,shop.getUsername()) ;
		       
		        // 进行数据库查询操作   
		        ResultSet rs = pstmt.executeQuery();
		        
		        while(rs.next()){  
		         // 查询出内容，之后将查询出的内容赋值给person对象   
		        	System.out.println(rs.getString("username"));
		            if(rs.getString("username").equals(shop.getUsername())){
		            	System.out.println("faaaaaa");
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
		System.out.println(flag);
				return flag;
		
	}

	
	public ArrayList<Shopping> queryShop(String username) throws Exception {
		
		ArrayList<Shopping> list=new ArrayList<Shopping>();
		String sql = "select * from shopping_cart where username='"+username+"'";
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
		        		Shopping shop = new Shopping();
		        		shop.setProduct(rs.getString("product"));
		        		shop.setPrice(rs.getString("price"));
		        		shop.setPicture(rs.getString("picture"));
		        		shop.setKey(Integer.parseInt(rs.getString("keyID")));
		            	list.add(shop);
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
	
	public void delete(Shopping shop) throws Exception {
		
		
		String sql = "select * from shopping_cart where username = ?";
		PreparedStatement pstmt = null ;   
        DBConnect dbc = null;  
        
        try{   
            // 连接数据库   
            dbc = new DBConnect() ;   
            pstmt = dbc.getConnection().prepareStatement(sql) ; 
            pstmt.setString(1,shop.getUsername()) ; 
            ResultSet rs = pstmt.executeQuery();
            // 进行数据库查询操作   
           
            rs.close() ; 
             
            System.out.println(shop.getUsername());
            String sql1= "delete from shopping_cart where username='"+shop.getUsername()+"'";
            pstmt = dbc.getConnection().prepareStatement(sql1) ; 
            
            pstmt.executeUpdate();
             pstmt.close() ; 
           
        }catch (SQLException e){   
            System.out.println(e.getMessage());   
        }finally{   
            // 关闭数据库连接  
            dbc.close() ;   
        }   
  
		
		
	}


	public void add(Shopping shop,Robot robot) throws Exception {
		
		   ArrayList<Robot> flag = null;
		   RobotDAO dao = new RobotDAOImpl(); 
		   PreparedStatement pstmt = null;
		   DBConnect dbc = null;
		   String sql = "insert into shopping_cart(username,product,price,picture) values(?,?,?,?)";
		 
		   try{
			
			   	   dbc = new DBConnect();
			   
			       pstmt = dbc.getConnection().prepareStatement(sql);
				   
			       flag = dao.queryByRobotNature(robot.getName(),robot);
					   
				   pstmt.setString(1, shop.getUsername()); 
				   pstmt.setString(2, flag.get(0).getName());
				   pstmt.setString(3, flag.get(0).getPrice());
				   pstmt.setString(4, flag.get(0).getPicture0());
				   pstmt.executeUpdate();
				   System.out.println("aaaaaaaaaaaaaaa");
				
			   
		 } catch(SQLException e){
			 
			   System.out.println(e.getMessage());
			   
		     } finally{
			   
		    	 dbc.close();
		       }
		
		
		

	}
	
	public int deleteOne(Shopping shop) throws Exception {
		
		int flag = 0;
		String sql = "select * from shopping_cart where keyID = ?";
		 System.out.println(sql);
		PreparedStatement pstmt = null ;   
        DBConnect dbc = null;  
        
        try{   
            // 连接数据库   
            dbc = new DBConnect() ;   
            pstmt = dbc.getConnection().prepareStatement(sql) ; 
            System.out.println("AAAAAAAAAAAAAAAAAAA");
            pstmt.setInt(1,shop.getKey()) ; 
            ResultSet rs = pstmt.executeQuery();
            // 进行数据库查询操作   
           
            while(rs.next()){  
                // 查询出内容，之后将查询出的内容赋值给person对象   
            	if(rs.getInt("keyID")==(shop.getKey())){
                	flag = 1;
                	System.out.println(flag);
                } 
            }   
            rs.close() ; 
         
            String sql1= "delete from shopping_cart where keyID="+shop.getKey()+"";
            pstmt = dbc.getConnection().prepareStatement(sql1) ; 
            pstmt.executeUpdate();
            pstmt.close() ; 
           
        }catch (SQLException e){   
            System.out.println(e.getMessage());   
        }finally{   
            // 关闭数据库连接  
            dbc.close() ;   
        }   
		return flag;
	 
		
	}



	
}
