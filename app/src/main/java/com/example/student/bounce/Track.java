package com.example.student.bounce;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;

/**
 * Created by student on 6/27/2016.
 */
public class Track {
    private Point point;
    private int color;
    private Paint paint;

    public Track(int y, int x, int col) {
        point = new Point(x,y);
        color = col;
        paint = new Paint();
        paint.setColor(color);
    }
    public int getX() {
        return point.x;
    }
    public int getY() {
        return point.y;
    }
    public Paint getPaint() {
        return paint;
    }
    public void setColor(int col) {
        col = color;
    }
    public void goTo(int x, int y) {
        point.x = x;
        point.y = y;

        Paint paint;
        Track myTrack;

        //Paint object
        paint = new Paint();
        paint.setColor(Color.BLUE);

    }
    public void bounce(Canvas canvas) {

        if (point.x > canvas.getWidth() || point.x < 0) {
        }
        if (point.y > canvas.getWidth() || point.y < 0) {
        }
    }
    public void tick (Canvas canvas) {
        Paint myPaint = new Paint();
        myPaint.setColor(Color.BLUE);
        this.bounce(canvas);
        canvas.drawRect(this.getX(), this.getY(),this.getX(),this.getY(), myPaint);
    }
}
