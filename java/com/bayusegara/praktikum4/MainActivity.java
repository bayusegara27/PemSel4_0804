package com.bayusegara.praktikum4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText edtPanjang, edtLebar, edtTinggi;
    private Button btnHitung, btnNext, btnFragment;
    private TextView tvHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize views
        edtPanjang = findViewById(R.id.edt_panjang);
        edtLebar = findViewById(R.id.edt_lebar);
        edtTinggi = findViewById(R.id.edt_tinggi);
        btnHitung = findViewById(R.id.btn_hitung);
        btnNext = findViewById(R.id.btn_next);
        btnFragment = findViewById(R.id.btn_fragment);
        tvHasil = findViewById(R.id.tv_hasil);

        // Set click listener for calculate button
        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get values from EditText fields
                String panjangStr = edtPanjang.getText().toString().trim();
                String lebarStr = edtLebar.getText().toString().trim();
                String tinggiStr = edtTinggi.getText().toString().trim();

                // Check if fields are not empty
                if (!panjangStr.isEmpty() && !lebarStr.isEmpty() && !tinggiStr.isEmpty()) {
                    // Parse values to double
                    double panjang = Double.parseDouble(panjangStr);
                    double lebar = Double.parseDouble(lebarStr);
                    double tinggi = Double.parseDouble(tinggiStr);

                    // Calculate volume
                    double volume = panjang * lebar * tinggi;

                    // Display result
                    tvHasil.setText("Volume Balok: " + volume);
                } else {
                    Toast.makeText(MainActivity.this, "Semua field harus diisi!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        // Set click listener for next button
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Example: Start a new activity
                Toast.makeText(MainActivity.this, "Next button clicked", Toast.LENGTH_SHORT).show();
                // Intent intent = new Intent(MainActivity.this, NextActivity.class);
                // startActivity(intent);
            }
        });

        // Set click listener for fragment button
        btnFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start FragmentActivity
                Intent intent = new Intent(MainActivity.this, FragmentActivity.class);
                startActivity(intent);
            }
        });
    }
}