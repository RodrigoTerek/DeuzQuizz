package uamtcc.com.br.deusquizz.Fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

import uamtcc.com.br.deusquizz.Principal;
import uamtcc.com.br.deusquizz.Quizz;
import uamtcc.com.br.deusquizz.R;

public class FasesFragment extends Fragment {

    private ImageButton btnQuizz;


    public FasesFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_fases, container, false);

        btnQuizz = view.findViewById(R.id.imageButton_fase1);
        btnQuizz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Quizz.class);
                intent.putExtra("nroquest", 0);
                intent.putExtra("pontuacao", 0);
                startActivity(intent);
            }
        });

        return view;
    }



}
