package com.example.jona.apppruebacrypmkt;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Adapt extends BaseAdapter {

    private static LayoutInflater inflater =null;
    Context context;
    String [][]datos;
    String saldo;
    int[] img;
    Button btnComprar;
    Button btnVender;
    public Adapt(Context context, String[][] datos, int[] img) {
        this.context = context;
        this.datos = datos;
        this.img = img;
        inflater=(LayoutInflater)context.getSystemService(context.LAYOUT_INFLATER_SERVICE);

    }

    @Override
    public View getView(final int i, View convertView, ViewGroup parent) {
    final  View vista= inflater.inflate(R.layout.style_lista,null);
         btnComprar=(Button)vista.findViewById(R.id.btnComprar);
         btnVender=(Button)vista.findViewById(R.id.btnVender);
        TextView nombre=(TextView)vista.findViewById(R.id.txtNombre);
        TextView valorDeCompra=(TextView)vista.findViewById(R.id.txtValorCompra);
        final TextView valordeVenta=(TextView)vista.findViewById(R.id.txtValorVenta);
        final TextView saldo=(TextView)vista.findViewById(R.id.txtBilletera);
        TextView porcentaje=(TextView)vista.findViewById(R.id.txtPorcentaje);
        ImageView imagen=(ImageView)vista.findViewById(R.id.imageView);
        TextView txtAbreName=(TextView)vista.findViewById(R.id.txtAbreName);



        nombre.setText(datos[i][0]);
        valorDeCompra.setText(datos[i][1]);
        valordeVenta.setText(datos[i][2]);
        saldo.setText(datos[i][3]);
        porcentaje.setText(datos[i][4]);
        imagen.setImageResource(img[i]);
        txtAbreName.setText(datos[i][5]);
        btnComprar.setOnClickListener(new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(context, comprando.class);

                myIntent.putExtra("nombre",datos[i][0]);
                myIntent.putExtra("valorDeCompra",datos[i][1]);

                myIntent.putExtra("saldo",datos[i][3]);
                myIntent.putExtra("abre",datos[i][5]);
                myIntent.putExtra("imagen",img[i]);
                context.startActivity(myIntent);



            }
        });
        btnVender.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(context, vendiendo.class);

                myIntent.putExtra("nombre",datos[i][0]);

                 myIntent.putExtra("valordeVenta",datos[i][2]);
                myIntent.putExtra("saldo",datos[i][3]);
                myIntent.putExtra("abre",datos[i][5]);
                myIntent.putExtra("imagen",img[i]);
                context.startActivity(myIntent);
            }
        });
        return vista;
    }

    @Override
    public int getCount() {
        return img.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }


}
