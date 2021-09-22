package com.example.listenwithus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.TextView;

public class religious extends AppCompatActivity {
    Button review,contactus;
    int i=0,j=0,k=0,f=0;
    TextView tt1,tt2,v1,v2;
    SeekBar se1,se2;
    MediaPlayer music1,music2;
    ImageView im1,im2;
    Handler handler=new Handler();
    Runnable runnable;
       @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.religious);
           review=(Button)findViewById(R.id.review);
           contactus=(Button)findViewById(R.id.contactus);
        tt1=(TextView)findViewById(R.id.tt1);
        tt2=(TextView)findViewById(R.id.tt2);
        v1=(TextView)findViewById(R.id.v1);
        v2=(TextView)findViewById(R.id.v2);
        se1=(SeekBar) findViewById(R.id.se1);
        se2=(SeekBar) findViewById(R.id.se2);
        im1=(ImageView)findViewById(R.id.im1);
        im2=(ImageView)findViewById(R.id.im2);
        music1=MediaPlayer.create(this,R.raw.voice1);
        music2=MediaPlayer.create(this,R.raw.voice2);
          }

    public void dowenloud1 (View view) {
        i=i+1;
        tt1.setText(String.valueOf(i));
    }

    public void dowenloud2(View view) {
           j=j+1;
        tt2.setText(String.valueOf(j));
    }

    public void switch1(View view) {
       im1.setVisibility(View.GONE);
       music1.start();
       se1.setMax(music1.getDuration());
       handler.postDelayed(runnable,0);
        k=k+1;
        v1.setText(String.valueOf(k));
    }

    public void switch2(View view) {
        im2.setVisibility(View.GONE);
        music2.start();
        se1.setMax(music2.getDuration());
        handler.postDelayed(runnable,0);
        f=f+1;
        v2.setText(String.valueOf(f));
    }

    public void Reiew(View view) {
        Intent e=new Intent(getApplicationContext(),Raview.class);
        startActivity(e);
    }
}