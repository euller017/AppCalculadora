package com.example.aluno.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private Button buttonMultiplicacao;
    private Button buttonSoma;
    private Button buttonDivisao;
    public Button buttonSubtracao;
    private EditText editTextValor1;
    private EditText editTextValor2;


    private TextView textViewAlterador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


                textViewAlterador =   (TextView) findViewById(R.id.textViewAlterador);
                buttonSoma = (Button) findViewById(R.id.buttonSoma);
                buttonMultiplicacao = (Button) findViewById(R.id.buttonMultiplicacao);
                buttonDivisao = (Button) findViewById(R.id.buttonDivisao);
                buttonSubtracao = (Button) findViewById(R.id.buttonSubtracao);
                editTextValor1 = (EditText) findViewById(R.id.editTextValor1);
                editTextValor2 = (EditText) findViewById(R.id.editTextValor2);



                buttonMultiplicacao.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        String valor1 = editTextValor1.getText().toString();
                        String valor2 = editTextValor2.getText().toString();

                        double valorConvertido;

                        valorConvertido = Double.parseDouble(valor1) * Double.parseDouble(valor2);

                        textViewAlterador.setText("" + valorConvertido);

                    }



                });

                buttonSoma.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String valor1 = editTextValor1.getText().toString();
                        String valor2 = editTextValor2.getText().toString();

                        double valorConvertido;

                        valorConvertido = Double.parseDouble(valor1) + Double.parseDouble(valor2);

                        textViewAlterador.setText("" + valorConvertido);

                    }
                });

            buttonDivisao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String valor1 = editTextValor1.getText().toString();
                String valor2 = editTextValor2.getText().toString();

                double valorConvertido;

                valorConvertido = Double.parseDouble(valor1) / Double.parseDouble(valor2);

                textViewAlterador.setText("" + valorConvertido);

            }
        });

        buttonSubtracao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String valor1 = editTextValor1.getText().toString();
                String valor2 = editTextValor2.getText().toString();

                double valorConvertido;

                valorConvertido = Double.parseDouble(valor1) - Double.parseDouble(valor2);

                textViewAlterador.setText("" + valorConvertido);

            }
        });



    }
}
