package com.example.riddhi.first;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.ViewSwitcher;

/**
 * Created by riddhi on 3/23/2017.
 */

public class Main4Activity extends AppCompatActivity {

    ImageButton b_prev, b_next,home;

    ImageSwitcher imageSwitcher;
    MediaPlayer s1,s2,s3,s4,s5,s6,s7,s8,s9,s10,s11,s12,s13,s14,s15,s16,s17,s18,s19,s20,s21,s22,s23,s24,s25,s26;

    Integer[] images = {R.drawable.a, R.drawable.b2,R.drawable.c,R.drawable.d,R.drawable.e,R.drawable.f,R.drawable.g,R.drawable.h,
                        R.drawable.i,R.drawable.j,R.drawable.k,R.drawable.l,R.drawable.m,R.drawable.n, R.drawable.o,R.drawable.p,
                        R.drawable.q,R.drawable.r,R.drawable.s,R.drawable.t,R.drawable.u,R.drawable.v,R.drawable.w,R.drawable.x,
                        R.drawable.y,R.drawable.z};
    int i = 0, cnt = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
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
                Intent i = new Intent(Main4Activity.this,MainActivity.class);
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
            s1 = MediaPlayer.create(Main4Activity.this, R.raw.a);
            s1.start();
        }

        if (cnt == 1) {
            onpause();
            s2 = MediaPlayer.create(Main4Activity.this, R.raw.b);
            s2.start();
        }
        if (cnt == 2) {
            onpause();
            s3 = MediaPlayer.create(Main4Activity.this, R.raw.c);
            s3.start();
        }
        if (cnt == 3) {
            onpause();
            s4 = MediaPlayer.create(Main4Activity.this, R.raw.d);
            s4.start();
        }
        if (cnt == 4) {
            onpause();
            s5 = MediaPlayer.create(Main4Activity.this, R.raw.e);
            s5.start();
        }
        if (cnt == 5) {
            onpause();
            s6 = MediaPlayer.create(Main4Activity.this, R.raw.f);
            s6.start();
        }
        if (cnt == 6) {
            onpause();
            s7 = MediaPlayer.create(Main4Activity.this, R.raw.g);
            s7.start();
        }
        if (cnt == 7) {
            onpause();
            s8= MediaPlayer.create(Main4Activity.this, R.raw.h);
            s8.start();
        }
        if (cnt == 8) {
            onpause();
            s9 = MediaPlayer.create(Main4Activity.this, R.raw.i);
            s9.start();
        }
        if (cnt == 9) {
            onpause();
            s10 = MediaPlayer.create(Main4Activity.this, R.raw.j);
            s10.start();
        }
        if (cnt == 10) {
            onpause();
            s11 = MediaPlayer.create(Main4Activity.this, R.raw.k);
            s11.start();
        }
        if (cnt == 11) {
            onpause();
            s12 = MediaPlayer.create(Main4Activity.this, R.raw.l);
            s12.start();
        }
        if (cnt == 12) {
            onpause();
            s13 = MediaPlayer.create(Main4Activity.this, R.raw.m);
            s13.start();
        }
        if (cnt == 13) {
            onpause();
            s14= MediaPlayer.create(Main4Activity.this, R.raw.n);
            s14.start();
        }
        if (cnt == 14) {
            onpause();
            s15= MediaPlayer.create(Main4Activity.this, R.raw.o);
            s15.start();
        }
        if (cnt == 15) {
            onpause();
            s16 = MediaPlayer.create(Main4Activity.this, R.raw.p);
            s16.start();
        }
        if (cnt == 16) {
            onpause();
            s17 = MediaPlayer.create(Main4Activity.this, R.raw.q);
            s17.start();
        }
        if (cnt == 17) {
            onpause();
            s18= MediaPlayer.create(Main4Activity.this, R.raw.r);
            s18.start();
        }
        if (cnt == 18) {
            onpause();
            s19= MediaPlayer.create(Main4Activity.this, R.raw.s);
            s19.start();
        }
        if (cnt == 19) {
            onpause();
            s20= MediaPlayer.create(Main4Activity.this, R.raw.t);
            s20.start();
        }
        if (cnt == 20) {
            onpause();
            s21= MediaPlayer.create(Main4Activity.this, R.raw.u);
            s21.start();
        }
        if (cnt == 21) {
            onpause();
            s22= MediaPlayer.create(Main4Activity.this, R.raw.v);
            s22.start();
        }
        if (cnt == 22) {
            onpause();
            s23= MediaPlayer.create(Main4Activity.this, R.raw.w);
            s23.start();
        }
        if (cnt == 23) {
            onpause();
            s24= MediaPlayer.create(Main4Activity.this, R.raw.x);
            s24.start();
        }
        if (cnt == 24) {
            onpause();
            s25= MediaPlayer.create(Main4Activity.this, R.raw.y);
            s25.start();
        }
        if (cnt == 25) {
            onpause();
            s26= MediaPlayer.create(Main4Activity.this, R.raw.z);
            s26.start();
        }

    }

    public void play1()
    {
        if (cnt == 0) {
            onpause1();
            s1 = MediaPlayer.create(Main4Activity.this, R.raw.a);
            s1.start();
        }

        if (cnt == 1) {
            onpause1();
            s2 = MediaPlayer.create(Main4Activity.this, R.raw.b);
            s2.start();
        }
        if (cnt == 2) {
            onpause1();
            s3 = MediaPlayer.create(Main4Activity.this, R.raw.c);
            s3.start();
        }
        if (cnt == 3) {
            onpause1();
            s4 = MediaPlayer.create(Main4Activity.this, R.raw.d);
            s4.start();
        }
        if (cnt == 4) {
            onpause1();
            s5 = MediaPlayer.create(Main4Activity.this, R.raw.e);
            s5.start();
        }
        if (cnt == 5) {
            onpause1();
            s6 = MediaPlayer.create(Main4Activity.this, R.raw.f);
            s6.start();
        }
        if (cnt == 6) {
            onpause1();
            s7 = MediaPlayer.create(Main4Activity.this, R.raw.g);
            s7.start();
        }
        if (cnt == 7) {
            onpause1();
            s8= MediaPlayer.create(Main4Activity.this, R.raw.h);
            s8.start();
        }
        if (cnt == 8) {
            onpause1();
            s9 = MediaPlayer.create(Main4Activity.this, R.raw.i);
            s9.start();
        }
        if (cnt == 9) {
            onpause1();
            s10 = MediaPlayer.create(Main4Activity.this, R.raw.j);
            s10.start();
        }
        if (cnt == 10) {
            onpause1();
            s11 = MediaPlayer.create(Main4Activity.this, R.raw.k);
            s11.start();
        }
        if (cnt == 11) {
            onpause1();
            s12 = MediaPlayer.create(Main4Activity.this, R.raw.l);
            s12.start();
        }
        if (cnt == 12) {
            onpause1();
            s13 = MediaPlayer.create(Main4Activity.this, R.raw.m);
            s13.start();
        }
        if (cnt == 13) {
            onpause1();
            s14= MediaPlayer.create(Main4Activity.this, R.raw.n);
            s14.start();
        }
        if (cnt == 14) {
            onpause1();
            s15= MediaPlayer.create(Main4Activity.this, R.raw.o);
            s15.start();
        }
        if (cnt == 15) {
            onpause1();
            s16 = MediaPlayer.create(Main4Activity.this, R.raw.p);
            s16.start();
        }
        if (cnt == 16) {
            onpause1();
            s17 = MediaPlayer.create(Main4Activity.this, R.raw.q);
            s17.start();
        }
        if (cnt == 17) {
            onpause1();
            s18= MediaPlayer.create(Main4Activity.this, R.raw.r);
            s18.start();
        }
        if (cnt == 18) {
            onpause1();
            s19= MediaPlayer.create(Main4Activity.this, R.raw.s);
            s19.start();
        }
        if (cnt == 19) {
            onpause1();
            s20= MediaPlayer.create(Main4Activity.this, R.raw.t);
            s20.start();
        }
        if (cnt == 20) {
            onpause1();
            s21= MediaPlayer.create(Main4Activity.this, R.raw.u);
            s21.start();
        }
        if (cnt == 21) {
            onpause1();
            s22= MediaPlayer.create(Main4Activity.this, R.raw.v);
            s22.start();
        }
        if (cnt == 22) {
            onpause1();
            s23= MediaPlayer.create(Main4Activity.this, R.raw.w);
            s23.start();
        }
        if (cnt == 23) {
            onpause1();
            s24= MediaPlayer.create(Main4Activity.this, R.raw.x);
            s24.start();
        }
        if (cnt == 24) {
            onpause1();
            s25= MediaPlayer.create(Main4Activity.this, R.raw.y);
            s25.start();
        }
        if (cnt == 25) {
            onpause1();
            s26= MediaPlayer.create(Main4Activity.this, R.raw.z);
            s26.start();
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
        if (cnt == 9) {
            super.onPause();
            s9.release();
        }
        if (cnt == 10) {
            super.onPause();
            s10.release();
        }
        if (cnt == 11) {
            super.onPause();
            s11.release();
        }
        if (cnt == 12) {
            super.onPause();
            s12.release();
        }
        if (cnt == 13) {
            super.onPause();
            s13.release();
        }
        if (cnt == 14) {
            super.onPause();
            s14.release();
        }
        if (cnt == 15) {
            super.onPause();
            s15.release();
        }
        if (cnt == 16) {
            super.onPause();
            s16.release();
        }
        if (cnt == 17) {
            super.onPause();
            s17.release();
        }
        if (cnt == 18) {
            super.onPause();
            s18.release();
        }
        if (cnt ==19) {
            super.onPause();
            s19.release();
        }
        if (cnt == 20) {
            super.onPause();
            s20.release();
        }
        if (cnt == 21) {
            super.onPause();
            s21.release();
        }
        if (cnt == 22) {
            super.onPause();
            s22.release();
        }
        if (cnt == 23) {
            super.onPause();
            s23.release();
        }
        if (cnt == 24) {
            super.onPause();
            s24.release();
        }
        if (cnt == 25) {
            super.onPause();
            s25.release();
        }
        if (cnt == 26) {
            super.onPause();
            s26.release();
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
        if(cnt == 6){
            super.onPause();
            s8.release();
        }
        if(cnt == 7){
            super.onPause();
            s9.release();
        }
        if(cnt == 8){
            super.onPause();
            s10.release();
        }
        if(cnt == 9){
            super.onPause();
            s11.release();
        }
        if(cnt == 10){
            super.onPause();
            s12.release();
        }
        if(cnt == 11){
            super.onPause();
            s13.release();
        }
        if(cnt == 12){
            super.onPause();
            s14.release();
        }
        if(cnt == 13){
            super.onPause();
            s15.release();
        }
        if(cnt == 14){
            super.onPause();
            s16.release();
        }
        if(cnt == 15){
            super.onPause();
            s17.release();
        }
        if(cnt == 16){
            super.onPause();
            s18.release();
        }
        if(cnt == 17){
            super.onPause();
            s19.release();
        }
        if(cnt == 18){
            super.onPause();
            s20.release();
        }
        if(cnt == 19){
            super.onPause();
            s21.release();
        }
        if(cnt == 20){
            super.onPause();
            s22.release();
        }
        if(cnt == 21){
            super.onPause();
            s23.release();
        }
        if(cnt == 22){
            super.onPause();
            s24.release();
        }
        if(cnt == 23){
            super.onPause();
            s25.release();
        }
        if(cnt == 24){
            super.onPause();
            s26.release();
        }

    }
}







