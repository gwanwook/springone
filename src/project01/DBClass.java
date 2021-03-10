package project01;

public class DBClass {
	private String url = "jdbc:oracle:thin:@210.108.48.214:1521:xe";
	private String id = "springone";
	private int pwd = 1234;
	
	public DBClass() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
