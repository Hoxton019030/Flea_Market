package tw.com.eeit45.user.model.SQLSyntax;

public class SQLSyntaxCollection_Table {

	private static String CreateTable = "USE Flea_Market CREATE TABLE USERS (編號 INT  NOT NULL IDENTITY PRIMARY KEY,姓名 NVARCHAR(12),帳號 NVARCHAR(12),密碼 NVARCHAR(12),)";
	private static String DropTable = "Drop table USERS";

	public static String getCreateTable() {
		return CreateTable;
	}

	public void setCreateTable(String createTable) {
		CreateTable = createTable;
	}

	public static String getDropTable() {
		return DropTable;
	}

	public void setDropTable(String dropTable) {
		DropTable = dropTable;
	}

}
