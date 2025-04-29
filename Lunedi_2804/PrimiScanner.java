import java.util.Scanner;

public class PrimiScanner {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter username");
        String userName = myObj.nextLine();
        
        Scanner myObj2 = new Scanner(System.in);
        System.out.println("Enter age:");
        int userAge =  myObj2.nextInt();
        
        System.out.println("Username: " + userName + " Age: "+ userAge);

        myObj.close();
        myObj2.close();
    }
}
