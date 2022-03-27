package tw.com.eeit.test;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/page/HelloWorldServlet")
public class HelloWorld extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");

		String localMyName = request.getParameter("myName");
		String localMyAge = request.getParameter("myAge");
		String[] localMyHobby = request.getParameterValues("myHobby");

		PrintWriter out = response.getWriter();

		out.write("<div>你的名字是：" + localMyName + "</div>");
		out.write("<div>你的年齡是：" + localMyAge + "歲</div>");

		for(String item:localMyHobby) {
			
			out.write("<div>你的興趣是：" + item + "</div>");
			
		}
		
		out.close();

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
