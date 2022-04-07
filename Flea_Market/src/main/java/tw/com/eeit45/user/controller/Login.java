package tw.com.eeit45.user.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.catalina.Session;

import tw.com.eeit45.user.model.bean.Users;
import tw.com.eeit45.user.model.service.UsersServiceImp;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String localAccount = request.getParameter("account");
		String localPassword = request.getParameter("password");

		Users u = new Users();
		
		u.setAccount(localAccount);
		u.setPassword(localPassword);
		System.out.println(u);
		Users loginUser = new UsersServiceImp().login(u);
		System.out.println(loginUser);
		HttpSession session = request.getSession();

		if (loginUser != null) {
			session.setAttribute("loginSuccessUser", loginUser);
			request.getRequestDispatcher("/message.jsp").forward(request, response);
		}

	}

}
