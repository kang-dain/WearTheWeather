package org.techtown.weartheweather;


import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.List;

public class FeelsDataSource {
    private DatabaseHelper dbHelper;

        public FeelsDataSource(Context context) {
            dbHelper = new DatabaseHelper(context);
        }

        public void open() {
            dbHelper.getWritableDatabase();
        }

        public void close() {
            dbHelper.close();
        }

        public List<String> getSearchResults() {
            List<String> searchResults = new ArrayList<>();

            SQLiteDatabase db = dbHelper.getReadableDatabase();
            Cursor cursor = db.query(
                    "user_input",
                    new String[]{"date", "temperature"},
                    null,
                    null,
                    null,
                    null,
                    null
            );

            while (cursor.moveToNext()) {
                String date = cursor.getString(cursor.getColumnIndexOrThrow("date"));
                int temperature = cursor.getInt(cursor.getColumnIndexOrThrow("temperature"));

                String result = "Date: " + date + "\nTemperature: " + temperature;
                searchResults.add(result);
            }

            cursor.close();
            db.close();

            return searchResults;

    }
}