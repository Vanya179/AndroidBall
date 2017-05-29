package com.example.ball;

import android.graphics.Canvas;

public abstract class Obj {
    protected float velx, vely, x, y, diametr;
    abstract public void draw(Canvas canvas);
    public Obj()
    {
        velx = (float) (Math.random() * 5);
        vely = (float) (Math.random() * 5);
        diametr = (float) (Math.random() * 57 + 5);
        x = (float) (Math.random() * 570 + diametr / 2 + 1);
        y = (float) (Math.random() * 570 + diametr / 2 + 1);
    }
    protected void move()
    {
        x += velx;
        y += vely;
    }
    protected void turn(Canvas canvas)
    {
        if (x > canvas.getWidth() - diametr / 2 || x < diametr / 2)
            velx *= -1;
        if (y > canvas.getHeight() - diametr / 2 || y < diametr / 2)
            vely *= -1;
    }
}
