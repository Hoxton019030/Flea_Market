package tw.com.eeit.test;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ServerInfoGet")
public class ServerInfoGet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ArrayList<String> aL;

	
	
	public ServerInfoGet(ArrayList<String> aL) {
		this.aL=aL;
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		ServletContext context = getServletContext();

		ArrayList<String> aLLLLLLL = (ArrayList<String>) context.getAttribute("myList");

		PrintWriter out = response.getWriter();
		for (String item : aLLLLLLL) {
			out.write("<div>" + item + "</div>");

		}
		out.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
