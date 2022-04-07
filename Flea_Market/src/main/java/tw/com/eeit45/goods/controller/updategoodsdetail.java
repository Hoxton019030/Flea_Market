package tw.com.eeit45.goods.controller;

import java.io.IOException;
import java.io.InputStream;
import java.util.Base64;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import tw.com.eeit45.goods.model.bean.Goods;
import tw.com.eeit45.goods.model.service.GoodsServiceImp;

/**
 * Servlet implementation class updategoodsdetail
 */
@WebServlet("/updategoodsdetail")
public class updategoodsdetail extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		GoodsServiceImp gService = new GoodsServiceImp();

		request.setCharacterEncoding("UTF-8");
		String username = request.getParameter("username");
		String goodsname = request.getParameter("goodsname");
		String goodsprice = request.getParameter("goodsprice");
		String goodsvolume = request.getParameter("goodsvolume");
		String goodsdiscribe = request.getParameter("goodsdiscribe");
		Part p = request.getPart("goodsimage");
		InputStream inputStream = p.getInputStream();
		byte[] bytes = inputStream.readAllBytes();
		String encodedString = "data:image/jpg;base64,"+Base64.getEncoder().encodeToString(bytes);
		
		Goods g = new Goods(username, goodsname, goodsprice, goodsvolume, goodsdiscribe, goodsdiscribe);
		gService.updateGoods(g);


	}

}
