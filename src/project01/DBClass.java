package project01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


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
}