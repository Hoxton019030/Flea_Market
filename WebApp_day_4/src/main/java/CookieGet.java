
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.util.URLEncoder;

@WebServlet("/CookieGet")
public class CookieGet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
//		String unc = new URLEncoder().encode("好窩", "UTF-8");
		

		Cookie[] cs = request.getCookies();

		for (Cookie c : cs) {
			if (c.getName().equals("myName")) {
				out.write("<div>你的名字:" + c.getValue() + "</div>");
			}
			if (c.getName().equals("myItem")) {
				out.write("<div>你的物品:" + c.getValue() + "</div>");
			}
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
