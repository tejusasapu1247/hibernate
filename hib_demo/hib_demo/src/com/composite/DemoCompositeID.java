package com.composite;
import java.util.Date;
import org.hibernate.*;
import com.bookapp.dao.MySessionFactory;
public class DemoCompositeID {
	public static void main(String[] args) {
		SessionFactory factory=MySessionFactory.getSessionFactory();
		Session session=factory.openSession();
		BookId id=new BookId("234", "java");
		Book book=new Book(id, "john", new Date(), 4000);
		Transaction tr=session.getTransaction();
		try {
			tr.begin();
			session.save(book);
			tr.commit();
		}catch (HibernateException e) {
			tr.rollback();
		}
		
	}

}
