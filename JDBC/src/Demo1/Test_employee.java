package Demo1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Test_employee {

	public static void main(String[] args) throws Exception {

		Class.forName("com.mysql.jdbc.Driver");  
		Connection con=DriverManager.getConnection(  "jdbc:mysql://localhost:3306/batch134","root","root");  

		System.out.println("connection done");
		Statement st = con.createStatement();
		
		String insert="insert into employee values(1,'Rushi','Pune')";
		st.execute(insert);
		System.out.println("insert data");
		
//		String update= "update employee set name='raj' where id = 1";
//		st.execute(update);
//
//
//		
//		String delete="delete from employee where id= 1";
//		st.execute(delete);
//		System.out.println("insert data");
		
		
	}

}
