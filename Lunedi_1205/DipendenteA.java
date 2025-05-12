package Lunedi_1205;

public class DipendenteA extends Dipendente {
    private int malattia;

    public DipendenteA(String matricola, double stipendio, double straordinario) {
        super(matricola, stipendio, straordinario);
        this.malattia = 0; // inizializzazione come richiesto
    }

    public void prendiMalattia(int giorni) {
        malattia += giorni;
    }

    @Override
    public double paga(double oreStraordinario) {
        double p = super.paga(oreStraordinario);
        if (malattia == 0) {
            return p;
        } else {
            return p - (malattia * 15.0);
        }
    }

    public void stampaMalattia() {
        System.out.println("Giorni di malattia: " + malattia);
    }
}