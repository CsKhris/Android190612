package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ViewAttr extends AppCompatActivity {

    //Button과 Text View를 저장할 참조형 변수
    private Button btn;
    private TextView label;
    boolean flag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_attr);

        //XML에 Design한 View 가져오기
        btn = (Button)findViewById(R.id.btn);
        label = (TextView)findViewById(R.id.label);

        String msg = "문자열 설정";
        label.setText("msg");
        //Android에서 View에 설정하는 문자열의 자료형은 String이 아닌 CharSequence 나 Editable 인 경우가 많습니다.
        //String은 CharSequence와 Editable Interface를 구현하였기 때문에 String으로 설정은 할수 있지만,
        //가져온 내용을 String에 바로 대입할 수 없습니다.
        String txt = label.getText().toString();

        //Button을 Click 했을 때 Event 처리
        btn.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                //Java Code로 View의 속성을 변경할 때는 set Method 이용
                //View의 속성을 가져올 때는 get Method 이용
                if(flag)
                    label.setVisibility(View.VISIBLE);
                else
                    label.setVisibility(View.INVISIBLE);
                flag = !flag;
            }
        });
    }
}
