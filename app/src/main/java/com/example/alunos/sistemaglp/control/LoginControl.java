package com.example.alunos.sistemaglp.control;

import android.app.Activity;
import android.widget.EditText;
import android.widget.Toast;

import com.example.alunos.sistemaglp.R;
import com.example.alunos.sistemaglp.dao.LoginDao;
import com.example.alunos.sistemaglp.dao.helpers.ORMLiteHelper;
import com.example.alunos.sistemaglp.model.Login;
import com.example.alunos.sistemaglp.resources.LoginResources;
import com.j256.ormlite.dao.Dao;

public class LoginControl {
    private Dao<Login, Integer> loginDao;

    private LoginDao loginOrmDao;
    private ORMLiteHelper helper;

    private Activity activity;
    private LoginResources loginResource;
    private EditText editLogin;
    private EditText editSenha;
    private Login login;



    public LoginControl(Activity activity) {
        this.activity = activity;
        this.loginResource = new LoginResources(this.activity);
        this.loginOrmDao = new LoginDao(this.helper);
        this.helper = new ORMLiteHelper(activity);

        this.editLogin = activity.findViewById(R.id.editLogin);
        this.editSenha = activity.findViewById(R.id.editSenha);


//     try{
//         usuarioDao = usuarioOrmDao.getProdutoDao();
//      } catch (SQLException e){
//          e.printStackTrace();
//     }
 }

        public void ValidaUsuario () {
            if (editLogin.getText().toString().trim().isEmpty()) {
                Toast.makeText(activity, R.string.erro_logar, Toast.LENGTH_LONG).show();
                editLogin.requestFocus();
                return;
            } else if (editSenha.getText().toString().trim().isEmpty()) {
                Toast.makeText(activity, R.string.erro_senha, Toast.LENGTH_LONG).show();
                editSenha.requestFocus();
                return;
            }

        try {
            login = null;

            String l = editLogin.getText().toString();
            String s = editSenha.getText().toString();

            loginResource.verificaLogin(l, s);

              } catch (Exception e) {
                  Toast.makeText(activity, "Falha ao logar", Toast.LENGTH_SHORT).show();
                    return;
            }
        }
        public boolean validarCampos () {
            if (editLogin.getText().toString().trim().isEmpty()) {
                Toast.makeText(activity, R.string.erro_logar, Toast.LENGTH_LONG).show();
                editLogin.requestFocus();
                return false;
            } else if (editSenha.getText().toString().trim().isEmpty()) {
                Toast.makeText(activity, R.string.erro_senha, Toast.LENGTH_LONG).show();
                editSenha.requestFocus();
                return false;
            }
            return true;
        }


    }


