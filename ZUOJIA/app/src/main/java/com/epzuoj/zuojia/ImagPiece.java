package com.epzuoj.zuojia;

import android.graphics.Bitmap;

/**
 * Created by wujianxing on 16/8/6.
 */
public class ImagPiece {
    private  int index;
    private Bitmap bitmap;

    public ImagPiece(int index, Bitmap bitmap) {
        this.index = index;
        this.bitmap = bitmap;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public Bitmap getBitmap() {
        return bitmap;
    }

    public void setBitmap(Bitmap bitmap) {
        this.bitmap = bitmap;
    }
}
