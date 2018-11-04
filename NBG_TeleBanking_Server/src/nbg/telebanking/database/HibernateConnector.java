package nbg.telebanking.database;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import nbg.telebanking.models.User;

public abstract class HibernateConnector {
	
	private static final Configuration config = new Configuration();
	private static SessionFactory sessionFactory = null;

	private static SessionFactory getSessionFactory() throws HibernateException {
		if (sessionFactory == null) {
			config.configure("hibernate.cfg.xml").addAnnotatedClass(User.class);
			sessionFactory = config.buildSessionFactory();
		}

		return sessionFactory;
	}

	protected static Session getSession(){
		SessionFactory factory = null;
		try{
		    factory = getSessionFactory();
		}catch(HibernateException e){
			e.printStackTrace();
		}
		return factory != null ? factory.openSession() : null;
	}
	

}
