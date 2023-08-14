package org.techtown.weartheweather;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Random;

public class keyword_snow extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_keyword_snow);


        ImageButton keyword_closebutton = (ImageButton) findViewById(R.id.keyword_closebutton);
        keyword_closebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });


        // 이미 정해놓은 비오는 날씨 키워드 리스트
        ArrayList<String> snowKeywords = new ArrayList<>();
        snowKeywords.add("깨끗함");   snowKeywords.add("설레임");   snowKeywords.add("환상적");   snowKeywords.add("로맨틱");
        snowKeywords.add("촉촉함");   snowKeywords.add("맑음");   snowKeywords.add("기분 좋음");   snowKeywords.add("하얀 눈송이");
        snowKeywords.add("평온함");   snowKeywords.add("정적");   snowKeywords.add("차가움");   snowKeywords.add("기다림");
        snowKeywords.add("행복함");   snowKeywords.add("따뜻함");   snowKeywords.add("아늑함");   snowKeywords.add("즐거움");
        snowKeywords.add("산뜻함");   snowKeywords.add("축축함");   snowKeywords.add("펑펑");   snowKeywords.add("아름다움");
        snowKeywords.add("기대감");    snowKeywords.add("편안함");


        // 이미 정해놓은 키워드 리스트에서 랜덤으로 3개의 키워드를 추천
        ArrayList<String> recommendedKeywords = getRandomKeywords(snowKeywords, 3);

        // 키워드 리스트를 '#'으로 구분하여 문자열로 변환
        StringBuilder keywordBuilder = new StringBuilder();
        for (int i = 0; i < recommendedKeywords.size(); i++) {
            keywordBuilder.append("#").append(recommendedKeywords.get(i));
            if (i < recommendedKeywords.size() - 1) {
                keywordBuilder.append("   ");
            }
        }
        String keywordText = keywordBuilder.toString();

        // XML 레이아웃에서 TextView를 찾아서 키워드를 설정
        TextView keywordsTextView = findViewById(R.id.keywordsTextView);
        keywordsTextView.setText(keywordText);
    }

    // 랜덤으로 n개의 키워드를 추천하는 메서드
    public static ArrayList<String> getRandomKeywords(ArrayList<String> keywordList, int n) {
        ArrayList<String> recommendedKeywords = new ArrayList<>();
        Random random = new Random();

        int listSize = keywordList.size();
        if (listSize <= n) {
            recommendedKeywords.addAll(keywordList);
        } else {
            while (recommendedKeywords.size() < n) {
                int randomIndex = random.nextInt(listSize);
                String randomKeyword = keywordList.get(randomIndex);
                if (!recommendedKeywords.contains(randomKeyword)) {
                    recommendedKeywords.add(randomKeyword);
                }
            }
        }
        return recommendedKeywords;
    }
    public void onBackPressed() {
        // 뒤로가기 버튼을 눌렀을 때 원하는 동작을 수행
        // 예: 특정 조건을 검사하고 동작을 수행하거나, 데이터를 저장한 후 종료 등

        // 원래 뒤로가기 동작 수행 (액티비티 종료)
        super.onBackPressed();
    }
}
