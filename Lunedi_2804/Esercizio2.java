import java.util.Scanner;

public class Esercizio2 {
    public static void main(String[] args) {
        // CREAZIONE DELL'OGGETTO SCANNER PER LEGGERE
        Scanner myObj = new Scanner(System.in);

        // 4 INPUT NUMERICI
        System.out.println("Inserisci il primo numero:");
        int num1 = myObj.nextInt();

        System.out.println("Inserisci il secondo numero:");
        int num2 = myObj.nextInt();

        System.out.println("Inserisci il terzo numero:");
        int num3 = myObj.nextInt();

        System.out.println("Inserisci il quarto numero:");
        int num4 = myObj.nextInt();

        // CONFRONTO TRA I NUMERI UTILIZZANDO GLI OPERATORI LOGICI
        
        boolean risultatoAND = (num1 > 15 && num2 > 15 && num3 > 15 && num4 > 15);
        System.out.println("Tutti i numeri sono maggiori di 15? " + risultatoAND);
     
        boolean risultatoOR = (num1 == 5 || num2 == 5 || num3 == 5 || num4 == 5);
        System.out.println("Almeno uno dei numeri è uguale a 5? " + risultatoOR);

        boolean risultatoNOT = !(num1 == num2 && num2 == num3 && num3 == num4);
        System.out.println("I numeri sono tutti diversi? " + risultatoNOT);
        
        myObj.close();
    }

}