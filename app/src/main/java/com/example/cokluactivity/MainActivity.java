package com.example.cokluactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.cokluactivity.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
     EditText adiSoyadiEdittext;
     EditText numaraEdittext;
     Button digerButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        adiSoyadiEdittext = findViewById(R.id.editTextAdSoyAd);
        numaraEdittext = findViewById(R.id.editTextNumara);
        digerButton = findViewById(R.id.button);

        digerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                digerActivity(view);
            }
        });
        //setContentView(R.layout.activity_main);


    }
    public void digerActivity(View view){
        String adiSoyadi = binding.editTextAdSoyAd.getText().toString();
        String telefonNo = binding.editTextNumara.getText().toString();
        Intent intent = new Intent(MainActivity.this,diger.class);
        intent.putExtra("adiSoyadiKey",adiSoyadi);
        intent.putExtra("telefonNoKey",telefonNo);
        startActivity(intent);
    }

}