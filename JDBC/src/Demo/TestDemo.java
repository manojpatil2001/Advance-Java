package Demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class TestDemo {

	public static void main(String[] args) throws Exception  {
	
		Class.forName("com.mysql.jdbc.Driver");  
		Connection con=DriverManager.getConnection( "jdbc:mysql://localhost:3306/batch134","root","root"); 
		System.out.println("Driver load");
		
		Statement st= con.createStatement();
		
//		String insert = "insert into student values(3,'Manoj','6000')";
//		st.execute(insert);
		
//		String update="update student set name='Raj' where id=3";
//		st.execute(update);
	
		String delete="delete from student where id=3";
		st.execute(delete);
			
		System.out.println("project done");
	}

}
