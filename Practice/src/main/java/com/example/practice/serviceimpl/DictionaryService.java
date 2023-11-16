package com.example.practice.serviceimpl;

import com.example.practice.dao.IDictionaryDao;
import com.example.practice.daoimpl.DictionaryDao;
import com.example.practice.model.Dictionary;
import com.example.practice.service.IDictionaryService;
import com.example.practice.util.ConnectDB;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class DictionaryService implements IDictionaryService {
    IDictionaryDao dictionaryDao = new DictionaryDao();
    @Override
    public List<Dictionary> findAll() {
        return null;
    }

    @Override
    public Dictionary findById(Integer id) {
        return dictionaryDao.findById(id);
    }

    @Override
    public boolean save(Dictionary dictionary) {
        return dictionaryDao.save(dictionary);
    }

    @Override
    public void deleteById(Integer id) {

    }
}
