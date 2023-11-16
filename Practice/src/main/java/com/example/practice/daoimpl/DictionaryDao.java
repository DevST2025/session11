package com.example.practice.daoimpl;

import com.example.practice.dao.IDictionaryDao;
import com.example.practice.model.Dictionary;
import com.example.practice.util.ConnectDB;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class DictionaryDao implements IDictionaryDao {

    @Override
    public List<Dictionary> findAll() {
        return null;
    }

    @Override
    public Dictionary findById(Integer id) {
        Connection conn = ConnectDB.getConnection();
        Dictionary d = null;
        try {
            CallableStatement callSt = conn.prepareCall("{call proc_find_by_vocabulary(?)}");
            callSt.setInt(1, id);
            ResultSet rs = callSt.executeQuery();
            if (rs.next()) {
                d = new Dictionary();
                d.setImgUrl(rs.getString("img_url"));
                d.setVocabulary(rs.getString("vocabulary"));
                d.setDesc(rs.getString("desc"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            ConnectDB.closeConnection(conn);
        }
        return d;
    }

    @Override
    public boolean save(Dictionary dictionary) {
        Connection conn = ConnectDB.getConnection();
        Dictionary vocabulary = findById(dictionary.getId());
        if (vocabulary != null) {

        } else {
            try {
                CallableStatement callSt = conn.prepareCall("{call proc_insert_dictionary(?,?,?)}");
                callSt.setString(1, dictionary.getImgUrl());
                callSt.setString(2, dictionary.getVocabulary());
                callSt.setString(3, dictionary.getDesc());
                callSt.executeUpdate();
            } catch (SQLException e) {
                return false;
            } finally {
                ConnectDB.closeConnection(conn);
            }
        }
        return true;
    }

    @Override
    public void deleteById(Integer id) {

    }
}
