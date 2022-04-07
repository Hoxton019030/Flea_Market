package tw.com.eeit45.user.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tw.com.eeit45.conn.ConnectionFactory;
import tw.com.eeit45.user.model.service.UsersServiceImp;

/**
 * Servlet implementation class Deleteuser
 */
@WebServlet("/Deleteuser.do")
public class Deleteuser extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String number = request.getParameter("number");
		ConnectionFactory conn = new ConnectionFactory();
		UsersServiceImp uService = new UsersServiceImp();
		uService.deleteUser(number);
		request.getRequestDispatcher("admin_user.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

}
