package Lunedi_1205;

public class CalcoloStipendi {
    public static void main(String[] args) {
        Dipendente dipendente = new Dipendente("00309", 1000.00, 7.50);

        dipendente.paga(10);
        dipendente.getStipendio();

        DipendenteA dipendenteA = new DipendenteA("00201", 1500.0, 8.50);
        dipendenteA.prendiMalattia(5);
        dipendenteA.paga(3);
        dipendenteA.stampaMalattia();

        System.out.println(dipendente);
        System.out.println(dipendenteA);
    }
}
