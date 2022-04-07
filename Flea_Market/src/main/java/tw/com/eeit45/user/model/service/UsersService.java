package tw.com.eeit45.user.model.service;

import java.util.List;

import tw.com.eeit45.user.model.bean.Users;

public interface UsersService {
	void addUser(Users user);
	void deleteUser(String account);
	void updateUSer(Users user);
	List<Users> findUser(int account);
	List<Users> findAllUser();
	Users findUserByAccout(String account);
	Users login(Users s);
	
	
	
	
	

}
