package com.example.riddhi.first;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.content.ClipData;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.DragEvent;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class Main5Activity extends AppCompatActivity {
    TextView tx1,tx2,tx3,tx4,tx5;
    MediaPlayer sound;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        sound = MediaPlayer.create(this,R.raw.longpress);
        sound.start();

        tx1=(TextView)findViewById(R.id.tx1);
        tx2=(TextView)findViewById(R.id.tx2);
        tx3=(TextView)findViewById(R.id.tx3);
        tx4=(TextView)findViewById(R.id.tx4);
        tx5=(TextView)findViewById(R.id.tx5);

        tx1.setOnLongClickListener(longClickListener);
        tx2.setOnLongClickListener(longClickListener);
        tx3.setOnLongClickListener(longClickListener);
        tx5.setOnLongClickListener(longClickListener);
        tx4.setOnDragListener(dragListener);

        ImageButton home = (ImageButton)findViewById(R.id.home);

        home.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent i = new Intent(Main5Activity.this,MainActivity.class);
                startActivity(i);
                finish();
            }
        });

    }
    View.OnLongClickListener longClickListener=new View.OnLongClickListener() {
        @Override
        public boolean onLongClick(View v) {
            ClipData data = ClipData.newPlainText("","");
            View.DragShadowBuilder myshadowbuilder = new View.DragShadowBuilder(v);
            v.startDrag(data,myshadowbuilder,v,0);
            return true;
        }
    };

    View.OnDragListener dragListener = new View.OnDragListener() {
        @Override
        public boolean onDrag(View v, DragEvent event) {
            int dragEvent = event.getAction();
            sound.stop();
            switch (dragEvent)
            {
                case DragEvent.ACTION_DRAG_ENTERED:
                    final View view=(View)event.getLocalState();
                    if(view.getId()==R.id.tx1)
                    {
                        Thread mythread = new Thread(){
                            @Override
                            public void run() {
                                try {
                                    sleep(1000);
                                    Intent intent = new Intent(getApplicationContext(), Main6Activity.class);
                                    startActivity(intent);
                                    finish();
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }

                            }
                        };
                        mythread.start();
                    }
                    break;
                case DragEvent.ACTION_DRAG_EXITED:
                    break;
                case DragEvent.ACTION_DROP:
            }
            return true;
        }
    };

}



