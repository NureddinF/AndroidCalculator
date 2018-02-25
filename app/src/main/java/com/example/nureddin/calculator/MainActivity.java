package com.example.nureddin.calculator;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int primary; //val for primary color for root_button
    String valOne, valTwo; //Values that hold value one and value two
    float answer; // Holds the answer
    boolean inProgress = false; //boolean variable that indicates that an operation is in progress
    boolean secondVal = false; //boolean variable that indicates that an operand has been selected and to wait for second value to be inputted
    boolean root = false; //variable that indicates root button has been selected
    boolean equals = false; //variable that indicates that equals button has been pressed
    char operand; //holds the operand that is selcted
    int wholeAnswer; //changes answer to integer if it doesn't contain decimals
    boolean decimal = false;
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

        one_button = findViewById(R.id.one);   //setting all the buttons by their ids
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

        display.setText("0"); //initializes the textView display to 0
        zero_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                equals = false; //sets equals to false
                root_button.setBackgroundColor(primary);  //Sets the operand buttons to their default colors
                add_button.setBackgroundColor(Color.YELLOW);
                div_button.setBackgroundColor(Color.YELLOW);
                multi_button.setBackgroundColor(Color.YELLOW);
                sub_button.setBackgroundColor(Color.YELLOW);
                if(display.getText() == "0"){ //checks the display if its set to 0(initilized value)
                    display.setText("0");
                }
                else if(secondVal){ //if an operand is waiting for the second value
                    display.setText("0"); //removes the previous value and displays the value
                    secondVal = false;
                    root = false; //sets root to false, to indicate there isnt a standalone root calculation
                }
                else{
                    display.setText(display.getText()+"0"); //otherwise appends the value to the value already contained in textView
                }
            }
        });

        /* ALL THE VALUE BUTTONS CONTAIN THE SAME CODE AS ABOVE*/
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
                    root = false;
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
                    root = false;
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
                    root = false;
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
                    root = false;
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
                    root = false;
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
                    root = false;
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
                    root = false;
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
                    root = false;
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
                    root = false;
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

                if(secondVal){ //operand is waiting to second value
                    display.setText("0."); //removes the previous content held in display, and sets it to this value
                    secondVal = false;
                }
                if(!display.getText().toString().contains(".")){ //if decimal is not already present
                    display.setText(display.getText()+"."); //append decimal to previous value
                }
                else{
                    return; //otherwise quit method
                }
            }
        });

        add_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                equals = false; //sets equals to false once add button clicked


                if(secondVal){ //checks if an other operand is waiting for a second value
                    add_button.setBackgroundColor(Color.YELLOW); //sets add to its default color
                    return; //quits method
                }

                add_button.setBackgroundColor(Color.GRAY); //sets add to inprogress color
                div_button.setBackgroundColor(Color.YELLOW); //the rest to default color
                sub_button.setBackgroundColor(Color.YELLOW);
                multi_button.setBackgroundColor(Color.YELLOW);
                root_button.setBackgroundColor(primary);

                if(inProgress){ //checks if anther operand is in progress (to allow 3 * 3 + 1)
                    valTwo = display.getText().toString(); //gets the second value
                    valOne = Float.toString(calculate(valOne, valTwo, operand)); //calcualtes the value with the operand that is inprogress and sets aswer to value one
                    answer = Float.parseFloat(valOne);
                    operand = '+'; //sets the operand
                    if (checkDeci(answer)) { //checks if the answer is a decimal
                        int wholeAnswer = (int) answer; //if it isnt then sets answer to int
                        display.setText(Integer.toString(wholeAnswer));
                    } else {
                        display.setText(Float.toString(answer)); //other wise displays the float
                    }
                    secondVal = true; //sets second val to true and now waiting for a second val to be inputted
                } else {
                    valOne = display.getText().toString(); //gets val one from display
                    operand = '+'; //sets operand
                    inProgress = true; //sets inprogress to true
                    secondVal = true; //waiting for second val input
                }

            }
        });

        /*OPERAND BUTTONS SIMILAR TO ABOVE*/

        multi_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                equals = false;

                if(secondVal){
                    multi_button.setBackgroundColor(Color.YELLOW);
                    return;
                }

                multi_button.setBackgroundColor(Color.GRAY);
                div_button.setBackgroundColor(Color.YELLOW);
                add_button.setBackgroundColor(Color.YELLOW);
                sub_button.setBackgroundColor(Color.YELLOW);
                root_button.setBackgroundColor(primary);

                if(inProgress) {
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
                } else{
                    valOne = display.getText().toString();
                    operand = '*';
                    inProgress = true;
                    secondVal = true;
                }

            }
        });

        sub_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                equals = false;

                if(secondVal){
                    sub_button.setBackgroundColor(Color.YELLOW);
                    return;
                }

                sub_button.setBackgroundColor(Color.GRAY);
                div_button.setBackgroundColor(Color.YELLOW);
                add_button.setBackgroundColor(Color.YELLOW);
                multi_button.setBackgroundColor(Color.YELLOW);
                root_button.setBackgroundColor(primary);

                if(inProgress) {
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
                } else {
                    valOne = display.getText().toString();
                    operand = '-';
                    inProgress = true;
                    secondVal = true;
                }
            }
        });

        div_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                equals = false;

                if(secondVal){
                    div_button.setBackgroundColor(Color.YELLOW);
                    return;
                }

                div_button.setBackgroundColor(Color.GRAY);
                add_button.setBackgroundColor(Color.YELLOW);
                sub_button.setBackgroundColor(Color.YELLOW);
                multi_button.setBackgroundColor(Color.YELLOW);
                root_button.setBackgroundColor(primary);

                if(inProgress) {
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

                } else {
                    valOne = display.getText().toString();
                    operand = '/';
                    inProgress = true;
                    secondVal = true;
                }
            }
        });

        /*SIMILAR TO DECIMAL BUTTON*/
        root_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                root_button.setBackgroundColor(Color.GRAY);
                div_button.setBackgroundColor(Color.YELLOW);
                add_button.setBackgroundColor(Color.YELLOW);
                sub_button.setBackgroundColor(Color.YELLOW);
                multi_button.setBackgroundColor(Color.YELLOW);
                root = true;
                if(display.getText() == "0"){
                    display.setText("√");
                }
                else if(secondVal || equals){
                    display.setText("√");
                    secondVal = false;
                    root = false;
                }
                else if(!display.getText().toString().contains("√")){ //make sure cannot display more than 1 root symbols
                    display.setText(display.getText()+"√");
                }
                else{
                    return;
                }
                equals = false;


            }
        });

        pos_neg_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                placeHolder = Float.parseFloat(display.getText().toString()); //sets display text value to palce holder
                placeHolder = -1 * placeHolder; //multiplies by negative one

                /*SIMILAR TO PREV METHODS*/
                if(display.getText() == "0"){
                    display.setText("-");
                }

                else if(secondVal || equals){ //checks if equals was pressed also
                    display.setText("-");
                    secondVal = false;
                    equals = false;
                }

                else{ //checks if its a whole or decimal number and displays accordingly
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
            public void onClick(View view) { //sets all buttons to default colors and all boolean values to false
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
        }); //clears the current text to 0

        equals_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inProgress = false; //inprogress is now false since quals is clicked
                add_button.setBackgroundColor(Color.YELLOW); //sets buttons to default colors
                div_button.setBackgroundColor(Color.YELLOW);
                multi_button.setBackgroundColor(Color.YELLOW);
                sub_button.setBackgroundColor(Color.YELLOW);
                root_button.setBackgroundColor(primary);

                valTwo = display.getText().toString(); //gets value two from display

                if(operand == '-' && equals){ //checks if the operand is negative and equals is true, to allow equals to be clicked multiple times and it would
                    answer = calculate(valTwo,valOne,operand);//continue calculating and subtracting by valOne
                }
                if(operand == '/' && equals) { //same with division
                    answer = calculate(valTwo, valOne, operand);
                }
                if(root){
                    answer = (float)root(valTwo);  //if it is just a root operation alone without anyother calculations
                    root = false;
                } else{
                    answer = calculate(valOne,valTwo,operand);
                }
                if(checkDeci(answer)){ //Check for decimal or whole number
                    wholeAnswer = (int) answer;
                    display.setText(Integer.toString(wholeAnswer));
                } else{
                    display.setText(Float.toString(answer));
                }
                equals = true;
//                secondVal = true;
            }
        });

    }

    private float calculate(String left,String right, char operand){ //calculate function
        float answer = 0;
        float num1 = 0;
        float num2 = 0;
        if(operand == '+'){ //add
            if (left.contains("√")) {  //checks string to see if there is a root operation
                num1 = (float) root(left); //call on root method and convert to float
            }
            if (right.contains("√")) {
                num2 = (float) root(right);

            }
            if(!right.contains("√") && !left.contains("√")){ //if it doesn't, change strings to float
                num1 = Float.parseFloat(left);
                num2 = Float.parseFloat(right);
            }
            if(num1 == 0){
                num1 = Float.parseFloat(left);
            }
            if(num2 == 0){
                num2 = Float.parseFloat(right);
            }
            answer = num1 + num2; //add the numbers
        }
        /*SAME AS ADD*/

        if(operand == '-'){//sub
            if (left.contains("√")) {
                num1 = (float) root(left);
            }
            if (right.contains("√")) {
                num2 = (float) root(right);
            }
            if(num1 == 0){
                num1 = Float.parseFloat(left);
            }
            if(num2 == 0){
                num2 = Float.parseFloat(right);
            }
            answer = num1 - num2;//subtracts the numbers
        }
        if(operand == '*'){//multi
            if (left.contains("√")) {
                num1 = (float) root(left);
            }
            if (right.contains("√")) {
                num2 = (float) root(right);
            }
            if(num1 == 0){
                num1 = Float.parseFloat(left);
            }
            if(num2 == 0){
                num2 = Float.parseFloat(right);
            }
            answer = num1 * num2; //multiplies the numbers
        }
        if(operand == '/'){//div
            if (left.contains("√")) {
                num1 = (float) root(left);
            }
            if (right.contains("√")) {
                num2 = (float) root(right);
            }
            if(num1 == 0){
                num1 = Float.parseFloat(left);
            }
            if(num2 == 0){
                num2 = Float.parseFloat(right);
            }
            answer = num1 / num2; //divides the numbers
        }

        return answer; //retuns the answer
    }

    private double root(String num){ //calculates root operations
        String temp = "";
        for(int i = 1; i <= num.length()-1; i++) { //pases string to only get the value not the root symbol
            temp += num.charAt(i);

        }
        double val = Float.parseFloat(temp);//changes the value to float
        double answer = Math.sqrt(val); //calculates sqrt
        return answer;
    }

    private boolean checkDeci(float answer){ //method to check if final answer is a decimal or root
        if(answer % 1 == 0){ //if 0 then its a whole number
            return true;
        } else{
            return false;
        }
    }
}
