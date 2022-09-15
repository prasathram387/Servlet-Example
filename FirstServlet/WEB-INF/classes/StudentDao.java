
import org.hibernate.cfg.Configuration;  
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.hibernate.Session;    
import org.hibernate.SessionFactory;    
import org.hibernate.Transaction;      

public class StudentDao {
     
    public int insertStudent(Student student) {

        Session session = null;
        Transaction transaction = null;
        try {
            session = BaseDao.getInstance().openSession();  
            transaction = session.beginTransaction();   
            int id = (Integer) session.save(student);  
            transaction.commit(); 
            return id;
        } catch (Exception error) {
            error.printStackTrace();
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return 0;
    }
}