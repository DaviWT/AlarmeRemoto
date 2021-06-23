/*
    Trabalho de Conclusao de Curso 2021
    Electronics Engineering - UTFPR

    ALARME REMOTO

    Alunos:
    - Adriano Ricardo de Abreu Gamba
    - Davi Wei Tokikawa
    - Erika Maria Capote Both
 */

package com.example.alarmeremoto;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import android.view.View;
import android.widget.TextView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    Button buttonAdd;
    Button buttonRefresh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.textView);
        buttonAdd = findViewById(R.id.button1);
        buttonRefresh = findViewById(R.id.button2);

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            int counter = 0;
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                textView.setText(counter % 2 == 0 ? "ALARME REMOTO" : "GAIOLA DE JAVALI");
                counter++;
            }
        });
    }
}