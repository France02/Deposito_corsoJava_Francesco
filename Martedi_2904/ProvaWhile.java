import java.util.Scanner;

public class ProvaWhile {
    public static void main(String[] args) {
        int i = 1;
        // Inizializziamo la varibile

        // Continua il ciclo finche la condizione sarà falsa
        while (i <= 5) {
            i++; //Incrementiamo di 1 
            System.out.println(i);
        }

        //inizializziamo una nuova variabiele
        int x = 0;
        do{
            System.out.println(x);
            x++; //incremento di 1
        } while(x < 5);

        // Ciclo booleano
        // inizializziamo un valore booleano 
        boolean condizione = true;
        Scanner myScanner = new Scanner(System.in); //Classe Scanner

        while (condizione) {
            //corpo del ciclo da ripetere
            System.out.println("Vuoi continuare il ciclo?");
            String risposta = myScanner.nextLine();
            if(risposta.equals("No")){
                //
                condizione = false;
            }
        }

        // Proviamo il ciclo For 
        System.out.println("Inserisci un numero:"); // l'utente inserisce un numero
        int numero = myScanner.nextInt();

        
        System.out.println("Tabellina del: "+ numero);

        //Condizione del ciclo for
        for(int a = 1; a <= 10; a++){
            System.out.println("numero " + numero + " x " + a + " = " + (numero * a)); 
            //Mostra le tabelline del numero scelto
        }



        myScanner.close();
    }
}
