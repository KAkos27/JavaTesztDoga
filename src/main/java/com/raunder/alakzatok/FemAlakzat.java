package com.raunder.alakzatok;

public abstract class FemAlakzat {
    protected static double fajSuly = 1.2;

    public FemAlakzat() {
    }

    public static double getFajsuly() {
        return fajSuly;
    }

    public abstract double terfogat();

    public double suly() {
        return fajSuly * terfogat();
    }

    ;
}
