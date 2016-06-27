package com.example.student.bounce;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;

/**
 * Created by student on 6/22/2016.
 */
public class Ball {

    private Point point;
        private int color;
        private double xvelocity;
        private double yvelocity;
        private int radius;
        private Paint paint;
        private static final double MAX_SPEED = 15;

        public Ball(int y, int x, int col, int r) {
            point = new Point(x,y);
            color = col;
            radius = r;
            paint = new Paint();
            paint.setColor(color);
        xvelocity = 0;
        yvelocity = 0;
    }
    public int getX() {
        return point.x;
}
    public int getY() {
        return point.y;
    }
    public int getRadius() {
        return radius;
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
    }
    public void setDX(int speed) {
        xvelocity = speed;
    }
    public void setDY(int speed) {
        yvelocity = speed;
    }
    public void move() {
        point.x = (int) (((double) point.x) + xvelocity);
        point.y = (int) (((double) point.y) + yvelocity);
    }
    public void bounce(Canvas canvas) {
        move();
        if (point.x > canvas.getWidth() || point.x < 0) {
            changeXVelocity(xvelocity * -1.08);
        }
        if (point.y > canvas.getWidth() || point.y < 0) {
            changeYVelocity(yvelocity * -1.08);
        }
    }
    public void changeXVelocity(double newVelocity) {
        xvelocity = newVelocity;
        if (xvelocity > MAX_SPEED) {
            xvelocity = MAX_SPEED;
        }
    }
    public void changeYVelocity(double newVelocity) {
        yvelocity = newVelocity;
        if (yvelocity > MAX_SPEED) {
            yvelocity = MAX_SPEED;
        }
    }

    public void tick (Canvas canvas) {
        this.bounce(canvas);
        canvas.drawCircle(this.getX(), this.getY(), this.getRadius(), this.getPaint());
    }
}
