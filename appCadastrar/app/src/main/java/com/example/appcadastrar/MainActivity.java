package com.example.appcadastrar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Spinner spinnerSexo = (Spinner) findViewById(R.id.spinnerSexo);
        int [] imagens = {R.drawable.imageadulto,R.drawable.imagem};
        final ImageView imageView =(ImageView) findViewById(R.id.imageView);
        ArrayAdapter adapter = ArrayAdapter.createFromResource(this, R.array.sexo, R.layout.support_simple_spinner_dropdown_item);
        spinnerSexo.setAdapter(adapter);
        spinnerSexo.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Toast.makeText(getBaseContext(), "Olá, Senhor", Toast.LENGTH_SHORT).show();
                    imageView.setImageResource(R.drawable.imageadulto);
                } else if (position == 1){
                    Toast.makeText(getBaseContext(), "Olá, Senhora", Toast.LENGTH_SHORT).show();
                    imageView.setImageResource(R.drawable.imagem);
                }
            }
        });
        Button btnCalcular = (Button) findViewById(R.id.btnCadastrar);
        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editNome = (EditText) findViewById(R.id.editNome);
                TextView textNome = (TextView) findViewById(R.id.textNome);
                int nome = Integer.parseInt(editNome.getText().toString());
                textNome.setText(nome);
            }
        });


    }
}