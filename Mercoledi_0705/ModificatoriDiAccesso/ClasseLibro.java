package Mercoledi_0705.ModificatoriDiAccesso;

import java.util.Scanner;

// Creare una classe Libro con un campo titolo privato e un metodo setTitolo pubblico per impostare il valore del campo:
class Libro{
    private String titolo;

    public void setTitolo(String titolo){
        this.titolo = titolo;
    }

    public String getTitolo(){
        return titolo;
    }
}

public class ClasseLibro {
    public static void main(String[] args) {
        Libro libro = new Libro();
        Scanner myScanner = new Scanner(System.in);

        System.out.print("Dimmi il titolo del libro che vuoi: ");
        String titoloLibro = myScanner.nextLine();

        libro.setTitolo(titoloLibro);
        System.out.println("Ecco il libro da te scelto: " + libro.getTitolo());
    }
}
