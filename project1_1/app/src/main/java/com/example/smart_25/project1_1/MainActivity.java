package com.example.smart_25.project1_1;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //변수 선언 자료형 변수명;
    Button button1; //버튼명은 id값과 동일하지 않아도 된다
    Button button2, button3;

    TextView tv1,tv2,tv3;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //activity_main.xml에 있는 id값 찾아서 변수에 저장하기
        button1 = (Button) findViewById(R.id.button); //res에서 id값을 button1찾음
        button2 = (Button) findViewById(R.id.button2); //res에서 id값을 button1찾음
        button3 = (Button) findViewById(R.id.button3); //res에서 id값을 button1찾음

        tv1 = (TextView) findViewById(R.id.textView1);
        tv2 = (TextView) findViewById(R.id.textView2);
        tv3 = (TextView) findViewById(R.id.textView3);


        //위젯에 이벤트 부여하기 ==> button1에 click이벤트 리스너 부여
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { //이벤트 핸들러 ==> 실제 처리하는 공간
                Toast.makeText(getApplicationContext(),  "hello", Toast.LENGTH_SHORT).show();
                //Toast : 메시지 보여주는 클래스
                //makeText(): 메시지를 만들어줌
                //getApplicationContext(): 실행되는 어플리케이션의 내용으로
                //Toast.LENGTH_SHORT : 메시지길이(보여지는 길이)
                //show():보여주기

            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "안녕하세요", Toast.LENGTH_SHORT).show();

            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(getApplicationContext(), "감사합니다", Toast.LENGTH_SHORT).show();
                tv2.setText("2018오미진");//변경하고자 하는 텍스트
                tv3.setText("정릉거주 경제학 전공");
                tv2.setTextColor(Color.BLUE);
                tv3.setTextSize(30);
            }
        });


    }
}
