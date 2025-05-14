package Mercoledi_1405;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        Library libreria = new Library();

        libreria.addBooks(new Book("Le Signore velate", "Ezio Greggio"));
       libreria.addBooks(new Book("Il Letto rettangolare", "Ciccio Bello"));
       libreria.addBooks(new Book("Il Cammino dei passi", "Usaint bold"));

       int choise;
       do {
        System.out.println("***MENU BIBLIOTECA****");
        System.out.println("1. Mostra tutti i libri");
        System.out.println("2. Prendi un libro in Prestito");
        System.out.println("3. Esci");
        System.out.println("Scegli un opzione");

        choise = myScanner.nextInt();
        myScanner.nextLine();

        switch (choise) {
            case 1:
                System.out.println("Libri disponibili:");
                libreria.displayBooks();
                
            break;

            case 2:
                System.out.println("Scrivi il titolo del libro che vuoi: ");
                String titolo = myScanner.nextLine();
                if(!(titolo.isEmpty())){
                    libreria.borrowBook(titolo);
                } else{
                    System.out.println("input inserito non valido");
                }
            break;

            case 3:
                System.out.println("Arrivederci");
            break;

            default:
                System.out.println("Scelta non valida riprova");
            break;
        }
        
        } while (choise != 3);
        
        myScanner.close();
    }
}
