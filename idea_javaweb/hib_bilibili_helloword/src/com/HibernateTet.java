import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.BootstrapServiceRegistryBuilder;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import org.hibernate.service.ServiceRegistry;
import org.junit.Test;


import java.sql.Date;

import  static org.junit.Assert.*;
public class HibernateTet {

    @Test
    public void test() {
        SessionFactory sessionFactory =null;
        Configuration configuration = new Configuration().configure();
        configuration.addClass(News.class);
        ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties())
                .build();//4.2版本后 注册服务
        sessionFactory = new MetadataSources(serviceRegistry).buildMetadata().buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        News news =new  News("Java","ym",new Date(new java.util.Date().getTime()));
        session.save(news);
        transaction.commit();
        session.close();
        sessionFactory.close();

    }
}
