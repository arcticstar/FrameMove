package com.auxgroup.framemove;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

/**
 * Created by Administrator on 2015-11-26.
 */
public class MeziView extends View {
    public float x,y;
    public MeziView(Context context) {
        super(context);
        x=0;
        y=200;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint=new Paint();
        Bitmap bitmap= BitmapFactory.decodeResource(this.getResources(),R.drawable.smile2);
        canvas.drawBitmap(bitmap,x,y,paint);
        if (!bitmap.isRecycled()) {
            bitmap.recycle();
        }
    }
}
