package com.example.numberguess;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class Themes extends AppCompatActivity {

    private View background;
    private Button tech;
    private Button storm;
    private Button galaxy;
    private Button  none;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_themes);


            background = (View)findViewById(R.id.themesBack);

            tech=(Button) findViewById(R.id.techButton);
            tech.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v){

                    background.setBackground();

                }

            });


            storm=(Button) findViewById(R.id.stormButton);
            storm.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v){


                }

            });


            galaxy=(Button) findViewById(R.id.galaxyButton);
            galaxy.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v){


                }

            });



            none=(Button) findViewById(R.id.none);
            none.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v){


                }

            });


        }

}