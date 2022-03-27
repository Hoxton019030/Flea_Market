package tw.com.eeit.test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RealPathTest")
public class RealPathTest extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ServletContext context = getServletContext();

		String realPath = context.getRealPath("") + "A.jpg";
		
		InputStream in = new FileInputStream(realPath);
		byte[] bytes = in.readAllBytes();

		in.close();
		
		response.setContentType("image/jpeg");
		ServletOutputStream out = response.getOutputStream();
		
		out.write(bytes);
		
		out.close();
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
