package com.example.javcalculator;

import static com.example.javcalculator.R.id.tvVar1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvVar1;
    Button btnAdd,btnSub,btnMul,btnDiv,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btnClr,btnEq;
    int input,input2;
    boolean add,sub,mul,div;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvVar1=findViewById(R.id.tvVar1);
        btnAdd=findViewById(R.id.btnAdd);
        btnSub=findViewById(R.id.btnSub);
        btnMul=findViewById(R.id.btnMul);
        btnDiv=findViewById(R.id.btnDiv);
        btn0=findViewById(R.id.btn0);
        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);
        btn4=findViewById(R.id.btn4);
        btn5=findViewById(R.id.btn5);
        btn6=findViewById(R.id.btn6);
        btn7=findViewById(R.id.btn7);
        btn8=findViewById(R.id.btn8);
        btn9=findViewById(R.id.btn9);
        btnClr=findViewById(R.id.btnClr);
        btnEq=findViewById(R.id.btnEq);

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvVar1.setText(tvVar1.getText() + "0");
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvVar1.setText(tvVar1.getText() + "1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvVar1.setText(tvVar1.getText() + "2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvVar1.setText(tvVar1.getText() + "3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvVar1.setText(tvVar1.getText() + "4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvVar1.setText(tvVar1.getText() + "5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvVar1.setText(tvVar1.getText() + "6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvVar1.setText(tvVar1.getText() + "7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvVar1.setText(tvVar1.getText() + "8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvVar1.setText(tvVar1.getText() + "9");
            }
        });
        btnClr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvVar1.setText("");
                input=0;
                input2=0;
            }
        });
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(tvVar1.getText().length()!=0){
                    input=Integer.valueOf(tvVar1.getText() + "");
                    tvVar1.setText(null);
                    add=true;
                    sub=false;
                    mul=false;
                    div=false;
                }
            }
        });
        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(tvVar1.getText().length()!=0){
                    input=Integer.valueOf(tvVar1.getText() + "");
                    tvVar1.setText(null);
                    add=false;
                    sub=true;
                    mul=false;
                    div=false;
                }
            }
        });
        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(tvVar1.getText().length()!=0){
                    input=Integer.valueOf(tvVar1.getText() + "");
                    tvVar1.setText(null);
                    add=true;
                    sub=false;
                    mul=true;
                    div=false;
                }
            }
        });
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(tvVar1.getText().length()!=0){
                    input=Integer.valueOf(tvVar1.getText() + "");
                    tvVar1.setText(null);
                    add=true;
                    sub=false;
                    mul=false;
                    div=true;
                }
            }
        });
        btnEq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                if(add||sub||mul||div){
                    input2=Integer.valueOf(tvVar1.getText() + "");
//                }
                if(add){
                    int add=input+input2;
                    String ans=String.valueOf(add);
                    tvVar1.setText(ans+ "");
                }
                if(sub){
                    int sub=input-input2;
                    String ans=String.valueOf(sub);
                    tvVar1.setText(ans+ "");
                }
                if(mul){
                    int mul=input*input2;
                    String ans=String.valueOf(mul);
                    tvVar1.setText(ans+ "");
                }
                if(div){
                    int div=input/input2;
                    String ans=String.valueOf(div);
                    tvVar1.setText(ans+ "");
                }
            }
        });
    }
}