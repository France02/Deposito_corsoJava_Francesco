import java.util.Scanner;

public class ProvaSwitch {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Inserisci il giorno della settimana, utilizzando 1 a 7:");
        int day = myScanner.nextInt();

        switch (day) {
            case 1:
            System.out.println("Monday");
            break;

            case 2:
            System.out.println("Tuesday");
            break;

            case 3:
            System.out.println("Wednesday");
            break;

            case 4:
            System.out.println("Thursday");
            break;

            case 5:
            System.out.println("Friday");
            break;

            case 6:
            System.out.println("Saturday");
            break;

            case 7:
            System.out.println("Sunday");
            break;
            
            default:
            System.out.println("Ciccio questo non è un numero da 1 a 7, riprova");

        }
        myScanner.close();
    }
}
