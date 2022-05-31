package Teme;

import org.junit.Test;


public class Cursant_Practice_Home {

    public String word;
    public String Nume;
    public String primaProp;
    public String secondPro;

    public Integer total1;
    public Integer total2;
    public Integer total3;


    @Test
    public void welcome(){
        word="Hello!";
        Nume="Nicolae Bunea";
        System.out.println(word);
        System.out.println(Nume);

        poveste();
        suma();
        System.out.println("Suma numerelor este: "+total1);
        System.out.println("Produsul numerelor este: "+total2);
        System.out.println("Rezultatul impartirii este: "+total3);
        System.out.print(getGreutate());


    }

    public void poveste(){
        primaProp="Bula, spune-mi o propozitie cu J: ";
        secondPro="Bravo, spune-mi alta propozitie cu J";
        System.out.println(primaProp+"Un Jerme merje pe jeam");
        System.out.println(secondPro+": "+"Alt Jerme merje pe jeam");
    }
    //De ce nu recunaoste metoda fara sa scriu @Test?
    //Nu am inteles diferenta in public si local la scriere
    //De ce imi zice la functia de return = should be void?
    //De ce am declarat variabile cu publi + type cand puteam scrie direct tipul in corpul codului?

    public String getGreutate(){
        Integer greutate= 81;
        String s= greutate+" Kg";
        return s;
    }

    public void suma(){
        Integer nr1=40;
        Integer nr2=20;
        total1= nr1+nr2;
        total2=nr1*nr2;
        total3=nr1/nr2;
    }
















}
