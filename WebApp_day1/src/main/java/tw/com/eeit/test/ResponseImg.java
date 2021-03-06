package tw.com.eeit.test;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ResponseImg")
public class ResponseImg extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("image/jpeg");

		ServletContext context = getServletContext();
		String contextPath = context.getRealPath(""); // 執行當下的路徑
		String imgPath = contextPath + "Raven.jpg";

		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(imgPath));

		byte[] bytes = bis.readAllBytes();

		bis.close();

		ServletOutputStream out = response.getOutputStream();

		out.write(bytes);
		
		out.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
