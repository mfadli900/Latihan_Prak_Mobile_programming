package com.example.mul21.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button tombol1, tombol2, tombol3, btnsubmit;
    EditText nama, nim, kelas, angkatan;
    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tombol1 = (Button) findViewById(R.id.btn1);
        tombol2 = (Button) findViewById(R.id.btn2);
        tombol3 = (Button) findViewById(R.id.btn3);
        hasil = (TextView) findViewById(R.id.aksi);
        nama = (EditText) findViewById(R.id.et_nama);
        nim = (EditText) findViewById(R.id.et_nim);
        kelas = (EditText) findViewById(R.id.et_kelas);
        angkatan = (EditText) findViewById(R.id.et_angkatan);
        btnsubmit = (Button) findViewById(R.id.btnsubmit);

        tombol1.setOnClickListener(this);
        tombol2.setOnClickListener(this);
        tombol3.setOnClickListener(this);
        btnsubmit.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btn1) {
            hasil.setText("TOMBOL 1 DI KLIK");
        } else if (v.getId() == R.id.btn2) {
            hasil.setText("TOMBOL 2 DI KLIK");
        } else if (v.getId() == R.id.btn3) {
            hasil.setText("TOMBOL 3 DI KLIK");
        } else if (v.getId() == R.id.btnsubmit) {
            String hasilText = "Nama : " + nama.getText().toString() + "\n" +
                    "NIM : " + nim.getText().toString() + "\n" +
                    "Kelas : " + kelas.getText().toString() + "\n" +
                    "Angkatan : " + angkatan.getText().toString() + "\n";
            hasil.setText(hasilText);
        }

    }
}

