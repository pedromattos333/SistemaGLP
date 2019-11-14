package com.example.alunos.sistemaglp.dao;

import com.example.alunos.sistemaglp.model.Relatorio;
import com.j256.ormlite.dao.Dao;

import java.sql.SQLException;

public class RelatorioDao {

    private Dao<Relatorio, Integer> relatorioDao;
    private MyORMLiteHelper helper;

    public RelatorioDao(MyORMLiteHelper helper) {
        this.helper = helper;
    }

    public Dao<Relatorio, Integer> getProdutoDao() throws SQLException {
        if(relatorioDao == null){
            relatorioDao = helper.getDao(Relatorio.class);
        }
        return relatorioDao;
    }
}

