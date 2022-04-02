package com.example.numberguess;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class InstructionsActivity extends AppCompatActivity {
    private Button toMain;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instructions);
        toMain=(Button) findViewById(R.id.HomePage);
        toMain.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent=new Intent(InstructionsActivity.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}