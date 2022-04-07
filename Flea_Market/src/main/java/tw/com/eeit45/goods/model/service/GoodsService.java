package tw.com.eeit45.goods.model.service;

import java.util.List;

import tw.com.eeit45.goods.model.bean.Goods;

public interface GoodsService {
	boolean addGoods(Goods goods);
	void deleteGoods(String number);
	void updateGoods(Goods goods);
	List<Goods> findAllGoods(String name);
	List<Goods> findGoodsByAccount (String account);
}
