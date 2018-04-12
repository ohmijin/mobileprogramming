package com.example.smart_25.project1_4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
//import android.widget.Button;
//import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;
//import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //사용할 변수 선언
    TextView text1, text2;
    //CheckBox chkAgree;
    Switch switch1;
    RadioGroup rGroup1;
    RadioButton rdoDog, rdoCat, rdoRab;
    //Button btnOk;
    ImageView imgPet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);
        setTitle("사진 선택");

        //id찾기
        text1 = (TextView) findViewById(R.id.Text1);
        text2 = (TextView) findViewById(R.id.Text2);
        switch1 = (Switch) findViewById(R.id.Switch1);
        //chkAgree = (CheckBox) findViewById(R.id.ChkAgree);
        rGroup1 = (RadioGroup) findViewById(R.id.Rgroup1);
        rdoDog = (RadioButton) findViewById(R.id.RdoDog);
        rdoCat = (RadioButton) findViewById(R.id.RdoCat);
        rdoRab = (RadioButton) findViewById(R.id.RdoRab);
        //btnOk = (Button) findViewById(R.id.BtnOk);
        imgPet = (ImageView) findViewById(R.id.ImgPet);

        //checkBox의 선택 유무 체크할 이벤트
        //클릭으로 해도 상관은 없음
//        chkAgree.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
//            //선택을 변경할 때 발생하는 이벤트 리스너 등록
//            @Override
//            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
//                //이벤트 핸들러
//                if(chkAgree.isChecked()==true){
//                    //isChecked : checked 속성값을 알아볼 때 사용
//                    //화면에 보여주기 ==> visible이라는 속성값을 설정
//                    text2.setVisibility(View.VISIBLE);
//                    rGroup1.setVisibility(View.VISIBLE);
//                    //btnOk.setVisibility(View.VISIBLE);
//                    imgPet.setVisibility(View.VISIBLE);
//                }else { //다시 화면에서 숨기기
//                    text2.setVisibility(View.INVISIBLE);
//                    rGroup1.setVisibility(View.INVISIBLE);
//                    //btnOk.setVisibility(View.INVISIBLE);
//                    imgPet.setVisibility(View.INVISIBLE);
//                }
//            }
//        }); // checkbox 영역에 대한 처리 끝

//        //선택완료 버튼에 클릭 이벤트 부여
//        btnOk.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                switch(rGroup1.getCheckedRadioButtonId()){
//                    case R.id.RdoDog:
//                        imgPet.setImageResource(R.drawable.dog);
//                        //setImageResources ==> android:src 동일 기능 ==> 이미지 불러오기
//                        break;
//                    case R.id.RdoCat:
//                        imgPet.setImageResource(R.drawable.cat);
//                        //setImageResources ==> android:src 동일 기능 ==> 이미지 불러오기
//                        break;
//                    case R.id.RdoRab:
//                        imgPet.setImageResource(R.drawable.rabbit);
//                        //setImageResources ==> android:src 동일 기능 ==> 이미지 불러오기
//                        break;
//                    default:
//                        Toast.makeText(getApplicationContext(),
//                                "선택하세요", Toast.LENGTH_SHORT).show();
//
//                }
//
//            }
//        });


    }
}
