package com.tugas.individu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main_Activity extends AppCompatActivity {
    Button linear, relative, login, bahasa, negara;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        linear = findViewById(R.id.btnLinear);
        relative = findViewById(R.id.btnRelative);
        login = findViewById(R.id.btnLogin);
        bahasa = findViewById(R.id.btnBahasa);
        negara = findViewById(R.id.btnNegara);
        linear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent linearlayout = new Intent(Main_Activity.this, Linear_Layout_Activity.class);
                startActivity(linearlayout);
            }
        });

        relative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent relativelayout = new Intent(Main_Activity.this, Relative_Layout_Activity.class);
                startActivity(relativelayout);
            }
        });

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent login = new Intent(Main_Activity.this, Activity_login.class);
                startActivity(login);
            }
        });

        bahasa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bhs = new Intent(Main_Activity.this, List_View_Data.class);
                startActivity(bhs);
            }
        });
    }
}