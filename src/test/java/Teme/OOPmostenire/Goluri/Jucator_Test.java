package Teme.OOPmostenire.Goluri;

import org.junit.Test;

import java.util.Scanner;

public class Jucator_Test {

    /*@Test
    *//*public void jucatorTest(){
        Messi messiGol= new Messi("Messi", "Atacant", 10, 1.67,"Lovitura cu capul", 15, false);
        messiGol.infoJucator();
        messiGol.lovitura();
        messiGol.booleanGol();
        System.out.println();

        Ronaldinho modSut= new Ronaldinho("Ronaldinho", "Atacant", 10, 1.76);
        modSut.infoJucator();
        modSut.modalitateSut();
        modSut.posibilitateExecutie();
        modSut.osibilitateExecutie("Penalty");
        modSut.posibilitateExecutie("Penalty", 11);*//*

    }*/

    public static void main(String[] args){
        Scanner player= new Scanner(System.in);
        System.out.println("Ce player alegi?");
        System.out.println("(1=Messi) si (2=Ronaldinho)");
        Integer alegeNr= player.nextInt();

        if (alegeNr==1){
            Messi messiGol= new Messi("Messi", "Atacant", 10, 1.67,
                    "Lovitura cu capul", 15, true);
            messiGol.infoJucator();
            messiGol.lovitura();
            messiGol.booleanGol();
            System.out.println();
        }
        else if (alegeNr==2){
            Ronaldinho modSut= new Ronaldinho("Ronaldinho", "Atacant", 10, 1.76);
            modSut.infoJucator();
            modSut.modalitateSut();
            modSut.posibilitateExecutie();
            modSut.posibilitateExecutie("Penalty");
            modSut.posibilitateExecutie("Penalty", 11);
        }
        else{
            System.out.println("Numarul ales este incorect");
        }

    }




}
