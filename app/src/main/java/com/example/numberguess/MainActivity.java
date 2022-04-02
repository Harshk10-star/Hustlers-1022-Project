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
    private Button buttonThemes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonStart=(Button) findViewById(R.id.start);
        buttonStart.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent=new Intent(MainActivity.this,LevelActivity.class);
                startActivity(intent);
                finish();
            }
        });


        buttonInstructions=(Button) findViewById(R.id.instructions);
        buttonInstructions.setOnClickListener(v -> {
            Intent intent=new Intent(MainActivity.this,InstructionsActivity.class);
            startActivity(intent);
            finish();

        });

        buttonHigh=(Button) findViewById(R.id.highscores);
        buttonHigh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent intent=new Intent(MainActivity.this,ScoresActivity.class);
                startActivity(intent);
                finish();

            }
        });
        
        buttonThemes=(Button) findViewById(R.id.themes);
        buttonThemes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Themes.class);
                startActivity(intent);
                finish();
            }
        });


    }

}
