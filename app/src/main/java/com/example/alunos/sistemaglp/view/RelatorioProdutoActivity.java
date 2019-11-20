package com.example.alunos.sistemaglp.view;


import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.alunos.sistemaglp.R;
import com.example.alunos.sistemaglp.control.RelatorioControl;

public class RelatorioProdutoActivity extends Activity {
    private RelatorioControl relatorioControl;
    private ArrayAdapter adapter;
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relatorio_produto);
        relatorioControl = new RelatorioControl(this);
    }
}
