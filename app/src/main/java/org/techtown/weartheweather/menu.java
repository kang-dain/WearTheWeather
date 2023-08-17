package org.techtown.weartheweather;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
public class menu extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        // SharedPreferences에서 데이터 가져오기
        SharedPreferences sharedPref = getSharedPreferences("UserData", Context.MODE_PRIVATE);
        String email = sharedPref.getString("email", "");
        String nickname = sharedPref.getString("nickname", "");

        // 텍스트뷰에 이메일 정보 설정
        TextView emailView = findViewById(R.id.email_View);
        emailView.setText("이메일: " + email);




        ImageButton menu_button1 = (ImageButton) findViewById(R.id.menu_button1);
        menu_button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), setting.class);
                startActivity(intent);
            }
        });



        ImageButton menu_common_closebutton = (ImageButton) findViewById(R.id.menu_common_closebutton);
        menu_common_closebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), main_weather.class);
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
                Intent intent = new Intent(getApplicationContext(), search_user.class);
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