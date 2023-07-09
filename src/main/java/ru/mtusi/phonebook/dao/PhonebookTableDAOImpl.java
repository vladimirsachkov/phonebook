package ru.mtusi.phonebook.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ru.mtusi.phonebook.entity.PhonebookTableEntity;

import java.util.List;

@Repository("PhonebookTableDAOImpl")
public class PhonebookTableDAOImpl implements PhonebookTableDAO {
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    @Transactional
    public List<PhonebookTableEntity> getAll() {
        Session session = sessionFactory.getCurrentSession();
        List<PhonebookTableEntity> phonebookTableEntities =
                session.createQuery("select a from PhonebookTableEntity a", PhonebookTableEntity.class).getResultList();
        System.out.println(phonebookTableEntities);
        return phonebookTableEntities;
    }

    @Override
    @Transactional
    public void savePhonebookTable(PhonebookTableEntity phonebookTableEntity) {
        Session session = sessionFactory.getCurrentSession();
        session.save(phonebookTableEntity);
    }
}
