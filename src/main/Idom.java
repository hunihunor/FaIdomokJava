package main;

import java.util.ArrayList;

public class Idom {
    private double fajsuly;
    private static ArrayList<Idom> idomok = new ArrayList<>();

    
    Idom(){
        this.fajsuly = 0.8;
        idomok.add(this);
    }

    public double getFajsuly() {
        return fajsuly;
    }

    public static ArrayList<Idom> getIdomok() {
        return idomok;
    }
    public double terfogat(){
        return 0;
    }

    @Override
    public String toString() {
        return "Idom{" + "fajsuly=" + fajsuly + '}';
    }
    
}
