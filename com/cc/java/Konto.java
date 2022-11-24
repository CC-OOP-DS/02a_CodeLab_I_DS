package com.cc.java;

public class Konto{

    private int kontostand = 10000;

    
// Constructor nur wenn in App etwas eingefügt werden soll
    // public Konto(int kontostand) {
    //     this.kontostand = kontostand;
    // }

    public int getKontostand() {
        return kontostand;
    }

    public void setKontostand(int kontostand) {
        this.kontostand = kontostand;
    }

    
}