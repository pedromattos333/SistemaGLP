package com.example.alunos.sistemaglp.view;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import com.example.alunos.sistemaglp.R;
import com.example.alunos.sistemaglp.control.LoginControl;

public class MainActivity extends Activity {

    private LoginControl loginControl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginControl = new LoginControl(this);
    }

    public void entrar(View view){
        loginControl.validarCampos();
        loginControl.ValidaUsuario();
    }


}
