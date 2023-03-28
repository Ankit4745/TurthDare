package com.ankit.button_custom;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private Button btn;
    private ImageView img;
    private Random random = new Random();
    private int newDirection, lastDirection;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      img = findViewById(R.id.imageView);
      btn = findViewById(R.id.button5);
    }

    public void spin(View view) {
        newDirection = random.nextInt(3600);
        float privoitX = img.getWidth()/2;
        float privoitY = img.getHeight()/2;
        Animation rotate = new RotateAnimation(lastDirection,newDirection,privoitX, privoitY);
        rotate.setDuration(3000);
        rotate.setFillAfter(true);
        lastDirection =newDirection;
        img.startAnimation(rotate);

    }
}