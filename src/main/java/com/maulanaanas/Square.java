package com.maulanaanas;

public class Square {
    private int sisi;
    private double luas;

    public Square(int sisi) {
        this.sisi = sisi;
    }

    public double getLuas(){
        return this.sisi * this.sisi;
    }
}

