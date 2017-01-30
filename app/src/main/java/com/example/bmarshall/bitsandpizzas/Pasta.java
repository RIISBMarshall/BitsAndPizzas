package com.example.bmarshall.bitsandpizzas;

/**
 * Created by bmarshall on 1/30/17.
 */

public class Pasta {
    private String name;
    private int imageResourceId;

    public static final Pasta[] pastas = {
            new Pasta("Spaghetti", R.drawable.spaghetti),
            new Pasta("Lasagne", R.drawable.lasagna)
    };

    private Pasta(String name, int imageResourceId){
        this.name = name;
        this.imageResourceId = imageResourceId;
    }

    public String getName() {
        return name;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }
}
