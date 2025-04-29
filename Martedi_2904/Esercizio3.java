import java.util.Scanner;
public class Esercizio3 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        String admin = "Francesco";
        int password = 1234;

        System.out.println("Username:");
        String userName = myScanner.nextLine();

        System.out.println("Inserisci una password numerica:");
        int num1 = myScanner.nextInt();

        if(userName.equals(admin) && num1 == password){
            System.out.println("la password e Username corretti");
        } else{
            System.out.println("Riprova password e Username errati");
        }
         myScanner.close();
    }
}