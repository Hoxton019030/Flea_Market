package tw.com.eeit45.goods.model.SQLSyntax;

public class SQLSyntaxCollection_Goods {

	private String addGoods ="USE Flea_Market INSERT INTO [dbo].[Goods] VALUES ( ? , ? , ? , ? , ? , ?)";
	private String deleteGoods ="USE Flea_Market DELETE FROM [dbo].[Goods] WHERE 編號　= ? ";
	private String updateGoods = "USE Flea_Market UPDATE [dbo].[Goods] SET [商品名稱]= ?,[商品價錢]=?,[商品描述]=? ,[商品圖片]=? WHERE 編號 = ?"; 
	private String findGoods = "SELECT * FROM [Flea_Market].[dbo].[Goods] WHERE 編號 = ? ";
	private String findAllGoods = "SELECT * FROM [Flea_Market].[dbo].[Goods] ";
	private String findGoodsByAccount = "SELECT * FROM [Flea_Market].[dbo].[Goods] WHERE 帳號=?";

	public SQLSyntaxCollection_Goods() {
	}

	public SQLSyntaxCollection_Goods(String addGoods, String deleteGoods, String updateGoods, String findGoods) {
		this.addGoods = addGoods;
		this.deleteGoods = deleteGoods;
		this.updateGoods = updateGoods;
		this.findGoods = findGoods;
	}

	@Override
	public String toString() {
		return "SQLSyntaxCollection_Goods [addGoods=" + addGoods + ", deleteGoods=" + deleteGoods + ", updateGoods="
				+ updateGoods + ", findGoods=" + findGoods + "]";
	}

	public String getAddGoods() {
		return addGoods;
	}

	public void setAddGoods(String addGoods) {
		this.addGoods = addGoods;
	}

	public String getDeleteGoods() {
		return deleteGoods;
	}

	public void setDeleteGoods(String deleteGoods) {
		this.deleteGoods = deleteGoods;
	}

	public String getUpdateGoods() {
		return updateGoods;
	}

	public void setUpdateGoods(String updateGoods) {
		this.updateGoods = updateGoods;
	}

	public String getFindGoods() {
		return findGoods;
	}

	public void setFindGoods(String findGoods) {
		this.findGoods = findGoods;
	}

	public String getFindAllGoods() {
		return findAllGoods;
	}

	public void setFindAllGoods(String findAllGoods) {
		this.findAllGoods = findAllGoods;
	}

	public String getFindGoodsByAccount() {
		return findGoodsByAccount;
	}

	public void setFindGoodsByAccount(String findGoodsByAccount) {
		this.findGoodsByAccount = findGoodsByAccount;
	}

}
