package org.example.calcurator;

public class Mulfunc {
    double left, right;

    public Mulfunc(double left, double right){
        this.left = left;
        this.right = right;
    }

    public double result(){
        return left * right;
    }
}
