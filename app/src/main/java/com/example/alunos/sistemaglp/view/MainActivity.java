package com.example.alunos.sistemaglp.view;

import android.app.Activity;
import android.os.Bundle;
import android.os.StrictMode;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.alunos.sistemaglp.R;
import com.example.alunos.sistemaglp.control.LoginControl;

public class MainActivity extends Activity {

    private LoginControl loginControl;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loginControl = new LoginControl(this);
        if (android.os.Build.VERSION.SDK_INT > 9)
        {
            StrictMode.ThreadPolicy policy = new
                    StrictMode.ThreadPolicy.Builder().permitAll().build();
            StrictMode.setThreadPolicy(policy);
        }


    }

    public void entrar(View view){
        loginControl.ValidaUsuario();
        loginControl.validarCampos();

    }


}
