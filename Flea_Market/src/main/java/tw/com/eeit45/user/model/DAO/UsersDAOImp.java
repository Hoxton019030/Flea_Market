package tw.com.eeit45.user.model.DAO;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.catalina.User;

import tw.com.eeit45.conn.ConnectionFactory;
import tw.com.eeit45.user.model.SQLSyntax.SQLSystaxCollection_User;
import tw.com.eeit45.user.model.bean.Users;

public class UsersDAOImp implements UserDAO {

	@Override
	public boolean addUser(Users user) {
		SQLSystaxCollection_User SQL = new SQLSystaxCollection_User();
		Connection conn = ConnectionFactory.getConn();
		boolean succeed = false;
		try {
			PreparedStatement pstmt = conn.prepareStatement(SQL.getAddUser());
			pstmt.setString(1, user.getUserName());
			pstmt.setString(2, user.getAccount());
			pstmt.setString(3, user.getPassword());
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

	/**
	 *@param
	 *@dis
	 */
	@Override
	public  void deleteUser(String userID) {
		SQLSystaxCollection_User SQL = new SQLSystaxCollection_User();
		Connection conn = ConnectionFactory.getConn();
		try {
			CallableStatement pstmt = conn.prepareCall(SQL.getDeleteUser());
			pstmt.setString(1, userID);
			int update = pstmt.executeUpdate();
			System.out.println("成功刪除第" + userID + "筆");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void updateUSer(Users user) {
		SQLSystaxCollection_User SQL = new SQLSystaxCollection_User();
		Connection conn = ConnectionFactory.getConn();
		try {
			PreparedStatement pstmt = conn.prepareStatement(SQL.getUpdateUser());

			pstmt.setString(1, user.getUserName());
			pstmt.setString(2, user.getAccount());
			pstmt.setString(3, user.getPassword());
			pstmt.setString(4, user.getNumber());
			int count = pstmt.executeUpdate();
			System.out.println("資料已更新");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public List<Users> findUser(int account) {
		SQLSystaxCollection_User SQL = new SQLSystaxCollection_User();
		Connection conn = ConnectionFactory.getConn();
		List<Users> usersList = new ArrayList<Users>();

		try {
			PreparedStatement pstmt = conn.prepareStatement(SQL.getFindUser());
			pstmt.setInt(1, account);
			ResultSet rs = pstmt.executeQuery();
			rs.next();
			Users u = new Users();
			u.setUserName(rs.getString("姓名"));
			u.setAccount(rs.getString("帳號"));
			u.setPassword(rs.getString("密碼"));
			u.setNumber(rs.getString("編號"));
			usersList.add(u);

			System.out.println(usersList);

			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return usersList;

	}

	@Override
	public List<Users> findAllUser() {
		List<Users> usersList = new ArrayList<Users>();
		SQLSystaxCollection_User SQL = new SQLSystaxCollection_User();
		Connection conn = ConnectionFactory.getConn();		
		try {
			PreparedStatement pstmt = conn.prepareStatement(SQL.getFindAllUser());
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
//				Users u = new Users(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4));
				Users u = new Users(rs.getString("帳號"), rs.getString("密碼"), rs.getString("姓名"), rs.getString("編號"));
				usersList.add(u);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return usersList;
	}

	@Override
	public Users findUserByAccount(String account) {

		SQLSystaxCollection_User SQL = new SQLSystaxCollection_User();
		Connection conn = ConnectionFactory.getConn();
		Users u = new Users();

		try {
			PreparedStatement pstmt = conn.prepareStatement(SQL.getFindUserByAccount());
			pstmt.setString(1, account);
			ResultSet rs = pstmt.executeQuery();
			rs.next();
			u.setNumber(rs.getString("編號"));
			u.setUserName(rs.getString("姓名"));
			u.setAccount(rs.getString("帳號"));
			u.setPassword(rs.getString("密碼"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return u;

	}

}
