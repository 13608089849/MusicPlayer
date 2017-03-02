package com.example.administrator.musicplayer;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.TextView;

public class LyricView extends TextView{
    public String stringLyric = "No lyric";

    public LyricView(Context context) {
        super( context );
    }

    public LyricView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public void setLyric(String string){
        this.stringLyric = string;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        Paint paint = new Paint();
        paint.setColor( Color.BLUE );
        paint.setAntiAlias( true );
        paint.setTextSize( 60 );
        canvas.drawText( stringLyric,100, 100, paint );

        super.onDraw(canvas);
    }
}
