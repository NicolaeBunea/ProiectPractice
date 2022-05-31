package obiectConstructor;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class StudentTest {

    //Obiect=instanta unei clase
    //Obiectul este strict legat de constructor
    //Dintr-o clasa putem declara n obiecte
    //Obiectele se diferentiaza pe baza numelui
    //structura obiect= nume clasa+nume obiect= "new" nume clasa(valori parametrii)
    //recunoastem un obiect dupa cuvantul "new"

    @Test
    public void metodaTest(){
        //Primul obiect
        List<Integer> noteRomanaNicu= new ArrayList<>();
        noteRomanaNicu.add(10);
        noteRomanaNicu.add(9);
        noteRomanaNicu.add(7);
        noteRomanaNicu.add(10);
        List<Integer> noteMatematicaNicu= new ArrayList<>();
        noteMatematicaNicu.add(8);
        noteMatematicaNicu.add(2);
        noteMatematicaNicu.add(5);
        Student Nicu= new Student("Bunea","Nicu",27,1.76,
                'M',true,noteMatematicaNicu,noteRomanaNicu);
        Nicu.infoStudent();
        Nicu.infoNote("Romana");
        Nicu.infoNote("Matematica");
        Nicu.Prenume="Sebastian";
        Nicu.infoStudent();


        List<Integer> noteRomanaAlex= new ArrayList<>();
        noteRomanaAlex.add(5);
        noteRomanaAlex.add(6);
        noteRomanaAlex.add(6);
        noteRomanaAlex.add(9);
        List<Integer> noteMatematicaAlex= new ArrayList<>();
        noteMatematicaAlex.add(3);
        noteMatematicaAlex.add(10);
        noteMatematicaAlex.add(8);
        Student DorhaAlex= new Student("Dorha","Alex",27,1.80,
                'M',false,noteMatematicaNicu,noteRomanaNicu);
        DorhaAlex.infoStudent();
        DorhaAlex.infoNote("matematica");
        DorhaAlex.infoNote("Romana");


        List<Integer> noteMatematicaClaudiu= new ArrayList<>();
        noteMatematicaClaudiu.add(3);
        noteMatematicaClaudiu.add(10);
        noteMatematicaClaudiu.add(8);
        noteMatematicaClaudiu.add(6);
        Student PopClaudiu= new Student("Pop","Claudiu",27,1.80,
                'M',false,noteMatematicaClaudiu);
        PopClaudiu.infoStudent();
        PopClaudiu.infoNote("matematica");


        List<Integer> noteMatematicaMircea= new ArrayList<>();
        noteMatematicaMircea.add(4);
        noteMatematicaMircea.add(10);
        noteMatematicaMircea.add(8);
        List<Integer> noteRomanaMircea= new ArrayList<>();
        noteRomanaMircea.add(3);
        noteRomanaMircea.add(10);
        noteRomanaMircea.add(8);
        noteRomanaMircea.add(6);
        List<Integer> noteMaghiaraMircea= new ArrayList<>();
        noteMaghiaraMircea.add(10);
        noteMaghiaraMircea.add(9);
        noteMaghiaraMircea.add(8);

        Student MirceaRadu= new Student("Radu","Mircea",30,1.90,
                'M',false,noteMatematicaMircea,noteRomanaMircea,noteMaghiaraMircea);
        MirceaRadu.infoStudent();
        MirceaRadu.infoNote("Maghiara");
        MirceaRadu.infoNote("Matematica");
        MirceaRadu.infoNote("Romana");
        MirceaRadu.calculMedie("Matematica");

    }

}
