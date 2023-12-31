package ru.mtusi.phonebook.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ru.mtusi.phonebook.entity.PhonebookTableEntity;

import java.util.List;

@Repository("PhonebookTableDAOImpl")
public class PhonebookTableDAOImpl implements PhonebookTableDAO {
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<PhonebookTableEntity> getAll() {
        Session session = sessionFactory.getCurrentSession();
        List<PhonebookTableEntity> phonebookTableEntities =
                session.createQuery("select a from PhonebookTableEntity a", PhonebookTableEntity.class).getResultList();
        System.out.println(phonebookTableEntities);
        return phonebookTableEntities;
    }

    @Override
    public void savePhonebookTable(PhonebookTableEntity phonebookTableEntity) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(phonebookTableEntity);
    }

    @Override
    public PhonebookTableEntity getPhonebookTableEntity(long id) {
        Session session = sessionFactory.getCurrentSession();

        PhonebookTableEntity phonebookTableEntity = session.get(PhonebookTableEntity.class, id);
        return phonebookTableEntity;
    }

    @Override
    public void deletePhonebookTableEntity(long id) {
        Session session = sessionFactory.getCurrentSession();

        Query<PhonebookTableEntity> query = session.createQuery("delete from " +
                "PhonebookTableEntity where id = :PhonebookTableEntityId");
        query.setParameter("PhonebookTableEntityId", id);
        query.executeUpdate();
    }
}
