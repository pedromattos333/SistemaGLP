package com.example.alunos.sistemaglp.dao;

import com.example.alunos.sistemaglp.model.RelatorioPedido;
import com.j256.ormlite.dao.Dao;

import java.sql.SQLException;

public class RelatorioDao {

    private Dao<RelatorioPedido, Integer> relatorioDao;
    private MyORMLiteHelper helper;

    public RelatorioDao(MyORMLiteHelper helper) {
        this.helper = helper;
    }

    public Dao<RelatorioPedido, Integer> getRelatorioDao() throws SQLException {
        if(relatorioDao == null){
            relatorioDao = helper.getDao(RelatorioPedido.class);
        }
        return relatorioDao;
    }
}

