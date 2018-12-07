package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import model.Info;
import util.DbHelper;

public class InfoDao {
	public int AddInfo(String text) throws Exception {
		String sql = "Insert into info (text) values('" + text + "')";
		PreparedStatement ps = DbHelper.getConnection().prepareStatement(sql);
		int flag = ps.executeUpdate();

		return flag;
	}

	public List<Info> getInfoById(String thatid) throws Exception {
		String sql = "SELECT * FROM info WHERE id=" + thatid;

		PreparedStatement ps = DbHelper.getConnection().prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		List<Info> infos = new ArrayList<Info>();
		Info info = null;
		while (rs.next()) {
			int id = rs.getInt("id");
			String text = rs.getString("text");
			String datetime = rs.getString("datetime");
			System.out.println(id + text + datetime);
			info = new Info(id, text, datetime);
			infos.add(info);
		}
		return infos;
	}

	public List<Info> getAllInfo() throws Exception {
		String sql = "SELECT * FROM info order by 1 desc";
		PreparedStatement ps = DbHelper.getConnection().prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		List<Info> infos = new ArrayList<Info>();
		Info info = null;
		while (rs.next()) {
			int id = rs.getInt("id");
			String text = rs.getString("text");
			String datetime = rs.getString("datetime");
//			System.out.println(id + text + datetime);
			info = new Info(id, text, datetime);
			infos.add(info);
		}
		return infos;
	}

	public int deleteInfo(int id) throws Exception {
		String sql = "DELETE FROM info WHERE id =" + id;
		PreparedStatement ps = DbHelper.getConnection().prepareStatement(sql);
		int flag = ps.executeUpdate();

		return flag;
	}
}
