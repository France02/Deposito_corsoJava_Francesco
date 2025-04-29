import java.util.Scanner;

public class EsercizioDistributore {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        double saldo = 10.00; // Saldo iniziale
        boolean continua = true; // Variabile per controllare il ciclo

        while (continua) { // Ciclo che si ripete finché "continua" è true
            System.out.println("Saldo attuale: " + saldo + "€");
            System.out.println("Scegli una Bevanda: \n1: Caffe - 1.50€\n2: Cappuccino - 2.00€ \n3: Tè - 1.00€\n4: Acqua - 0.50€\n5: Uscire");
            
            int scelta = myScanner.nextInt();

            switch (scelta) {
                case 1:
                    if (saldo >= 1.50) {
                        saldo -= 1.50;
                        System.out.println("Hai scelto Caffe");
                    } else {
                        System.out.println("Credito insufficiente per acquistare il Caffe.");
                    }
                    break;
                case 2:
                    if (saldo >= 2.00) {
                        saldo -= 2.00;
                        System.out.println("Hai scelto Cappuccino");
                    } else {
                        System.out.println("Credito insufficiente per acquistare il Cappuccino.");
                    }
                    break;
                case 3:
                    if (saldo >= 1.00) {
                        saldo -= 1.00;
                        System.out.println("Hai scelto Tè");
                    } else {
                        System.out.println("Credito insufficiente per acquistare il Tè.");
                    }
                    break;
                case 4:
                    if (saldo >= 0.50) {
                        saldo -= 0.50;
                        System.out.println("Hai scelto Acqua");
                    } else {
                        System.out.println("Credito insufficiente per acquistare l'Acqua.");
                    }
                    break;
                case 5:
                    System.out.println("Grazie per aver utilizzato il distributore. Saldo rimanente: " + saldo + "€");
                    continua = false; // Imposta "continua" a false per uscire dal ciclo
                    break;
                default:
                    System.out.println("Scelta non valida. Riprova.");
                    break;
            }

            // Controllo se il saldo è esaurito
            if (saldo <= 0) {
                System.out.println("Credito esaurito. Grazie per aver utilizzato il distributore.");
                continua = false; // Imposta "continua" a false per uscire dal ciclo
            }
        }

        myScanner.close(); // Chiude lo scanner alla fine del programma
    }
}