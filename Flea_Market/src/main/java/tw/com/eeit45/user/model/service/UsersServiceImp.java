package tw.com.eeit45.user.model.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import org.apache.catalina.connector.Response;

import tw.com.eeit45.conn.ConnectionFactory;
import tw.com.eeit45.user.model.DAO.UsersDAOImp;
import tw.com.eeit45.user.model.bean.Users;

public class UsersServiceImp implements UsersService{
	UsersDAOImp usersDAOImp = new UsersDAOImp();

	@Override //2022-4-4 測試ok
	public void addUser(Users user) {
		// TODO Auto-generated method stub
		usersDAOImp.addUser(user);
	}

	/**
	 * 根據使用者的ID，刪除指定使用者，刪除成功則回傳True，失敗則為False
	 *@param userId 使用者ID
	 *
	 *@return boolean 預設回傳False，刪除成功則回傳True
	 */
	@Override
	public void deleteUser(String account) {
		usersDAOImp.deleteUser(account);
	}

	@Override
	public void updateUSer(Users user) {
		// TODO Auto-generated method stub
		usersDAOImp.updateUSer(user);
	}

	@Override //2022-4-4 測試ok
	public List<Users> findUser(int account) {
		List<Users> findUser = usersDAOImp.findUser(account);
		// TODO Auto-generated method stub
		return findUser;
		
	}
	
	@Override
	public Users findUserByAccout(String account) {
		Users findUserByAccount = usersDAOImp.findUserByAccount(account);
		return findUserByAccount; 
	}

	@Override
	public List<Users> findAllUser() {
		List<Users> findAllUser = usersDAOImp.findAllUser();
		// TODO Auto-generated method stub
		return findAllUser;
	}
	
	@Override
	public Users login(Users u) {
		Users returnUserBean = null;
		Connection conn = ConnectionFactory.getConn();
		UsersDAOImp uDAO = new UsersDAOImp();
		Users userFromDB = uDAO.findUserByAccount(u.getAccount());
		
		if(u.getPassword().equals(userFromDB.getPassword())) {
			returnUserBean=userFromDB;
		}
		
		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return returnUserBean;
		// TODO Auto-generated method stub
		
	}



}
