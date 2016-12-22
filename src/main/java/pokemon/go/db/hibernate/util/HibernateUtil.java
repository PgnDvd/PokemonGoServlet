package pokemon.go.db.hibernate.util;


import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Properties;

import org.apache.commons.io.IOUtils;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import pokemon.go.db.hibernate.model.MoveStatic;
import pokemon.go.db.hibernate.model.PokemonEvolution;
import pokemon.go.db.hibernate.model.PokemonMove;
import pokemon.go.db.hibernate.model.PokemonStatic;


public class HibernateUtil {
	//Annotation based configuration
	private static SessionFactory sessionAnnotationFactory;
	private static Session session;


	private static SessionFactory buildSessionAnnotationFactory() {
		try {
			// Create the SessionFactory from hibernate.cfg.xml
			Configuration configuration = new Configuration();
			configuration.configure("hibernate.cfg.xml");
			configuration.addAnnotatedClass(PokemonStatic.class);
			configuration.addAnnotatedClass(MoveStatic.class);
			configuration.addAnnotatedClass(PokemonMove.class);
			configuration.addAnnotatedClass(PokemonEvolution.class);
			configuration.setProperty("hibernate.hbm2ddl.auto", "update");
//			configuration.setProperty("hibernate.hbm2ddl.auto", "create");
			configuration.setProperty("hibernate.show_sql", "false");
			System.out.println("Hibernate Annotation Configuration loaded");

			ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
			System.out.println("Hibernate Annotation serviceRegistry created");

			SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);

			return sessionFactory;
		}
		catch (Throwable ex) {
			// Make sure you log the exception, as it might be swallowed
			System.err.println("Initial SessionFactory creation failed." + ex);
			throw new ExceptionInInitializerError(ex);
		}
	}


	private static SessionFactory getSessionAnnotationFactory() {
		if(sessionAnnotationFactory == null) sessionAnnotationFactory = buildSessionAnnotationFactory();
		return sessionAnnotationFactory;
	}

	public static void commit(Object obj){
		session = getSession();
		Transaction transaction = session.beginTransaction();
		try{
			session.saveOrUpdate(obj);
			transaction.commit();
		}
		catch(Exception e){
			transaction.rollback();
			e.printStackTrace();
		}
	}

	public static Session getSession() {
		if(session == null){
			SessionFactory sessionFactory = getSessionAnnotationFactory();
			System.out.println("opening session");
			session = sessionFactory.openSession();
		}
		return session;
	}


	public static void close(){
		if(sessionAnnotationFactory!=null){
			sessionAnnotationFactory.close();
		}
	}
	
	public static String getSourceAsString(String spec) throws MalformedURLException, IOException {
		URL url = new URL(spec);

		URLConnection urlConn = url.openConnection();
		urlConn.setRequestProperty("User-Agent", "cheese");

		InputStream is = urlConn.getInputStream();

		String source = IOUtils.toString(is);
		return source;
	}

}
