package com.example.kiheitai.firstapp;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;

import de.hdodenhof.circleimageview.CircleImageView;

/**
 * Created by kiheitai on 15/03/13.
 */
public class Adaptador extends ArrayAdapter<Cat> {
    private LayoutInflater inflador;
    TextView titulo, subtitulo;
    ImageView icono;
    ArrayList<Cat> catList;
    Context ctx;

    public Adaptador(Context contexto, int resource, ArrayList<Cat> cats){
        super(contexto, resource, cats);
        //inflador = (LayoutInflater) contexto.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        catList = cats;
        ctx = contexto;
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
        ViewHolder holder;

        Cat cat = catList.get(position);

        if (convertView == null){
            inflador = ((Activity)ctx).getLayoutInflater();
            convertView = inflador.inflate(R.layout.list_element, null);

            holder = new ViewHolder();
            holder.image = (ImageView) convertView.findViewById(R.id.icono);
            holder.titulo = (TextView) convertView.findViewById(R.id.titulo);
            holder.subtitulo = (TextView) convertView.findViewById(R.id.subtitulo);
            convertView.setTag(holder);
        }else{
            holder = (ViewHolder) convertView.getTag();
        }

        if(cat != null){
            holder.titulo.setText(cat.getTitulo());
            holder.subtitulo.setText(cat.getSubtitulo());
            //holder.image.setImageResource(cat.getIdImage());
            if(!Cache.map.containsKey(cat.getIdImage())){
                Cache.map.put(cat.getIdImage(), ctx.getResources().getDrawable(cat.getIdImage()));
            }
            holder.image.setImageDrawable(Cache.map.get(cat.getIdImage()));
        }


        return convertView;
    }

    class ViewHolder{
        TextView titulo;
        TextView subtitulo;
        ImageView image;
    }

    static class Cache{
        static HashMap<Integer,Drawable> map = new HashMap<>();
    }
}
