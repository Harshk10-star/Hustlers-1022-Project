package com.example.numberguess;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class GameActivity extends AppCompatActivity {


    private EditText guess;
    private CheckBox hintReveal;
    private EditText hint;
    private Button toHome;
    private Button Guess;
    private View listener;
    private int randomNum;
    private String level;
    private int number;

    public GameActivity(String level){
        this.level=level;
        if(level=="easy"){
            number=getLevel.easy();
        }else if(level=="medium"){
            number=getLevel.medium();
        }else if(level=="hard") {
            number = getLevel.hard();
        }else if(level=="extreme") {
            number = getLevel.extreme();
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);




    }

    public void  onClickOther(View v){
        EditText textInput= (EditText) findViewById(R.id.guessText);
        String convertTextToString=textInput.getText().toString();


        int userChoice=getLevel.toInteger(convertTextToString);

        if(userChoice==number){
            if(level=="easy"){
                number=getLevel.easy();
            }else if(level=="medium"){
                number=getLevel.medium();
            }else if(level=="hard") {
                number = getLevel.hard();
            }else if(level=="extreme") {
                number = getLevel.extreme();
            }
            String sendBack="Good Job! Guess next number!";
            ((TextView)findViewById(R.id.response)).setText(sendBack);
        }else{
            String sendBack="Incorrect try agai!";
            ((TextView)findViewById(R.id.response)).setText(sendBack);
        }


    }






}