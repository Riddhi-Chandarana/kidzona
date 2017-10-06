package com.example.riddhi.first;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;

public class Main11Activity extends AppCompatActivity {
ImageButton pink,green,yellow;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main11);

        final MediaPlayer s = MediaPlayer.create(this,R.raw.choosepurple);
        s.start();
            ImageButton violet =(ImageButton)findViewById(R.id.violet);

            violet.setOnClickListener(new View.OnClickListener(){

                @Override
                public void onClick(View v) {
                    s.stop();
                    Intent intent = new Intent(Main11Activity.this,Main2_4Activity.class);
                    startActivity(intent);
                    finish();
                }
            });
        green = (ImageButton)findViewById(R.id.green);
        pink =(ImageButton)findViewById(R.id.pink);
        yellow =(ImageButton)findViewById(R.id.yellow);

        green.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                s.stop();
                didTapButton(v);
            }
        });

        pink.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                s.stop();
                didTapButton1(v);
            }
        });

        yellow.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                didTapButton2(v);
            }
        });
        ImageButton home = (ImageButton)findViewById(R.id.home);

        home.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                s.stop();
                Intent i = new Intent(Main11Activity.this,MainActivity.class);
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
        green.startAnimation(myAnim);

    }
    public void didTapButton1(View view) {
        MediaPlayer s2 = MediaPlayer.create(this,R.raw.ohoh);
        s2.start();
        final Animation myAnim = AnimationUtils.loadAnimation(this, R.anim.bounce);
        MyBounceInterpolator interpolator = new MyBounceInterpolator(0.2, 20);
        myAnim.setInterpolator(interpolator);
        pink.startAnimation(myAnim);

    }
    public void didTapButton2(View view) {
        MediaPlayer s3 = MediaPlayer.create(this,R.raw.ohoh);
        s3.start();
        final Animation myAnim = AnimationUtils.loadAnimation(this, R.anim.bounce);
        MyBounceInterpolator interpolator = new MyBounceInterpolator(0.2, 20);
        myAnim.setInterpolator(interpolator);
        yellow.startAnimation(myAnim);

    }

}


