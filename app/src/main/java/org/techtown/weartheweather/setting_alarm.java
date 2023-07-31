package org.techtown.weartheweather;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Switch;

import androidx.appcompat.app.AppCompatActivity;


public class setting_alarm extends AppCompatActivity {

    //스위치버튼 상태 유지
    private SettingAlarmPlus settingAlarmPlus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting_alarm);

        settingAlarmPlus = new SettingAlarmPlus(this);

        Switch switch1 = findViewById(R.id.switch1);
        switch1.setChecked(settingAlarmPlus.loadSwitchState()); //스위치 상태 복원

        switch1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){

                    //스위치가 ON인 상태
                    settingAlarmPlus.saveSwitchState(true);

                    ImageView setting_alarm_2 = (ImageView)findViewById(R.id.setting_alarm_2);
                    setting_alarm_2.setVisibility(View.VISIBLE);

                    ImageView setting_alarm_common_big_arrow__right = (ImageView)findViewById(R.id.setting_alarm_common_big_arrow__right);
                    setting_alarm_common_big_arrow__right.setVisibility(View.VISIBLE);
                }
                else{

                    //스위치가 OFF인 상태
                    settingAlarmPlus.saveSwitchState(false);

                    ImageView setting_alarm_2 = (ImageView)findViewById(R.id.setting_alarm_2);
                    setting_alarm_2.setVisibility(View.INVISIBLE);

                    ImageView setting_alarm_common_big_arrow__right = (ImageView)findViewById(R.id.setting_alarm_common_big_arrow__right);
                    setting_alarm_common_big_arrow__right.setVisibility(View.INVISIBLE);
                }
            }
        });


        ImageButton setting_common_backbutton6 = (ImageButton) findViewById(R.id.setting_common_backbutton6);
        setting_common_backbutton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), setting.class);
                startActivity(intent);
            }
        });

        ImageButton setting_alarm_common_big_arrow__right = (ImageButton) findViewById(R.id.setting_alarm_common_big_arrow__right);
        setting_alarm_common_big_arrow__right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), setting_alarm_time.class);
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