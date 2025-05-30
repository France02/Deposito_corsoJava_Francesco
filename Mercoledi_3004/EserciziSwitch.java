package Mercoledi_3004;

public class EserciziSwitch {

    public static void main(String[] args) {
        // Scrivi un programma Java che stampa il nome del giorno della
        // settimana corrispondente a un numero utilizzando il blocco "switch".
        int numeroGiorno = 2;

        switch (numeroGiorno) {
            case 1:
                System.out.println("Lunedi");
                break;
            case 2:
                System.out.println("Martedi");
                break;
            case 3:
                System.out.println("Mercoledi");
                break;
            case 4:
                System.out.println("Giovedi");
                break;
            case 5:
                System.out.println("Venerdi");
                break;
            case 6:
                System.out.println("Sabato");
                break;
            case 7:
                System.out.println("Domenica");
                break;

            default:
                System.out.println("Il numero non corrisponde ad un Giorno");

                break;
        }

        int numeroMese = 6;
        String stagione;

        switch (numeroMese) {
            case 12:
            case 1:
            case 2:
                stagione = "Inverno";
                break;
            case 3:
            case 4:
            case 5:
                stagione = "Primavera";
                break;
            case 6:
            case 7:
            case 8:
                stagione = "Estate";
                break;
            case 9:
            case 10:
            case 11:
                stagione = "Autunno";
                break;
            default:
                stagione = "Numero non valido";

        }

        System.out.println("Il mese " + numeroMese + " corrisponde alla stagione " + stagione + ".");

    }
}