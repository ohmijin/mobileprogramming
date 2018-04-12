package com.example.smart_25.project1_3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //변수선언
    EditText edit1,edit2;
    Button btnBmi;
    TextView textResult;
    String num1, num2;
    Float height, weight, bmi;
    Integer cm=100;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("간단 BMI 계산기");

        //xml에 있는 id값 찾기
        edit1 = (EditText) findViewById(R.id.Height);
        edit2 = (EditText) findViewById(R.id.Weight);
        btnBmi = (Button) findViewById(R.id.BtnBmi);
        textResult = (TextView) findViewById(R.id.TextResult);

        //기능부여 ==> 이벤트 ==> onTouchListener
        btnBmi.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                height = Float.parseFloat(num1);
                weight = Float.parseFloat(num2);

                bmi =  (weight) / ((height/cm)*(height/cm));

                if ( bmi < 18.5  ){
                    textResult.setText(bmi.toString() +" 은 저체중 입니다");
                }
                else if( 18.5 < bmi && bmi < 22.9){
                    textResult.setText(bmi.toString() +" 은 정상 입니다");
                }
                else if (bmi >= 23){
                    textResult.setText(bmi.toString() +" 은 비만 입니다");
                }
                else{
                    textResult.setText("잘못 입력하셨습니다");
                }

                return false;
            }
        });
    }
}
