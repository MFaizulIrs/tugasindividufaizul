package com.tugas.individu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class Relative_Layout_Activity extends AppCompatActivity {

    TextView prov;
    Spinner provinsi;
    Button tombol;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relative_layout);

        provinsi = findViewById(R.id.provinsi);
        tombol = findViewById(R.id.tombol);
        tombol.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Toast.makeText(Relative_Layout_Activity.this,
                        "Pilihan "+ provinsi.getSelectedItem().toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}