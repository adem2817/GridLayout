package com.example.lab08.gridlayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {


    ImageView imageDegis,imageDegis2,imageDegis3,imageDegis4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageDegis = findViewById(R.id.imageDegis);
        imageDegis2 = findViewById(R.id.imageDegis2);
        imageDegis3 = findViewById(R.id.imageDegis3);
        imageDegis4 = findViewById(R.id.imageDegis4);

        imageDegis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageDegis.setImageResource(R.drawable.agla);
                //imageView in image değişimi burada yapılır
            }
        });
        imageDegis2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageDegis2.setImageResource(R.drawable.agla);
                //imageView in image değişimi burada yapılır
            }
        });
        imageDegis3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageDegis3.setImageResource(R.drawable.agla);
                //imageView in image değişimi burada yapılır
            }
        });
        imageDegis4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageDegis4.setImageResource(R.drawable.agla);
                //imageView in image değişimi burada yapılır
            }
        });

}
    }
