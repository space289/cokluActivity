package com.example.cokluactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.cokluactivity.databinding.ActivityDigerBinding;

public class diger extends AppCompatActivity {
    private ActivityDigerBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDigerBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        Intent intent = getIntent();
        String bilgiAdiSoyadi = intent.getStringExtra("adiSoyadiKey");
        String bilgiTelefonNo = intent.getStringExtra("telefonNoKey");
        binding.AdSoyad.setText(bilgiAdiSoyadi);
        binding.Numara.setText(bilgiTelefonNo);
        //setContentView(R.layout.activity_diger);
    }
}