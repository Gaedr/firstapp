package com.example.kiheitai.firstapp;

import android.app.ListActivity;
import android.graphics.BitmapFactory;
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

        catList.add(new Cat(BitmapFactory.decodeResource(this.getResources(), R.drawable.c1), "Cat Eyes", "This cat hangs around our office and is not camera shy like the other ones."));
        catList.add(new Cat(BitmapFactory.decodeResource(this.getResources(), R.drawable.c2), "Cat", "This cat hangs around our office and is not camera shy like the other ones."));
        catList.add(new Cat(BitmapFactory.decodeResource(this.getResources(), R.drawable.c3), "Norwegian Cat", "This cat hangs around our office and is not camera shy like the other ones."));
        catList.add(new Cat(BitmapFactory.decodeResource(this.getResources(), R.drawable.c4), "The Cat: If Looks could kill", "This cat hangs around our office and is not camera shy like the other ones."));
        catList.add(new Cat(BitmapFactory.decodeResource(this.getResources(), R.drawable.c1), "Our cat", "This cat hangs around our office and is not camera shy like the other ones."));
        catList.add(new Cat(BitmapFactory.decodeResource(this.getResources(), R.drawable.c2), "Kitty Cat", "This cat hangs around our office and is not camera shy like the other ones."));

        adapter = new Adaptador(this,catList);
        setListAdapter(adapter);
    }
}
