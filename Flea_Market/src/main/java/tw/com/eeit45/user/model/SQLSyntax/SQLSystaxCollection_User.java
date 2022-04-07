package tw.com.eeit45.user.model.SQLSyntax;

public class SQLSystaxCollection_User {
	
	private String addUser ="USE Flea_Market INSERT INTO [dbo].[USERS] VALUES ( ? , ? , ? )";
	private String deleteUser ="USE Flea_Market DELETE FROM [dbo].[USERS] WHERE 編號　= ? ";
	private String updateUser = "USE Flea_Market UPDATE [dbo].[USERS] SET [姓名]= ?,[帳號]=?,[密碼]=? WHERE 編號 = ?";
	private String findUser = "SELECT [編號],[姓名],[帳號],[密碼] FROM [Flea_Market].[dbo].[USERS]WHERE 編號 = ? ";
	private String findAllUser = "SELECT [編號],[姓名],[帳號],[密碼] FROM [Flea_Market].[dbo].[USERS]";
	private String findUserByAccount ="SELECT [編號],[姓名],[帳號],[密碼] FROM [Flea_Market].[dbo].[USERS] WHERE  帳號 = ? ";
	public String getAddUser() {
		return addUser;
	}
	public void setAddUser(String addUser) {
		this.addUser = addUser;
	}
	public String getDeleteUser() {
		return deleteUser;
	}
	public void setDeleteUser(String deleteUser) {
		this.deleteUser = deleteUser;
	}
	public String getUpdateUser() {
		return updateUser;
	}
	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}
	public String getFindUser() {
		return findUser;
	}
	public void setFindUser(String findUser) {
		this.findUser = findUser;
	}
	public String getFindUserByAccount() {
		return findUserByAccount;
	}
	public void setFindUserByAccount(String findUserByAccount) {
		this.findUserByAccount = findUserByAccount;
	}
	public String getFindAllUser() {
		return findAllUser;
	}
	public void setFindAllUser(String findAllUser) {
		this.findAllUser = findAllUser;
	}
	

}
