package com.sdabyd2.programowanie.operacje;

/**
 * Created by Łukasz on 2017-10-14.
 */


public class  Dodawanie extends OperacjaMatematyczna {

    public Dodawanie(double a, double b){
        setLiczba1(a);
        setLiczba2(b);
    }

    public Dodawanie(){
        this(0.0,0.0);
    }

    @Override
    public void wykonajOperacje(){
        setWynik(getLiczba1() + getLiczba2());
    }
    @Override
    public String toString(){
        return "Wynik dodawania to " + String.valueOf(getWynik());

    }



}
