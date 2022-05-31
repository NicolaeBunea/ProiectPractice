package Teme;

import org.junit.Test;

import java.util.Calendar;
import java.util.Date;

public class Tema_1 {
    //sa facem o metoda pentru fiecare cerinta
    //toate cerintele sa fie delimitate
    public Integer varsta;
    public String Nume;
    public String Prenume;
    public Integer produs;
    public Double suma;
    public  Integer suma1;



    //Am vrut sa fac cu variabile globale pentru double si imi da ca valorile sunt "null". De ce?




    @Test
    public void  aCerinte(){
        helloWorld();
        System.out.println("Poti pleca acasa dupa ce iti ferific munca!");
        Nume="Bunea";
        Prenume="Nicolae";
        varsta=27;
        varsta();
        System.out.println("Poti pleca acasa dupa ce iti ferific munca!");
        numePrenume();
        System.out.println("Poti pleca acasa dupa ce iti ferific munca!");
        dataDeAzi();
        System.out.println("Poti pleca acasa dupa ce iti ferific munca!");
        calculMate();
        System.out.println("Poti pleca acasa dupa ce iti ferific munca!");
        calculDouble();
        System.out.println("Poti pleca acasa dupa ce iti ferific munca!");
        produsInteger();
        System.out.println("Poti pleca acasa dupa ce iti ferific munca!");
        concatenate();
        System.out.println("Poti pleca acasa dupa ce iti ferific munca!");
        mLaFinal1();
        mLaFinal2();
        System.out.println("Poti pleca acasa dupa ce iti ferific munca!");
        anaAreMere1();
        anaAreMere2();
        System.out.println("Poti pleca acasa dupa ce iti ferific munca!");
        valoriDiferite(3,3,10);
        System.out.println("Poti pleca acasa dupa ce iti ferific munca!");




    }
    public void helloWorld(){
        System.out.println("Ex: 1");
        System.out.println("Hello World");
    }
    //Cerinta 2
    public void varsta(){
        System.out.println("Ex: 2");
        System.out.println("Am "+varsta+" de ani");
    }
    public void numePrenume(){
        System.out.println("Ex: 3");
        System.out.println(Nume);
        System.out.println(Prenume);
    }
    //Cerinta 4
    public void dataDeAzi(){
        Date today=Calendar.getInstance().getTime();
        System.out.println("Ex: 4");
        System.out.println(today);
    }
    public void calculMate(){
        double op1=2+(3*4)-3;
        double op2=op1/3;
        System.out.println("Ex: 5");
        System.out.println("Rezultatul operatiei este: "+op2);
    }
    //Cerinta 6
    public void calculDouble(){
        Double a1=3.78;
        Double a2=10.32;
        Double a3=12.87;
        suma=a1+a2+a3;
        System.out.println("Ex: 6");
        System.out.println("Suma numerelor este: "+suma);
    }
    public void produsInteger(){
        Integer b1=12;
        Integer b2=3;
        produs=b1*b2;
        System.out.println("Ex: 7");
        System.out.println("Produsul numerelor este: "+produs);

    }
    public void concatenate(){
        System.out.println("Ex: 8");
        System.out.println("Stiu ca am calculat bine "+"produsul= "+produs+" si "+"suma= "+suma);
    }
    public void mLaFinal1(){
        System.out.println("Ex: 9");
        System.out.println("M"+"Salut");
    }
    public void mLaFinal2(){
        Character m='M';
        String salut="Salut";
        String mSalut=m+salut;
        System.out.println("Ex: 9");
        System.out.println(mSalut);
    }
    public void anaAreMere1(){
        Character z='Z';
        System.out.println("Ex: 10");
        System.out.println("Ana"+z+" are"+z+" mere"+z+", pere"+z+", prune"+z);
    }
    //Cum functioneaza regex?
    //Cum pot sa scriu in cod
    public void anaAreMere2(){
        String str = "Ana are mere pere prune ";
        str = str.replaceAll(" ", "Z ");
        System.out.println("Ex: 10");
        System.out.println(str);
    }
    //De ce imi da valoare nula daca declar o variabila globala cand merge pe else?
    public void valoriDiferite(Integer v1, Integer v2, Integer v3){
        System.out.println("Ex: 11");
        if (v1+v2>v3){
            suma1=v1+v2;
            System.out.println("Valoarea sumei este "+suma1+" si este mai mare decat "+v3);
        }
        else {
            Integer suma2=v1+v2;
            System.out.println("Valoarea sumei este "+suma2+" si nu este mai mare decat "+v3);
        }
    }



}
