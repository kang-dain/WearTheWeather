package org.techtown.weartheweather;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.List;


public class search_result extends AppCompatActivity {


    //다인
    private FeelsDataSource dataSource;
    private TextView resultTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_result);


        //다인
        dataSource = new FeelsDataSource(this);
        dataSource.open();

        resultTextView = findViewById(R.id.resultTextView);

        /**
        // 데이터베이스에서 검색결과 가져오기
        List<String> searchResults = dataSource.getSearchResults();

        if (!searchResults.isEmpty()) {
            String resultText = TextUtils.join("\n\n", searchResults);
            resultTextView.setText(resultText);
        } else {
            resultTextView.setText("검색 결과가 없습니다.");
        }
    }

    protected void onDestory() {
        super.onDestory();

        if(dataSource != null) {
            dataSource.close();
        }
         */




        //검색조건 설정 (예. 특정 날짜와 온도에 해당하는 데이터 검색
        String searchDate = "2023-08-14";
        int searchTemperature = 25;

        //데이터베이스에서 검색결과 가져오기
        List<String> searchResults = dataSource.getSearchResults(searchDate, searchTemperature);

        // 검색 결과를 TextView에 보여줍니다
        if (!searchResults.isEmpty()) {
            String resultText = TextUtils.join("\n", searchResults);
            resultTextView.setText(resultText);
        } else {
            resultTextView.setText("검색 결과가 없습니다.");
        }


        ImageButton search_result_closebutton = (ImageButton) findViewById(R.id.common_closebutton);
        search_result_closebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), search_temperature.class);
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

    protected void onDestroy() {
        super.onDestroy();
        dataSource.close();
    }
}