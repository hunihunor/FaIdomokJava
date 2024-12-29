package main;

import java.lang.reflect.Array;

public class FaIdomok {
    
    public static void main(String[] args) {
        
        Gomb labda1 = new Gomb(5);
        Gomb labda2 = new Gomb(8);
        Gomb labda3 = new Gomb(3);
        Gomb labda4 = new Gomb(2);
        
        Hasab tegla1 = new Hasab(4, 5, 2);
        Hasab tegla2 = new Hasab(5, 4, 12);
        Hasab tegla3 = new Hasab(10, 5, 4);
        Hasab tegla4 = new Hasab(4, 15, 1);
        Hasab tegla5 = new Hasab(8, 5, 6);
        
        System.out.println(Idom.getIdomok());
        System.out.println("Idomok összes súlya: " + osszSuly()+"g");
        System.out.println("Gömbök összes súlya: " + gombOsszSuly()+"g");
        System.out.println("A legkissebb és legnagyobb idomok:" + minMax()[0] + minMax()[1]);
    }
    
    private static double osszSuly() {
            double osszSuly = 0;
            for (Idom idom : Idom.getIdomok()) {
                osszSuly += idom.getFajsuly() * idom.terfogat();
            }
            return osszSuly;
        }
    private static double gombOsszSuly() {
            double osszSuly = 0;
            for (Idom idom : Idom.getIdomok()) {
                if (idom instanceof Gomb) {
                    osszSuly += idom.getFajsuly() * idom.terfogat();
                }
            }
            return osszSuly;
        }
    private static Idom[] minMax(){
        Idom[] minMax = new Idom[2];
        double min = 0;
        double max = 0;
        for (Idom idom : Idom.getIdomok()) {
            if(idom.terfogat()<min){
                minMax[0] = idom;
            }
            if(idom.terfogat()>max){
                minMax[1] = idom;
            }
        }
        
        return minMax;
    }
}
