package Mercoledi_0705.EserciziArray;

public class Occorrenza {
    public static void main(String[] args) {
        // Contare il numero di occorrenze di un elemento in un array di stringhe:
        // inizializziamo l'Array
        String parole[] = {"Casa", "Cane", "Casa", "Gatto"};
        int conteggio = 0;

        // Con questo for la variabile parola assume, una alla volta, il valore di ogni elemento dell’array parole
        for(String parola : parole){
            if(parola.equals(parole[0])){ // Conta se il valore di parola è uguale "Casa"
                conteggio++; // Incrementiamo la varibile
            }
        }

        System.out.println("IL numero di parole uguali è: " + conteggio); 
    }
}
