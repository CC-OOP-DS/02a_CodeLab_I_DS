package com.cc.java;

import java.lang.reflect.Array;

public class App {
    
    public static void main(String[] args) {
        // Kontoeröffnung
        Konto konto1 = new Konto (10000);
        Konto konto2 = new Konto (10000);
        Konto konto3 = new Konto (10000);

        
        // Output Kontostand 
        output(String.valueOf(konto1.getKontostand()));
        output(String.valueOf(konto2.getKontostand()));
        output(String.valueOf(konto3.getKontostand()));

        //Kontostand verändern
        konto1.setKontostand(konto1.getKontostand()*2);
        konto2.setKontostand(konto2.getKontostand()*3);
        konto3.setKontostand(konto3.getKontostand()*10);

        //Output neuer Kontostand
        output(String.valueOf(konto1.getKontostand()));
        output(String.valueOf(konto2.getKontostand()));
        output(String.valueOf(konto3.getKontostand()));


    }
    // Wie bekomme ich "Kontostand von 'konto1': "
    public static void output(String outputStr) {
        System.out.println("Kontostand: " + outputStr);
    }



}

