package com.example.alunos.sistemaglp.dao;

import com.example.alunos.sistemaglp.dao.helpers.ORMLiteHelper;
import com.example.alunos.sistemaglp.model.Login;
import com.j256.ormlite.dao.Dao;

import java.sql.SQLException;

public class LoginDao {

    private Dao<Login, Integer> loginDao;
    private ORMLiteHelper helper;

    public LoginDao(ORMLiteHelper helper) {
        this.helper = helper;
    }

    public Dao<Login, Integer> getLoginDao() throws SQLException {
        if(loginDao == null){
            loginDao = helper.getDao(Login.class);
        }
        return loginDao;
    }
    }

