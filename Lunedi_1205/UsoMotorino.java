package Lunedi_1205;

public class UsoMotorino {
    public static void main(String[] args) {
        // Creazione del primo motorino
        Motorino motorino = new Motorino("grigiometallizzato", 40.5, "Piaggio Liberty");
        double velocitaIniziale = motorino.getVelocita();
        System.out.println("Velocità iniziale Motorino: " + velocitaIniziale);

        // Creazione del motorino immatricolato
        MotorinoImmatricolato motorino2 = new MotorinoImmatricolato("rosso", "Aprilia Scarabeo", 30.5, "CV1234", 60);

        // Stampa max velocità
        System.out.println("Max Velocità MotorinoImmatricolato: " + motorino2.getMax());

        // Acceleriamo entrambi
        motorino.accelera(30.7);
        motorino2.accelera(30.7);

        // Stampiamo le nuove velocità
        System.out.println("Nuova velocità Motorino: " + motorino.getVelocita());
        System.out.println("Nuova velocità MotorinoImmatricolato: " + motorino2.getVelocita());
    }
}