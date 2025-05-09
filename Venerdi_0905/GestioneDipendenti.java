package Venerdi_0905;

import java.util.ArrayList;
import java.util.Scanner;

public class GestioneDipendenti {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        ArrayList<Dipendenti> dipendenti = new ArrayList<>();
        int scelta;

        do {
            System.out.println("\n GESTIONE DIPENDENTI ");
            System.out.println("1. Aggiungi dipendente");
            System.out.println("2. Visualizza tutti i dipendenti");
            System.out.println("3. Modifica un dipendente");
            System.out.println("4. Rimuovi un dipendente");
            System.out.println("5. Esci");
            System.out.print("Scelta: ");
            scelta = myScanner.nextInt();
            myScanner.nextLine();

            switch (scelta) {
                case 1:
                    System.out.println("Inserisci il nome: ");
                    String nome = myScanner.nextLine();

                    System.out.println("Inserisci lo stipendio: ");
                    double stipendio = myScanner.nextDouble();
                    myScanner.nextLine();

                    System.out.println("Inserisci il dipartimento:");
                    String dipartimento = myScanner.nextLine();
                    
                    dipendenti.add(new Dipendenti(nome, stipendio, dipartimento));
                    System.out.println("Dipendente aggiunto");
                break;
                case 2: 
                    if(dipendenti.isEmpty()){
                        System.out.println("Nessun dipendente registrato");
                    } else{
                        System.out.println(dipendenti);
                    }
                    
                break;
                case 3:
                    System.out.println("Inserisci il numero del dipendente da modificare: ");
                    int indexDipendente = myScanner.nextInt() - 1;
                    myScanner.nextLine();

                    if(indexDipendente >= 0 && indexDipendente <= dipendenti.size()){
                        Dipendenti d = dipendenti.get(indexDipendente);

                        System.out.println("Inserisci il nuovo nome:");
                        String nuovoNome = myScanner.nextLine();
                        if(!(nuovoNome.isEmpty())){
                            d.setNome(nuovoNome);
                        }
                        
                        System.out.println("Inserisci un nuovo stipendio:");
                        double nuovoStipendio = myScanner.nextDouble();
                        myScanner.nextLine();
                        d.setStipendio(nuovoStipendio);

                        System.out.println("Inserisci un nuovo dipartimento:");
                        String nuovoDipartimento = myScanner.nextLine();
                        if(!(nuovoDipartimento.isEmpty())){
                            d.setDipartimento(nuovoDipartimento);

                        }
                        
                    } else{
                        System.out.println("Input inserito non valido");
                    }
                    
                break;
                case 4:
                    System.out.println("Inserisci il numero del dipendente da rimuovere");

                    int indexRemove = myScanner.nextInt() - 1;
                    myScanner.nextLine();

                    if(indexRemove >=0 && indexRemove <= dipendenti.size() ){
                        dipendenti.remove(indexRemove);
                    } else{
                        System.out.println("Dipendente non trovato o Numero errato");
                    }

                break;
            
            }
        } while (scelta != 5);


    }
}
