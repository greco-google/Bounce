package com.example.student.bounce;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Canvas;
import android.support.v4.view.MotionEventCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

public class GamePlay extends AppCompatActivity {

    BallAnimation ballAnimation;
    Track track;
    private Activity mDetector;
    public int score;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_play);
        ballAnimation = (BallAnimation) findViewById(R.id.ballAnimation);
    }
    //this.score = (TextView)findViewById(R.id.editText2);

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    public void button2(View view) {
        Intent intent = new Intent(this, PauseMenu.class);
        startActivity(intent);
    }

    public boolean onTouchEvent(MotionEvent event) {
        //event = new MotionEvent()
        //this.mDetector.onTouchEvent(event);
        //Canvas canvas = new Canvas();
        float touchX = event.getX();
        float touchY = event.getY();
        int ballX = ballAnimation.myBall.getX() + 50;
        int ballY = ballAnimation.myBall.getY() + 380;
        System.out.println(touchX + " " + touchY);

        //calculate the distance of the touch event from the ball
        double distance = Math.sqrt(Math.pow((touchX - ballX), 2) + Math.pow((touchY - ballY), 2));


        //if distance is within the radius, we want to make the ball bounce
        if (distance <= (ballAnimation.myBall.getRadius()*2)) {
            ballAnimation.myBall.changeXVelocity(ballAnimation.myBall.xvelocity * -1.08);
            ballAnimation.myBall.changeYVelocity(ballAnimation.myBall.yvelocity * -1.08);
            System.out.println("Touch within Radius");
            //ballAnimation.myBall.bounce(canvas);

        }

        return super.onTouchEvent(event);

//    if(MotionEvent) {
//        public void editText3(View view){
 //           Intent intent = new Intent(score++);
//
 //   }

    }
}
