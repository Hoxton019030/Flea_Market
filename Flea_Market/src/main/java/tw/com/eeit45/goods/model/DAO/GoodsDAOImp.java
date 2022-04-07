package tw.com.eeit45.goods.model.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import tw.com.eeit45.conn.ConnectionFactory;
import tw.com.eeit45.goods.model.SQLSyntax.SQLSyntaxCollection_Goods;
import tw.com.eeit45.goods.model.bean.Goods;

public class GoodsDAOImp implements GoodsDAO{

	@Override
	public boolean addGoods(Goods goods) {
		 SQLSyntaxCollection_Goods SQL = new SQLSyntaxCollection_Goods();
		Connection conn = ConnectionFactory.getConn();
		boolean succeed = false;
		try {
			PreparedStatement pstmt = conn.prepareStatement(SQL.getAddGoods());
			pstmt.setString(1, goods.getAccount());
			pstmt.setString(2, goods.getGoodsName());
			pstmt.setString(3, goods.getGoodsPrice());
			pstmt.setString(4, goods.getGoodsVolume());
			pstmt.setString(5, goods.getGoodsdiscribe());
			pstmt.setString(6, goods.getGoodsimg());
			int count = pstmt.executeUpdate();
			if (count > 1) {
				succeed = true;
			}
			System.out.println("資料已新增");
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return succeed;
	}

	@Override
	public void deleteGoods(String number) {
		
	}

	@Override
	public void updateGoods(Goods goods) {
		 SQLSyntaxCollection_Goods SQL = new SQLSyntaxCollection_Goods();
			Connection conn = ConnectionFactory.getConn();
try {
	PreparedStatement pstmt = conn.prepareStatement(SQL.getUpdateGoods());
	pstmt.setString(1, goods.getGoodsName());
	pstmt.setString(2, goods.getGoodsPrice());
	pstmt.setString(3, goods.getGoodsdiscribe());
	pstmt.setString(4, goods.getGoodsimg());
	pstmt.execute();
	conn.close();
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
		
	}

	@Override
	public List<Goods> findAllGoods() {
		 SQLSyntaxCollection_Goods SQL = new SQLSyntaxCollection_Goods();
			Connection conn = ConnectionFactory.getConn();
			List<Goods> goodsList=new ArrayList<Goods>();
			try {
				PreparedStatement pstmt = conn.prepareStatement(SQL.getFindAllGoods());
				ResultSet rs = pstmt.executeQuery();
				while(rs.next()) {
					Goods goods = new Goods();
					goods.setAccount(rs.getString("帳號"));
					goods.setGoodsName(rs.getString("商品名稱"));
					goods.setGoodsPrice(rs.getString("商品價錢"));
					goods.setGoodsVolume(rs.getString("商品數量"));
					goods.setGoodsdiscribe(rs.getString("商品描述"));
					goods.setGoodsimg(rs.getString("商品圖片"));
					goodsList.add(goods);
				}
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return goodsList;
	}

	@Override
	public List<Goods> findGoodsByAccount(String account) {
		 SQLSyntaxCollection_Goods SQL = new SQLSyntaxCollection_Goods();
			Connection conn = ConnectionFactory.getConn();
			List<Goods> goodsList=new ArrayList<Goods>();
			try {
				PreparedStatement pstmt = conn.prepareStatement(SQL.getFindGoodsByAccount());
				pstmt.setString(1, account);
				ResultSet rs = pstmt.executeQuery();
				while(rs.next()) {
					Goods goods = new Goods();
					goods.setAccount(rs.getString("帳號"));
					goods.setGoodsName(rs.getString("商品名稱"));
					goods.setGoodsPrice(rs.getString("商品價錢"));
					goods.setGoodsVolume(rs.getString("商品數量"));
					goods.setGoodsdiscribe(rs.getString("商品描述"));
					goods.setGoodsimg(rs.getString("商品圖片"));
					goodsList.add(goods);
				}
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return goodsList;
	}

}
