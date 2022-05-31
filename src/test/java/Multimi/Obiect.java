package Multimi;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Obiect {

    //la o multime de nume programul atribuie numere
    //1.array= toate elementele sunt de acelasi tip =[]
    //2.list
    //3.hashmap = key value
    @Test
    public void obiect(){
        printNumeArray();
        pintNumeLista();
        printValoriHasmap();
        tariOrase();



    }
    //Printam toate valorile dintr-un array
    //Array- se declara cu String[] variabila=new tip[]
    //Dimensiunea unui array se face cu ".length"
    public void printNumeArray(){
        String[] nume1=new String[4];
        nume1[0]="Ana";
        nume1[1]="Nicu";
        nume1[2]="Alex";
        nume1[3]="Bogdan";
        for (Integer index=0; index<nume1.length; index++){
            System.out.println(nume1[index]);
        }
    }
    //tipul listei se declara intre <>
    //dimensiunea listei se face cu .size
    //sout - chemi lista.get(index)
    // diferenta intre array si list este ca nu definesti spatiu la lista
    public void pintNumeLista(){
        List<String> lista=new ArrayList<>();
        lista.add("Nicu");
        lista.add("Ana");
        lista.add("Alex");
        lista.add("Bogdan");
        for (Integer index=0; index<lista.size(); index++){
            System.out.println(lista.get(index));
        }
    }
    //Printeaza valori diferite dintr-o multime
    //adaugi cu .put
    // pentru fiecare cheie din lista de chei" key:hasKey.keySet()"
    // in for definesti tipul de cheie
    //ca sa printezi valoarea se ia cu .get(variabila)
    //for each se cheama cu ":"
    public void printValoriHasmap(){
        HashMap<String,String> hashKey=new HashMap<>();
        hashKey.put("fruct","mar");
        hashKey.put("haine","pantof");
        hashKey.put("leguma","cartof");
        for (String key: hashKey.keySet()){
            System.out.println("Cheia este "+key);
            System.out.println("Valoarea este: "+hashKey.get(key));
        }
    }
    public void tariOrase(){
        List<String> OraseRomania= new ArrayList<>();
        OraseRomania.add("Dej");
        OraseRomania.add("Gherla");
        OraseRomania.add("Cluj");
        List<String> OraseItalia= new ArrayList<>();
        OraseItalia.add("Roma");
        OraseItalia.add("Torino");
        List<String> OraseSpania= new ArrayList<>();
        OraseSpania.add("Barcelona");
        OraseSpania.add("Madrid");
        OraseSpania.add("Valencia");
        OraseSpania.add("Malaga");

        HashMap<String,List<String>> tariEuro= new HashMap<>();
        tariEuro.put("Romania",OraseRomania);
        tariEuro.put("Italia", OraseItalia);
        tariEuro.put("Spania", OraseSpania);
        for (String key: tariEuro.keySet()){
            System.out.println("Tara este "+key);
            System.out.println("Orasele sunt: "+tariEuro.get(key));
        }
    }
}
