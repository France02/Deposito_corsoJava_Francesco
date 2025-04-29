import java.util.Scanner;

public class Esercizio4 {
    public static void main(String[] args) {
         
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Benvenuto prova a vincere");
        
        int numeroDaIndovinare = 42;
        System.out.println("inserisci un numero:");
        int num1 = myScanner.nextInt();

        if(num1 > numeroDaIndovinare){
            System.out.println("Hai perso, numero troppo grande");
       } else if (num1 < numeroDaIndovinare){
            System.out.println("Hai perso, numero troppo piccolo");
       } else if(num1 == numeroDaIndovinare){
        System.out.println("Hai vinto!!");
       } else {
            System.out.println("Inserisci un numero valido!");
       }
       myScanner.close();
    }
}
