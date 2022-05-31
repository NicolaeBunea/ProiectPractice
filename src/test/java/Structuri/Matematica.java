package Structuri;

import org.junit.Test;

public class Matematica {

    //Structuri= alternativa si repetitive
    //1. Structuri ALternative= if----then/else & switch----case1,case2
    @Test
    public void MatematicaTest(){
        numarMaimareCa20();
        numarPar();
        numarMaimareCaunNumar(58,26);
        numarMaimareCaunNumar(2,10);
        verificParitateNumar(6);
        verificParitateNumar(21);
        VerificNumarImparDivizibil(10);
        VerificNumarImparDivizibil(9);
        VerificNumarImparDivizibil(14);
        VerificNumarImparDivizibil(5);
        printeazaZi("Duminica");




    }

    //Verificam daca un numar este mai mare ca 5
    public void numarMaimareCa20(){
        Integer nr1=1350;
        Integer nr2=60;
        if (nr1>nr2){
            System.out.println("Numarul "+nr1+" este mai mare ca "+nr2);
        }
        else {
            System.out.println("10 este mai mica ca 5");
        }

    }

    public void numarMaimareCaunNumar(Integer numar,Integer comp) {
        if (numar > comp) {
            System.out.println("Numarul " + numar + " este mai mare ca "+comp);
        }
        else {
            System.out.println("Numarul " + numar + " este mai mic ca "+comp);
        }
    }

    //verificam daca un numar este par
    //La impartitre "/" este pentru primul numar de la imapartire
    //La impartire "%" este pentru zecimale
    public void numarPar(){
        if (7%2==0){
            System.out.println("Numarul este par");
        }
        else {
            System.out.println("Numarul este impar");
        }
    }

    public void verificParitateNumar(Integer par1){
        if (par1%2==0){
            System.out.println("Numarul "+par1+" este par");
        }
        else {
            System.out.println("Numarul "+par1+" este impar");
        }
    }

    //Verific daca un numar este impar si divizibil cu 5

    public void VerificNumarImparDivizibil(Integer numar){
       if (numar%2==1){
           if (numar%5==0){
               System.out.println(numar+" este impar si divizibil cu 5");
           }
           else {
               System.out.println(numar+" este impar si nu este divizibil cu 5");
           }
       }
       else {
           if (numar%5==0){
               System.out.println(numar+" este par si divizibil cu 5");
           }
           else {
               System.out.println(numar+" este par si nu este divizibil cu 5");
           }
       }

    }

    //switch case pe zilele saptamani
    public void printeazaZi(String ziCurenta){
        switch (ziCurenta){
            case "Duminica":
                System.out.println("Astazi este Duminica");
                break;
            case "Luni":
                System.out.println("Astazi este Luni");
                break;
            case "Marti":
                System.out.println("Astazi este Marti");
                break;

        }

    }




}
