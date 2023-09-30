package org.example;

public class Calcolatrice {
    public Calcolatrice() {
    }

    public int somma(int a, int b){
        return a+b;
    }

    public int moltiplicazione(int a, int b){
        return a*b;
    }

    public int sottrazione(int a, int b){
        return a-b;
    }

    public double divisone(int a, int b){
        if(b != 0){
            return a/b;
        }else {
            return 0;
        }
    }
}
