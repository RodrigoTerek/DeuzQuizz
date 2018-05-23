package uamtcc.com.br.deusquizz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Quizz extends AppCompatActivity implements View.OnClickListener{

    private Questoes questoes;
    private String nome;

    private TextView pergunta, tv_nroQuest;
    private RadioGroup altGroup;
    private RadioButton alt1, alt2, alt3, alt4, alt5;
    private Button avancar;
    private int pontuacao, nroquest;
    private String altSelecionada, altCorreta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quizz);

        questoes = new Questoes();

        Bundle bdle = getIntent().getExtras();

//        nome = bdle.getString("nome");
        nroquest = bdle.getInt("nroquest");
        pontuacao = bdle.getInt("pontuacao");

        tv_nroQuest = findViewById(R.id.textView_nroQuest);
        pergunta = findViewById(R.id.textView_pergunta);
        altGroup = findViewById(R.id.radioGroup);
        alt1 = findViewById(R.id.radioButton_alt1);
        alt2 = findViewById(R.id.radioButton_alt2);
        alt3 = findViewById(R.id.radioButton_alt3);
        alt4 = findViewById(R.id.radioButton_alt4);
        alt5 = findViewById(R.id.radioButton_alt5);
        avancar = findViewById(R.id.button_avancar);

        definirPergunta();

        avancar.setEnabled(false);
        avancar.setOnClickListener(this);

        altGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){

                    case R.id.radioButton_alt1:
                        altSelecionada = alt1.getText().toString();
                        break;

                    case R.id.radioButton_alt2:
                        altSelecionada = alt2.getText().toString();
                        break;

                    case R.id.radioButton_alt3:
                        altSelecionada = alt3.getText().toString();
                        break;

                    case R.id.radioButton_alt4:
                        altSelecionada = alt4.getText().toString();
                        break;

                    case R.id.radioButton_alt5:
                        altSelecionada = alt5.getText().toString();
                        break;
                }

                if(!avancar.isEnabled())
                    avancar.setEnabled(true);
            }
        });

    }

    @Override
    public void onClick(View view) {

        nroquest++;

        if(altSelecionada.equals(altCorreta)){
            pontuacao++;
        }

        if(nroquest < 10){

            altGroup.clearCheck();
            definirPergunta();

        }else{

            Intent intent = new Intent(this, Resultado.class);
//            intent.putExtra("nome", nome);
            intent.putExtra("pontuacao", pontuacao);

            startActivity(intent);

        }

        if(avancar.isEnabled())
            avancar.setEnabled(false);


    }

    private void definirPergunta(){

        tv_nroQuest.setText("Questão nº " + (nroquest+1));
        pergunta.setText(questoes.pergunta[nroquest]);
        alt1.setText(questoes.alternativas[nroquest][0]);
        alt2.setText(questoes.alternativas[nroquest][1]);
        alt3.setText(questoes.alternativas[nroquest][2]);
        alt4.setText(questoes.alternativas[nroquest][3]);
        alt5.setText(questoes.alternativas[nroquest][4]);

        altCorreta = questoes.altCorreta[nroquest];

    }


}
