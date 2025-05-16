package Venerdi_1605;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RentalAgency agency = new RentalAgency();

        // Aggiungi alcune auto di esempio
        agency.addCar(new Car("Fiat Panda", "AB123CD"));
        agency.addCar(new Car("Ford Fiesta", "EF456GH"));
        agency.addCar(new Car("BMW Serie 3", "IJ789KL"));

        int choice;
        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Visualizza auto disponibili");
            System.out.println("2. Noleggia un'auto");
            System.out.println("3. Restituisci un'auto");
            System.out.println("4. Esci");
            System.out.print("Scelta: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consuma il newline

            switch (choice) {
                case 1:
                    agency.displayAvailableCars();
                    break;
                case 2:
                    System.out.print("Inserisci la targa dell'auto da noleggiare: ");
                    String rentPlate = scanner.nextLine();
                    agency.rentCar(rentPlate);
                    break;
                case 3:
                    System.out.print("Inserisci la targa dell'auto da restituire: ");
                    String returnPlate = scanner.nextLine();
                    agency.returnCar(returnPlate);
                    break;
                case 4:
                    System.out.println("Arrivederci!");
                    break;
                default:
                    System.out.println("Scelta non valida.");
            }
        } while (choice != 4);

        scanner.close();
    }
}