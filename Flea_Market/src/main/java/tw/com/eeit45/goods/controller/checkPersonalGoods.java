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
import tw.com.eeit45.user.model.service.UsersServiceImp;

/**
 * Servlet implementation class checkPersonalGoods
 */
@WebServlet("/checkPersonalGoods")
public class checkPersonalGoods extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public checkPersonalGoods() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String account = request.getParameter("account");
		System.out.println(account);
		GoodsServiceImp gService = new GoodsServiceImp();
		List<Goods> goodslist = gService.findGoodsByAccount(account);
		HttpSession session = request.getSession();
		session.setAttribute("goodslist", goodslist);
		System.out.println("列表"+goodslist);
		request.getRequestDispatcher("ShowPersonalGoods.jsp").forward(request, response);
	}

}
