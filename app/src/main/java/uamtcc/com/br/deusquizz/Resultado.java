package uamtcc.com.br.deusquizz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Resultado extends AppCompatActivity implements View.OnClickListener{

    private TextView result, pont;
    private Button about, continuar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        Bundle bdle = getIntent().getExtras();

        result = findViewById(R.id.textView_resultado);
        pont = findViewById(R.id.textView_pontuacao);
        about = findViewById(R.id.button_about);
        continuar = findViewById(R.id.button_continuar);

        about.setOnClickListener(this);
        continuar.setOnClickListener(this);

        setResult(bdle);

    }

    @Override
    public void onClick(View v) {

        switch(v.getId()) {
            case R.id.button_continuar:
                startActivity(new Intent(this, Principal.class));
            break;
            case R.id.button_about:
                startActivity(new Intent(this, About.class));
            break;
        }
    }

    private void setResult(Bundle bdle){

//        String nome = bdle.getString("nome");
        int pontos = bdle.getInt("pontuacao");

        if(pontos > 7){

            result.setText(getString(R.string.parabens) + " " + getString(R.string.passou));
            pont.setText(getString(R.string.pontuacao) + " "  + pontos + " " + getString(R.string.pontos_feliz));

        }else{

            result.setText(getString(R.string.vocefalhou) + ", " + getString(R.string.falhou));
            pont.setText(getString(R.string.pontuacao)  + " " + pontos + " " + getString(R.string.pontos_triste));

        }

    }

}
