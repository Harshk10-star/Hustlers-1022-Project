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
    private int high;
    private String level;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Bundle bundle=getIntent().getExtras();
        high=bundle.getInt("message");
        level=bundle.getString("d");
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
        buttonInstructions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,InstructionsActivity.class);
                startActivity(intent);
                finish();

            }
        });

        buttonHigh=(Button) findViewById(R.id.highscores);
        buttonHigh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent intent=new Intent(MainActivity.this,ScoresActivity.class);
                intent.putExtra("message",high);
                intent.putExtra("d",level);
                startActivity(intent);
                finish();

            }
        });
        
        buttonThemes=(Button) findViewById(R.id.themes);
        buttonThemes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,themeActivity.class);
                startActivity(intent);
                finish();
            }
        });


    }

}
