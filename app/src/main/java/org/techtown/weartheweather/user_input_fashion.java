package org.techtown.weartheweather;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.HorizontalScrollView;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class user_input_fashion extends AppCompatActivity {

    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_input_fashion);

        getWindow().setWindowAnimations(0);

        ImageButton fashion_left = (ImageButton) findViewById(R.id.user_input_fashion_common_big_arrow_left);
        fashion_left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), user_input_keyword.class);
                startActivity(intent);
            }
        });

        ImageButton user_input_temperature_backbutton4 = (ImageButton) findViewById(R.id.user_input_temperature_backbutton4);
        user_input_temperature_backbutton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), main_weather.class);
                startActivity(intent);
            }
        });

        Button user_input_fashion_button_5 = findViewById(R.id.user_input_fashion_button_5);
        user_input_fashion_button_5.setOnTouchListener((view, motionEvent) -> {
            if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                user_input_fashion_button_5.setBackgroundResource(R.drawable.user_input_fashion_button_5_blue);
            }
            return false;
        });

        Button user_input_fashion_button_1 = findViewById(R.id.user_input_fashion_button_1);
        Button user_input_fashion_button_2 = findViewById(R.id.user_input_fashion_button_2);
        Button user_input_fashion_button_3 = findViewById(R.id.user_input_fashion_button_3);
        Button user_input_fashion_button_4 = findViewById(R.id.user_input_fashion_button_4);
        HorizontalScrollView outer = findViewById(R.id.outer);
        HorizontalScrollView top = findViewById(R.id.top);
        HorizontalScrollView pants = findViewById(R.id.pants);
        HorizontalScrollView shoes = findViewById(R.id.shoes);

        user_input_fashion_button_1.setOnTouchListener((view, motionEvent) -> {
            if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                user_input_fashion_button_1.setBackgroundResource(R.drawable.user_input_fashion_button_1_blue);
                user_input_fashion_button_2.setBackgroundResource(R.drawable.user_input_fashion_button_2);
                user_input_fashion_button_3.setBackgroundResource(R.drawable.user_input_fashion_button_3);
                user_input_fashion_button_4.setBackgroundResource(R.drawable.user_input_fashion_button_4);
                outer.setVisibility(View.VISIBLE);
                top.setVisibility(View.INVISIBLE);
                pants.setVisibility(View.INVISIBLE);
                shoes.setVisibility(View.INVISIBLE);
            }
            return false;
        });
        user_input_fashion_button_2.setOnTouchListener((view, motionEvent) -> {
            if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                user_input_fashion_button_1.setBackgroundResource(R.drawable.user_input_fashion_button_1);
                user_input_fashion_button_2.setBackgroundResource(R.drawable.user_input_fashion_button_2_blue);
                user_input_fashion_button_3.setBackgroundResource(R.drawable.user_input_fashion_button_3);
                user_input_fashion_button_4.setBackgroundResource(R.drawable.user_input_fashion_button_4);
                top.setVisibility(View.VISIBLE);
                outer.setVisibility(View.INVISIBLE);
                pants.setVisibility(View.INVISIBLE);
                shoes.setVisibility(View.INVISIBLE);
            }
            return false;
        });
        user_input_fashion_button_3.setOnTouchListener((view, motionEvent) -> {
            if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                user_input_fashion_button_1.setBackgroundResource(R.drawable.user_input_fashion_button_1);
                user_input_fashion_button_2.setBackgroundResource(R.drawable.user_input_fashion_button_2);
                user_input_fashion_button_3.setBackgroundResource(R.drawable.user_input_fashion_button_3_blue);
                user_input_fashion_button_4.setBackgroundResource(R.drawable.user_input_fashion_button_4);
                pants.setVisibility(View.VISIBLE);
                outer.setVisibility(View.INVISIBLE);
                top.setVisibility(View.INVISIBLE);
                shoes.setVisibility(View.INVISIBLE);
            }
            return false;
        });
        user_input_fashion_button_4.setOnTouchListener((view, motionEvent) -> {
            if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                user_input_fashion_button_1.setBackgroundResource(R.drawable.user_input_fashion_button_1);
                user_input_fashion_button_2.setBackgroundResource(R.drawable.user_input_fashion_button_2);
                user_input_fashion_button_3.setBackgroundResource(R.drawable.user_input_fashion_button_3);
                user_input_fashion_button_4.setBackgroundResource(R.drawable.user_input_fashion_button_4_blue);
                shoes.setVisibility(View.VISIBLE);
                outer.setVisibility(View.INVISIBLE);
                top.setVisibility(View.INVISIBLE);
                pants.setVisibility(View.INVISIBLE);
            }
            return false;
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