
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/ShoppingCartAdd")
public class ShoppingCartAdd extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String localAdd = request.getParameter("add");
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();

		HttpSession session = request.getSession();
		ArrayList aL = (ArrayList) session.getAttribute("myShoppingCart");

		if (aL == null) {
			ArrayList<String> newAL = new ArrayList<String>();
			newAL.add(localAdd);
			session.setAttribute("myShoppingCart", newAL);
		}

		if (aL != null) {
			aL.add(localAdd);
			session.setAttribute("myShoppingCart", aL);
		}

		out.write("你已在購物車新增" + localAdd);

		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
