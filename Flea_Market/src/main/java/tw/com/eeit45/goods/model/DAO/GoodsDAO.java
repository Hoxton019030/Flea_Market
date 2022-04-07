package tw.com.eeit45.goods.model.DAO;

import java.util.List;

import tw.com.eeit45.goods.model.bean.Goods;

public interface GoodsDAO {
		boolean addGoods(Goods goods);
		void deleteGoods(String number);
		void updateGoods(Goods goods);
		List<Goods> findAllGoods();
		List<Goods> findGoodsByAccount (String account);
}
