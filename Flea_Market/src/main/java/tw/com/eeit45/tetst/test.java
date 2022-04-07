package tw.com.eeit45.tetst;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tw.com.eeit45.user.model.bean.Users;
import tw.com.eeit45.user.model.service.UsersServiceImp;

/**
 * Servlet implementation class test
 */
@WebServlet("/test")
public class test extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		UsersServiceImp serviceImp = new UsersServiceImp();
//		Users users = new Users("the_chiling", "orz93098", "李淇鈴","1");
//		serviceImp.updateUSer(users);
//		serviceImp.deleteUser("5");
		Users findUserByAccout = serviceImp.findUserByAccout("ling");
		System.out.println(findUserByAccout);
//		try {
//			InitialContext context = new InitialContext();
//			DataSource ds = (DataSource)context.lookup("java:comp/env/jdbc/TestDB");
//			Connection conn = ds.getConnection();
//			PreparedStatement pstmt = conn.prepareStatement("SELECT [編號],[姓名],[帳號],[密碼] FROM [Flea_Market].[dbo].[USERS]WHERE 編號 = 1 ");
//			ResultSet rs = pstmt.executeQuery();
//			while(rs.next()) {
//				System.out.println(rs.getString(2));
//			}
//			conn.close();
//		} catch (NamingException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
