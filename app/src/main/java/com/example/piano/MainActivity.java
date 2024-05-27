package com.example.piano;

import androidx.appcompat.app.AppCompatActivity;

import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {
    private SoundPool soundPool;
    private int sound_a,sound_b,sound_c,sound_d,sound_e,sound_f,sound_g,sound_h,sound_i,sound_j;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    if (Build.VERSION.SDK_INT>=Build.VERSION_CODES.LOLLIPOP) {
        soundPool = new SoundPool.Builder().setMaxStreams(5).build();
        }
    else {
            soundPool=new SoundPool(5, AudioManager.STREAM_MUSIC,0);
        }

        sound_a= soundPool.load(this,R.raw.m1,1);
        sound_b= soundPool.load(this,R.raw.m2,1);
        sound_c= soundPool.load(this,R.raw.m3,1);
        sound_d= soundPool.load(this,R.raw.m4,1);
        sound_e= soundPool.load(this,R.raw.m5,1);
        sound_f= soundPool.load(this,R.raw.m6,1);
        sound_g= soundPool.load(this,R.raw.m7,1);
        sound_h= soundPool.load(this,R.raw.m8,1);
        sound_i= soundPool.load(this,R.raw.m9,1);
        sound_j= soundPool.load(this,R.raw.m10,1);



    }



    public void click(View view) {
        int viewId = view.getId();

        if (viewId == R.id.a) {
            soundPool.play(sound_a, 1, 1, 0, 0, 1);
        } else if (viewId == R.id.b) {
            soundPool.play(sound_b, 1, 1, 0, 0, 1);
        } else if (viewId == R.id.c) {
            soundPool.play(sound_c, 1, 1, 0, 0, 1);
        } else if (viewId == R.id.d) {
            soundPool.play(sound_d, 1, 1, 0, 0, 1);
        } else if (viewId == R.id.e) {
            soundPool.play(sound_e, 1, 1, 0, 0, 1);
        } else if (viewId == R.id.f) {
            soundPool.play(sound_f, 1, 1, 0, 0, 1);
        } else if (viewId == R.id.g) {
            soundPool.play(sound_g, 1, 1, 0, 0, 1);
        } else if (viewId == R.id.h) {
            soundPool.play(sound_h, 1, 1, 0, 0, 1);
        } else if (viewId == R.id.i) {
            soundPool.play(sound_i, 1, 1, 0, 0, 1);
        } else if (viewId == R.id.j) {
            soundPool.play(sound_j, 1, 1, 0, 0, 1);
        } else {
            throw new IllegalStateException("Unexpected value: " + view.getId());
        }
    }
}