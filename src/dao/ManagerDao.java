package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import model.Manager;
import util.DbHelper;

public class ManagerDao {
	public boolean Login(Manager manager) throws Exception {
		boolean flag = false;
		String password = null;
		String sql = "Select * From manager Where managername ='" + manager.getManagername() + "'";

		PreparedStatement ps = DbHelper.getConnection().prepareStatement(sql);
		ResultSet rs = ps.executeQuery();

		if (rs.next()) {
			// trim()ȥ����β�ո�
			password = rs.getString("password").trim();
		}

		if (password.equals(manager.getPassword())) {
			flag = true;
		}

		return flag;
	}
}
