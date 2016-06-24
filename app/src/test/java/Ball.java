import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;

/**
 * Created by student on 6/22/2016.
 */
public class Ball {

    private Point point;
    private int color;
    private int xvelocity;
    private int yvelocity;
    private int radius;
    private Paint paint;

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
        point.x = point.x + xvelocity;
        point.y = point.y + yvelocity;
    }
    public void bounce(Canvas canvas) {
        move();
        if (point.x > canvas.getWidth() || point.x < 0) {
            xvelocity = xvelocity * -2;
        }
        if (point.y > canvas.getWidth() || point.y < 0) {
            yvelocity = yvelocity * -2;
        }
    }
}
