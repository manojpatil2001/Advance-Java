package Demo_2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Test_Product {

	public static void main(String[] args) throws Exception {

		Class.forName("com.mysql.jdbc.Driver");  
		Connection con=DriverManager.getConnection(  "jdbc:mysql://localhost:3306/batch134","root","root");  
		
		Statement ans=con.createStatement();
		
//		String insert="insert into product values(01,'pen',5)";
//		ans.execute(insert);
//		
//		String insert1="insert into product values(02,'pencil',10) ";
//		ans.execute(insert1);
		
		String rushi="insert into product values(03,'book',50) ";
		ans.execute(rushi);
		
	

//		String update="update product set name='pencil' where id=1";
//		ans.execute(update);
//		
//		String delete="delete from product where id=1";
//		ans.execute(delete);
//		System.out.println("******");
		
		
	}

}
