import java.util.Scanner;

public class EsercizioScarso {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        
        // INSERIMENTO DUE NUMERI INTERI
        System.out.println("inserisci un numero:");
        int num1 = myScanner.nextInt();
        System.out.println("inserisci un secondo numero:");
        int num2 = myScanner.nextInt();

        // LE VARIE OPERAZIONI
        int somma = num1 + num2;
        int differenza = num1 - num2;
        int moltiplicazione = num1 * num2;

        
        System.out.println(somma);
        System.out.println(differenza);
        System.out.println(moltiplicazione);
    
        myScanner.close();
    }
   
}
