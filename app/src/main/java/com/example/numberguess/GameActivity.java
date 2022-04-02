package com.example.numberguess;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class GameActivity extends AppCompatActivity {


    private String level;
    private int number;
    private Button getNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);


        getNumber=(Button) findViewById(R.id.guessButton);
        getNumber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText textInput= (EditText) findViewById(R.id.guessText);
                String convertTextToString=textInput.getText().toString();
                int userChoice=getLevel.toInteger(convertTextToString);


            }
        });

    }
}