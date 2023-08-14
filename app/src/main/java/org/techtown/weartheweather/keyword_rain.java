package org.techtown.weartheweather;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Random;

public class keyword_rain extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_keyword_rain);


        ImageButton keyword_closebutton = (ImageButton) findViewById(R.id.keyword_closebutton);
        keyword_closebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), user_input.class);
                startActivity(intent);
            }
        });


        // 이미 정해놓은 비오는 날씨 키워드 리스트
        ArrayList<String> rainKeywords = new ArrayList<>();
        rainKeywords.add("추적추적");    rainKeywords.add("상쾌함");   rainKeywords.add("시원함");   rainKeywords.add("깨끗함");
        rainKeywords.add("청량함");   rainKeywords.add("고요함");   rainKeywords.add("빗소리");   rainKeywords.add("장마");
        rainKeywords.add("선선함");   rainKeywords.add("비바람");   rainKeywords.add("차가움");   rainKeywords.add("조용함");
        rainKeywords.add("여유로움");   rainKeywords.add("싱그러움");   rainKeywords.add("잔잔함");   rainKeywords.add("감성적");
        rainKeywords.add("나른함");   rainKeywords.add("찜찜함");   rainKeywords.add("우중충한");   rainKeywords.add("낭만적");
        rainKeywords.add("아늑함");   rainKeywords.add("우울함");   rainKeywords.add("습함");


        // 이미 정해놓은 키워드 리스트에서 랜덤으로 3개의 키워드를 추천
        ArrayList<String> recommendedKeywords = getRandomKeywords(rainKeywords, 3);

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