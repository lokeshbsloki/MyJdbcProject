package DAO;

public class DataAccessObjectModel {

	public static void main(String[] args) {
		
		studentDAO dao=new studentDAO();
		 student name = dao.getStudentName(1);
		System.out.println("name is = "+name.sname);
		 student name1 = dao.getStudentName(2);
		System.out.println("name is = "+name1.sname);
		student s2 = new student();
		s2.rollno=8;
		s2.sname="sowmya";
		dao.addStudent(s2);
		
	}
}
