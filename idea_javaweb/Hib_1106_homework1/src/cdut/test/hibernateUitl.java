package cdut.test;

import cdut.ym.Login;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class hibernateUitl {
    static SessionFactory sessionFactory;
    private Session session =null;
    private Transaction tx =null;
    static {
        try{
            Configuration config = new Configuration().configure();
            sessionFactory = config.buildSessionFactory();

        }catch (Exception e){
            System.out.println("static块中："+e.getMessage());
        }
    }
    //开启session
    public void openSession(){
        session = sessionFactory.openSession();
        tx=session.beginTransaction();
    }
    //保存信息
    public String saveMessage(Login login){
        try{
            openSession();
            session.save(login);
            //调用save方法将信息保存到数据库
            tx.commit();
            closeSession();
            return "保存信息成功";


        }catch(Exception e){
            e.printStackTrace();
            return "保存留言信息失败!";
        }
    }
    //关闭session
    public void closeSession(){
        session.close();
    }
}
