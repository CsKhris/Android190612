package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class EditActivity extends AppCompatActivity {
    private EditText edit;
    private Button btn;
    private TextView result;

    //Keyboard 관리 객체의 참조를 저장할 변수
    InputMethodManager imm;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit);

        //XML File에 Design 한 View 가져오기
        edit = (EditText)findViewById(R.id.edit);
        btn = (Button)findViewById(R.id.btn);
        result = (TextView)findViewById(R.id.result);

        //Button을 눌렀을 때 Event 처리
        btn.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){
                String msg = edit.getText().toString();
                result.setText(msg);
            }
        });

        //EditText의 문자열이 변경되면 호출되는 Event 설정
        edit.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                result.setText(editable.toString());
            }
        });

        //Keyboard 관리 객체 가져오기
        imm = (InputMethodManager)getSystemService(
                INPUT_METHOD_SERVICE);
        //Keyboard 출력하기 : edit에 입력가능하도록 설정
        imm.showSoftInput(edit, 0);

        Button keyboardshow = (Button)findViewById(R.id.keyboardshow);
        keyboardshow.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){
                imm.showSoftInput(edit, 0);
            }
        });

        Button keyboardhide = (Button)findViewById(R.id.keyboardhide);
        keyboardhide.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v) {
                imm.hideSoftInputFromWindow(edit.getWindowToken(), 0);
            }
        });
    }
}
