package com.example.jona.apppruebacrypmkt;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {


    ListView list;
    Button btnComprar;
    String misaldo= "99999999";
    String [] [] datos= {{"Bitcoin","4423800","4400600","$"+misaldo,"00","BTC"},{"Ether","151000","150000","$"+misaldo,"00","ETH"},{"EOS","3802,2","3724","$"+misaldo,"00","EOS"},
            {"Stellar","168,2","155,7","$"+misaldo,"00","XLM"}};
    int [] img ={R.drawable.bitcoin,R.drawable.etherum,R.drawable.eos,R.drawable.stellar};
    int mbtc=0;
    int meth=0;
    int mxlm=0;
    int meos=0;

    @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

        list = (ListView)findViewById(R.id.listaMonedas);
        list.setAdapter(new Adapt(this,datos,img));
    }
}
