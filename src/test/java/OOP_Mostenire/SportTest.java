package OOP_Mostenire;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class SportTest {
    @Test

    public void mostenireTest(){
        //facem primul obiect(copil) pentru fotbal
        List<String> reguliFotbal = new ArrayList<>();
        reguliFotbal.add("Nu ai voie sa atingi mingea cu mana");
        reguliFotbal.add("Nu ai voie sa faci fault");
        reguliFotbal.add("Nu ai voie sa iti dai tricoul jos");
        Fotbal fotbalSport= new Fotbal("Fotbal", "Sport de echipa", true,
                11, true, 3, reguliFotbal);
        fotbalSport.infoSport();
        fotbalSport.infoFotbal();
        fotbalSport.reguli= null;
        fotbalSport.infoFotbal();

        List<String> reguliHandball = new ArrayList<>();
        reguliHandball.add("Nu ai voie sa atingi cu piciorul");
        reguliHandball.add("Nu ai voie sa faci pasi fara sa bati mingea");
        reguliHandball.add("Nu ai voie sa intri in careul de 6 metrii");
        Handball handballSport= new Handball("Handball", "Sport de echipa", true,
                7, true, 2, reguliHandball);
        handballSport.infoSport();
        handballSport.infoHandball();
    }

}
