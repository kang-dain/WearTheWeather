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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting_alarm);


        Switch switch1 = findViewById(R.id.switch1);
        switch1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    ImageView setting_alarm_2 = (ImageView)findViewById(R.id.setting_alarm_2);
                    setting_alarm_2.setVisibility(View.VISIBLE);
                    ImageView setting_alarm_common_big_arrow__right = (ImageView)findViewById(R.id.setting_alarm_common_big_arrow__right);
                    setting_alarm_common_big_arrow__right.setVisibility(View.VISIBLE);
                }else{
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
    }
}