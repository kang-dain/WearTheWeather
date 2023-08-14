package org.techtown.weartheweather;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Random;

public class keyword_sun extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_keyword_sun);

        ImageButton keyword_closebutton = (ImageButton) findViewById(R.id.keyword_closebutton);
        keyword_closebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), user_input.class);
                startActivity(intent);
            }
        });


        // 이미 정해놓은 비오는 날씨 키워드 리스트
        ArrayList<String> sunKeywords = new ArrayList<>();
        sunKeywords.add("상쾌함");   sunKeywords.add("활기참");   sunKeywords.add("행복함");
        sunKeywords.add("밝음");    sunKeywords.add("경쾌함");   sunKeywords.add("즐거움");
        sunKeywords.add("유쾌함");   sunKeywords.add("기분좋음");  sunKeywords.add("더움");
        sunKeywords.add("생기발랄");  sunKeywords.add("에너지");   sunKeywords.add("창의적");
        sunKeywords.add("자유로움");  sunKeywords.add("신선함");   sunKeywords.add("희망적");
        sunKeywords.add("해방감");   sunKeywords.add("활기참");   sunKeywords.add("쾌적함");
        sunKeywords.add("싱그러움");  sunKeywords.add("여유로움");


        // 이미 정해놓은 키워드 리스트에서 랜덤으로 3개의 키워드를 추천
        ArrayList<String> recommendedKeywords = getRandomKeywords(sunKeywords, 3);

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

}