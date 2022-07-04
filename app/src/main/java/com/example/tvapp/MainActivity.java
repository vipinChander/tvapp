package com.example.tvapp;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.list_val);
        String[] mobileArray = {"Android", "IPhone", "WindowsMobile", "Blackberry",
                "WebOS", "Ubuntu", "Windows7", "Max OS X"};
        ArrayAdapter adapter = new ArrayAdapter<String>(this,
                R.layout.left_design, R.id.title_name, mobileArray);
        listView.setAdapter(adapter);

        listView.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {

            }
        });
        listView.requestFocus();

    }
}