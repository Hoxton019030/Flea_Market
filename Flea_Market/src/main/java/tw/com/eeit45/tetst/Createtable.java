package tw.com.eeit45.tetst;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tw.com.eeit45.conn.ConnectionFactory;
import tw.com.eeit45.user.model.SQLSyntax.SQLSyntaxCollection_Table;

/**
 * Servlet implementation class Createtable
 */
@WebServlet("/Createtable")
public class Createtable extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Connection conn = ConnectionFactory.getConn();
		SQLSyntaxCollection_Table SQL = new SQLSyntaxCollection_Table();
		String sql2= "USE Flea_Market INSERT INTO [dbo].[USERS] VALUES ( '許誌展' ,'orz93097' , 'orz93098' ),('李淇鈴','ling','123'),('廖韻綺','yuchi','123'),('羅雅琪','yachi','123')";
		try {
//			PreparedStatement pstmt1 = conn.prepareStatement(SQL.getDropTable());
//			pstmt1.executeUpdate();
			PreparedStatement pstmt2 = conn.prepareStatement(SQL.getCreateTable());
			PreparedStatement pstmt3 = conn.prepareStatement(sql2);
			try{
				pstmt2.executeUpdate();
			}catch (Exception e) {

				System.out.println("有資料囉");
			}
			pstmt3.executeUpdate();	
			System.out.println("耶");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
