package com.example.kiheitai.firstapp;

import android.app.Activity;
import android.content.Context;
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
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by kiheitai on 15/03/13.
 */
public class Adaptador extends BaseAdapter {
    private LayoutInflater inflador;
    TextView titulo, subtitulo;
    ImageView icono;
    ArrayList<Cat> catList;

    public Adaptador(Context contexto, ArrayList<Cat> cats){
        inflador = (LayoutInflater) contexto.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        catList = cats;
    }

    @Override
    public int getCount() {
        return catList.size();
    }

    @Override
    public Cat getItem(int position) {
        return catList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Cat cat = catList.get(position);
        if (convertView == null){
            convertView = inflador.inflate(R.layout.list_element, null);
        }

        titulo = (TextView) convertView.findViewById(R.id.titulo);
        subtitulo = (TextView) convertView.findViewById(R.id.subtitulo);
        icono = (ImageView) convertView.findViewById(R.id.icono);

        titulo.setText(cat.getTitulo());
        subtitulo.setText(cat.getSubtitulo());
        icono.setImageBitmap(cat.getRoundedImage());

        icono.setScaleType(ImageView.ScaleType.FIT_START);
        return convertView;
    }
}
