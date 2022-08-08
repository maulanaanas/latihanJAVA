package com.maulanaanas;

public class Kalkulator {
    private double angka1;
    private double angka2;
    private double hasil;

    public Kalkulator(double angka1, double angka2) {
        this.angka1 = angka1;
        this.angka2 = angka2;
    }

    public double getHasilPerkalian(){
        double hasil = angka1*angka2;
        return hasil;
    }
}
