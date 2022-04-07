package tw.com.eeit45.goods.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import tw.com.eeit45.goods.model.bean.Goods;
import tw.com.eeit45.goods.model.service.GoodsServiceImp;

/**
 * Servlet implementation class updateGoods
 */
@WebServlet("/updateGoods.do")
public class updateGoods extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		GoodsServiceImp gService = new GoodsServiceImp();
		String account = request.getParameter("account");
		List<Goods> aL = gService.findGoodsByAccount(account);
		HttpSession session = request.getSession();
		session.setAttribute("goodsInformation", aL);
		request.getRequestDispatcher("Updategoods.jsp").forward(request, response);;
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
