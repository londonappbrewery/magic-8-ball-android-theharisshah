package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button askbtn =(Button) findViewById(R.id.askButton);
       final ImageView balldisplay;
        balldisplay = (ImageView) findViewById(R.id.image_eightball);
       final int[] ballArray={
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
               R.drawable.ball5
        };
        askbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random ranNumgen = new Random();
                int num =ranNumgen.nextInt(4);
                balldisplay.setImageResource(ballArray[num]);
            }
        });
    }
}
