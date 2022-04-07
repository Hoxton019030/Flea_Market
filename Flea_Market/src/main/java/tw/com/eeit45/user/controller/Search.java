package tw.com.eeit45.user.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import tw.com.eeit45.user.model.bean.Users;
import tw.com.eeit45.user.model.service.UsersService;
import tw.com.eeit45.user.model.service.UsersServiceImp;

/**
 * Servlet implementation class Search
 */
@WebServlet("/search")
public class Search extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String searchName = request.getParameter("searchName");
		UsersService uService = new UsersServiceImp();
		Users searchResult = uService.findUserByAccout(searchName);
		List<Users>aL= new ArrayList<Users>();
		aL.add(searchResult);
		HttpSession session = request.getSession();
		session.setAttribute("userlist", aL);
		request.getRequestDispatcher("alluser.jsp").forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
