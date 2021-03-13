package com.example.gilber.equaodosegundograu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText edtValorA, edtValorB, edtValorC;
    private Button btnCalculo;
    private TextView txtRessultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtValorA = (EditText)findViewById(R.id.idValorA);
        edtValorB = (EditText)findViewById(R.id.idValorB);
        edtValorC = (EditText)findViewById(R.id.idValorC);
        btnCalculo = (Button)findViewById(R.id.idCalculo);
        txtRessultado = (TextView)findViewById(R.id.idTxtResult);

        btnCalculo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a, b, c, delta;
                double raiz1, raiz2;
                a = Integer.parseInt(edtValorA.getText().toString());
                b = Integer.parseInt(edtValorB.getText().toString());
                c = Integer.parseInt(edtValorC.getText().toString());
                if (a!=0){
                    delta = (b*b) + (-4 * a * c);
                    raiz1 = (- b + Math.sqrt(delta)) / (2 * a);
                    raiz2 = (- b - Math.sqrt(delta)) / (2 * a);
                    if (delta<0) {
                        txtRessultado.setText("Delta = " + String.valueOf(delta) + "\n" +
                                "Raiz 1 = " + String.valueOf(Math.round(raiz1)) + "\n" +
                                "Raiz 2 = " + String.valueOf(Math.round(raiz2)));
                    }else {
                        txtRessultado.setText("Delta = " + String.valueOf(delta) + "\n" +
                                "Raiz 1 = " + String.valueOf(Math.round(raiz1)) + "\n" +
                                "Raiz 2 = " + String.valueOf(Math.round(raiz2)));
                    }

                }

            }
        });




    }
}
