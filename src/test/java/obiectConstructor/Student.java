package obiectConstructor;

import java.util.List;

public class Student {

    public String Nume;
    public String Prenume;
    public Integer Varsta;
    public Double Inaltime;
    public Character Sex;
    public Boolean areBursa;
    public List<Integer> noteMatematica;
    public List<Integer> noteRomana;
    public List<Integer> noteMaghiara;

    //Obiect = instanta unei clase
    //Constructor= are ca rol sa initializeze variabilele unei clase
    //Tipuri constructor= 1. cu parametri si fara parametrii;
    //                      2. by default avem "un" constructor fara parametrii in orice clasa
    //Intro clasa putem avea N constructori
    //structura constructor= public +numele clasei+ (are sau nu parametrii)
    //nu exista constructor cu "return";

    public Student (String Nume, String Prenume, Integer Varsta, Double Inaltime, Character Sex,
                    Boolean areBursa, List<Integer> noteMatematica, List<Integer> noteRomana){
        this.Nume= Nume;
        this.Prenume= Prenume;
        this.Inaltime= Inaltime;
        this.areBursa= areBursa;
        this.Varsta= Varsta;
        this.Sex= Sex;
        this.noteMatematica= noteMatematica;
        this.noteRomana= noteRomana;


    }

    //facem un alt constructor doar cu note Matematica - exemplul cu licenta


    public Student(String nume, String prenume, Integer varsta, Double inaltime, Character sex,
                   Boolean areBursa, List<Integer> noteMatematica) {
        Nume = nume;
        Prenume = prenume;
        Varsta = varsta;
        Inaltime = inaltime;
        Sex = sex;
        this.areBursa = areBursa;
        this.noteMatematica = noteMatematica;
    }

    public Student(String nume, String prenume, Integer varsta, Double inaltime, Character sex,
                   Boolean areBursa, List<Integer> noteMatematica, List<Integer> noteRomana, List<Integer> noteMaghiara) {
        Nume = nume;
        Prenume = prenume;
        Varsta = varsta;
        Inaltime = inaltime;
        Sex = sex;
        this.areBursa = areBursa;
        this.noteMatematica = noteMatematica;
        this.noteRomana = noteRomana;
        this.noteMaghiara = noteMaghiara;
    }

    public void infoStudent(){
        System.out.println("Numele studentului este: "+Nume);
        System.out.println("Prenumele studentului este: "+Prenume);
        System.out.printf("Inaltimea studentului este: %.2f%n",Inaltime);
        System.out.println("Are studentul bursa? "+areBursa);
        System.out.println("Varsta studentului este: "+Varsta);
        System.out.println("Sexul studentului este: "+Sex);
        /*System.out.println("Notele studentului la Romana sunt: "+noteRomana);
        System.out.println("Notele studentului la Matematica sunt: "+noteMatematica);*/

    }

    public void infoNote(String materie){
        if (materie.equals("romana") || materie.equals("Romana")){
            System.out.println("Notele studentului la Romana sunt urmatoarele: ");
            printNoteLista(noteRomana);

        }
        if (materie.equals("matematica") || materie.equals("Matematica")){
            System.out.println("Notele studentului la Matematica sunt urmatoarele: ");
            printNoteLista(noteMatematica);
        }
        if (materie.equals("maghiara") || materie.equals("Maghiara")){
            System.out.println("Notele studentului la Maghiara sunt urmatoarele: ");
            printNoteLista(noteMaghiara);
        }

    }
    public void printNoteLista(List<Integer> note){
        for (Integer index=0; index<note.size(); index++){
            System.out.println(note.get(index));
        }
    }

    public void calculMedie(String materie){
        if (materie.equals("matematica") || materie.equals("Matematica")){
            System.out.println("Media studentului la Matematica este: ");
            float suma=0;
            Integer nrElemente=noteMatematica.size();
            for (Integer index=0; index<noteMatematica.size(); index++){
                suma=suma+noteMatematica.get(index);
            }
            float Medie=suma/nrElemente;
            System.out.println(Medie);
           /* System.out.print(medie);*/
        }
    }

}
