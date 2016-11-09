package com.example.dm2.a13_actividadespropuestas2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText valor1;
    private EditText valor2;
    private TextView resultado;
    private Button boton;
    private String tvalor1;
    private String tvalor2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        boton = (Button) findViewById(R.id.boton);
        valor1 = (EditText) findViewById(R.id.valor1);
        valor2 = (EditText) findViewById(R.id.valor2);
        resultado = (TextView) findViewById(R.id.tResultado);
        boton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                tvalor1 = String.valueOf(valor1.getText());
                int v1 = Integer.parseInt(tvalor1);
                tvalor2 = String.valueOf(valor2.getText());
                int v2 = Integer.parseInt(tvalor2);
                int res = v1 + v2;
                resultado.setText("La suma es : "+res);
                valor1.setText("");
                valor2.setText("");
            }



        });
    }
}
