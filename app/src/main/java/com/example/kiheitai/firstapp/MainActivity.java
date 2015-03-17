package com.example.kiheitai.firstapp;

import android.app.ListActivity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.support.v4.graphics.drawable.RoundedBitmapDrawable;
import android.support.v4.graphics.drawable.RoundedBitmapDrawableFactory;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;

import java.util.ArrayList;


public class MainActivity extends ListActivity {
    public Adaptador adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<Cat> catList = new ArrayList<>();

        Bitmap src = BitmapFactory.decodeResource(getResources(), R.drawable.c1);
        RoundedBitmapDrawable dr = RoundedBitmapDrawableFactory.create(getResources(), src);
        dr.setCornerRadius(Math.min(dr.getMinimumWidth(),dr.getMinimumHeight()));



        catList.add(new Cat(R.drawable.c1, "Cat Eyes", "This cat hangs around our office and is not camera shy like the other ones."));
        catList.add(new Cat(R.drawable.c2, "Cat", "Cat Turkish Angora cat of my friend looking at the sunset"));
        catList.add(new Cat(R.drawable.c3, "Norwegian Cat", "Norwegian cat of my friend....it's such big and it has such lovely eyes!"));
        catList.add(new Cat(R.drawable.c4, "The Cat: If Looks could kill", "The Cat: If Looks could kill"));
        catList.add(new Cat(R.drawable.c1, "Our cat", "Oh no the cat has turned into an alien :-) I did warn you no more photos hahahahaha"));
        catList.add(new Cat(R.drawable.c2, "Kitty Cat", "This is our familiar cat Boo she is not very impressed"));

        adapter = new Adaptador(this,catList);
        setListAdapter(adapter);
    }
}
