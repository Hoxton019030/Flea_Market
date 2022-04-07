package tw.com.eeit45.goods.model.bean;

import java.io.Serializable;
import java.util.Arrays;

public class Goods implements Serializable {

	private static final long serialVersionUID = 1L;
	private String account;
	private String goodsName;
	private String goodsPrice;
	private String goodsVolume;
	private String goodsdiscribe;
	private String goodsimg;
	
	public Goods() {
	}



	public Goods(String account, String goodsName, String goodsPrice, String goodsVolume, String goodsdiscribe,
			String goodsimg) {
		super();
		this.account = account;
		this.goodsName = goodsName;
		this.goodsPrice = goodsPrice;
		this.goodsVolume = goodsVolume;
		this.goodsdiscribe = goodsdiscribe;
		this.goodsimg = goodsimg;
	}


	public void setAccount(String account) {
		this.account = account;
	}


	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}


	public void setGoodsPrice(String goodsPrice) {
		this.goodsPrice = goodsPrice;
	}


	public void setGoodsVolume(String goodsVolume) {
		this.goodsVolume = goodsVolume;
	}


	public void setGoodsdiscribe(String goodsdiscribe) {
		this.goodsdiscribe = goodsdiscribe;
	}


	public void setGoodsimg(String goodsimg) {
		this.goodsimg = goodsimg;
	}





	@Override
	public String toString() {
		return "Goods [account=" + account + ", goodsName=" + goodsName + ", goodsPrice=" + goodsPrice
				+ ", goodsVolume=" + goodsVolume + ", goodsdiscribe=" + goodsdiscribe + ", goodsimg=" + goodsimg + "]";
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	public String getAccount() {
		return account;
	}


	public String getGoodsName() {
		return goodsName;
	}


	public String getGoodsPrice() {
		return goodsPrice;
	}


	public String getGoodsVolume() {
		return goodsVolume;
	}


	public String getGoodsdiscribe() {
		return goodsdiscribe;
	}


	public String getGoodsimg() {
		return goodsimg;
	}
	

	
}
