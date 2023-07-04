import org.hibernate.Session;
import untils.HibernateUntil;

public class Main {
    public static void main(String[] args) {
        Session session = HibernateUntil.getSessionFactory().openSession();
        session.close();
        HibernateUntil.shutdown();
    }
}
