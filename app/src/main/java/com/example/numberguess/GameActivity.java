package com.example.numberguess;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class GameActivity extends AppCompatActivity {


    private String level;
    private int number;
    private Button getNumber;

    private int randomNum;
    getLevel getLevel = new getLevel();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
    //    randomNum = getLevel.getRandomNum();

        getNumber=(Button) findViewById(R.id.guessButtonM);
        getNumber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText textInput= (EditText) findViewById(R.id.guessTextM);
                String convertTextToString=textInput.getText().toString();
                int userChoice=getLevel.toInteger(convertTextToString);

               if(getLevel.checkAnswerCorrect(randomNum, userChoice)==true)
               {
                   ShowMessage();
               }


            }
        });

    }



    protected void ShowMessage(){
        AlertDialog show = new AlertDialog.Builder(this)
                .setTitle("Message")
                .setMessage("k88888888888887hguh")
                .setNeutralButton("OK", null)
                .show();
    }
}