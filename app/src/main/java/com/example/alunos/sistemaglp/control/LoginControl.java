package com.example.alunos.sistemaglp.control;

import android.app.Activity;
import android.widget.EditText;
import android.widget.Toast;

import com.example.alunos.sistemaglp.R;
import com.example.alunos.sistemaglp.dao.LoginDao;
import com.example.alunos.sistemaglp.dao.MyORMLiteHelper;
import com.example.alunos.sistemaglp.model.Login;
import com.example.alunos.sistemaglp.resources.LoginResources;
import com.j256.ormlite.dao.Dao;

import java.sql.SQLException;

public class LoginControl {
    private Dao<Login, Integer> loginDao;
    private LoginDao loginOrmDao;
    private MyORMLiteHelper helper;

    private Activity activity;
    private LoginResources loginResource;
    private EditText editLogin;
    private EditText editSenha;
    private Login login;



    public LoginControl(Activity activity) {
        this.activity = activity;
        this.loginResource = new LoginResources(this.activity);
        this.loginOrmDao = new LoginDao(this.helper);
        this.helper = new MyORMLiteHelper(activity);

        this.editLogin = activity.findViewById(R.id.editLogin);
        this.editSenha = activity.findViewById(R.id.editSenha);


//
//      try{
//         loginDao = loginOrmDao.getLoginDao();
//      } catch (SQLException e){
//          e.printStackTrace();
//      }
  }

    public void ValidaUsuario(){

        login = null;

        String l = editLogin.getText().toString();
        String s = editSenha.getText().toString();

        loginResource.verificaLogin(l,s);
    }
    public boolean validarCampos() {
        if (editLogin.getText().toString().trim().isEmpty()) {
            Toast.makeText(activity, R.string.erro_logar, Toast.LENGTH_LONG).show();
            editLogin.requestFocus();
            return false;
        } else if (editSenha.getText().toString().trim().isEmpty()) {
            Toast.makeText(activity, R.string.erro_senha, Toast.LENGTH_LONG).show();
            editSenha.requestFocus();

            return false;
        }
        return false;
    }



}

