package com.example.numberguess;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ScoresActivity extends AppCompatActivity {
    private Button homePage;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scores);
        Bundle bundle=getIntent().getExtras();
        int num=bundle.getInt("message");
        String m=getLevel.toString(num);
        String l=bundle.getString("d");
        if(l=="easy"){
            ((TextView) findViewById(R.id.easyScore)).setText(m);
        }else if(l=="medium"){
            ((TextView) findViewById(R.id.mediumScore)).setText(m);
        }else if(l=="hard"){
            ((TextView) findViewById(R.id.hardScore)).setText(m);
        }else if(l=="extreme"){
            ((TextView) findViewById(R.id.extremeScore)).setText(m);
        }




        homePage=(Button) findViewById(R.id.homeFromScore);
        homePage.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent=new Intent(ScoresActivity.this,MainActivity.class);
                startActivity(intent);
                finish();
            }

        });

    }

    public void setEasyScore(){
      //  ((TextView) findViewById(R.id.easyScore)).setText(String.format("HighScore: %d, Most Correct: %d", highScore, mostCorrect ));
    }

}