package com.tugas.individu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class List_View_Act extends AppCompatActivity {

    ListView lvResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);
        lvResult = findViewById(R.id.lvResult);

        String[][] dataNegara = new String[][]{{"Indonesia","ASIA","indonesia"},
                {"Malaysia","ASIA","malaysia"},{"Singapore","ASIA","singapore"},
                {"Italia","EROPA","italia"},{"Inggris","EROPA","inggris"},
                {"Belanda","EROPA","belanda"},{"Argentina","AMERIKA","argentina"},
                {"Chile","AMERIKA","chile"},{"Mesir","AFRIKA","mesir"},
                {"Uganda","AFRIKA","uganda"}};

        Negara_Adapter adapter = new Negara_Adapter(List_View_Act.this, dataNegara);
        lvResult.setAdapter(adapter);
    }
}