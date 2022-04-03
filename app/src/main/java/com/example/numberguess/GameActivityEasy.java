package com.example.numberguess;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class GameActivityEasy extends AppCompatActivity {

    private int randomNum;
    private Button getNumber;
    private Button tohome;
    private String output;
    private int pointsCounter = 0;
    private int currentPoints;
    private int highScore;
    private int overallCorrect;
    private int mostCorrect;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_easy);


        randomNum = getLevel.getRandomNum("easy");



        getNumber=(Button) findViewById(R.id.guessButtonM);
        getNumber.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {
                EditText textInput= (EditText) findViewById(R.id.guessTextM);
                String convertTextToString=textInput.getText().toString();
                int userChoice=getLevel.toInteger(convertTextToString);

                if(userChoice>0 && userChoice<11){
                    if(userChoice==0)
                    {
                        Intent intent=new Intent(GameActivityEasy.this,MainActivity.class);
                        startActivity(intent);
                        finish();

                    }
                    else {

                        if (getLevel.checkAnswerCorrect(randomNum, userChoice) == true) {

                            randomNum = getLevel.getRandomNum("easy");

                            pointsCounter++;

                            currentPoints = getLevel.gethighscore(currentPoints, "easy", pointsCounter);
                            highScore = currentPoints;
                            overallCorrect++;
                            output = String.format("The number you guessed is correct! Keep Going! Your current score %d, total guessed correct %d", currentPoints, overallCorrect);
                            ((TextView) findViewById(R.id.outputTextM)).setText(output);


                        } else {
                            output = String.format("Wrong guess again! Your current score %d, total guessed correct %d", currentPoints, overallCorrect);
                            ((TextView) findViewById(R.id.outputTextM)).setText(output);
                            pointsCounter = 0;

                            if (((CheckBox) findViewById(R.id.hintCheckBoxM)).isChecked() == true) {
                                output = getLevel.getHint(randomNum, userChoice);
                                output += String.format("Your current score %d, total guessed correct %d", currentPoints, overallCorrect);
                                ((TextView) findViewById(R.id.outputTextM)).setText(output);
                            }

                        }


                    }
                }else{
                    output="Enter a valid number!";
                    ((TextView) findViewById(R.id.outputTextM)).setText(output);

                }






            }


        });


       tohome=(Button) findViewById(R.id.guessToHomeM);
        tohome.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                if(highScore < currentPoints)
                {
                    highScore = currentPoints;
                }

                if(mostCorrect < overallCorrect)
                {
                    mostCorrect = overallCorrect;
                }



                output = String.format("HighScore: %d, Most Correct: %d", highScore, mostCorrect );
                ((TextView) findViewById(R.id.easyScore)).setText(output);

                output = "";

                pointsCounter = 0;
                currentPoints = 0;
                overallCorrect = 0;


                Intent intent=new Intent(GameActivityEasy.this,MainActivity.class);
                startActivity(intent);
                finish();
            }

        });




    }


}