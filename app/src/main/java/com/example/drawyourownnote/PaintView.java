package com.example.drawyourownnote;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.design.widget.FloatingActionButton;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class PaintView extends View {

    public ViewGroup.LayoutParams layoutParams;
    private android.graphics.Path path = new Path();
    private Paint brush = new Paint();

    Paint myPaint;
    FloatingActionButton floatingActionButtonAddPaint;




    public PaintView(Context context,  AttributeSet attrs) {
        super(context, attrs);

        myPaint = new Paint();

        brush.setAntiAlias(true);
        brush.setColor(Color.MAGENTA);
        brush.setStyle(Paint.Style.STROKE);
        brush.setStrokeJoin(Paint.Join.ROUND);
        brush.setStrokeWidth(8f);





        layoutParams = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {

        float pointX = event.getX();
        float pointY = event.getY();

        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                path.moveTo(pointX, pointY);
                return true;
            case MotionEvent.ACTION_MOVE:
                path.lineTo(pointX, pointY);
                break;
            default:
                return false;

        }
        postInvalidate();
        return false;


    }

    @Override
    protected void onDraw(Canvas canvas) {
        canvas.drawPath(path, brush);

       //canvas.drawCircle(400,250, 100, myPaint);






    }
}




