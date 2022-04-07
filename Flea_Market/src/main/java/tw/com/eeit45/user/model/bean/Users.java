package tw.com.eeit45.user.model.bean;

import java.io.Serializable;

public class Users implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String account;
	private String password;
	private String userName;
	private String number;
	
	

	public Users() {
	}


	public Users(String account, String password, String userName, String number) {
		this.account = account;
		this.password = password;
		this.userName = userName;
		this.number = number;
	}
	


	@Override
	public String toString() {
		return "Users [account=" + account + ", password=" + password + ", userName=" + userName + ", number=" + number
				+ "]";
	}


	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}


	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}
}
