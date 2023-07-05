import entity.PhonebookTableEntity;
import org.hibernate.Session;
import untils.HibernateUntil;

public class Main {
    public static void main(String[] args) {
        Session session = HibernateUntil.getSessionFactory().openSession();
        session.beginTransaction();
        PhonebookTableEntity list = session.get(PhonebookTableEntity.class, 2);
        System.out.println(list.toString());
        HibernateUntil.shutdown();
    }
}
