import java.io.*;
import java.sql.*;

class Main {
	public static void main (String args[]) throws Exception {
		String url = "jdbc:mysql://localhost:3306/test";
		String username = "root";
		String password = "P@ssw0rd";
		String query = "SELECT * FROM b";
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,username,password);
		System.out.print("\nConnection established successfully");
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		rs.next();
		String name = rs.getString("id");
		System.out.print("\n"+name);
		st.close();
		con.close();
		System.out.print("\nConnection closed.");
	}
}