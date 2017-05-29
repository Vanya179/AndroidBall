package com.example.ball;

import android.graphics.Canvas;
import android.graphics.Paint;

public class Circle extends Obj
{
    @Override
    public void draw(Canvas canvas)
    {
        Paint paint = new Paint();
        paint.setARGB(255, 255, 0, 255);
        canvas.drawCircle(x, y, diametr / 2, paint);
        this.move();
        this.turn(canvas);
    }
}
