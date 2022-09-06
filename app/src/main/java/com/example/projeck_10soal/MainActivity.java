package com.example.projeck_10soal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioGroup soal1, soal2, soal3, soal4, soal5, soal6, soal7, soal8, soal9, soal10;
    private Button proses;
    private RadioButton value1, value2, value3, value4, value5, value6, value7, value8, value9, value10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((R.layout.activity_main));
        soal1 = findViewById(R.id.soal1);
        soal2 = findViewById(R.id.soal2);
        soal3 = findViewById(R.id.soal3);
        soal4 = findViewById(R.id.soal4);
        soal5 = findViewById(R.id.soal5);
        soal6 = findViewById(R.id.soal6);
        soal7 = findViewById(R.id.soal7);
        soal8 = findViewById(R.id.soal8);
        soal9 = findViewById(R.id.soal9);
        soal10 = findViewById(R.id.soal10);

        proses = findViewById(R.id.inibutton);
        proses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int pointa = soal1.getCheckedRadioButtonId();
                value1 = (RadioButton) findViewById(pointa);

                int pointb = soal2.getCheckedRadioButtonId();
                value2 = (RadioButton) findViewById(pointb);

                int pointc = soal3.getCheckedRadioButtonId();
                value3 = (RadioButton) findViewById(pointc);

                int pointd = soal4.getCheckedRadioButtonId();
                value4 = (RadioButton) findViewById(pointd);

                int pointe = soal5.getCheckedRadioButtonId();
                value5 = (RadioButton) findViewById(pointe);

                int pointf = soal6.getCheckedRadioButtonId();
                value6 = (RadioButton) findViewById(pointf);

                int pointg = soal7.getCheckedRadioButtonId();
                value7 = (RadioButton) findViewById(pointg);

                int pointh = soal8.getCheckedRadioButtonId();
                value8 = (RadioButton) findViewById(pointh);

                int pointi = soal9.getCheckedRadioButtonId();
                value9 = (RadioButton) findViewById(pointi);

                int pointj = soal10.getCheckedRadioButtonId();
                value10 = (RadioButton) findViewById(pointj);

                int nilai = 0;


                if (value1.getText().toString().toLowerCase().equals("xml dan jawa")) {
                    nilai = nilai + 10;
                }
                if (value2.getText().toString().toLowerCase().equals("1945")) {
                    nilai = nilai + 10;
                }
                if (value3.getText().toString().toLowerCase().equals("jepang")) {
                    nilai = nilai + 10;
                }
                if (value4.getText().toString().toLowerCase().equals("5")) {
                    nilai = nilai + 10;
                }
                if (value5.getText().toString().toLowerCase().equals("jakarta")) {
                    nilai = nilai + 10;
                }
                if (value6.getText().toString().toLowerCase().equals("jl.kliningan")) {
                    nilai = nilai + 10;
                }
                if (value7.getText().toString().toLowerCase().equals("nabi isa")) {
                    nilai = nilai + 10;
                }
                if (value8.getText().toString().toLowerCase().equals("imam mahdi")) {
                    nilai = nilai + 10;
                }
                if (value9.getText().toString().toLowerCase().equals("1000")) {
                    nilai += 10;
                }
                if (value10.getText().toString().toLowerCase().equals("bu rani")) {
                    nilai = nilai + 10;
                }
                Toast.makeText(getApplicationContext(), "nilai="+nilai, Toast.LENGTH_SHORT).show();
                nilai = 0;
            }

        });
    }
}