package demoPackage;
import java.sql.*;

public class DemoClass {

	public static void main(String[] args) throws Exception {
		
		String url="jdbc:mysql://localhost:3306/abc";
		String uname="root";
		String pwd="lokesh";
		String query="select sname from student where rollno=1";
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection(url, uname,pwd);
		
		Statement st=con.createStatement();
		ResultSet rs = st.executeQuery(query);
		rs.next();
		String name=rs.getString("sname");
		System.out.println("my name is = "+name);
		st.close();
		con.close();
	}

}
