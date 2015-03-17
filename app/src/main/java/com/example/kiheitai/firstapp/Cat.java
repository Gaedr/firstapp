package com.example.kiheitai.firstapp;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.support.v4.graphics.drawable.RoundedBitmapDrawable;
import android.support.v4.graphics.drawable.RoundedBitmapDrawableFactory;

/**
 * Created by kiheitai on 15/03/13.
 */
public class Cat {
    private int idImage;
    //private Bitmap roundedImage;
    private String titulo, subtitulo;

    public Cat(int idImage, String titulo, String subtitulo){
        this.idImage = idImage;
        /*RoundedAvatarDrawable rad = new RoundedAvatarDrawable(idImage);
        this.roundedImage = rad.getBitmap();*/

        this.titulo = titulo;
        this.subtitulo = subtitulo;
    }

    public int getIdImage() {
        return idImage;
    }

    //public Bitmap getRoundedImage(){ return  roundedImage;}

    public String getTitulo() {
        return titulo;
    }

    public String getSubtitulo() {
        return subtitulo;
    }

    /*public static Bitmap getRoundedBitmap(Bitmap bitmap) {
        final Bitmap output = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        final Canvas canvas = new Canvas(output);

        final int color = Color.RED;
        final Paint paint = new Paint();
        final int tam = (bitmap.getWidth() > bitmap.getHeight()) ? bitmap.getHeight() : bitmap.getWidth();
        final Rect rect = new Rect(0, 0, tam, tam);
        final RectF rectF = new RectF(rect);

        paint.setAntiAlias(true);
        canvas.drawARGB(0, 0, 0, 0);
        paint.setColor(color);
        canvas.drawOval(rectF, paint);

        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, rect, rect, paint);

        bitmap.recycle();

        return output;
    }*/
}
