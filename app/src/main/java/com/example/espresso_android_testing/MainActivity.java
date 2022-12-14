package com.example.espresso_android_testing;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView preferred_language;
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.english:
                preferred_language.setText("English");
                break;
            case R.id.french:
                preferred_language.setText("French");
                break;
            case R.id.german:
                preferred_language.setText("German");
                break;
            case R.id.hindi:
                preferred_language.setText("Hindi");
                break;
            case R.id.urdu:
                preferred_language.setText("Urdu");
                break;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        preferred_language = findViewById(R.id.preferred_language);
    }
}
