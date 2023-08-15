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

public class search_temperature extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_temperature);

        getWindow().setWindowAnimations(0);

//다인
        ImageButton search_temperature_right = (ImageButton) findViewById(R.id.common_big_arrow__right);

        search_temperature_right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //온도 검색을 위한 코드 추가
                EditText ediTextNumberSigned = findViewById(R.id.editTextNumberSigned);
                int targetTemperature = Integer.parseInt(ediTextNumberSigned.getText().toString());

                //search_month로 온도 데이터 전달 및 화면 전환
                Intent monthIntent = new Intent(getApplicationContext(), search_month.class);
                monthIntent.putExtra("targetTemperature", targetTemperature);
                startActivity(monthIntent);
                /**
                //검색 결과를 search_result화면으로 전달하기
                Intent resultIntent = new Intent(getApplicationContext(), search_result.class);
                resultIntent.putExtra("targetTemperature", targetTemperature);

                //search_result화면으로 데이터 전달만 하고 화면 전환은 하지 않음
                startActivity(resultIntent);
                 */


            }
        });

        //search_month화면으로 이동하기
        ImageButton common_big_arrow__right_month = (ImageButton) findViewById(R.id.common_big_arrow__right_month);
        common_big_arrow__right_month.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),search_month.class);
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
/**
        ImageView closetipbutton1 = (ImageView) findViewById(R.id.search_tip4);
        closetipbutton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageView search_tip = (ImageView)findViewById(R.id.search_tip4);
                search_tip.setVisibility(View.INVISIBLE);

            }
        });
*/



        ImageButton user_input_temperature_backbutton5 = (ImageButton) findViewById(R.id.user_input_temperature_backbutton5);
        user_input_temperature_backbutton5.setOnClickListener(new View.OnClickListener() {
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
    }
}