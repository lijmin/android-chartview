package com.jimmylee.pieview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import java.util.List;

/**
 * 饼图
 * Created by lijiamin on 18/1/28.
 */
public class PieView extends View{
    private int circleColor;
    private Paint paint;
    private float startAngle;
    private RectF rectf;


    private List<Part> parts;


    public PieView(Context context) {
        super(context);
    }

    public PieView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(context, attrs, 0);
    }

    public PieView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context, attrs, defStyleAttr);
    }

    private void init(Context context, AttributeSet attrs, int defStyleAttr){
        TypedArray typedArray = context.obtainStyledAttributes(attrs, R.styleable.PieView, defStyleAttr, 0);
        circleColor = typedArray.getColor(R.styleable.PieView_backgroundColor, 0);
        startAngle = typedArray.getColor(R.styleable.PieView_startAngle, 180);
        typedArray.recycle();

        paint = new Paint();
        paint.setColor(circleColor);
        paint.setStyle(Paint.Style.FILL);

        rectf = new RectF();
    }



    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        int width = getWidth();
        int height = getHeight();

        canvas.drawCircle(width/2, height/2, width/2, paint);

        if (parts == null) {
            return;
        }

        rectf.right = width;
        rectf.bottom = height;
        for(Part part : parts){
            if(part == null){
                return;
            }
            paint.setColor(part.color);
            canvas.drawArc(rectf, startAngle, part.angle, true, paint);
            startAngle += part.angle;
        }


    }

    public int getCircleColor() {
        return circleColor;
    }

    public void setCircleColor(int circleColor) {
        this.circleColor = circleColor;
    }

    public Paint getPaint() {
        return paint;
    }

    public void setPaint(Paint paint) {
        this.paint = paint;
    }

    public float getStartAngle() {
        return startAngle;
    }

    public void setStartAngle(float startAngle) {
        this.startAngle = startAngle;
    }

    public List<Part> getParts() {
        return parts;
    }

    public void setParts(List<Part> parts) {
        this.parts = parts;
        this.invalidate();
    }

}
