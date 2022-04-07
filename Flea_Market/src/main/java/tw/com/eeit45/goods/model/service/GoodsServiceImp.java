package tw.com.eeit45.goods.model.service;

import java.util.List;

import tw.com.eeit45.goods.model.DAO.GoodsDAOImp;
import tw.com.eeit45.goods.model.bean.Goods;

public class GoodsServiceImp implements GoodsService{
	GoodsDAOImp g=new GoodsDAOImp();
	@Override
	public boolean addGoods(Goods goods) {
		// TODO Auto-generated method stub
		g.addGoods(goods);
		return false;
	}

	@Override
	public void deleteGoods(String number) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateGoods(Goods goods) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Goods> findAllGoods(String name) {
		GoodsDAOImp goodsDAOImp = new GoodsDAOImp();
		List<Goods> goodslist = goodsDAOImp.findAllGoods();
		return goodslist;
	}

	@Override
	public List<Goods> findGoodsByAccount(String account) {
		GoodsDAOImp goodsDAOImp = new GoodsDAOImp();
		// TODO Auto-generated method stub
		List<Goods> goodslist = goodsDAOImp.findGoodsByAccount(account);
		return goodslist;
	}

}
