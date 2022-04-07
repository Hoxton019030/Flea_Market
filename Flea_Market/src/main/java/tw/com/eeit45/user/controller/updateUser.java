package tw.com.eeit45.user.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tw.com.eeit45.user.model.bean.Users;
import tw.com.eeit45.user.model.service.UsersServiceImp;

/**
 * Servlet implementation class updateUser
 */
@WebServlet("/updateUser")
public class updateUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		System.out.println("執行到這邊1");
		UsersServiceImp uService = new UsersServiceImp();
		Users users = new Users();
		String number = request.getParameter("number");
		String userName = request.getParameter("userName");
		String account = request.getParameter("account");
		String password = request.getParameter("password");
		System.out.println("編號是:"+number);
		System.out.println("執行到這邊2");
		users.setNumber(number);
		users.setUserName(userName);
		users.setAccount(account);
		users.setPassword(password);
		uService.updateUSer(users);
		System.out.println("執行到這邊");
		request.getRequestDispatcher("admin_user.jsp").forward(request, response);	}
	

}
