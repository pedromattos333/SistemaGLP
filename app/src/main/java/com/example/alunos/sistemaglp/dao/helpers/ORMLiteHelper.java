package com.example.alunos.sistemaglp.dao.helpers;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.example.alunos.sistemaglp.model.Login;
import com.example.alunos.sistemaglp.model.RelatorioPedido;
import com.example.alunos.sistemaglp.model.RelatorioProduto;
import com.j256.ormlite.android.apptools.OrmLiteSqliteOpenHelper;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;

import java.sql.SQLException;


public class  ORMLiteHelper extends OrmLiteSqliteOpenHelper {
    private static final String DATABASE_NAME = "glp.db";
    private static final int DATABASE_VERSION = 1;
    private static ORMLiteHelper mInstance = null;

    public ORMLiteHelper(Context c){
        super(c, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase, ConnectionSource connectionSource) {
        try {
            TableUtils.createTable(connectionSource, RelatorioProduto.class);
            TableUtils.createTable(connectionSource, RelatorioPedido.class);
            TableUtils.createTable(connectionSource, Login.class);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, ConnectionSource connectionSource, int i, int i1) {
        try {
            TableUtils.dropTable(connectionSource, RelatorioProduto.class, true);
            TableUtils.dropTable(connectionSource, RelatorioPedido.class, true);
            TableUtils.dropTable(connectionSource, Login.class, true);
            onCreate(sqLiteDatabase, connectionSource);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
