package com.example.nureddin.calculator;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int primary;
    String valOne, valTwo,rootVal;
    float answer;
    boolean inProgress = false;
    boolean secondVal = false;
    boolean root = false;
    boolean equals = false;
    char operand;
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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        http://tekeye.uk/android/examples/how-to-set-a-color-in-android
        primary = getResources().getColor(R.color.colorPrimary);

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
                equals = false;
                root_button.setBackgroundColor(primary);
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
                equals = false;
                add_button.setBackgroundColor(Color.YELLOW);
                div_button.setBackgroundColor(Color.YELLOW);
                multi_button.setBackgroundColor(Color.YELLOW);
                sub_button.setBackgroundColor(Color.YELLOW);
                root_button.setBackgroundColor(primary);

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
                equals = false;
                add_button.setBackgroundColor(Color.YELLOW);
                div_button.setBackgroundColor(Color.YELLOW);
                multi_button.setBackgroundColor(Color.YELLOW);
                sub_button.setBackgroundColor(Color.YELLOW);
                root_button.setBackgroundColor(primary);

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
                equals = false;
                add_button.setBackgroundColor(Color.YELLOW);
                div_button.setBackgroundColor(Color.YELLOW);
                multi_button.setBackgroundColor(Color.YELLOW);
                sub_button.setBackgroundColor(Color.YELLOW);
                root_button.setBackgroundColor(primary);

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
                equals = false;
                add_button.setBackgroundColor(Color.YELLOW);
                div_button.setBackgroundColor(Color.YELLOW);
                multi_button.setBackgroundColor(Color.YELLOW);
                sub_button.setBackgroundColor(Color.YELLOW);
                root_button.setBackgroundColor(primary);

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
                equals = false;
                add_button.setBackgroundColor(Color.YELLOW);
                div_button.setBackgroundColor(Color.YELLOW);
                multi_button.setBackgroundColor(Color.YELLOW);
                sub_button.setBackgroundColor(Color.YELLOW);
                root_button.setBackgroundColor(primary);

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
                equals = false;
                add_button.setBackgroundColor(Color.YELLOW);
                div_button.setBackgroundColor(Color.YELLOW);
                multi_button.setBackgroundColor(Color.YELLOW);
                sub_button.setBackgroundColor(Color.YELLOW);
                root_button.setBackgroundColor(primary);

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
                equals = false;
                add_button.setBackgroundColor(Color.YELLOW);
                div_button.setBackgroundColor(Color.YELLOW);
                multi_button.setBackgroundColor(Color.YELLOW);
                sub_button.setBackgroundColor(Color.YELLOW);
                root_button.setBackgroundColor(primary);

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
                equals = false;
                add_button.setBackgroundColor(Color.YELLOW);
                div_button.setBackgroundColor(Color.YELLOW);
                multi_button.setBackgroundColor(Color.YELLOW);
                sub_button.setBackgroundColor(Color.YELLOW);
                root_button.setBackgroundColor(primary);

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
                equals = false;
                add_button.setBackgroundColor(Color.YELLOW);
                div_button.setBackgroundColor(Color.YELLOW);
                multi_button.setBackgroundColor(Color.YELLOW);
                sub_button.setBackgroundColor(Color.YELLOW);
                root_button.setBackgroundColor(primary);

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

        deci_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                equals = false;
                add_button.setBackgroundColor(Color.YELLOW);
                div_button.setBackgroundColor(Color.YELLOW);
                multi_button.setBackgroundColor(Color.YELLOW);
                sub_button.setBackgroundColor(Color.YELLOW);
                root_button.setBackgroundColor(primary);

                if(secondVal){
                    display.setText("0.");
                    secondVal = false;
                }
                else{
                    display.setText(display.getText()+".");
                }
            }
        });

        add_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                equals = false;
                add_button.setBackgroundColor(Color.GRAY);
                div_button.setBackgroundColor(Color.YELLOW);
                sub_button.setBackgroundColor(Color.YELLOW);
                multi_button.setBackgroundColor(Color.YELLOW);
                root_button.setBackgroundColor(primary);

                if (!inProgress) {
                    valOne = display.getText().toString();
                    operand = '+';
                    inProgress = true;
                    secondVal = true;
                }
//                else if(root){
//                    rootVal = Float.parseFloat(display.getText().toString());
//                }
                else if(inProgress){
                    valTwo = display.getText().toString();
                    valOne = Float.toString(calculate(valOne, valTwo, operand));
                    answer = Float.parseFloat(valOne);
                    operand = '+';
                    if (checkDeci(answer)) {
                        int wholeAnswer = (int) answer;
                        display.setText(Integer.toString(wholeAnswer));
                    } else {
                        display.setText(Float.toString(answer));
                    }
                    secondVal = true;
                }
            }
        });

        multi_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                equals = false;
                multi_button.setBackgroundColor(Color.GRAY);
                div_button.setBackgroundColor(Color.YELLOW);
                add_button.setBackgroundColor(Color.YELLOW);
                sub_button.setBackgroundColor(Color.YELLOW);
                root_button.setBackgroundColor(primary);

                if (!inProgress) {
                    valOne = display.getText().toString();
                    operand = '*';
                    inProgress = true;
                    secondVal = true;

                }
//                else if(root){
//                    rootVal = Float.parseFloat(display.getText().toString());
//                    answer =(float) root(rootVal);
////                    display.setText(Double.toString(answer));
//                    if(!inProgress) {
//                        valOne = Float.toString(answer);
//                    } else{
//                        valTwo = Float.toString(answer);
//                    }
//                    root = false;
//                }
                else if(inProgress) {
                    valTwo = display.getText().toString();
                    valOne = Float.toString(calculate(valOne, valTwo, operand));
                    answer = Float.parseFloat(valOne);
                    operand = '*';
                    if(checkDeci(answer)){
                        int wholeAnswer = (int) answer;
                        display.setText(Integer.toString(wholeAnswer));
                    }
                    else{
                        display.setText(Float.toString(answer));
                    }
                    secondVal = true;
                }
            }
        });

        sub_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                equals = false;
                sub_button.setBackgroundColor(Color.GRAY);
                div_button.setBackgroundColor(Color.YELLOW);
                add_button.setBackgroundColor(Color.YELLOW);
                multi_button.setBackgroundColor(Color.YELLOW);
                root_button.setBackgroundColor(primary);

                if (!inProgress) {
                    valOne = display.getText().toString();
                    operand = '-';
                    inProgress = true;
                    secondVal = true;
                }
                else if(inProgress) {
                    valTwo = display.getText().toString();
                    valOne = Float.toString(calculate(valOne, valTwo, operand));
                    answer = Float.parseFloat(valOne);
                    operand = '-';
                    if (checkDeci(answer)) {
                        wholeAnswer = (int) answer;
                        display.setText(Integer.toString(wholeAnswer));
                    } else {
                        display.setText(Float.toString(answer));
                    }
                    secondVal = true;
                }
            }
        });

        div_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                equals = false;
                div_button.setBackgroundColor(Color.GRAY);
                add_button.setBackgroundColor(Color.YELLOW);
                sub_button.setBackgroundColor(Color.YELLOW);
                multi_button.setBackgroundColor(Color.YELLOW);
                root_button.setBackgroundColor(primary);


                if (!inProgress) {
                    valOne = display.getText().toString();
                    operand = '/';
                    inProgress = true;
                    secondVal = true;
                } else if(inProgress) {
                    valTwo = display.getText().toString();
                    valOne = Float.toString(calculate(valOne, valTwo, operand));
                    answer = Float.parseFloat(valOne);
                    operand = '/';
                    if (checkDeci(answer)) {
                        wholeAnswer = (int) answer;
                        display.setText(Integer.toString(wholeAnswer));
                    } else {
                        display.setText(Float.toString(answer));
                    }
                    secondVal = true;
                }
            }
        });

        root_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                equals = false;
                root_button.setBackgroundColor(Color.GRAY);
                div_button.setBackgroundColor(Color.YELLOW);
                add_button.setBackgroundColor(Color.YELLOW);
                sub_button.setBackgroundColor(Color.YELLOW);
                multi_button.setBackgroundColor(Color.YELLOW);
                root = true;
                if(display.getText() == "0"){
                    display.setText("√");
                }
                else if(secondVal){
                    display.setText("√");
                    secondVal = false;
                }
                else{
                    display.setText(display.getText()+"√");
                }

            }
        });

        pos_neg_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                equals = false;
                placeHolder = Float.parseFloat(display.getText().toString());
                placeHolder = -1 * placeHolder;

                if(display.getText() == "0"){
                    display.setText("-");
                }

                else if(secondVal){
                    display.setText("-");
                    secondVal = false;
                }

                else{
                    if(checkDeci(placeHolder)) {
                        wholeAnswer = (int) placeHolder;
                        display.setText(Integer.toString(wholeAnswer));
                    } else {
                        display.setText(Float.toString(placeHolder));
                    }
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
                root_button.setBackgroundColor(primary);
                display.setText("0");
                valOne = "";
                valTwo = "";
                operand = ' ';
                inProgress = false;
                secondVal = false;
                equals = false;
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
                add_button.setBackgroundColor(Color.YELLOW);
                div_button.setBackgroundColor(Color.YELLOW);
                multi_button.setBackgroundColor(Color.YELLOW);
                sub_button.setBackgroundColor(Color.YELLOW);
                root_button.setBackgroundColor(primary);

                valTwo = display.getText().toString();
                inProgress = false;
//                answer = calculate(valOne,valTwo,operand);
                if(operand == '-' && equals){
                    answer = calculate(valTwo,valOne,operand);
                }
                if(operand == '/' && equals){
                    answer = calculate(valTwo,valOne,operand);
                }
//                if(root && secondVal){
//                    rootVal = display.getText().toString();
//                    answer =(float) root(rootVal);
//                    display.setText(Double.toString(answer));
//                    root = false;
//
//                }
                else{

                    answer = calculate(valOne,valTwo,operand);
//                    display.setText(Float.toString(answer));
                }

                display.setText(Float.toString(answer));

                if(checkDeci(answer)){
                    wholeAnswer = (int) answer;
                    display.setText(Integer.toString(wholeAnswer));
                }

                else{
                    display.setText(Float.toString(answer));
                }
                equals = true;
                secondVal = true;

            }
        });

    }

    private float calculate(String left,String right, char operand){
        float answer = 0;
        float num1 = 0;
        float num2 = 0;
        if(operand == '+'){
            if (left.contains("√")) {
                num1 = (float) root(left);
            }
            if (right.contains("√")) {
                num2 = (float) root(right);

            }
            if(!right.contains("√") && !left.contains("√")){
                num1 = Float.parseFloat(left);
                num2 = Float.parseFloat(right);
            }
            if(num1 == 0){
                num1 = Float.parseFloat(left);
            }
            if(num2 == 0){
                num2 = Float.parseFloat(right);
            }
            answer = num1 + num2;
        }
        if(operand == '-'){
            if (left.contains("√")) {
                num1 = (float) root(left);
            }
            if (right.contains("√")) {
                num2 = (float) root(right);
            }
            else {
                num1 = Float.parseFloat(left);
                num2 = Float.parseFloat(right);

            }
            answer = num1 - num2;
        }
        if(operand == '*'){
            if (left.contains("√")) {
                num1 = (float) root(left);
            }
            if (right.contains("√")) {
                num2 = (float) root(right);
            }
            else {
                num1 = Float.parseFloat(left);
                num2 = Float.parseFloat(right);

            }
            answer = num1 * num2;
        }
        if(operand == '/'){
            if (left.contains("√")) {
                num1 = (float) root(left);
            }
            if (right.contains("√")) {
                num2 = (float) root(right);
            }
            else {
                num1 = Float.parseFloat(left);
                num2 = Float.parseFloat(right);

            }
            answer = num1 / num2;
        }

        return answer;
    }

    private double root(String num){
        String temp = "";
        for(int i = 1; i <= num.length()-1; i++) {
            temp += num.charAt(i);

        }
//        display.setText(temp);
        double val = Float.parseFloat(temp);
        double answer = Math.sqrt(val);
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
