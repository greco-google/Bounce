package com.example.student.bounce;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by student on 6/27/2016.
 */
public class BallAnimation extends View {
    private final int FRAME_RATE = 15;
    private Paint paint;
    private Handler handler;
    Ball myBall;
    Track myTrack;
    public BallAnimation(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        // Setting the Handler(allows you to process runnable objects) object
        handler = new Handler();

        //Paint object
        paint = new Paint();
        paint.setColor(Color.BLACK);

        //Creating the ball object(x=100 y=100 color=black radus=50
        myBall = new Ball(400, 250, Color.BLACK, 10);
       // myTrack = new Track(360,215, Color.BLUE);
        Canvas canvas = new Canvas();
        canvas.drawRect(360,215,100,100, paint);

        //speed of the ball
        myBall.setDX(2);
        myBall.setDY(2);
    }

    protected void onDraw(Canvas canvas) {

        //drawing the images by taking data from the ball
        canvas.drawRect(10,50,1000,950, paint);
        //canvas.drawRect(10,50,925,875, paint.getColor(android.R.color.white));
        myBall.tick(canvas);

        //Call the runnable which will calculate the model and draw animation
        handler.postDelayed(runnable, FRAME_RATE);
    }

    private Runnable runnable = new Runnable(){
        public void run() {
            invalidate();
        }
    };
}
