package Zadaca;

import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {

        // POCETAK PROGRAMA
        System.out.println("--- PALINDROM ---");

        // UNOS STRINGA
        String lijevo;
        Scanner unos = new Scanner(System.in);
        System.out.print("Unesi recenicu: ");
        lijevo = unos.nextLine();

        // KONVERTOVANJE IZ STRINGA U INT RADI PROVJERE DUZINE KARAKTERA
        int duzina = lijevo.length();

        // PREBACIVANJE KARAKTERA S LIJEVA NA DESNO I SMJESTAMO NJEGOVE KARAKTERE U NOVI STRING desno
        String desno="";
        for (int i = duzina - 1; i >= 0; i-- )
            desno = desno + lijevo.charAt(i);

        // PRILIKOM PROVJERE POKLAPANJA, STAVLJEN JE IgnoreCase DA NE BI DOSLO DO NE POKLAPANJA RADI VELIKIH ILI MALIH SLOVA
        if (lijevo.equalsIgnoreCase(desno)) {
            System.out.println("Unesena recenica je polindrom!");
        } else {
            System.out.println("Unesena recenica nije polindrom!");
        }

        // KRAJ PROGRAMA
    }
}