
import org.hibernate.cfg.Configuration;      
import org.hibernate.SessionFactory;

public class BaseDao {

    private static SessionFactory factory = null; 

    private BaseDao() {
  
    }

    public static SessionFactory getInstance() {
        if (factory == null) {
            return new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        }
        return factory;
    }
}
        
