package Mercoledi_3004;

import java.util.Scanner;

public class EsercizioBigliettiCinema {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int postiStandard = 100;
        int postiVip = 20;
        int postiTotali = postiStandard + postiVip;
        
        double totale = 0;
    

        boolean scelta = true;
        while (scelta && postiTotali > 0) {
            
            System.out.println("Benvenuto prenota i tuoi biglietti Standard o Vip");
            String biglietto = myScanner.nextLine();
            double prezzo = 0;
            if(biglietto.equals("Standard") && postiStandard > 0){
                prezzo += 8;
                postiStandard--;
            }else if(biglietto.equals("Vip") && postiVip > 0){
                prezzo += 15;
                postiVip--;
            } else{
                System.out.println("Seleziona un posto valido/Posti finiti");
            }

            System.out.println("Inserisci la tua età");
            int eta = myScanner.nextInt();
            myScanner.nextLine();

            if(eta < 25){
                prezzo *=0.95;
                System.out.println("Hai uno sconto del 5%");
            }

            totale += prezzo;

            System.out.println("Il prezzo totale è: " + prezzo);
            System.out.println("Vuoi acquistare un altro biglietto? (Scrivi 'si' per continuare, 'no' per uscire):");
            String continua = myScanner.nextLine();

            if(!(continua.equals("si"))){
                scelta = false;
            }

        }

        System.out.println("\n--- Riepilogo finale ---");
        System.out.println("Ha pagato: " + totale);
        System.out.println("Posti Standard rimasti: " + postiStandard);
        System.out.println("Posti VIP rimasti: " + postiVip);

        myScanner.close();
    }
}
