package com.example.jona.apppruebacrypmkt;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class vendiendo  extends MainActivity {
    TextView misaldo;
    TextView nombre;
    TextView valorMoneda;
    EditText txtCantidadaComprar;
    TextView txtMontoTemporal;
    ImageView imageView;
    TextView txtAbremo;
    Button btnVender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.proceso2);
        btnVender=(Button)findViewById(R.id.btnVender);
        txtMontoTemporal=(TextView)findViewById(R.id.txtMontoTemporal);
        imageView=(ImageView)findViewById(R.id.imageView2);
        misaldo=(TextView)findViewById(R.id.txxSaldo);
        nombre=(TextView)findViewById(R.id.txtNombre);
        valorMoneda=(TextView)findViewById(R.id.txtValor);
        txtCantidadaComprar=(EditText) findViewById(R.id.txtCantidadaComprar);
        txtAbremo=(TextView)findViewById(R.id.txtAbremo);

        Intent intent= getIntent();
        Bundle extras =intent.getExtras();

        String moneda=extras.getString("abre");
        String saldo=extras.getString("saldo");
        String nombreMoneda=extras.getString("nombre");
        String valor=extras.getString("valordeVenta");
        String imagenMoneda=extras.getString("imagen");




        //Operaciones Matematicas



        misaldo.setText(saldo);
        nombre.setText(nombreMoneda);
        valorMoneda.setText(valor);
        txtAbremo.setText(moneda);

        switch (nombreMoneda){
            case "Bitcoin":
                imageView.setImageResource(R.drawable.bitcoin);
                break;
            case "Ether":
                imageView.setImageResource(R.drawable.etherum);
                break;
            case "EOS":
                imageView.setImageResource(R.drawable.eos);
                break;
            case "Stellar":
                imageView.setImageResource(R.drawable.stellar);
                break;
        }
        btnVender.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"No disponible aun, aun no corrigo cierto problema XD", Toast.LENGTH_LONG).show();
            }
        });    }
}
