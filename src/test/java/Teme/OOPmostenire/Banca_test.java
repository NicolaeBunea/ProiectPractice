package Teme.OOPmostenire;

import org.junit.Test;

public class Banca_test {

    @Test
    public void client1(){
        Client_1 clientul1= new Client_1("Pop", "Radu", true,1234,1921232141);
        clientul1.detaliiClient();
        clientul1.infoClient_1();
    }
}
