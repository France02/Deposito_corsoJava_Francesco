import java.util.Scanner;

public class Esercizio1 {
    public static void main(String[] args) {
        //CREAZIONE DELL'OGGETTO SCANNER PER LA LETTURA
       Scanner myObj = new Scanner(System.in);
       
       // LETTURA TIPI CHAR E STRING 
       System.out.println("Tipo char e String");
        String stringChar = myObj.nextLine();
        System.out.println("Dato:" + stringChar);

        // LETTURA TIPO BYTE 
       System.out.println("Tipo Byte");
        byte myBite = myObj.nextByte();
        System.out.println("Dato:" + myBite);

        // LETTURA TIPO BOOLEANO 
       System.out.println("Tipo Boolean");
        boolean valoreBool = myObj.nextBoolean();
        System.out.println("Dato:" + valoreBool);

        // LETTURA TIPO DOUBLE 
       System.out.println("Tipo Double");
        double myDouble = myObj.nextDouble();
        System.out.println("Dato:" + myDouble);

        // LETTURA TIPO FLOAT 
       System.out.println("Tipo float");
        float myFloat = myObj.nextFloat();
        System.out.println("Dato:" + myFloat);
        
    }
}
