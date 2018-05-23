package uamtcc.com.br.deusquizz.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import uamtcc.com.br.deusquizz.R;

public class EstatisticaFragment extends Fragment {


    public EstatisticaFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_estatistica, container, false);
    }

}
