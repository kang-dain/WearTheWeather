package org.techtown.weartheweather;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class search_user extends AppCompatActivity {

    //search_month변수
    private int targetTemperature;
    long delay = 0;

    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_user);




        //search_temperature
        getWindow().setWindowAnimations(0);


        ImageButton search_month_button13 = (ImageButton) findViewById(R.id.search_month_button13);
        search_month_button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //EditText에서 온도를 읽어와서 targetTemperature에 저장
                EditText editTextNumberSigned = findViewById(R.id.editTextNumberSigned);
                int targetTemperature = Integer.parseInt(editTextNumberSigned.getText().toString());

                //Intent 생성하여 온도 데이터를 search_result로 전달
                Intent intent = new Intent(getApplicationContext(), search_result.class);
                intent.putExtra("targetTemperature", targetTemperature);
                startActivity(intent);
            }
        });




        ImageButton search_temperature_button = (ImageButton) findViewById(R.id.search_temperature_button);
        search_temperature_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {/**
             ImageView search_tip = (ImageView)findViewById(R.id.search_tip4);
             search_tip.setVisibility(View.VISIBLE);*/
                /**Intent intent = new Intent(getApplicationContext(), search_tip_temperature.class);
                 startActivity(intent);
                 */
                ImageButton imageButton9 = (ImageButton)findViewById(R.id.imageButton9);
                imageButton9.setVisibility(View.VISIBLE);
            }
        });


        ImageButton imageButton9 = (ImageButton) findViewById(R.id.imageButton9);
        imageButton9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageButton imageButton9 = (ImageButton)findViewById(R.id.imageButton9);
                imageButton9.setVisibility(View.INVISIBLE);
            }
        });


        ImageButton search_user_backbutton = (ImageButton) findViewById(R.id.search_user_backbutton);
        search_user_backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),calender.class);
                startActivity(intent);
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








/**
        //search_month

        //이전 액티비티에서 온도 데이터 받아오기
        Intent intent = getIntent();
        targetTemperature = intent.getIntExtra("targetTemperature", 0);
        //달 선택 후 검색 결과를 search_result로 전달
        //선택된 달을 받아서 사용

        //검색 결과 전달 및 화면 전환
        Intent resultIntent = new Intent(getApplicationContext(), search_result.class);
        resultIntent.putExtra("targetTemperature", targetTemperature);
        //다른 데이터 추가(선택된 달 등)
        //resultIntent.putExtra("selectoedMonth", selectedMonth);
        startActivity(resultIntent);

        getWindow().setWindowAnimations(0);



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

                        if (sum >= 3) { // Check if sum is 3 or more
                            // Load and start the animation
                            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blink);
                            search_month_3.startAnimation(anim);
                        } else {
                            // Stop the animation
                            search_month_3.clearAnimation();
                        }
                    } else {
                        buttons[buttonIndex].setTextColor(Color.parseColor("#ffffff"));
                    }
                }
            });
        }

*/
    }
}


