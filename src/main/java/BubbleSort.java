import java.util.Scanner;
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {

        // POČETAK PROGRAMA
        System.out.println("--- Potrebno je unjeti 10 brojeva za sortiranje ---");

        // NIZ BROJEVA KOJE JE KORISNIK UNJEO
        int[] niz = new int[10];
        Scanner unos = new Scanner(System.in);

        for (int j=0; j< niz.length; j++){
                System.out.print("Unesite broj: ");
                niz[j] = unos.nextInt();
        }

        // SORTIRANJE NIZA
        Arrays.sort(niz);

        // OUTPUT SORTIRANIH BROJEVA
        System.out.println("--- Sortirani brojevi od najmanjeg ka najvecem ---");

        for (int i=0; i<niz.length; i++) {
            System.out.print(niz[i] + "\t");
        }

        // KRAJ PROGRAMA

    }
}