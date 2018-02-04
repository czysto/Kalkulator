package com.sdabyd2.programowanie.operacje;

/**
 * Created by Łukasz on 2017-10-14.
 */
public class Dzielenie extends OperacjaMatematyczna {

    public Dzielenie(double a, double b){
        setLiczba1(a);
        setLiczba2(b);
    }

    public Dzielenie(){

	this(0.0,0.0);
    }

//TB super ze nadpisuje metode
//ale lepiej jak by ta metoda zwracala double
    @Override
    public void wykonajOperacje(){
        setWynik(getLiczba1() / getLiczba2());
    }
    @Override
    public String toString(){
        return "Wynik dzielenia to " + String.valueOf(getWynik());

    }

}
