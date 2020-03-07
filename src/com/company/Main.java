package com.company;

public class Main {

    public static void main(String[] args) {
	// Aufgabe berechne bruttopreis

        int nettoPreis = 200;
        double steuerSatz = 0.05;
        double bruttoPreis;

        bruttoPreis = nettoPreis + nettoPreis * steuerSatz;

        System.out.println("Ergebnis: " +bruttoPreis);

     // booleans

        boolean dieSonneScheint = false;
        boolean scheissWetter = true;

        boolean wetterHeute;
        wetterHeute = dieSonneScheint && scheissWetter;

        System.out.println("die Sonne scheint & scheiss Wetter: " +wetterHeute);

     //boolean 2: (1>3 && (!3<5)) || 2==4

        boolean teil1 = (1>3 && !(3<5));
        boolean teil2 = 2==4;
        System.out.println(teil1 || teil2);

     // if else Übung

        double maxSteuersatz = 0.6;
        boolean bedingung = maxSteuersatz > steuerSatz;

        if (bedingung) {
            System.out.println("der Steuersatz übertragt den maximalen nicht");
        } else {
            System.out.println("der steuersatz übertragt den maximalen");
        }
//
    }
}
