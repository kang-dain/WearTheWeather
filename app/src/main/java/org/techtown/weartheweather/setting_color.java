package org.techtown.weartheweather;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class setting_color extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting_color);


         // 라디오 그룹 찾기
         RadioGroup radioGroup = findViewById(R.id.radioGroup);

         // 라디오 버튼 클릭 이벤트 처리
         radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
        // 선택된 라디오 버튼 찾기
        RadioButton radioButton = findViewById(checkedId);

        // 선택된 라디오 버튼의 텍스트 가져오기
        String selectedColor = radioButton.getText().toString();

        // 토스트 메시지로 선택된 색상 알림
        String message = "변경된 모드:" + selectedColor;
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
        }
        });


        ImageButton setting_common_backbutton5 = (ImageButton) findViewById(R.id.setting_common_backbutton5);
        setting_common_backbutton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), setting.class);
                startActivity(intent);
            }
        });

    }
}