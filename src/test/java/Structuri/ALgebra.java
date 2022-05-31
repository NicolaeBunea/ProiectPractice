package Structuri;

import org.junit.Test;

public class ALgebra {


    @Test
    public void algebraTest(){
        //printNumere();
        //printNumereWhile();
        printeazaPar(20);


    }
    //structuri repetitive= for----while
    //Printam primele 50 de numere
    public void printNumere(){
        for (Integer index=0; index<51; index++){
            System.out.println(index);
        }
    }
    //For are nr finit de pasi
    //While are nr infinit de pasi
    public void printNumereWhile(){
        Integer index=0;
        while (index<51){
            System.out.println(index);
            index++;
        }

    }

    //Printeaza numerele pare de la 0 pana la un numar
    public void printeazaPar(Integer capat){
        for (Integer index=0; index<capat+1; index++){
            if (index%2==0){
                System.out.println(index);
            }
        }
    }





}
