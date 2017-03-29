package com.blogspot.petacreepers23.widget;

import android.content.Context;
import android.graphics.Typeface;
import android.support.v7.widget.AppCompatEditText;
import android.util.AttributeSet;

/**
 * Created by reiva on 29/03/2017.
 */

public class MyTexto extends AppCompatEditText {

    public MyTexto(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    public MyTexto(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public MyTexto(Context context) {
        super(context);
        init();
    }

    private void init() {
        if (!isInEditMode()) {
            Typeface tf = Typeface.createFromAsset(getContext().getAssets(), "fonts/digital.ttf");
            setTypeface(tf);
        }
    }

}
