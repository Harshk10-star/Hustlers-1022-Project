package com.example.numberguess;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button buttonStart;
    private Button buttonInstructions;
    private Button buttonHigh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonStart=(Button) findViewById(R.id.start);
        buttonStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                openStartActivity();
            }


        });
        buttonInstructions=(Button) findViewById(R.id.instructions);
        buttonInstructions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                openInstructionsActivity();
            }
        });

        buttonHigh=(Button) findViewById(R.id.highscores);
        buttonHigh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                openHighActivity();
            }
        });
    }
    public void openStartActivity(){
        Intent intent= new Intent(this,GameActivity.class);
        startActivity(intent);
    }
    public void openInstructionsActivity(){
        Intent intent= new Intent(this,InstructionsActivity.class);
        startActivity(intent);
    }
    public void openHighActivity(){
        Intent intent= new Intent(this,ScoresActivity.class);
        startActivity(intent);
    }
}