package com.example.riddhi.first;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.ViewSwitcher;

public class Main12Activity extends AppCompatActivity {
    ImageButton b_prev, b_next,home;

    ImageSwitcher imageSwitcher;
    MediaPlayer s1,s2,s3,s4,s5,s6,s7,s8;

    Integer[] images = {R.drawable.reds, R.drawable.greenss,R.drawable.violets,R.drawable.bluess,R.drawable.pinkss,R.drawable.orangess,
                         R.drawable.yellows,R.drawable.browns};
    int i = 0, cnt = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main12);

        imageSwitcher = (ImageSwitcher) findViewById(R.id.imageSwitcher);
        cnt = 0;
        imageSwitcher.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {
                ImageView imageView = new ImageView(getApplicationContext());
                imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                imageView.setLayoutParams(new ImageSwitcher.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
                return imageView;
            }
        });

        imageSwitcher.setImageResource(images[0]);
        play();

        final Animation in = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.in);
        final Animation out = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.out);
        final Animation in2 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.in2);
        final Animation out2 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.out2);


        imageSwitcher.setInAnimation(in);
        imageSwitcher.setOutAnimation(out);
        imageSwitcher.setInAnimation(in2);
        imageSwitcher.setOutAnimation(out2);

        b_next = (ImageButton) findViewById(R.id.b_next);
        b_prev = (ImageButton) findViewById(R.id.b_prev);
        home=(ImageButton)findViewById(R.id.home);

        b_prev.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                imageSwitcher.setInAnimation(in);
                imageSwitcher.setOutAnimation(out);
                if (i > 0) {
                    i--;
                    cnt--;
                    imageSwitcher.setImageResource(images[i]);
                    play1();
                }
            }
        });
        home.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent i = new Intent(Main12Activity.this,MainActivity.class);
                startActivity(i);
                finish();
            }
        });

        b_next.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                imageSwitcher.setInAnimation(in2);
                imageSwitcher.setOutAnimation(out2);

                if (i < images.length - 1) {
                    i++;
                    cnt++;
                    imageSwitcher.setImageResource(images[i]);
                    play();
                }
            }
        });
    }

    public void play (){
        if (cnt == 0) {
            onpause();
            s1 = MediaPlayer.create(Main12Activity.this, R.raw.redcolor);
            s1.start();
        }

        if (cnt == 1) {
            onpause();
            s2 = MediaPlayer.create(Main12Activity.this, R.raw.greencolor);
            s2.start();
        }
        if (cnt == 2) {
            onpause();
            s3 = MediaPlayer.create(Main12Activity.this, R.raw.purplecolor);
            s3.start();
        }
        if (cnt == 3) {
            onpause();
            s4 = MediaPlayer.create(Main12Activity.this, R.raw.bluecolor);
            s4.start();
        }
        if (cnt == 4) {
            onpause();
            s5 = MediaPlayer.create(Main12Activity.this, R.raw.pinkcolor);
            s5.start();
        }
        if (cnt == 5) {
            onpause();
            s6 = MediaPlayer.create(Main12Activity.this, R.raw.orangecolor);
            s6.start();
        }
        if (cnt == 6) {
            onpause();
            s7 = MediaPlayer.create(Main12Activity.this, R.raw.yellowcolor);
            s7.start();
        }
        if(cnt == 7)
        {
            onpause();
            s8 = MediaPlayer.create(Main12Activity.this, R.raw.browncolor);
            s8.start();
        }
    }

    public void play1()
    {
        if (cnt == 0) {
            onpause1();
            s1 = MediaPlayer.create(Main12Activity.this, R.raw.redcolor);
            s1.start();
        }

        if (cnt == 1) {
            onpause1();
            s2 = MediaPlayer.create(Main12Activity.this, R.raw.greencolor);
            s2.start();
        }
        if (cnt == 2) {
            onpause1();
            s3 = MediaPlayer.create(Main12Activity.this, R.raw.purplecolor);
            s3.start();
        }
        if (cnt == 3) {
            onpause1();
            s4 = MediaPlayer.create(Main12Activity.this, R.raw.bluecolor);
            s4.start();
        }
        if (cnt == 4) {
            onpause1();
            s5 = MediaPlayer.create(Main12Activity.this, R.raw.pinkcolor);
            s5.start();
        }
        if (cnt == 5) {
            onpause1();
            s6 = MediaPlayer.create(Main12Activity.this, R.raw.orangecolor);
            s6.start();
        }
        if (cnt == 6) {
            onpause1();
            s7 = MediaPlayer.create(Main12Activity.this, R.raw.yellowcolor);
            s7.start();
        }
        if(cnt ==7)
        {
            onpause1();
            s8 = MediaPlayer.create(Main12Activity.this, R.raw.browncolor);
            s8.start();
        }


    }
    protected void onpause() {

        if (cnt == 1) {
            super.onPause();
            s1.release();
        }
        if (cnt == 2) {
            super.onPause();
            s2.release();
        }
        if (cnt == 3) {
            super.onPause();
            s3.release();
        }
        if (cnt == 4) {
            super.onPause();
            s4.release();
        }
        if (cnt == 5) {
            super.onPause();
            s5.release();
        }
        if (cnt == 6) {
            super.onPause();
            s6.release();
        }
        if (cnt == 7) {
            super.onPause();
            s7.release();
        }
        if (cnt == 8) {
            super.onPause();
            s8.release();
        }

    }

    protected void onpause1() {

        if (cnt == 0) {
            super.onPause();
            s2.release();
        }
        if (cnt == 1) {
            super.onPause();
            s3.release();
        }
        if(cnt == 2){
            super.onPause();
            s4.release();
        }
        if(cnt == 3){
            super.onPause();
            s5.release();
        }
        if(cnt == 4){
            super.onPause();
            s6.release();
        }
        if(cnt == 5){
            super.onPause();
            s7.release();
        }
        if(cnt==6)
        {
            super.onPause();
            s8.release();
        }

    }
}

