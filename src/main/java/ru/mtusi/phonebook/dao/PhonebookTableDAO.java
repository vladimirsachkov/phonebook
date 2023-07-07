package ru.mtusi.phonebook.dao;

import ru.mtusi.phonebook.entity.PhonebookTableEntity;

import java.util.List;

public interface PhonebookTableDAO {

    public List<PhonebookTableEntity> getAll();
}
