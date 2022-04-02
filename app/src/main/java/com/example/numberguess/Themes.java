
package com.example.numberguess;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;


public class Themes extends AppCompatActivity {

    private Button Main;
//    private Button tech;
//    private Button storm;
//    private Button galaxy;
//    private Button  none;


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_themes);




            Main=(Button) findViewById(R.id.themesToHome);
            Main.setOnClickListener(new View.OnClickListener(){
                @Override
            public void onClick(View v){
                Intent intent=new Intent(Themes.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
//
//            final RelativeLayout background;
//
//            background=findViewById(R.id.themesBack);
//
//            tech=(Button) findViewById(R.id.techButton);
//            tech.setOnClickListener(new View.OnClickListener(){
//                @Override
//                public void onClick(View v){
//
//
//                    background.setBackgroundResource(R.drawable.tech);
//
//                }
//
//            });


//            storm=(Button) findViewById(R.id.stormButton);
//            storm.setOnClickListener(new View.OnClickListener(){
//                @Override
//                public void onClick(View v){
//
//
//                }
//
//            });
//
//
//            galaxy=(Button) findViewById(R.id.galaxyButton);
//            galaxy.setOnClickListener(new View.OnClickListener(){
//                @Override
//                public void onClick(View v){
//
//
//                }
//
//            });
//
//
//
//            none=(Button) findViewById(R.id.none);
//            none.setOnClickListener(new View.OnClickListener(){
//                @Override
//                public void onClick(View v){
//
//
//                }
//
//            });


        }

}
