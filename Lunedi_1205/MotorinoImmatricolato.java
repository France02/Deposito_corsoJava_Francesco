package Lunedi_1205;

public class MotorinoImmatricolato extends Motorino {
    private double maxVelocità;
    private String targa;

    public MotorinoImmatricolato(String colore, String tipo, double velocità, String targa, double maxVelocità){
        super(colore, velocità, tipo);
        this.targa = targa;
        this.maxVelocità = maxVelocità;
    }

    public double getMax(){
        return maxVelocità;
    }

    public String getTarga() {
        return targa;
    }

    @Override
    public void accelera(double velocitaAumentata) {
        if (antiFurto == false) { 
            double nuovaVelocita = getVelocita() + velocitaAumentata;
            if (nuovaVelocita <= maxVelocità) {
                setVelocita(nuovaVelocita);
            } else {
                setVelocita(maxVelocità);
            }
        }
    }

}