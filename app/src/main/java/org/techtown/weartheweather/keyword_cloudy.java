package org.techtown.weartheweather;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Random;

public class keyword_cloudy extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_keyword_cloudy);

        // 이미 정해놓은 비오는 날씨 키워드 리스트
        ArrayList<String> cloudyKeywords = new ArrayList<>();
        cloudyKeywords.add("상쾌함");  cloudyKeywords.add("어둠"); cloudyKeywords.add("무기력"); cloudyKeywords.add("적막함");
        cloudyKeywords.add("불투명함"); cloudyKeywords.add("습함"); cloudyKeywords.add("활기 없음"); cloudyKeywords.add("분위기");
        cloudyKeywords.add("아늑함"); cloudyKeywords.add("고요함"); cloudyKeywords.add("편안함"); cloudyKeywords.add("낭만적");
        cloudyKeywords.add("차분함"); cloudyKeywords.add("맑음"); cloudyKeywords.add("우수수함"); cloudyKeywords.add("나른함");
        cloudyKeywords.add("추억"); cloudyKeywords.add("집순이"); cloudyKeywords.add("우중충함"); cloudyKeywords.add("우울함");
        cloudyKeywords.add("잔잔함"); cloudyKeywords.add("어두움"); cloudyKeywords.add("시원함");


        // 이미 정해놓은 키워드 리스트에서 랜덤으로 3개의 키워드를 추천
        ArrayList<String> recommendedKeywords = getRandomKeywords(cloudyKeywords, 3);

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