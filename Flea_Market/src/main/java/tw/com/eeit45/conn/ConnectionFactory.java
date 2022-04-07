package tw.com.eeit45.conn;

import java.sql.Connection;

import javax.naming.InitialContext;
import javax.sql.DataSource;

public class ConnectionFactory  {
	
	public static Connection getConn() {
		Connection conn=null;
		try {
			InitialContext context = new InitialContext();
			DataSource ds=(DataSource)context.lookup("java:comp/env/jdbc/TestDB");
			conn=ds.getConnection();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			
			e.printStackTrace();
		}
		return conn;
	}
	

}
