package com.example.calcularidade;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final int[] idade = new int[1];
        final int [] images = {R.drawable.imageadulto,R.drawable.imagecrianca, R.drawable.imagejovem};
        Button btnCalcular = (Button) findViewById(R.id.btnCalcular);
        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editAno = (EditText) findViewById(R.id.editAno);
                TextView textResult = (TextView) findViewById(R.id.textResult);
                TextView textDescricao = (TextView) findViewById(R.id.textDescricao);
                ImageView imageView = (ImageView) findViewById(R.id.imageView);
                int ano = Integer.parseInt(editAno.getText().toString());
                idade[0] = -ano - (-2019);
                if (idade[0] <= 12) {
                    textResult.setText(idade[0] + "");
                    textDescricao.setText("Criança");
                    imageView.setImageResource(R.drawable.imagecrianca);
                }
                if (idade[0] > 12 && idade[0] <= 18) {
                    textResult.setText(idade[0] + "");
                    textDescricao.setText("Adolescente");
                    imageView.setImageResource(R.drawable.imagejovem);
                }
                if (idade[0] > 18) {
                    textResult.setText(idade[0] + "");
                    textDescricao.setText("Adulto");
                    imageView.setImageResource(R.drawable.imageadulto);
                }
            }
        });
    }
}
