package com.sdabyd2.programowanie.operacje;

/**
 * Created by Łukasz on 2017-10-14.
 */
public class Mnozenie extends OperacjaMatematyczna {

    public Mnozenie(double a, double b){
        setLiczba1(a);
        setLiczba2(b);
    }

    public Mnozenie(){
        this(0.0,0.0);
    }

    @Override
    public void wykonajOperacje(){
        setWynik(getLiczba1() * getLiczba2());
    }
    @Override
    public String toString(){
        return "Wynik mnozenia to " + String.valueOf(getWynik());

    }

}
