package com.sdabyd2.programowanie.operacje;

public abstract class OperacjaMatematyczna {



    private double liczba1;
    private double liczba2;
    private double wynik;

    public double getLiczba1() {
        return liczba1;
    }

    public void setLiczba1(double liczba1) {
        this.liczba1 = liczba1;
    }

    public double getLiczba2() {
        return liczba2;
    }

    public void setLiczba2(double liczba2) {
        this.liczba2 = liczba2;
    }

    public double getWynik() {
        return wynik;
    }

    public void setWynik(double wynik) {
        this.wynik = wynik;
    }

    public abstract void wykonajOperacje();

    public abstract String toString();


}
