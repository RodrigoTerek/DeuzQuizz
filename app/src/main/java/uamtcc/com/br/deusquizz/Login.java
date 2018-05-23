package uamtcc.com.br.deusquizz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;

public class Login extends AppCompatActivity implements View.OnClickListener{

    private EditText login, senha;
    private Button entrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();

        setContentView(R.layout.activity_login);

        login = findViewById(R.id.editText_login);
        senha = findViewById(R.id.editText_senha);
        entrar = findViewById(R.id.button_entrar);

        entrar.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        Intent intent = new Intent(this, Principal.class);
        intent.putExtra("nome", login.getText().toString());

        startActivity(intent);

    }

}
