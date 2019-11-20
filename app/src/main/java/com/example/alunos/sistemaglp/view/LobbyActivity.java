package com.example.alunos.sistemaglp.view;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import com.example.alunos.sistemaglp.R;
import com.example.alunos.sistemaglp.control.RelatorioControl;

public class LobbyActivity extends Activity {

   private RelatorioControl control;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lobby);
        control = new RelatorioControl(this);

    }

    public void entrarTelaProduto(View view){
        control.entrarProduto();

    }


    public void entrarTelaPedido(View view){
        control.entrarPedido();

    }

}
