package tw.com.eeit45.user.model.DAO;

import java.util.List;

import tw.com.eeit45.user.model.bean.Users;

public interface UserDAO {
	
	boolean addUser(Users user);
	void deleteUser(String account);
	void updateUSer(Users user);
	List<Users> findUser(int account);
	List<Users> findAllUser();
	Users findUserByAccount (String account);
	
	

}
