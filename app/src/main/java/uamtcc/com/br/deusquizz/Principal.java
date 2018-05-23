package uamtcc.com.br.deusquizz;

import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.ogaclejapan.smarttablayout.SmartTabLayout;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItem;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItemAdapter;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItems;

import uamtcc.com.br.deusquizz.Fragments.EstatisticaFragment;
import uamtcc.com.br.deusquizz.Fragments.FasesFragment;

public class Principal extends AppCompatActivity {

    private ViewPager viewPager;
    private SmartTabLayout smartTabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        Bundle bdle = getIntent().getExtras();

//        getSupportActionBar().setElevation(0);
//        getSupportActionBar().setTitle("Deus Quizz");

        viewPager = findViewById(R.id.viewpager);
        smartTabLayout = findViewById(R.id.viewpagertab);

        FragmentPagerItemAdapter adapter = new FragmentPagerItemAdapter(
                getSupportFragmentManager(),
                FragmentPagerItems.with(this)
                    .add("Fases", FasesFragment.class)
                    .add("Estatísticas", EstatisticaFragment.class)
                    .create()
        );

        viewPager.setAdapter(adapter);
        smartTabLayout.setViewPager(viewPager);

    }
}
