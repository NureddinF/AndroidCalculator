package com.example.nureddin.calculator;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    float valOne, valTwo, answer;
    boolean inProgress = false;
    boolean secondVal = false;
    boolean neg = false;
    int wholeAnswer;
    float placeHolder;
    private Button one_button;
    private Button two_button;
    private Button three_button;
    private Button four_button;
    private Button five_button;
    private Button six_button;
    private Button seven_button;
    private Button eight_button;
    private Button nine_button;
    private Button clear_button;
    private Button all_clear_button;
    private Button root_button;
    private Button pos_neg_button;
    private Button zero_button;
    private Button deci_button;
    private Button div_button;
    private Button multi_button;
    private Button add_button;
    private Button sub_button;
    private Button equals_button;

    private TextView display;

    private Boolean add = false;
    private Boolean sub = false;
    private Boolean multi = false;
    private Boolean div = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        one_button = findViewById(R.id.one);
        two_button = findViewById(R.id.two);
        three_button = findViewById(R.id.three);
        four_button = findViewById(R.id.four);
        five_button = findViewById(R.id.five);
        six_button = findViewById(R.id.six);
        seven_button = findViewById(R.id.seven);
        eight_button = findViewById(R.id.eight);
        nine_button = findViewById(R.id.nine);
        zero_button = findViewById(R.id.zero);
        clear_button = findViewById(R.id.clear);
        all_clear_button = findViewById(R.id.all_clear);
        root_button = findViewById(R.id.root);
        pos_neg_button = findViewById(R.id.pos_neg);
        deci_button = findViewById(R.id.decimal);
        div_button = findViewById(R.id.divide);
        multi_button = findViewById(R.id.multiply);
        add_button = findViewById(R.id.addition);
        sub_button = findViewById(R.id.subtract);
        equals_button = findViewById(R.id.equals);

        display = findViewById(R.id.display);

        display.setText("0");
        zero_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                add_button.setBackgroundColor(Color.YELLOW);
                div_button.setBackgroundColor(Color.YELLOW);
                multi_button.setBackgroundColor(Color.YELLOW);
                sub_button.setBackgroundColor(Color.YELLOW);
                if(display.getText() == "0"){
                    display.setText("0");
                }
                else if(secondVal){
                    display.setText("0");
                    secondVal = false;
                }
                else{
                    display.setText(display.getText()+"0");
                }
            }
        });

        one_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                add_button.setBackgroundColor(Color.YELLOW);
                div_button.setBackgroundColor(Color.YELLOW);
                multi_button.setBackgroundColor(Color.YELLOW);
                sub_button.setBackgroundColor(Color.YELLOW);
                if(display.getText() == "0"){
                    display.setText("1");
                }
                else if(secondVal){
                    display.setText("1");
                    secondVal = false;
                }
                else{
                    display.setText(display.getText()+"1");
                }

            }
        });

        two_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                add_button.setBackgroundColor(Color.YELLOW);
                div_button.setBackgroundColor(Color.YELLOW);
                multi_button.setBackgroundColor(Color.YELLOW);
                sub_button.setBackgroundColor(Color.YELLOW);
                if(display.getText() == "0"){
                    display.setText("2");
                }
                else if(secondVal){
                    display.setText("2");
                    secondVal = false;
                }
                else{
                    display.setText(display.getText()+"2");
                }

            }
        });

        three_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                add_button.setBackgroundColor(Color.YELLOW);
                div_button.setBackgroundColor(Color.YELLOW);
                multi_button.setBackgroundColor(Color.YELLOW);
                sub_button.setBackgroundColor(Color.YELLOW);
                if(display.getText() == "0"){
                    display.setText("3");
                }
                else if(secondVal){
                    display.setText("3");
                    secondVal = false;
                }
                else{
                    display.setText(display.getText()+"3");
                }
            }
        });

        four_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                add_button.setBackgroundColor(Color.YELLOW);
                div_button.setBackgroundColor(Color.YELLOW);
                multi_button.setBackgroundColor(Color.YELLOW);
                sub_button.setBackgroundColor(Color.YELLOW);
                if(display.getText() == "0"){
                    display.setText("4");
                }
                else if(secondVal){
                    display.setText("4");
                    secondVal = false;
                }
                else{
                    display.setText(display.getText()+"4");
                }
            }
        });

        five_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                add_button.setBackgroundColor(Color.YELLOW);
                div_button.setBackgroundColor(Color.YELLOW);
                multi_button.setBackgroundColor(Color.YELLOW);
                sub_button.setBackgroundColor(Color.YELLOW);
                if(display.getText() == "0"){
                    display.setText("5");
                }
                else if(secondVal){
                    display.setText("5");
                    secondVal = false;
                }
                else{
                    display.setText(display.getText()+"5");
                }
            }
        });

        six_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                add_button.setBackgroundColor(Color.YELLOW);
                div_button.setBackgroundColor(Color.YELLOW);
                multi_button.setBackgroundColor(Color.YELLOW);
                sub_button.setBackgroundColor(Color.YELLOW);
                if(display.getText() == "0"){
                    display.setText("6");
                }
                else if(secondVal){
                    display.setText("6");
                    secondVal = false;
                }
                else{
                    display.setText(display.getText()+"6");
                }

            }
        });

        seven_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                add_button.setBackgroundColor(Color.YELLOW);
                div_button.setBackgroundColor(Color.YELLOW);
                multi_button.setBackgroundColor(Color.YELLOW);
                sub_button.setBackgroundColor(Color.YELLOW);
                if(display.getText() == "0"){
                    display.setText("7");
                }
                else if(secondVal){
                    display.setText("7");
                    secondVal = false;
                }
                else{
                    display.setText(display.getText()+"7");
                }
            }
        });

        eight_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                add_button.setBackgroundColor(Color.YELLOW);
                div_button.setBackgroundColor(Color.YELLOW);
                multi_button.setBackgroundColor(Color.YELLOW);
                sub_button.setBackgroundColor(Color.YELLOW);
                if(display.getText() == "0"){
                    display.setText("8");
                }
                else if(secondVal){
                    display.setText("8");
                    secondVal = false;
                }
                else{
                    display.setText(display.getText()+"8");
                }
            }
        });

        nine_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                add_button.setBackgroundColor(Color.YELLOW);
                div_button.setBackgroundColor(Color.YELLOW);
                multi_button.setBackgroundColor(Color.YELLOW);
                sub_button.setBackgroundColor(Color.YELLOW);
                if(display.getText() == "0"){
                    display.setText("9");
                }
                else if(secondVal){
                    display.setText("9");
                    secondVal = false;
                }
                else{
                    display.setText(display.getText()+"9");
                }
            }
        });

        add_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (sub || multi || div) {

                }else {
                    add_button.setBackgroundColor(Color.GRAY);
                    if (!inProgress) {
                        valOne = Float.parseFloat(display.getText().toString());
                        add = true;
                        inProgress = true;
                        secondVal = true;

                    } else {
                        valTwo = Float.parseFloat((display.getText().toString()));
                        valOne = calculate(valOne, valTwo, '+');
                        if(checkDeci(valOne)){
                            int wholeAnswer = (int) valOne;
                            display.setText(Integer.toString(wholeAnswer));
                        }
                        else{
                            display.setText(Float.toString(valOne));
                        }
                        secondVal = true;

                    }
                }
            }
        });

        multi_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(add || sub || div){

                }else {
                    multi_button.setBackgroundColor(Color.GRAY);
                    if (!inProgress) {
                        valOne = Float.parseFloat(display.getText().toString());
                        multi = true;
                        inProgress = true;
                        secondVal = true;

                    } else {
                        valTwo = Float.parseFloat((display.getText().toString()));
                        valOne = calculate(valOne, valTwo, '*');
                        if(checkDeci(valOne)){
                            int wholeAnswer = (int) valOne;
                            display.setText(Integer.toString(wholeAnswer));
                        }
                        else{
                            display.setText(Float.toString(valOne));
                        }
                        secondVal = true;

                    }
                }
            }
        });

        sub_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(add || multi || div){

                }else {
                    sub_button.setBackgroundColor(Color.GRAY);
                    if (!inProgress) {
                        valOne = Float.parseFloat(display.getText().toString());
                        sub = true;
                        inProgress = true;
                        secondVal = true;

                    } else {
                        valTwo = Float.parseFloat((display.getText().toString()));
                        valOne = calculate(valOne, valTwo, '-');
                        if(checkDeci(valOne)){
                            int wholeAnswer = (int) valOne;
                            display.setText(Integer.toString(wholeAnswer));
                        }
                        else{
                            display.setText(Float.toString(valOne));
                        }
                        secondVal = true;


                    }
                }


            }
        });

        div_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(add || multi || sub){

                }else {
                    div_button.setBackgroundColor(Color.GRAY);
                    if (!inProgress) {
                        valOne = Float.parseFloat(display.getText().toString());
                        div = true;
                        inProgress = true;
                        secondVal = true;

                    } else {
                        valTwo = Float.parseFloat((display.getText().toString()));
                        valOne = calculate(valOne, valTwo, '/');
                        if(checkDeci(valOne)){
                            int wholeAnswer = (int) valOne;
                            display.setText(Integer.toString(wholeAnswer));
                        }
                        else{
                            display.setText(Float.toString(valOne));
                        }
                        secondVal = true;

                    }
                }
            }
        });

        pos_neg_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                placeHolder = Float.parseFloat(display.getText().toString());
                placeHolder = -1 * placeHolder;
                if(checkDeci(placeHolder)){
                    int wholeAnswer = (int) placeHolder;
                    display.setText(Integer.toString(wholeAnswer));
                }
                else {
                    display.setText(Float.toString(placeHolder));
                }
            }
        });

        all_clear_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                add_button.setBackgroundColor(Color.YELLOW);
                div_button.setBackgroundColor(Color.YELLOW);
                multi_button.setBackgroundColor(Color.YELLOW);
                sub_button.setBackgroundColor(Color.YELLOW);
                display.setText("0");
                valOne = 0;
                valTwo = 0;
            }
        });

        clear_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText("0");
            }
        });

        equals_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(add){
                    add = false;
                    inProgress = false;
                    valTwo = Float.parseFloat((display.getText().toString()));
                    answer = calculate(valOne,valTwo,'+');
                    if(checkDeci(answer)){
                        int wholeAnswer = (int) answer;
                        display.setText(Integer.toString(wholeAnswer));
                    }
                    else{
                        display.setText(Float.toString(answer));
                    }

                }
                if(sub){
                    valTwo = Float.parseFloat((display.getText().toString()));
                    answer = calculate(valOne,valTwo,'-');
                    display.setText(Float.toString(answer));
                    sub = false;
                    inProgress = false;
                    if(checkDeci(answer)){
                        int wholeAnswer = (int) answer;
                        display.setText(Integer.toString(wholeAnswer));
                    }
                    else{
                        display.setText(Float.toString(answer));
                    }

                }
                if(multi){
                    valTwo = Float.parseFloat((display.getText().toString()));
                    answer = calculate(valOne,valTwo,'*');
                    display.setText(Float.toString(answer));
                    multi = false;
                    inProgress = false;
                    if(checkDeci(answer)){
                        int wholeAnswer = (int) answer;
                        display.setText(Integer.toString(wholeAnswer));
                    }
                    else{
                        display.setText(Float.toString(answer));
                    }

                }
                if(div){
                    valTwo = Float.parseFloat((display.getText().toString()));
                    answer = calculate(valOne,valTwo,'/');
                    display.setText(Float.toString(answer));
                    div = false;
                    inProgress = false;
                    if(checkDeci(answer)){
                        int wholeAnswer = (int) answer;
                        display.setText(Integer.toString(wholeAnswer));
                    }
                    else{
                        display.setText(Float.toString(answer));
                    }

                }
            }
        });

    }

    private float calculate(float left,float right, char operand){
        float answer = 0;
        if(operand == '+'){
            answer = left + right;
        }
        if(operand == '-'){
            answer = left - right;
        }
        if(operand == '*'){
            answer = left * right;
        }
        if(operand == '/'){
            answer = left / right;
        }

        return answer;
    }

    private boolean checkDeci(float answer){
        if(answer % 1 == 0){
            return true;
        }
        else{
            return false;
        }
    }
}
