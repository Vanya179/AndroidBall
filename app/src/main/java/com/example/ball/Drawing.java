package com.example.ball;


import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

import static java.lang.Thread.sleep;

public class Drawing extends View
{
    private Obj[] objs;
    int kolvo;
    @Override
    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        for (int i = 0; i < kolvo; i++)
            objs[i].draw(canvas);
        try
        {
            sleep(1);
        } catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        invalidate();
    }

    public Drawing(Context context)
    {
        super(context);
        kolvo = (int) (Math.random() * 100);
        objs = new Obj[kolvo];
        for (int i = 0; i < kolvo; i++)
        {
            boolean ind = true;
            if (Math.random() < 1.0 / 3.0)
            {
                objs[i] = new Circle();
                ind = false;
            }
            if (Math.random() < 1.0 / 2.0 && ind)
            {
                objs[i] = new Square();
                ind = false;
            }
            if (ind)
                objs[i] = new Triangle();

        }
    }
}
