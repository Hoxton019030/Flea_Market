package tw.com.eeit45.tetst;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;
/*
 * 這個java檔用以檢測Servlet是否與SQL連結成功，若連結成功則會秀出
 * 不需要事先在SQL裡面建立資料，直接執行即可
 * db.Class名(ex:class org.apache.tomcat.dbcp.dbcp2.BasicDataSource)
 * conn.Class名(ex:class org.apache.tomcat.dbcp.dbcp2.PoolingDataSource$PoolGuardConnectionWrapper)
 * hashcode(ex:1640821017)
 * */
@WebServlet("/ConnnectionPool")
public class ConnnectionPool extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Connection conn = null;
		
		try {
			InitialContext context = new InitialContext();
			//要注意這邊是不是和xml的配置對得起來
			DataSource ds = (DataSource)context.lookup("java:comp/env/jdbc/TestDB");
			//
			System.out.println(ds.getClass());
			conn=ds.getConnection();
			System.out.println(conn.getClass());
			System.out.println(conn.hashCode());
		} catch (NamingException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
