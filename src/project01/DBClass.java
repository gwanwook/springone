package project01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class DBClass {
	private String url = "jdbc:oracle:thin:@210.108.48.214:1521:xe";
	private String id = "springone";
	private String pwd = "1234";

	public DBClass() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	public void getMember() {
		String sql = "select * from newst1";
		try {
			Connection con = DriverManager.getConnection(url,id,pwd);
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			System.out.println("아이디\t이름\t나이");
			System.out.println("-----------------------");
			while(rs.next()) {
				System.out.println(rs.getString("id"));
				System.out.println(rs.getString("name"));
				System.out.println(rs.getInt("age"));
				System.out.println("=================");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public int modifyMember(Member m) {
		String sql = "update newst1 set name=?, age=? where id=?";
		int result = 0;
		try {
			Connection con = DriverManager.getConnection(url,id,pwd);
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(3, m.getId());
			ps.setString(1, m.getName());
			ps.setInt(2, m.getAge());
			result = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;	
	}

	public void saveMember(Member m) {
		String sql = "insert into newst1(id, name, age) values(?,?,?)";
		try {
			Connection con = DriverManager.getConnection(url, id, pwd);
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, m.getId());
			ps.setString(2, m.getName());
			ps.setInt(3, m.getAge());
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public int deleteMember(String id) {
		String sql = "delete from newst1 where id=?";
		int result = 0;
		try {
			Connection con = DriverManager.getConnection(url,this.id,pwd);
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, id);
			result = ps.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return result;
	}
}
