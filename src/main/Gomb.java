package main;

public class Gomb extends Idom{
    double r;
    
    Gomb(double r){
        super();
        this.r=r;
    }

    public double getR() {
        return r;
    }
    
    @Override
    public double terfogat(){
        double terfogat = 4*(r*r*r)*3.14/3;
        return terfogat;
    }

    @Override
    public String toString() {
        return "Gomb{"+ super.toString() + "r=" + r + '}';
    }
    
    
}
