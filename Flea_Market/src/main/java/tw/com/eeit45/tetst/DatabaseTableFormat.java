package tw.com.eeit45.tetst;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import tw.com.eeit45.conn.ConnectionFactory;

public class DatabaseTableFormat {
	public static void main(String[] args) {
//	Connection conn = ConnectionFactory.getConn();
	try {
		Connection conn = null;
		PreparedStatement pstmt = conn.prepareStatement("USE Flea_Market CREATE TABLE USERS (編號 INT  NOT NULL IDENTITY PRIMARY KEY, 姓名 VARCHAR(12) ,帳號 VARCHAR(12) UNIQUE ,密碼 VARCHAR(12))");
		PreparedStatement pstmt2 = conn.prepareStatement("USE Flea_Market INSERT INTO [dbo].[USERS] VALUES ( '許誌展' ,'orz93097' , 'orz93098' ),('李淇鈴','ling','123'),('廖韻綺','yuchi','123'),('羅雅琪','yachi','')");
		boolean isSucceed = pstmt.execute();
//		boolean execute = pstmt2.execute();
		
		
		System.out.println("成功");
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}
	
	
	
	

}
