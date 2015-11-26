package com.auxgroup.framemove;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FrameLayout frameLayout= (FrameLayout) findViewById(R.id.myFl);
        final MeziView meziView=new MeziView(MainActivity.this);
        meziView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
               meziView.x=event.getX()-150;
                meziView.y=event.getY()-150;
                meziView.invalidate();
                return true;
            }
        });
frameLayout.addView(meziView);
    }
}
