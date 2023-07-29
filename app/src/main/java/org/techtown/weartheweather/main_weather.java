package org.techtown.weartheweather;

import android.content.ContentValues;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class main_weather extends AppCompatActivity {

    private TextView weather;
    private TransLocalPoint transLocalPoint;
    private GpsTracker gpsTracker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_weather);

        //위젯에 대한 참조.
        weather = findViewById(R.id.weather);

        //URL 설정
        //String url = "http://kostat.go.kr/";

        String service_key = "%2Bsux%2FaGSa489c6iXbwfDMDDGKf8zxQQvkIcDIn6USryYU8cVVOHjlcXDeMIXWM1xMqX%2Bs9L7zGPRBhoPmI9TKg%3D%3D";
        String num_of_rows = "1";
        String page_no = "1";
        String date_type = "JSON"; //API로부터 받을 타입
        String base_date = "20230729"; //조회할 날짜
        String base_time = "0600"; //조회할 시간
        String nx = "55"; //조회 지역 좌표
        String ny = "127"; //조회 지역 좌표


        String url = "http://apis.data.go.kr/1360000/VilageFcstInfoService_2.0/getUltraSrtNcst" +
                "serviceKey="+service_key+
                "&numOfRows="+num_of_rows+
                "&pageNo="+page_no+
                "&dataType="+date_type+
                "&base_date="+base_date+
                "&base_time="+base_time+
                "&nx="+nx+
                "&ny="+ny;

        //AsyncTask를 통해 HTTpURLConnection 수행
        NetworkTask networkTask = new NetworkTask(url, null);
        networkTask.execute();


        ImageView main_weather_button1 = findViewById(R.id.main_weather_button1);
        main_weather_button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), user_input_temperature.class);
                startActivity(intent);
            }
        });

        ImageButton imageButton5 = findViewById(R.id.imageButton5);
        imageButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), main_weather.class);
                startActivity(intent);
            }
        });
        ImageButton imageButton6 = findViewById(R.id.imageButton6);
        imageButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), recommended_music.class);
                startActivity(intent);
            }
        });
        ImageButton imageButton7 = findViewById(R.id.imageButton7);
        imageButton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), calender.class);
                startActivity(intent);
            }
        });
        ImageButton imageButton8 = findViewById(R.id.imageButton8);
        imageButton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), search_temperature.class);
                startActivity(intent);
            }
        });
        ImageButton imageButton4 = findViewById(R.id.imageButton4);
        imageButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), menu.class);
                startActivity(intent);
            }
        });

    }

    public void setGpsTracker(GpsTracker gpsTracker) {
        this.gpsTracker = gpsTracker;
    }

    public TransLocalPoint getTransLocalPoint() {
        return transLocalPoint;
    }

    public void setTransLocalPoint(TransLocalPoint transLocalPoint) {
        this.transLocalPoint = transLocalPoint;
    }

    public GpsTracker getGpsTracker() {
        return gpsTracker;
    }

    public class NetworkTask extends AsyncTask<Void, Void, String> {

        private final String url;
        private final ContentValues values;

        public NetworkTask(String url, ContentValues values) {

            this.url = url;
            this.values = values;
        }

        @Override
        protected String doInBackground(Void... params) {

            String result; //요청 결과를 저장할 변수
            RequestHttpConnection requestHttpConnection = new RequestHttpConnection();
            result = requestHttpConnection.request(url, values); //해당 URL로부터 결과

            return result;
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            //doInBackground()로 부터 리턴된 값이 onPostExecute()의 매개변수로 넘어오므로 s를 출력한다.
            weather.setText(s);
            Log.d("onPostEx", "출력 값: " + s);
        }
    }

}

