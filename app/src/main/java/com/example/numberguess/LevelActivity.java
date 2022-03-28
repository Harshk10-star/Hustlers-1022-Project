package com.example.numberguess;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LevelActivity extends AppCompatActivity {
    private Button tohome;
    public String levelChosen;
    private Button easyToGame;
    private Button mediumToGame;
    private Button hardToGame;
    private Button extremeToGame;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level);
        tohome=(Button) findViewById(R.id.homeFromLevel);
        tohome.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent=new Intent(LevelActivity.this,MainActivity.class);
                startActivity(intent);
                finish();
            }

        });
        easyToGame=(Button) findViewById(R.id.easyLevel);
        easyToGame.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                levelChosen="easy";
                Intent intent=new Intent(LevelActivity.this,GameActivity.class);
                startActivity(intent);
                finish();

            }
        });
        mediumToGame=(Button) findViewById(R.id.mediumLevel);
        mediumToGame.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                levelChosen="medium";
                Intent intent=new Intent(LevelActivity.this,GameActivity.class);
                startActivity(intent);
                finish();

            }
        });

        hardToGame=(Button) findViewById(R.id.hardLevel);
        hardToGame.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                levelChosen="hard";
                Intent intent=new Intent(LevelActivity.this,GameActivity.class);
                startActivity(intent);
                finish();

            }
        });
        extremeToGame=(Button) findViewById(R.id.extremeLevel);
        extremeToGame.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                levelChosen="extreme";
                Intent intent=new Intent(LevelActivity.this,GameActivity.class);
                startActivity(intent);
                finish();

            }
        });
    }

}