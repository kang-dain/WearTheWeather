package org.techtown.weartheweather;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;


public class search_result extends AppCompatActivity {
    private FeelsDataSource dataSource;
    private TextView resultTextView;
    @SuppressLint("Range")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_result);

 //혜음
// 인텐트로부터 온도 값과 선택된 버튼 아이디들 받기
        Intent intent = getIntent();
        int temperature = intent.getIntExtra("temperature", 0);
        ArrayList<Integer> selectedButtonIds = intent.getIntegerArrayListExtra("selectedButtonIds");

// 결과 값을 TextView에 표시 (온도)
        TextView resultTextView = findViewById(R.id.resultTextView);
        resultTextView.setText("▼Temperature: " + temperature + "°C");

// 선택된 버튼 아이디들을 Month 텍스트로 변환하여 TextView에 표시
        TextView resultTextView2 = findViewById(R.id.resultTextView2);
        StringBuilder selectedMonths = new StringBuilder("▼Month: ");
        for (int buttonId : selectedButtonIds) {
            String buttonIndexString = getResources().getResourceEntryName(buttonId).replace("button", "");
            selectedMonths.append(buttonIndexString).append(",");
        }
// 마지막에 추가된 쉼표 제거
        if (selectedMonths.length() > 0) {
            selectedMonths.deleteCharAt(selectedMonths.length() - 1);
        }
        resultTextView2.setText(selectedMonths.toString());

// DatabaseHelper 클래스의 인스턴스 생성
        DatabaseHelper dbHelper = new DatabaseHelper(getApplicationContext());

// 온도 값의 ±3 범위 내에 해당하는 데이터를 검색하여 출력
        String query = "SELECT * FROM user_input WHERE temperature BETWEEN ? AND ? ORDER BY ABS(temperature - ?) ASC, temperature ASC";
        Cursor cursor = dbHelper.getReadableDatabase().rawQuery(query, new String[]{String.valueOf(temperature - 3), String.valueOf(temperature + 3)});

        StringBuilder userData = new StringBuilder();

        while (cursor.moveToNext()) {
            int userTemperature = cursor.getInt(cursor.getColumnIndex("temperature"));

            // 온도가 조건에 맞을 때만 처리
            if (userTemperature >= temperature - 3 && userTemperature <= temperature + 3) {
                int month = getMonthFromDateString(cursor.getString(cursor.getColumnIndex("date")));
                if (selectedButtonIds.contains(getResources().getIdentifier("button" + month, "id", getPackageName()))) {
                    userData.append("\n\n▶Date: ").append(cursor.getString(cursor.getColumnIndex("date"))).append("\n");
                    userData.append("Temperature: ").append(userTemperature).append("°C\n\n");
                }
            }
        }

        cursor.close(); // Cursor를 닫아주는 것을 잊지 마세요!

// 결과 값을 TextView에 표시 (user_data)
        TextView resultTextView3 = findViewById(R.id.resultTextView3);
        resultTextView3.setText(userData.toString());



/**
        //출력
        // FeelsDataSource 인스턴스 생성
        dataSource = new FeelsDataSource(this);
        // 데이터베이스 연결 열기
        dataSource.open();

        // 결과를 표시할 TextView
        resultTextView = findViewById(R.id.resultTextView);

        //온도 받아오기
        int targetTemperature = getIntent().getIntExtra("targetTemperature", 0);

        //선택된 달 데이터 받아오기
        int[] selectedMonths = getIntent().getIntArrayExtra("selectedMonths");

        // user_input 테이블의 데이터 가져와서 출력
        List<String> searchResults = dataSource.getSearchResults(targetTemperature, selectedMonths);

        StringBuilder resultBuilder = new StringBuilder();
        for (String result : searchResults) {
            resultBuilder.append(result).append("\n\n");
        }

        resultTextView.setText(resultBuilder.toString());

        // 데이터베이스 연결 닫기
        dataSource.close();

*/
        ImageButton search_result_closebutton = (ImageButton) findViewById(R.id.common_closebutton);
        search_result_closebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), search_user.class);
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

    // 월에 해당하는 데이터 가져오는 함수
    @SuppressLint("Range")
    private String getMonthData(int month) {
        // DatabaseHelper 클래스의 인스턴스 생성
        DatabaseHelper dbHelper = new DatabaseHelper(getApplicationContext());

        // 월 값을 가지고 데이터베이스에서 해당 월의 데이터를 찾아옴
        String query = "SELECT date FROM user_input WHERE strftime('%m', date) = ?";
        Cursor cursor = dbHelper.getReadableDatabase().rawQuery(query, new String[]{String.format("%02d", month)});

        StringBuilder monthData = new StringBuilder();
        while (cursor.moveToNext()) {
            monthData.append(cursor.getString(cursor.getColumnIndex("date"))).append(", ");
        }

        cursor.close(); // Cursor를 닫아주는 것을 잊지 마세요!
        return monthData.toString();
    }
    // 월 추출 함수
    private int getMonthFromDateString(String date) {
        String[] parts = date.split("-");
        if (parts.length >= 2) {
            return Integer.parseInt(parts[1]);
        }
        return 0; // 기본값
    }
    protected void onDestroy() {
        super.onDestroy();
        if(dataSource != null) {
            dataSource.close();
        }
    }
}