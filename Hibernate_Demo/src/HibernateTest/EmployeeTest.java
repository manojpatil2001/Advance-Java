package HibernateTest;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

public class EmployeeTest {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.addAnnotatedClass(Employeee.class).configure();

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();

		Criteria criteria = ss.createCriteria(Employeee.class);

		criteria.add(Restrictions.like("name", "%a%"));
		List l =criteria.list();
		
		System.out.println(l);
		
		ss.close();

	}

}
