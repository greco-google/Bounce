package com.example.student.bounce;

import android.content.Intent;
import android.support.v4.view.MotionEventCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;

public class GamePlay extends AppCompatActivity {

    BallAnimation ballAnimation;
    Track track;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_play);
        ballAnimation = (BallAnimation) findViewById(R.id.ballAnimation);
    }

    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    public void button2(View view) {
        Intent intent = new Intent(this, PauseMenu.class);
        startActivity(intent);
    }

//    public boolean onTouchEvent(MotionEvent event){
//        this.mDetector.onTouchEvent(event);
//        if(onTouchEvent())
//            changeXVelocity(xvelocity * -1.08);
//            changeYVelocity(yvelocity * -1.08);
//
//        return super.onTouchEvent(event);
//    }

}

