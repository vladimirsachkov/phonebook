package ru.mtusi.phonebook.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.mtusi.phonebook.dao.PhonebookTableDAO;
import ru.mtusi.phonebook.entity.PhonebookTableEntity;

import java.util.List;

@Service
@ComponentScan("ru.mtusi.phonebook.dao")
public class PhonebookTableServiceImpl implements PhonebookTableService {

    @Autowired
    public PhonebookTableDAO phonebookTableDAO;

    @Override
    @Transactional
    public List<PhonebookTableEntity> getAll() {
        return phonebookTableDAO.getAll();
    }

    @Override
    @Transactional
    public void savePhonebookTable(PhonebookTableEntity phonebookTableEntity) {
        phonebookTableDAO.savePhonebookTable(phonebookTableEntity);
    }

    @Override
    @Transactional
    public PhonebookTableEntity getPhonebookTableEntity(long id) {
        return phonebookTableDAO.getPhonebookTableEntity(id);
    }
}
