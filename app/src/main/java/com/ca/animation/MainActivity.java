package com.ca.animation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView Android_dv;
Button translet,alpha,rotate,scale;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Android_dv=findViewById(R.id.Android_dv);
        translet=findViewById(R.id.translete);
        alpha=findViewById(R.id.alpha);
        rotate=findViewById(R.id.rotate);
        scale=findViewById(R.id.scale);

        translet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animation_tra = AnimationUtils.loadAnimation(MainActivity.this, R.anim.animation_translet);
                Android_dv.startAnimation(animation_tra);
            }

        });
        alpha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animation_alpha = AnimationUtils.loadAnimation(MainActivity.this, R.anim.animation_alpha);
                Android_dv.startAnimation(animation_alpha);
            }

        });
        rotate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animation_rotate = AnimationUtils.loadAnimation(MainActivity.this, R.anim.animation_rotate);
                Android_dv.startAnimation(animation_rotate);
            }

        });
        scale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animation_scale = AnimationUtils.loadAnimation(MainActivity.this, R.anim.animation_scale);
                Android_dv.startAnimation(animation_scale);
            }

        });
        }
    }
