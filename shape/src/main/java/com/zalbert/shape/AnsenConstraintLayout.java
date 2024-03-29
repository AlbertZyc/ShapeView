package com.zalbert.shape;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;

import androidx.constraintlayout.widget.ConstraintLayout;

import com.zalbert.shape.module.ShapeAttribute;
import com.zalbert.shape.util.ShapeUtil;

/**
 * @author Ansen
 * @create time 2020/5/22
 */
public class AnsenConstraintLayout extends ConstraintLayout implements IAnsenShapeView{
    private ShapeAttribute shapeAttribute;

    public AnsenConstraintLayout(Context context) {
        this(context,null);
    }

    public AnsenConstraintLayout(Context context, AttributeSet attrs){
        this(context, attrs,0);
    }

    public AnsenConstraintLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        shapeAttribute= ShapeUtil.getShapeAttribute(context,attrs);
        ShapeUtil.setBackground(this,shapeAttribute);
    }

    @Override
    public void resetBackground() {
        ShapeUtil.setBackground(this,shapeAttribute);
    }

    @Override
    public void setSolidColor(int solidColor) {
        shapeAttribute.solidColor=solidColor;
    }

    @Override
    public void setPressedSolidColor(int pressedSolidColor) {
        shapeAttribute.pressedSolidColor=pressedSolidColor;
    }

    @Override
    public void setStartColor(int startColor) {
        shapeAttribute.startColor=startColor;
    }

    @Override
    public void setCenterColor(int centerColor) {
        shapeAttribute.centerColor=centerColor;
    }

    @Override
    public void setEndColor(int endColor) {
        shapeAttribute.endColor=endColor;
    }

    @Override
    public void setColorOrientation(GradientDrawable.Orientation orientation) {
        shapeAttribute.colorOrientation=ShapeUtil.getOrientation(orientation);
    }

    @Override
    public void setStrokeColor(int strokeColor) {
        shapeAttribute.strokeColor=strokeColor;
    }

    @Override
    public void setStrokeWidth(float strokeWidth) {
        shapeAttribute.strokeWidth=strokeWidth;
    }

    @Override
    public void setCornersRadius(float cornersRadius) {
        shapeAttribute.cornersRadius=cornersRadius;
    }

    @Override
    public void setTopLeftRadius(float topLeftRadius) {
        shapeAttribute.topLeftRadius=topLeftRadius;
    }

    @Override
    public void setTopRightRadius(float topRightRadius) {
        shapeAttribute.topRightRadius=topRightRadius;
    }

    @Override
    public void setBottomLeftRadius(float bottomLeftRadius) {
        shapeAttribute.bottomLeftRadius=bottomLeftRadius;
    }

    @Override
    public void setBottomRightRadius(float bottomRightRadius) {
        shapeAttribute.bottomRightRadius=bottomRightRadius;
    }

    @Override
    public void setShape(int shape) {
        shapeAttribute.shape=shape;
    }

    @Override
    public void setSelected(boolean selected) {
        super.setSelected(selected);

        shapeAttribute.selected=selected;
        resetBackground();
    }
}
