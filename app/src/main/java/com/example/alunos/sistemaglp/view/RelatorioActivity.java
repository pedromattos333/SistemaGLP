package com.example.alunos.sistemaglp.view;

import android.app.Activity;
import android.os.Bundle;

import com.example.alunos.sistemaglp.R;
import com.example.alunos.sistemaglp.control.RelatorioControl;

public class RelatorioActivity extends Activity {

    RelatorioControl control = new RelatorioControl();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relatorio);
        control = new RelatorioControl();

    }
}
