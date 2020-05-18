package demoPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.*;

import com.mysql.jdbc.PreparedStatement;

public class ToGetFullTable {

	public static void main(String[] args) throws Exception {
		
		String url="jdbc:mysql://localhost:3306/abc";
		String uname="root";
		String pwd="lokesh";
		int userid=7;
		String username="navya";
		String query="insert into student values (?,?)";
		
		//String query="insert into student values (6,'anvita')";

		//String query="insert into student values ("+userid+","+username+")";

		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,uname,pwd);
		
		 PreparedStatement st = (PreparedStatement) con.prepareStatement(query);
		 st.setInt(1, userid);
		 st.setString(2, username);
		 int count = st.executeUpdate();

		 System.out.println(count+" row affected");

		
		
		st.close();
		con.close();
	}
}
