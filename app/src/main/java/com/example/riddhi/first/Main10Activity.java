package com.example.riddhi.first;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;

public class Main10Activity extends AppCompatActivity {
    ImageButton black, orange, brown;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main10);

        final MediaPlayer s =MediaPlayer.create(this,R.raw.chooseyellow);
        s.start();
        ImageButton yellow = (ImageButton) findViewById(R.id.yellow);

        yellow.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                s.stop();
                Intent intent = new Intent(Main10Activity.this, Main2_3Activity.class);
                startActivity(intent);
                finish();
            }
        });

        black=(ImageButton)findViewById(R.id.black);
        orange=(ImageButton)findViewById(R.id.orange);
        brown=(ImageButton)findViewById(R.id.brown);

        black.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                s.stop();
                didTapButton(v);
            }
        });

        orange.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v)
            {
                s.stop();
                didTapButton1(v);
            }
        });

        brown.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                s.stop();
                didTapButton2(v);
            }
        });

        ImageButton home = (ImageButton)findViewById(R.id.home);

        home.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                s.stop();
                Intent i = new Intent(Main10Activity.this,MainActivity.class);
                startActivity(i);
                finish();
            }
        });

    }
    public void didTapButton(View view) {
        MediaPlayer s1 = MediaPlayer.create(this,R.raw.ohoh);
        s1.start();
        final Animation myAnim = AnimationUtils.loadAnimation(this, R.anim.bounce);
        MyBounceInterpolator interpolator = new MyBounceInterpolator(0.2, 20);
        myAnim.setInterpolator(interpolator);
        black.startAnimation(myAnim);

    }
    public void didTapButton1(View view) {
        MediaPlayer s2 = MediaPlayer.create(this,R.raw.ohoh);
        s2.start();
        final Animation myAnim = AnimationUtils.loadAnimation(this, R.anim.bounce);
        MyBounceInterpolator interpolator = new MyBounceInterpolator(0.2, 20);
        myAnim.setInterpolator(interpolator);
        orange.startAnimation(myAnim);

    }
    public void didTapButton2(View view) {
        MediaPlayer s3 = MediaPlayer.create(this,R.raw.ohoh);
        s3.start();
        final Animation myAnim = AnimationUtils.loadAnimation(this, R.anim.bounce);
        MyBounceInterpolator interpolator = new MyBounceInterpolator(0.2, 20);
        myAnim.setInterpolator(interpolator);
        brown.startAnimation(myAnim);
    }

}

