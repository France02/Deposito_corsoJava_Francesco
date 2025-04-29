import java.util.Scanner;

public class EsercizioLogin {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        //inizializzazione delle varie variabili
        boolean condition = true;
        String userName = "";
        String password = "";
        // Si fermerà se la condizione è falsa
        while (condition) {
            System.out.println("Registrati");

            System.out.println("Username:");
            userName = myScanner.nextLine();

            System.out.println("Password:");
            password = myScanner.nextLine();
            if (!(password.isEmpty() && userName.isEmpty())) {
                System.out.println("Registrazione Effettuata");
                condition = false;
            } else {
                System.out.println("Input non validi");
            }
        }

        boolean login = true;
        while (login) {
            System.out.println("Login");

            System.out.println("Username:");
            String userLogin = myScanner.nextLine();

            System.out.println("Password");
            String passwordLogin = myScanner.nextLine();

            if (userLogin == userName && passwordLogin == password) {
                System.out.println("Login effettuato");
                login = false;
            } else {
                System.out.println("Password o Username errati");
            }
        }

        System.out.println("Homepage");
        boolean continua = true;
        while (continua) {
            System.out.println("Scegli un opzione: \n1.Calcolatrice\n2.Cambia dati\n3.Esci");
            int scelta = myScanner.nextInt();
            // Inserisce la scelta
            switch (scelta) {
                case 1:
                    // Calcolatrice a due fattori
                    System.out.println("=== CALCOLATRICE ===");
                    System.out.print("Inserisci il primo numero: ");
                    double num1 = myScanner.nextDouble();
                    System.out.print("Inserisci il secondo numero: ");
                    double num2 = myScanner.nextDouble();

                    System.out.println("Scegli l'operazione:");
                    System.out.println("1: Addizione");
                    System.out.println("2: Sottrazione");
                    System.out.println("3: Moltiplicazione");
                    System.out.println("4: Divisione");

                    int operazione = myScanner.nextInt();
                    double risultato = 0;

                    switch (operazione) {
                        case 1:
                            risultato = num1 + num2;
                            System.out.println("Risultato: " + risultato);
                            break;

                        case 2:
                            risultato = num1 - num2;
                            System.out.println("Risultato: " + risultato);
                            break;

                        case 3:
                            risultato = num1 * num2;
                            System.out.println("Risultato: " + risultato);
                            break;

                        case 4:
                            if (num2 != 0) {
                                risultato = num1 / num2;
                                System.out.println("Risultato: " + risultato);
                            } else {
                                System.out.println("Errore: Divisione per zero.");
                            }
                            break;
                        default:
                            System.out.println("Operazione non valida.");
                    }
                    break;

                case 2:
                    // Sistema di cambio dei dati utente
                    System.out.println("=== CAMBIA DATI UTENTE ===");
                    System.out.print("Inserisci il nuovo nome utente: ");
                    String nuovoUsername = myScanner.nextLine();
                    System.out.print("Inserisci la nuova password: ");
                    String nuovaPassword = myScanner.nextLine();

                    if (!nuovoUsername.isEmpty() && !nuovaPassword.isEmpty()) {
                        userName = nuovoUsername;
                        password = nuovaPassword;
                        System.out.println("Dati utente aggiornati con successo!");
                    } else {
                        System.out.println("Nuovi dati non validi. I dati non sono stati modificati.");
                    }
                    break;

                case 3:
                    // Uscita dal programma
                    System.out.println("Grazie per aver usato il sistema. Arrivederci!");
                    continua = false;
                    break;

                default:
                    System.out.println("Scelta non valida. Riprova.");
            }
        }

        myScanner.close();
    }
}
