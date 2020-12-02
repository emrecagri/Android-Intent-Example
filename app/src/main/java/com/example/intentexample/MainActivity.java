package com.example.intentexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button ilksayfa_butonu = findViewById(R.id.button_page_1); //Nesne İle Button İlişkilendirme Yaptık


        //Altta butonumuza tıklama özelliği kazandırıyoruz.
        ilksayfa_butonu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //MainActivity.this diyerek bu activity de çalışacağını belirtiyoruz
                Intent intentislemi = new Intent(MainActivity.this, HakkindaActivity.class);


                startActivity(intentislemi);
            }
        });
    }
}