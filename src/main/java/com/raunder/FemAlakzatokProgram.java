package com.raunder;

import com.raunder.alakzatok.FemAlakzat;
import com.raunder.alakzatok.Gomb;

import java.util.ArrayList;
import java.util.List;

public class FemAlakzatokProgram {
    private List<FemAlakzat> alakzatok;

    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public void ujAlakzat(FemAlakzat alakzat) {
        alakzatok.add(alakzat);
    }

    public ArrayList<FemAlakzat> getLista() {
        return new ArrayList<>(alakzatok);
    }

    public double osszSuly() {
        double ossz = 0;

        for (FemAlakzat femAlakzat : alakzatok) {
            ossz += femAlakzat.suly();
        }

        return ossz;
    }

    public double gombokOsszSuly() {
        double ossz = 0;

        for (FemAlakzat femAlakzat : alakzatok) {
            if (femAlakzat instanceof Gomb) {
                ossz += femAlakzat.suly();
            }
        }

        return ossz;
    }

    public FemAlakzat minV() {
        FemAlakzat min = alakzatok.get(0);

        for (FemAlakzat femAlakzat : alakzatok) {
            if (femAlakzat.terfogat() < min.terfogat()) {
                min = femAlakzat;
            }
        }
        return min;
    }

    public FemAlakzat maxV() {
        FemAlakzat max = alakzatok.get(0);

        for (FemAlakzat femAlakzat : alakzatok) {
            if (femAlakzat.terfogat() > max.terfogat()) {
                max = femAlakzat;
            }
        }
        return max;
    }
}