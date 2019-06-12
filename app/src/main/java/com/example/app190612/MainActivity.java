package com.example.app190612;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    //Activity Class가 Instance화된 후 가장 먼저 호출되는 Method
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //상위 Class의 Method 호출
        super.onCreate(savedInstanceState);
        //화면 출력을 위해 View를 설정하는 Method
        setContentView(R.layout.activity_main);
        //Log Cat 출력
        Log.e("change", "Code변경");

    }
}