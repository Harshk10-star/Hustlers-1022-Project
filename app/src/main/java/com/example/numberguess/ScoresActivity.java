package com.example.numberguess;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ScoresActivity extends AppCompatActivity {
    private Button homePage;
    private Button easytoGame;
    private Button toGame;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scores);





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

}