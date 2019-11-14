package com.example.alunos.sistemaglp.control;

import android.app.Activity;

import com.example.alunos.sistemaglp.dao.LoginDao;
import com.example.alunos.sistemaglp.dao.MyORMLiteHelper;
import com.example.alunos.sistemaglp.dao.RelatorioDao;
import com.example.alunos.sistemaglp.resources.RelatorioResource;

public class RelatorioControl {
    private Activity activity;
    private RelatorioResource relatorioResource;
    private MyORMLiteHelper helper;
    private RelatorioDao relatorioOrmDao;


    public RelatorioControl() {
    }

    public RelatorioControl(Activity activity) {
        this.activity = activity;
        this.helper = new MyORMLiteHelper(activity);
        this.relatorioOrmDao = new RelatorioDao(this.helper);
        this.relatorioResource = new RelatorioResource(this.activity);
    }
}
