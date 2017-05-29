package com.example.ball;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;

public class Triangle extends Obj
{
    @Override
    public void draw(Canvas canvas)
    {
        Paint paint = new Paint();
        paint.setARGB(255, 255, 0, 255);
        Path path = new Path(); ///это я нагуглил
        path.moveTo(x - diametr / 2, y - diametr / 2);
        path.lineTo(x, y + diametr / 2);
        path.lineTo(x + diametr / 2, y - diametr / 2);
        canvas.drawPath(path, paint);
        this.move();
        this.turn(canvas);
    }
}
