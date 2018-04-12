package com.example.smart_25.project1_2;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity1 extends AppCompatActivity {
    //위젯 따른 사용할 변수 선언 ... 데이터타입 변수명 ; ==> 데이터타입(기본형(8), 참조형:클래스)
    EditText edit1,edit2;
    Button btnAdd,btnSub,btnMul,btnDiv,btnRem, btnCle, btnRed, btnBlue;
    TextView textResult;
    String num1, num2;
    Integer result;
    Float result1; //parseFloat

    //추가한 10개의 버튼을 사용하기 위한 배열 선언
    // 일일이 버튼 10개를 만들어도 됨
    //배열선언: 타입[] 배열명 = new 타입 [크기]
    Button [] numButtons = new Button[10];
    Integer[] numBtnIDS = {R.id.BtnNum0, R.id.BtnNum1,R.id.BtnNum2,R.id.BtnNum3,R.id.BtnNum4,
            R.id.BtnNum5,R.id.BtnNum6,R.id.BtnNum7,R.id.BtnNum8,R.id.BtnNum9,};
    //id값 순서는 바뀌면 안된다
    //int i; //인덱스 번호 체크할 변수
    Integer i;
    // 클래스를 써도 된다



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);
        setTitle("간단 계산기");

        //xml에 있는 id값 찾기
        edit1 = (EditText) findViewById(R.id.Edit1);
        edit2 = (EditText) findViewById(R.id.Edit2);
        btnAdd = (Button) findViewById(R.id.BtnAdd);
        btnSub = (Button) findViewById(R.id.BtnSub);
        btnMul = (Button) findViewById(R.id.BtnMul);
        btnDiv = (Button) findViewById(R.id.BtnDiv);
        btnRem = (Button) findViewById(R.id.BtnRem);
        btnCle = (Button) findViewById(R.id.BtnClear);
        btnRed = (Button) findViewById(R.id.BtnRed);
        btnBlue = (Button) findViewById(R.id.BtnBlue);

        textResult = (TextView) findViewById(R.id.TextResult);

        //배열에 있는 id값 찾기 ==> for문 이용
        for (int i=0; i<numBtnIDS.length; i++){
            numButtons[i] = (Button) findViewById(numBtnIDS[i]);
        }
        //메소드로 연결 또는 배열에 기능구현 가능


        //기능부여 ==> 이벤트 ==> onTouchListener
        btnAdd.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                num1=edit1.getText().toString();
                num2=edit2.getText().toString();
                //getText() : 입력된 값을 얻기
                //toString(): 문자열화 하기

                result = Integer.parseInt(num1)+Integer.parseInt(num2);


                textResult.setText("계산결과 : \t"+result.toString());

                return false;
            }
        });


        btnSub.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                num1=edit1.getText().toString();
                num2=edit2.getText().toString();
                //getText() : 입력된 값을 얻기
                //toString(): 문자열화 하기

                result = Integer.parseInt(num1)-Integer.parseInt(num2);


                textResult.setText("계산결과 : \t"+result.toString());

                return false;
            }
        });


        btnMul.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                num1=edit1.getText().toString();
                num2=edit2.getText().toString();
                //getText() : 입력된 값을 얻기
                //toString(): 문자열화 하기

                result = Integer.parseInt(num1)*Integer.parseInt(num2);


                textResult.setText("계산결과 : \t"+result.toString());

                return false;
            }
        });

        btnDiv.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                num1=edit1.getText().toString();
                num2=edit2.getText().toString();
                //getText() : 입력된 값을 얻기
                //toString(): 문자열화 하기

                result1 = Float.parseFloat(num1) / Float.parseFloat(num2);


                textResult.setText("계산결과 : \t"+result1.toString());

                return false;
            }
        });


        btnRem.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                num1=edit1.getText().toString();
                num2=edit2.getText().toString();
                //getText() : 입력된 값을 얻기
                //toString(): 문자열화 하기

                result1 = Float.parseFloat(num1) % Float.parseFloat(num2);


                textResult.setText("계산결과 : \t"+result1.toString());

                return false;
            }
        });

        btnCle.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                edit1.setText("");
                edit2.setText("");

                return false;
            }
        });

        btnRed.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                edit1.setTextColor(Color.RED);
                edit2.setTextColor(Color.RED);

                return false;
            }
        });

        btnBlue.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                edit1.setTextColor(Color.BLUE);
                edit2.setTextColor(Color.BLUE);

                return false;
            }
        });

        //0-9 각 버튼에 기능부여
        for(i=0; i< numBtnIDS.length;i++){
            final int index; //final은 안붙여도 됨
            index = i;
            numButtons[index].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(edit1.isFocused()==true){
                        num1 = edit1.getText().toString()
                                + numButtons[index].getText().toString();  // append써도 된다
                    //클릭한 버튼을 계속 추가해서 보여주기
                        edit1.setText(num1); // setText ; 새롭게 값 설정
                        // setText 공백처리하면 화면지우기 clear 기능
                    }else if (edit2.isFocused()==true){
                        num2 =  edit2.getText().toString()
                                + numButtons[index].getText().toString();
                        edit2.setText(num2);
                    }else{
                        Toast.makeText(getApplicationContext(),
                                "에디트에 값 입력", Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }


    }
}
