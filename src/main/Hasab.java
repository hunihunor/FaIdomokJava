package main;

public class Hasab extends Idom{
    double a;
    double b;
    double m;
    
    Hasab(double a, double b, double m){
        super();
        this.a=a;
        this.b=b;
        this.m=m;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getM() {
        return m;
    }
    @Override
    public double terfogat(){
        double terfogat = a*b*m;
        return terfogat;
    }

    @Override
    public String toString() {
        return "Hasab{"+ super.toString() + "a=" + a + ", b=" + b + ", m=" + m + '}';
    }
    
}
