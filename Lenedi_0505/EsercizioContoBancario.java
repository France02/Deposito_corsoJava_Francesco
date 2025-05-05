package Lenedi_0505;

import java.util.Scanner;

class ContoBancario {
    private String intestatario;
    private double saldo;

    public ContoBancario(String intestatario, double saldo) {
        this.intestatario = intestatario;
        this.saldo = saldo;
    }

    public void prelevare(double soldiPrelevati) {
        if (soldiPrelevati > 0 && saldo >= soldiPrelevati) {
            saldo -= soldiPrelevati;
            System.out.println("Hai prelevato: €" + soldiPrelevati);
        } else {
            System.out.println("Saldo insufficiente o importo non valido.");
        }
    }

    public void versare(double soldiVersati) {
        if (soldiVersati > 0) {
            saldo += soldiVersati;
            System.out.println("Hai versato: €" + soldiVersati);
        } else {
            System.out.println("Importo non valido.");
        }
    }

    public void applicaInteresse(double percentuale) {
        saldo += saldo * (percentuale / 100);
    }

    public double getSaldo() {
        return saldo;
    }

    public String getIntestatario() {
        return intestatario;
    }
}



public class EsercizioContoBancario {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        // Primo conto: harrysChecking
        ContoBancario harrysChecking = new ContoBancario("Harry", 0);

        String risposta;
        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1 - Versa denaro");
            System.out.println("2 - Preleva denaro");
            System.out.println("3 - Visualizza saldo");
            System.out.print("Scelta: ");
            int scelta = myScanner.nextInt();

            switch (scelta) {
                case 1:
                    System.out.print("Inserisci l'importo da versare: ");
                    double versamento = myScanner.nextDouble();
                    harrysChecking.versare(versamento);
                    break;

                case 2:
                    System.out.print("Inserisci l'importo da prelevare: ");
                    double prelievo = myScanner.nextDouble();
                    harrysChecking.prelevare(prelievo);
                    break;

                case 3:
                    System.out.println("Saldo attuale: €" + harrysChecking.getSaldo());
                    break;

                default:
                    System.out.println("Scelta non valida.");
                    break;
            }

            System.out.print("Vuoi effettuare un'altra operazione? (si/no): ");
            risposta = myScanner.next().toLowerCase();

        } while (risposta.equals("si") || risposta.equals("s"));

        // Nuovo conto: momsSaving
        ContoBancario momsSaving = new ContoBancario("Mom", 1000); // Saldo iniziale di 1000 euro

        System.out.println("\nSaldo iniziale del conto Moms Saving: €" + momsSaving.getSaldo());

        // Applica interesse del 10%
        momsSaving.applicaInteresse(10);

        // Stampa il saldo dopo l'applicazione degli interessi
        System.out.println("Saldo dopo l'applicazione del 10% di interesse: €" + momsSaving.getSaldo());

        System.out.println("Fine del programma. Arrivederci!");

        myScanner.close();
    }
    
}