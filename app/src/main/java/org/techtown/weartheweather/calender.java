package org.techtown.weartheweather;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.CalendarView;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class calender extends AppCompatActivity {

    // 위젯 전역변수
    CalendarView calendar;
    TextView tv_date;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calender);

        // xml 연결
        calendar = findViewById(R.id.calendar);
        tv_date = findViewById(R.id.tv_date);

        // Calendar 클릭 이벤트
        calendar.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView calendarView, int year, int month, int day) {
                tv_date.setText(year + "년 " + (month + 1) + "월 " + day + "일 선택");
            }
        });



        ImageButton calender_month_button2 = (ImageButton) findViewById(R.id.calender_month_button2);
        calender_month_button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), search_temperature.class);
                startActivity(intent);
            }
        });
        ImageButton imageButton = (ImageButton) findViewById(R.id.imageButton);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), menu.class);
                startActivity(intent);
            }
        });
    }
}