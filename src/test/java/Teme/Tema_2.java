package Teme;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Tema_2 {

    @Test
    public void bCerinte(){
        cuvantulDa();
        cuvantulDaAltfel();
        numereDivi3While(300);
        numereDivi3For();
        numereDivi5While(30);
        /*numerePozitive(60);*/
        sumaNumerelor();
        produsulNumerelor();
        retetaIngrediente();




    }
    public void cuvantulDa(){
        System.out.println("Exercitiul 2-b");
        System.out.print("DA ");
        System.out.print("DA ");
        System.out.print("DA ");
        System.out.print("DA ");
        System.out.println("DA ");
    }
    public void cuvantulDaAltfel(){
        String da="Da ";
        System.out.println(da+da+da+da+da);
    }
    // args contine parametrii 1 si 2
    public static void main(String[] args){
        for (int i=1; i<6; i++){
            System.out.print(i+ ".DA ");
        }
    }
    public void numereDivi3While(Integer numar){
        System.out.println("Exercitiul 3-b");
        Integer nr = 3;
        Integer counter = 0;
        while ((nr < numar) && (counter < 5)) {
            System.out.println(nr);
            nr+=3;
            counter++;
        }
    }
    // Nu inteleg de ce nu se opreste
    public void numereDivi3For(){
        Integer counter=0;
        System.out.println("Exercitiul 3-b");
        for (Integer index=1; index<100;index++){
            if (index%3==0){
                System.out.println(index);
                counter++;
            }
            if(counter==5){
                break;
            }
        }
    }
    public void numereDivi5While(Integer numar){
        System.out.println("Exercitiul 4-b");
        Integer nr = 5;
        Integer counter = 0;
        while ((nr < numar) && (counter < 3)) {
            System.out.println(nr);
            nr+=5;
            counter++;
        }
    }
    /*public void numerePozitive(Integer numere){
        System.out.println("Exercitiul 5-b");
        Integer numar=

    }*/
    public void sumaNumerelor(){
        System.out.println("Exercitiul 6-b");
        Integer sum=0;
        for (Integer index=1;index<11;index++){
            sum=sum+index;
            System.out.println(sum);
        }
    }
    public void produsulNumerelor(){
        System.out.println("Exercitiul 7-b");
        Integer sum=1;
        for (Integer index=1;index<6;index++){
            sum=sum*index;
            System.out.println(sum);
        }
    }
    public void retetaIngrediente(){
        List<String> umplutura= new ArrayList<>();
        umplutura.add("2 KG mere dulci");
        umplutura.add("200 g zahar");
        umplutura.add("coaja de lamaie");
        umplutura.add("60 g nuci");
        List<String> aluatFraged=new ArrayList<>();
        aluatFraged.add("500 g faina alba");
        aluatFraged.add("250 g unt");
        aluatFraged.add("2 pachete zahar vanilat");
        aluatFraged.add("2 oua");
        aluatFraged.add("praf de sare");

        HashMap<String, List<String>> prajituraCuMere= new HashMap<>();
        prajituraCuMere.put("umplutura",umplutura);
        prajituraCuMere.put("aluat fraged",aluatFraged);
        System.out.println("Prajitura cu mere- Ingrediente:");
        for (String key:prajituraCuMere.keySet()){
            System.out.println("Pentru: "+key);
            System.out.println("Ingrediente: "+prajituraCuMere.get(key));
        }


    }





}
