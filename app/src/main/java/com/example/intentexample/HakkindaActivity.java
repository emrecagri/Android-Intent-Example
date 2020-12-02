package com.example.intentexample;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class HakkindaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hakkinda);

        Button ikincisayfa_butonu = findViewById(R.id.button_page_2); //Nesne İle Button İlişkilendirme Yaptık


        //Altta butonumuza tıklama özelliği kazandırıyoruz.
        ikincisayfa_butonu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //HakkindaActivity.this diyerek bu activity de çalışacağını belirtiyoruz
                Intent intentislemi = new Intent(HakkindaActivity.this, MainActivity.class);


                startActivity(intentislemi);
            }
        });
    }
}
