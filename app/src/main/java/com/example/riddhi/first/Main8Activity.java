package com.example.riddhi.first;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.MediaController;
import android.widget.VideoView;

public class Main8Activity extends AppCompatActivity {
ImageButton brown,yellow,red;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);

       final MediaPlayer s = MediaPlayer.create(this,R.raw.choosepink);
        s.start();
        ImageButton pink =(ImageButton)findViewById(R.id.pink);

        pink.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                s.stop();
                Intent intent = new Intent(Main8Activity.this,Main2_1Activity.class);
                startActivity(intent);
                finish();
            }
        });
        brown= (ImageButton)findViewById(R.id.brown);
        yellow =(ImageButton)findViewById(R.id.yellow);
        red=(ImageButton)findViewById(R.id.red);

        brown.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                s.stop();
                didTapButton(v);
            }
        });

        yellow.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                s.stop();
                didTapButton1(v);
            }
        });

        red.setOnClickListener(new View.OnClickListener(){

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
                Intent i = new Intent(Main8Activity.this,MainActivity.class);
                startActivity(i);
                finish();
            }
        });

    }

    public void didTapButton(View view) {
        MediaPlayer s1 =MediaPlayer.create(this,R.raw.ohoh);
        s1.start();
        final Animation myAnim = AnimationUtils.loadAnimation(this, R.anim.bounce);
        MyBounceInterpolator interpolator = new MyBounceInterpolator(0.2, 20);
        myAnim.setInterpolator(interpolator);
        brown.startAnimation(myAnim);

    }
    public void didTapButton1(View view) {
        MediaPlayer s2 = MediaPlayer.create(this,R.raw.ohoh);
        s2.start();
        final Animation myAnim = AnimationUtils.loadAnimation(this, R.anim.bounce);
        MyBounceInterpolator interpolator = new MyBounceInterpolator(0.2, 20);
        myAnim.setInterpolator(interpolator);
        yellow.startAnimation(myAnim);

    }
    public void didTapButton2(View view) {
        MediaPlayer s3 = MediaPlayer.create(this,R.raw.ohoh);
        s3.start();
        final Animation myAnim = AnimationUtils.loadAnimation(this, R.anim.bounce);
        MyBounceInterpolator interpolator = new MyBounceInterpolator(0.2, 20);
        myAnim.setInterpolator(interpolator);
        red.startAnimation(myAnim);

    }


}


