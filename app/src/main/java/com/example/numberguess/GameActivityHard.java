package com.example.numberguess;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class GameActivityHard extends AppCompatActivity {
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
        setContentView(R.layout.activity_game_hard);


        randomNum = getLevel.getRandomNum("hard");



        getNumber=(Button) findViewById(R.id.guessButton);
        getNumber.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {
                EditText textInput= (EditText) findViewById(R.id.guessText);
                String convertTextToString=textInput.getText().toString();
                int userChoice=getLevel.toInteger(convertTextToString);
                String ins="Pick a number 1-50. Check the hint box for a hint!";
                ((TextView) findViewById(R.id.instructionsNum)).setText(ins);
                if(userChoice>0 && userChoice<51){
                    if(userChoice==0)
                    {
                        Intent intent=new Intent(GameActivityHard.this,MainActivity.class);
                        startActivity(intent);
                        finish();

                    }
                    else {

                        if (getLevel.checkAnswerCorrect(randomNum, userChoice) == true) {

                            randomNum = getLevel.getRandomNum("hard");

                            pointsCounter++;

                            currentPoints = getLevel.gethighscore(currentPoints, "hard", pointsCounter);
                            highScore = currentPoints;
                            overallCorrect++;
                            output = String.format("The number you guessed is correct! Keep Going! Your current score %d, total guessed correct %d", currentPoints, overallCorrect);
                            ((TextView) findViewById(R.id.outputText)).setText(output);


                        } else {
                            output = String.format("Wrong guess again! Your current score %d, total guessed correct %d", currentPoints, overallCorrect);
                            ((TextView) findViewById(R.id.outputText)).setText(output);
                            pointsCounter = 0;

                            if (((CheckBox) findViewById(R.id.hintCheckBox)).isChecked() == true) {
                                output = getLevel.getHint(randomNum, userChoice);
                                output += String.format("Your current score %d, total guessed correct %d", currentPoints, overallCorrect);
                                ((TextView) findViewById(R.id.outputText)).setText(output);
                            }

                        }


                    }
                }else{
                    output="Enter a valid number!";
                    ((TextView) findViewById(R.id.outputText)).setText(output);

                }






            }


        });


        tohome=(Button) findViewById(R.id.guessToHome);
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
                ((TextView) findViewById(R.id.hardScore)).setText(output);

                output = "";

                pointsCounter = 0;
                currentPoints = 0;
                overallCorrect = 0;


                Intent intent=new Intent(GameActivityHard.this,MainActivity.class);
                startActivity(intent);
                finish();
            }

        });




    }


}