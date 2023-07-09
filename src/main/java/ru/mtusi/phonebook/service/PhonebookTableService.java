package ru.mtusi.phonebook.service;

import ru.mtusi.phonebook.entity.PhonebookTableEntity;

import java.util.List;

public interface PhonebookTableService {
    public List<PhonebookTableEntity> getAll();

    public void savePhonebookTable(PhonebookTableEntity phonebookTableEntity);

    public PhonebookTableEntity getPhonebookTableEntity(long id);

    public void deletePhonebookTableEntity(long id);
}
