package com.example.relogiodigital;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextClock;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    TextClock textClockHora;
    TextView textHoraAtual;
    Button btCapturar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        WindowCompat.enableEdgeToEdge(getWindow());
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        DeclaraComponentes();
        CapturaHora();
    }

    private void CapturaHora() {
        btCapturar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                textHoraAtual.setText("HORA ATUAL: " + textClockHora.getText());

            }
        });
    }

    private void DeclaraComponentes() {
        textClockHora = findViewById(R.id.textClockHora);
        btCapturar = findViewById(R.id.btCapturar);
        textHoraAtual = findViewById(R.id.textHoraAtual);

    }
}