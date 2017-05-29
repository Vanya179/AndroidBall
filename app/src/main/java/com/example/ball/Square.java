package com.example.ball;

import android.graphics.Canvas;
import android.graphics.Paint;

public class Square extends Obj
{
    @Override
    public void draw(Canvas canvas)
    {
        Paint paint = new Paint();
        paint.setARGB(255, 255, 0, 255);
        canvas.drawRect(x - diametr / 2, y - diametr / 2, x + diametr / 2, y + diametr / 2, paint);
        this.move();
        this.turn(canvas);
    }
}
