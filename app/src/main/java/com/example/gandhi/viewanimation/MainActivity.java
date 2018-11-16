package com.example.gandhi.viewanimation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final android.widget.TextView textView = findViewById(R.id.tv1);
        final android.view.animation.Animation trans = android.view.animation.AnimationUtils.loadAnimation(this,R.anim.translation);
        final android.widget.Button button = findViewById(R.id.btn1);

        button.setOnClickListener(new android.view.View.OnClickListener() {
            @Override
            public void onClick(android.view.View view) {
                textView.startAnimation(trans);
            }
        });
    }
}

