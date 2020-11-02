package com.example.frasesdodia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gerarNovaFrase(View view){
        String[] frases = {
                "A persistência é o caminho do êxito.",
                "O sucesso nasce do querer, da determinação e persistência em se chegar a um objetivo. Mesmo não atingindo o alvo, quem busca e vence obstáculos, no mínimo fará coisas admiráveis",
                "Só existe um êxito: a capacidade de levar a vida que se quer.",
                "A coragem não é ausência do medo; é a persistência apesar do medo.",
                "Para ter um negócio de sucesso, alguém, algum dia, teve que tomar uma atitude de coragem."
        };
        int numero = new Random().nextInt(5);
        TextView frase = findViewById(R.id.Resultado);
        frase.setText(frases[numero]);
    }
}