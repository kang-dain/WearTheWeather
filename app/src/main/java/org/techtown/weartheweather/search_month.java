package org.techtown.weartheweather;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class search_month extends AppCompatActivity {
    long delay = 0;
    int count1,count2,count3,count4,count5,count6,count7,count8,count9,count10,count11,count12;
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

        ImageButton search_temperature_button2 = (ImageButton) findViewById(R.id.search_temperature_button2);
        search_temperature_button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageButton imageButton = (ImageButton)findViewById(R.id.imageButton);
                imageButton.setVisibility(View.VISIBLE);
            }
        });

        ImageButton imageButton = (ImageButton)findViewById(R.id.imageButton);
        imageButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
            ImageButton imageButton = (ImageButton)findViewById(R.id.imageButton);
            imageButton.setVisibility(View.INVISIBLE);
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
        //1-12월
        Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);
        Button button3 = findViewById(R.id.button3);
        Button button4 = findViewById(R.id.button4);
        Button button5 = findViewById(R.id.button5);
        Button button6 = findViewById(R.id.button6);
        Button button7 = findViewById(R.id.button7);
        Button button8 = findViewById(R.id.button8);
        Button button9 = findViewById(R.id.button9);
        Button button10 = findViewById(R.id.button10);
        Button button11= findViewById(R.id.button11);
        Button button12 = findViewById(R.id.button12);

        button1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
            if (System.currentTimeMillis() > delay){
                // 한 번 클릭
                delay=System.currentTimeMillis()+200;
                button1.setTextColor(Color.parseColor("#6094E3"));
                return;
            }
            if (System.currentTimeMillis() <= delay){
                // 두 번 연속 클릭
                button1.setTextColor(Color.parseColor("#ffffff"));
                }
            }
        });
        button2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if (System.currentTimeMillis() > delay){
                    delay=System.currentTimeMillis()+200;
                    button2.setTextColor(Color.parseColor("#6094E3"));
                    return;
                }
                if (System.currentTimeMillis() <= delay){
                    button2.setTextColor(Color.parseColor("#ffffff"));
                }
            }
        });
        button3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if (System.currentTimeMillis() > delay){
                    delay=System.currentTimeMillis()+200;
                    button3.setTextColor(Color.parseColor("#6094E3"));
                    return;
                }
                if (System.currentTimeMillis() <= delay){
                    button3.setTextColor(Color.parseColor("#ffffff"));
                }
            }
        });
        button4.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if (System.currentTimeMillis() > delay){
                    delay=System.currentTimeMillis()+200;
                    button4.setTextColor(Color.parseColor("#6094E3"));
                    return;
                }
                if (System.currentTimeMillis() <= delay){
                    button4.setTextColor(Color.parseColor("#ffffff"));
                }
            }
        });
        button5.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if (System.currentTimeMillis() > delay){
                    delay=System.currentTimeMillis()+200;
                    button5.setTextColor(Color.parseColor("#6094E3"));
                    return;
                }
                if (System.currentTimeMillis() <= delay){
                    button5.setTextColor(Color.parseColor("#ffffff"));
                }
            }
        });
        button6.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if (System.currentTimeMillis() > delay){
                    delay=System.currentTimeMillis()+200;
                    button6.setTextColor(Color.parseColor("#6094E3"));
                    return;
                }
                if (System.currentTimeMillis() <= delay){
                    button6.setTextColor(Color.parseColor("#ffffff"));
                }
            }
        });
        button7.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if (System.currentTimeMillis() > delay){
                    delay=System.currentTimeMillis()+200;
                    button7.setTextColor(Color.parseColor("#6094E3"));
                    return;
                }
                if (System.currentTimeMillis() <= delay){
                    button7.setTextColor(Color.parseColor("#ffffff"));
                }
            }
        });
        button8.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if (System.currentTimeMillis() > delay){
                    delay=System.currentTimeMillis()+200;
                    button8.setTextColor(Color.parseColor("#6094E3"));
                    return;
                }
                if (System.currentTimeMillis() <= delay){
                    button8.setTextColor(Color.parseColor("#ffffff"));
                }
            }
        });
        button9.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if (System.currentTimeMillis() > delay){
                    delay=System.currentTimeMillis()+200;
                    button9.setTextColor(Color.parseColor("#6094E3"));
                    return;
                }
                if (System.currentTimeMillis() <= delay){
                    button9.setTextColor(Color.parseColor("#ffffff"));
                }
            }
        });
        button10.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if (System.currentTimeMillis() > delay){
                    delay=System.currentTimeMillis()+200;
                    button10.setTextColor(Color.parseColor("#6094E3"));
                    return;
                }
                if (System.currentTimeMillis() <= delay){
                    button10.setTextColor(Color.parseColor("#ffffff"));
                }
            }
        });
        button11.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if (System.currentTimeMillis() > delay){
                    delay=System.currentTimeMillis()+200;
                    button11.setTextColor(Color.parseColor("#6094E3"));
                    return;
                }
                if (System.currentTimeMillis() <= delay){
                    button11.setTextColor(Color.parseColor("#ffffff"));
                }
            }
        });
        button12.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if (System.currentTimeMillis() > delay){
                    delay=System.currentTimeMillis()+200;
                    button12.setTextColor(Color.parseColor("#6094E3"));
                    return;
                }
                if (System.currentTimeMillis() <= delay){
                    button12.setTextColor(Color.parseColor("#ffffff"));
                }
            }
        });

        ImageButton imageButton5 = (ImageButton) findViewById(R.id.imageButton5);
        imageButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), main_weather.class);
                startActivity(intent);
            }
        });
        ImageButton imageButton6 = (ImageButton) findViewById(R.id.imageButton6);
        imageButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), recommended_music.class);
                startActivity(intent);
            }
        });
        ImageButton imageButton7 = (ImageButton) findViewById(R.id.imageButton7);
        imageButton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), calender.class);
                startActivity(intent);
            }
        });
        ImageButton imageButton8 = (ImageButton) findViewById(R.id.imageButton8);
        imageButton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), search_temperature.class);
                startActivity(intent);
            }
        });
        ImageButton imageButton4 = (ImageButton) findViewById(R.id.imageButton4);
        imageButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), menu.class);
                startActivity(intent);
            }
        });
    }
}