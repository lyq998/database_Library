package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import model.User;
import util.DbHelper;

public class UserDao {
	// �û���¼
	public boolean Login(String username, String password) throws Exception {
		boolean flag = false;
		String thispassword = null;
		String sql = "Select * From users Where username ='" + username + "'";

		PreparedStatement ps = DbHelper.getConnection().prepareStatement(sql);
		ResultSet rs = ps.executeQuery();

		if (rs.next()) {
			// trim()ȥ����β�ո�
			thispassword = rs.getString("password").trim();
		}

		if (thispassword.equals(password)) {
			flag = true;
		}

		return flag;
	}

	// ע���û�
	public int insertUser(User user) throws Exception {
		String sql = "Insert into users (username,password) values('" + user.getUsername() + "','" + user.getPassword()
				+ "')";
		PreparedStatement ps = DbHelper.getConnection().prepareStatement(sql);
		int flag = ps.executeUpdate();

		return flag;
	}
}
