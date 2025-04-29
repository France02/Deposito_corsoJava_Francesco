import java.util.Scanner;

public class Esercizio5 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int prezzoIniziale = 500;
        String userName_corretto = "Francesco";
        String password_corretta = "1234";

        System.out.println("Login");
        System.out.println("Username:");
        String userName = myScanner.nextLine();
        System.out.println("Password:");
        String password = myScanner.nextLine();

        if(password.equals(password_corretta) && userName.equals(userName_corretto)){
            System.out.println("Accesso effettuato");
            System.out.println("Calcola la tua assicurazione");
        
        
        System.out.println("inserisci la tua età:");
        int età = myScanner.nextInt();

        System.out.print("Inserisci gli anni di esperienza alla guida: ");
        int anniEsperienza = myScanner.nextInt();

        System.out.print("Quanti incidenti hai avuto negli ultimi 5 anni? ");
        int incidenti = myScanner.nextInt();

        if(età < 18){
            System.out.println("Non sei idoneo per l'assicurazione");
        }else if(età > 18 && età <= 25){
            prezzoIniziale *=1.2;
        } else if(età >= 26 && età >=50){
            System.out.println("Nessuna maggiorazione");
        } else{
            prezzoIniziale *=0.9;
        }

        if (anniEsperienza < 2) {
            prezzoIniziale *= 1.3; 
        }

        if (incidenti == 1) {
            prezzoIniziale *= 1.15; 
        } else if (incidenti >= 2 && incidenti <= 4) {
            prezzoIniziale *= 1.3; 
        } else if (incidenti > 4) {
            System.out.println("Non sei idoneo per l'assicurazione.");
            myScanner.close();
            return;
        }

        
        System.out.print("Scegli il pacchetto assicurativo (1=Base, 2=Intermedio, 3=Premium): ");
        int pacchetto = myScanner.nextInt();

        switch (pacchetto) {
            case 1:
        
                break;
            case 2:
                prezzoIniziale *= 1.2; 
                break;
            case 3:
                prezzoIniziale *= 1.5; 
                break;
            default:
                System.out.println("Pacchetto non valido. Verrà applicato il pacchetto Base.");
                break;
        }
        
        System.out.println("Questo è il preventivo finale: " + prezzoIniziale);
        myScanner.close();
        } else{
            System.out.println("Username o Password errati");
        }

        
    }
}
