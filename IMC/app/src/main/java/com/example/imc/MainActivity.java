package com.example.imc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final float[] imc = new float[1];
        Button btnCalcular = (Button) findViewById(R.id.btnCalcular);
        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editPe = (EditText) findViewById(R.id.editPe);
                EditText editAlt = (EditText) findViewById(R.id.editAlt);
                TextView textResult = (TextView) findViewById(R.id.textResult);
                TextView textDescricao = (TextView) findViewById(R.id.textDescricao);
                int peso = Integer.parseInt(editPe.getText().toString());
                float altura = Float.parseFloat(editAlt.getText().toString());
                imc[0] = peso / (altura*altura);
                if(imc[0]<18.5){
                    textResult.setText(imc[0]+"");
                    textDescricao.setText("Muito Baixo Peso");
                } else{
                    if(imc[0]<18.49){
                        textResult.setText(imc[0]+"");
                        textDescricao.setText("Abaixo Peso");
                    } else{
                        if(imc[0]<24.99){
                            textResult.setText(imc[0]+"");
                            textDescricao.setText("Peso Normal");
                        } else{
                            if(imc[0]<29.99){
                                textResult.setText(imc[0]+"");
                                textDescricao.setText("Acima do Peso");
                            } else{
                                if(imc[0]<34.99){
                                    textResult.setText(imc[0]+"");
                                    textDescricao.setText("Obesidade I");
                                } else{
                                    if(imc[0]<39.99){
                                        textResult.setText(imc[0]+"");
                                        textDescricao.setText("Obesidade II");
                                    } else{
                                        if(imc[0]>40){
                                            textResult.setText(imc[0]+"");
                                            textDescricao.setText("Obesidade III");
                                        }



                                        }


                                    }


                                }


                            }



                        }


                    }


                }

            }
        );}
    }

