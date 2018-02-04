package com.sdabyd2.programowanie.wywolanie;

import com.sdabyd2.programowanie.operacje.*;

import java.util.Scanner;

/**
 * Created by Łukasz on 2017-10-14.
 */
public class Kalkulator {

    public static void main(String[] args) {

        double l1;
        double l2;
        OperacjaMatematyczna operacja;
        int decyzja;

        Scanner wczytywanie = new Scanner(System.in);

        System.out.print("Podaj liczbe pierwsza: ");
        l1 = wczytywanie.nextDouble();

        System.out.print("Podaj druga liczbe: ");
        l2 = wczytywanie.nextDouble();

        System.out.println("Jaka operacje matematyczna chcesz wykonac? \n 1 - dodawanie \n 2 - odejmowanie \n 3 - mnozenie \n 4 - dzielenie ");
        decyzja = wczytywanie.nextInt();

       switch(decyzja){
            case 1:
                operacja = new Dodawanie(l1, l2);
                break;
            case 2:
                operacja = new Odejmowanie(l1, l2);
                break;
            case 3:
                operacja = new Mnozenie(l1, l2);
                break;
            case 4:
                operacja = new Dzielenie(l1, l2);
                break;
            default:
                System.out.println("Nie ma takiej operacji");
                return;

        }
        operacja.wykonajOperacje();
        System.out.println(operacja);

    }

}
