package Demo1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.addAnnotatedClass(College.class).configure();

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();

		Transaction tx = ss.beginTransaction();

		
		
		College ans = new College(2,"psgvp mandal","Lonkheda");


		ss.save(ans);

//   ss.update(ans);

//	ss.delete(r1);
		tx.commit();

	

		System.out.println(ans);
	}

}
