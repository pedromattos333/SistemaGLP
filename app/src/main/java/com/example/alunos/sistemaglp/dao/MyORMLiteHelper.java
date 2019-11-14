package com.example.alunos.sistemaglp.dao;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.example.alunos.sistemaglp.model.Login;
import com.example.alunos.sistemaglp.model.Relatorio;
import com.j256.ormlite.android.apptools.OrmLiteSqliteOpenHelper;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;

import java.sql.SQLException;



public class MyORMLiteHelper extends OrmLiteSqliteOpenHelper {
    /*
        Configurando a base de dados
     */
    private static final String DATABASE_NAME = "database.db";
    private static final int DATABASE_VERSION = 1;
    private static MyORMLiteHelper mInstance = null;

    /*
        Variaveis para o DAO
     */
    private Dao<Login, Integer> categoriaDao = null;

    public MyORMLiteHelper(Context c){
        super(c, DATABASE_NAME, null, DATABASE_VERSION);
    }

    public static MyORMLiteHelper getInstance(Context c){
        if(mInstance == null){
            mInstance = new MyORMLiteHelper(c.getApplicationContext());
        }
        return mInstance;
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase, ConnectionSource connectionSource) {
        try {
            TableUtils.createTable(connectionSource, Relatorio.class);
            TableUtils.createTable(connectionSource, Login.class);
        } catch (SQLException e ){
            e.printStackTrace();
        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, ConnectionSource connectionSource, int i, int i1) {
        try {
            TableUtils.dropTable(connectionSource, Relatorio.class, true);
            TableUtils.dropTable(connectionSource, Login.class, true);
            onCreate(sqLiteDatabase,connectionSource);
        } catch (SQLException e ){
            e.printStackTrace();
        }
    }
}
