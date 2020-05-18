package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class studentDAO {

	
	public student getStudentName(int rollno) {
		student s=new student();
		s.rollno=rollno;
		String url="jdbc:mysql://localhost:3306/abc";
		String uname="root";
		String pwd="lokesh";
		String query="select sname from student where rollno="+rollno;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection(url, uname,pwd);
			
			Statement st=con.createStatement();
			 ResultSet rs = st.executeQuery(query);
			rs.next();
			String name = rs.getString(1);
			s.sname=name;
			st.close();
			con.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return s;
	
	}
	
	public void addStudent(student s) {
		
		String url="jdbc:mysql://localhost:3306/abc";
		String uname="root";
		String pwd="lokesh";
		String query="insert into student values(?,?)";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection(url, uname,pwd);
			
			 PreparedStatement st = con.prepareStatement(query);
			 st.setInt(1, s.rollno);
			 st.setString(2, s.sname);
			 st.executeUpdate();

			st.close();
			con.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
