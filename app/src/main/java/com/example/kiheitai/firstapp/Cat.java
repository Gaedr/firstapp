package com.example.kiheitai.firstapp;

/**
 * Created by kiheitai on 15/03/13.
 */
public class Cat {
    private int idImage;
    private String titulo, subtitulo;

    public Cat(int idImage, String titulo, String subtitulo){
        this.idImage = idImage;

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
}
