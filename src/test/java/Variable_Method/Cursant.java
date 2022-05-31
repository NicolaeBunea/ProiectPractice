package Variable_Method;

import org.junit.Test;

public class Cursant {

    //acesta e un comentariu
    /*acesta este un alt fel de comentariu*/
    //Class= o colectie de variabile si metode
    //Intr-un fisier Java putem avea mai multe clase
    //Recunoastem o clasa dupa cuvantul cheie "class"
    //Structura clasa= public class"Nume"+{}
    //Orice structura invatam trebuie scrisa in interiorul unei clase (java)
    //Variabila = atributul unei clase
    //O clasa poate avea n variabile/ sau deloc
    //Tipuri variabile= globala si locala
    //O variabila trebuie sau nu sa primeasca o valoare
    //Structura variabila globala= "public" tip variabila (integer, string) "Nume"
    //Dam o valoare unei variabile cu "=".0
    public String Nume;
    public String Prenume;
    public Integer Varsta;
    public String Ocupatie;
    public Character Sex;
    public Double Inaltime;
    public Boolean esteAngajat;
    //Metoda= actiunea unei clase
    //O clasa poate sa contine sau nu n metode
    //Tipuri de metode= void si return
    //Structura metoda void= "public" "void" "Nume"(){}
    //Metodele pot sau nu sa contine parametrii


    @Test
    public void atribuireVariabile(){
        //dam valori pentru variabilele de mai sus
        //Doar la string punem ""
        //La caractere punem ''
        //La numere (integer) nu punem nimic dupa =
        //"DOUBLE" pentru valorile cu "."
        Nume="Bunea";
        Prenume="Nicu";
        Varsta=27;
        Ocupatie="ASM";
        Sex='M';
        Inaltime=1.76;
        esteAngajat=true;

        //Printam o valoare in consola
        System.out.print(Prenume);
        System.out.print(' ');
        System.out.print(Nume);
        System.out.print(' ');
        System.out.print(Varsta);
        System.out.print(' ');
        System.out.print(Ocupatie);
        System.out.print(' ');
        System.out.print(Sex);
        System.out.print(' ');
        System.out.print(Inaltime);
        System.out.print(' ');
        System.out.println(esteAngajat);
        //Print vs Println
        //Print= printeaza si ramane pe randul curent
        //Println= printeaza si sare la randul urmator
        printeazaNota();
        promovareCurs();

        System.out.println(getSalarV1());
        System.out.println(getSalarV2());


    }

    //variabila locala= tip variabila + nume
    public void printeazaNota(){
        Integer notamanual = 9;
        Integer notaautomation = 10;
        System.out.println("Cursantul Nicu a luat notele:"+notamanual+","+notaautomation);

    }

    public void promovareCurs(){
        Boolean promovare= true;
        System.out.println("A promovat cursantul: "+Nume+" "+Prenume+"? ");
        System.out.println(promovare);

    }

    //Metoda return= exprimare care contine "returneaza"
    //Structura metoda return= public+ "tip de data"+Nume(){}
    //Exista o conventie in Java ca metodele cu return sa aiba in fata "get"
    //Returnam salariul dorit
    public String getSalarV2(){
        Integer salariu= 1000000000;
        String s= salariu +" Lei";
        return s;
    }

    public Integer getSalarV1(){
        Integer salar=5000;
        return salar;
    }

    //


}
