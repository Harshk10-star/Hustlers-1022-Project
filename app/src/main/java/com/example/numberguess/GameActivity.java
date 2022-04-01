package com.example.numberguess;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class GameActivity extends AppCompatActivity {


    private EditText guess;
    private CheckBox hintReveal;
    private EditText hint;
    private Button toHome;
    private Button Guess;
    private View listener;
    private int randomNum;
    private String level;
    public GameActivity(String level){
        this.level=level;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);


    }
    public void  onClick(View v){
        EditText textInput= (EditText) findViewById(R.id.guessText);
        String convertTextToString=textInput.getText().toString();




    }








}