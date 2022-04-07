package tw.com.eeit45.user.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import tw.com.eeit45.user.model.bean.Users;
import tw.com.eeit45.user.model.service.UsersServiceImp;

/**
 * Servlet implementation class update
 */
@WebServlet("/tranformData")
public class tranformData extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		UsersServiceImp uService = new UsersServiceImp();
		String number = request.getParameter("number");
		List<Users> aL = uService.findUser(Integer.valueOf(number));
		HttpSession session = request.getSession();
		session.setAttribute("menberInformation", aL);
		request.getRequestDispatcher("Updateuser.jsp").forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
