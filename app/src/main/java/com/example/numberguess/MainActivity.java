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



       //        buttonHigh=(Button) findViewById(R.id.themes);
//        buttonHigh.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v){
//                Intent intent=new Intent(MainActivity.this,Themes.class);
//                startActivity(intent);
//                finish();
//
//            }
//        });

        themesMenu = (Spinner) findViewById(R.id.themeMenu);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(MainActivity.this,android.R.layout.simple_list_item_1,getResources().getStringArray(R.array.themes));
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        themesMenu.setAdapter(adapter);




    }

}
