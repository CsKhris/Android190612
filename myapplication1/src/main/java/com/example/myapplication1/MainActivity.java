package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Layout xml File을 가지고 화면을 만드는 설정
        //setContentView(R.layout.activity_main);

        //Layout 객체 생성 - 여러 개의 View를 배치하는 Container 생성
        LinearLayout linear = new LinearLayout(this);

        //Layout에 추가할 Widjet 생성
        Button btn1 = new Button(this);
        btn1.setText("Button1");
        //Layout에 추가
        linear.addView(btn1);


        Button btn2 = new Button(this);
        btn2.setText("Button2");
        linear.addView(btn2);

        //Activity에 Linear를 전체 View로 설정하여 출력
        setContentView(linear);
    }
}
