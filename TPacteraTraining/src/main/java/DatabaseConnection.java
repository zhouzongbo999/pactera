

import java.sql.DriverManager;

import com.mysql.jdbc.Connection;

public class DatabaseConnection {
	static{
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static Connection createConnection(){
		String username="root";
//		String password="admin";
		String password="123";
		String url="jdbc:mysql://localhost:3306/test";
		Connection conn = null;
		try {
			conn=(Connection) DriverManager.getConnection(url, username, password);
			System.out.println("connection success!");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}
}
