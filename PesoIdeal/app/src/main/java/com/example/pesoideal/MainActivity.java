package com.example.pesoideal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final int [] imagens = {R.drawable.imagem,R.drawable.imagef};
        final float[] alt = new float[1];
        final float[] pesoIdeal = new float[1];
        final RadioButton mas = (RadioButton) findViewById(R.id.radioH);
        mas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView imageView = (ImageView) findViewById(R.id.imageView);
                Toast.makeText(getBaseContext(),"Homem selecionado",Toast.LENGTH_SHORT).show();
                imageView.setImageResource(R.drawable.imagem);
            }
        });
        final RadioButton fem = (RadioButton) findViewById(R.id.radioM);
        fem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView imageView = (ImageView) findViewById(R.id.imageView);
                Toast.makeText(getBaseContext(),"Mulher selecionado", Toast.LENGTH_SHORT).show();
                imageView.setImageResource(R.drawable.imagef);
            }
        });
        Button btnCalcular = (Button) findViewById(R.id.btnCalcular);
        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editAtl =(EditText) findViewById(R.id.editAlt);
                TextView textResult = (TextView) findViewById(R.id.textResult);
                float altura = Float.parseFloat(editAtl.getText().toString());
                alt[0] = altura * 100;
                if(mas.isChecked()==true){
                    pesoIdeal[0] = (alt[0] - 100) - (alt[0] - 150)/4;
                    textResult.setText(pesoIdeal[0] +"");
                } else if (fem.isChecked()==true){
                    pesoIdeal[0] = (alt[0] - 100) - (alt[0] - 150)/2;
                    textResult.setText(pesoIdeal[0]+"");
                }



            }
        });
    }
}
