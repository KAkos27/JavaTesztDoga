package com.raunder.alakzatok;

public class Gomb extends FemAlakzat {
    private double sugar;

    public Gomb(double s) {
        this.sugar = s;
    }

    @Override

    public double terfogat() {
        return (4 * Math.pow(sugar, 3) * Math.PI) / 3;
    }
}
