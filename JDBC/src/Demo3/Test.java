package Demo3;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Test {
	public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysql.jdbc.Driver");  
		Connection con=DriverManager.getConnection(  "jdbc:mysql://localhost:3306/batch134","root","root");  
		
		Statement st=con.createStatement();

		
//		String insert= "insert into bank values(1432,'State Bank of india','Shahada')";
//		st.execute(insert);
		
//		String update="update bank set Bank_name='IDBI' where Ac_no=4294";
//		st.execute(update);

		
//		String delete="delete from bank where Ac_no=4294";
//		st.execute(delete);
		  
		System.out.println("****************");
		
		ResultSet rs=st.executeQuery("select*from bank");
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
		}
		
		
		
		
	}

}
