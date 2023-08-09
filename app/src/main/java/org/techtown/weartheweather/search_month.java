package org.techtown.weartheweather;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

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

        ImageButton search_temperature_button2 = (ImageButton) findViewById(R.id.search_temperature_button2);
        search_temperature_button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageButton imageButton = (ImageButton) findViewById(R.id.imageButton);
                imageButton.setVisibility(View.VISIBLE);
            }
        });

        ImageButton imageButton = (ImageButton) findViewById(R.id.imageButton);
        imageButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                ImageButton imageButton = (ImageButton) findViewById(R.id.imageButton);
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
        /**
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
         */
        ImageView search_month_3 = findViewById(R.id.search_month_3);
        Button[] buttons = new Button[12];
        int[] countArray = new int[12]; // To store count values for each button

// Track the selected buttons
        ArrayList<Button> selectedButtons = new ArrayList<>();

        for (int i = 0; i < 12; i++) {
            int buttonId = getResources().getIdentifier("button" + (i + 1), "id", getPackageName());
            buttons[i] = findViewById(buttonId);

            final int buttonIndex = i;
            buttons[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (System.currentTimeMillis() > delay) {
                        delay = System.currentTimeMillis() + 200;

                        if (selectedButtons.contains(buttons[buttonIndex])) {
                            selectedButtons.remove(buttons[buttonIndex]);
                            buttons[buttonIndex].setTextColor(Color.parseColor("#ffffff"));
                            countArray[buttonIndex] = 0;
                        } else if (selectedButtons.size() < 3) {
                            selectedButtons.add(buttons[buttonIndex]);
                            buttons[buttonIndex].setTextColor(Color.parseColor("#6094E3"));
                            countArray[buttonIndex] = 1;
                        }
                        // Disable other buttons if three are selected
                        for (Button button : buttons) {
                            if (!selectedButtons.contains(button)) {
                                button.setEnabled(selectedButtons.size() < 3);
                            }
                        }

                        int sum = 0;
                        for (int count : countArray) {
                            sum += count;
                        }
                    } else {
                        buttons[buttonIndex].setTextColor(Color.parseColor("#ffffff"));
                    }
                }
            });
        }


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