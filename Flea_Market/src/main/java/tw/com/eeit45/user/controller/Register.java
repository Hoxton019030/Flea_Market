package tw.com.eeit45.user.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.User;

import tw.com.eeit45.user.model.DAO.UserDAO;
import tw.com.eeit45.user.model.DAO.UsersDAOImp;
import tw.com.eeit45.user.model.bean.Users;
import tw.com.eeit45.user.model.service.UsersServiceImp;

/**
 * Servlet implementation class Regiser
 */
@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		UsersServiceImp uService = new UsersServiceImp();
		String account = request.getParameter("account");
		String password = request.getParameter("password");
		String username = request.getParameter("username");
		Users users = new Users(account, password, username,"");
		uService.addUser(users);
		System.out.println("使用者新增成功");
		request.getRequestDispatcher("/Login.jsp").forward(request, response);

	}

}
