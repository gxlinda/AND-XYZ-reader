package com.example.xyzreader.ui;

import android.content.Context;
import android.util.AttributeSet;

import com.android.volley.toolbox.NetworkImageView;
//sets image aspect ratio height 2/3 of width

public class ScaleToTwoThirdImageView extends NetworkImageView {

    public ScaleToTwoThirdImageView(Context context) {
        super(context);
    }

    public ScaleToTwoThirdImageView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public ScaleToTwoThirdImageView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int twoThirdHeight = MeasureSpec.getSize(widthMeasureSpec) *2/3;
        int twoThirdHeightSpec = MeasureSpec.makeMeasureSpec(twoThirdHeight, MeasureSpec.EXACTLY);
        super.onMeasure(widthMeasureSpec, twoThirdHeightSpec);
    }
}
