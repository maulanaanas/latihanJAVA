package com.maulanaanas;

public class Segitiga {
    private int alas;
    private int tinggi;
    private double luas;

    public Segitiga(int alas, int tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public double getLuas(){
        double luas = this.alas * this.tinggi / 2;
        return luas;
    }
}
