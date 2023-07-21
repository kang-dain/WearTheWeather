package org.techtown.weartheweather;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class search_month extends AppCompatActivity {
    long delay = 0;

    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_month);

        getWindow().setWindowAnimations(0);

        ImageButton search_month_left = (ImageButton) findViewById(R.id.common_big_arrow_left);
        search_month_left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), search_temperature.class);
                startActivity(intent);
            }
        });


        ImageButton search_month_button = (ImageButton) findViewById(R.id.search_month_button13);
        search_month_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), search_result.class);
                startActivity(intent);
            }
        });

        ImageButton tipbutton2 = (ImageButton) findViewById(R.id.search_temperature_button2);
        tipbutton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageView search_tip = (ImageView)findViewById(R.id.search_tip2);
                search_tip.setVisibility(View.VISIBLE);

            }
        });

        ImageView closetipbutton2 = (ImageView) findViewById(R.id.search_tip2);
        closetipbutton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageView search_tip = (ImageView)findViewById(R.id.search_tip2);
                search_tip.setVisibility(View.INVISIBLE);

            }
        });


        ImageButton search_month_button13 = (ImageButton) findViewById(R.id.search_month_button13);
        search_month_button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), search_result.class);
                startActivity(intent);
            }
        });


        Button button1 = findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
            if (System.currentTimeMillis() > delay){
                delay=System.currentTimeMillis()+200;
                button1.setTextColor(Color.parseColor("#75a3e9"));
                return;
            }
            if (System.currentTimeMillis() <= delay){
                button1.setTextColor(Color.parseColor("#ffffff"));
                }
            }
        });

        Button button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if (System.currentTimeMillis() > delay){
                    delay=System.currentTimeMillis()+200;
                    button2.setTextColor(Color.parseColor("#75a3e9"));
                    return;
                }
                if (System.currentTimeMillis() <= delay){
                    button2.setTextColor(Color.parseColor("#ffffff"));
                }
            }
        });

        Button button3 = findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if (System.currentTimeMillis() > delay){
                    delay=System.currentTimeMillis()+200;
                    button3.setTextColor(Color.parseColor("#75a3e9"));
                    return;
                }
                if (System.currentTimeMillis() <= delay){
                    button3.setTextColor(Color.parseColor("#ffffff"));
                }
            }
        });

        Button button4 = findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if (System.currentTimeMillis() > delay){
                    delay=System.currentTimeMillis()+200;
                    button4.setTextColor(Color.parseColor("#75a3e9"));
                    return;
                }
                if (System.currentTimeMillis() <= delay){
                    button4.setTextColor(Color.parseColor("#ffffff"));
                }
            }
        });

        Button button5 = findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if (System.currentTimeMillis() > delay){
                    delay=System.currentTimeMillis()+200;
                    button5.setTextColor(Color.parseColor("#75a3e9"));
                    return;
                }
                if (System.currentTimeMillis() <= delay){
                    button5.setTextColor(Color.parseColor("#ffffff"));
                }
            }
        });

        Button button6 = findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if (System.currentTimeMillis() > delay){
                    delay=System.currentTimeMillis()+200;
                    button6.setTextColor(Color.parseColor("#75a3e9"));
                    return;
                }
                if (System.currentTimeMillis() <= delay){
                    button6.setTextColor(Color.parseColor("#ffffff"));
                }
            }
        });

        Button button7 = findViewById(R.id.button7);
        button7.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if (System.currentTimeMillis() > delay){
                    delay=System.currentTimeMillis()+200;
                    button7.setTextColor(Color.parseColor("#75a3e9"));
                    return;
                }
                if (System.currentTimeMillis() <= delay){
                    button7.setTextColor(Color.parseColor("#ffffff"));
                }
            }
        });

        Button button8 = findViewById(R.id.button8);
        button8.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if (System.currentTimeMillis() > delay){
                    delay=System.currentTimeMillis()+200;
                    button8.setTextColor(Color.parseColor("#75a3e9"));
                    return;
                }
                if (System.currentTimeMillis() <= delay){
                    button8.setTextColor(Color.parseColor("#ffffff"));
                }
            }
        });

        Button button9 = findViewById(R.id.button9);
        button9.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if (System.currentTimeMillis() > delay){
                    delay=System.currentTimeMillis()+200;
                    button9.setTextColor(Color.parseColor("#75a3e9"));
                    return;
                }
                if (System.currentTimeMillis() <= delay){
                    button9.setTextColor(Color.parseColor("#ffffff"));
                }
            }
        });

        Button button10 = findViewById(R.id.button10);
        button10.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if (System.currentTimeMillis() > delay){
                    delay=System.currentTimeMillis()+200;
                    button10.setTextColor(Color.parseColor("#75a3e9"));
                    return;
                }
                if (System.currentTimeMillis() <= delay){
                    button10.setTextColor(Color.parseColor("#ffffff"));
                }
            }
        });

        Button button11 = findViewById(R.id.button11);
        button11.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if (System.currentTimeMillis() > delay){
                    delay=System.currentTimeMillis()+200;
                    button11.setTextColor(Color.parseColor("#75a3e9"));
                    return;
                }
                if (System.currentTimeMillis() <= delay){
                    button11.setTextColor(Color.parseColor("#ffffff"));
                }
            }
        });

        Button button12 = findViewById(R.id.button12);
        button12.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if (System.currentTimeMillis() > delay){
                    delay=System.currentTimeMillis()+200;
                    button12.setTextColor(Color.parseColor("#75a3e9"));
                    return;
                }
                if (System.currentTimeMillis() <= delay){
                    button12.setTextColor(Color.parseColor("#ffffff"));
                }
            }
        });
    }
}