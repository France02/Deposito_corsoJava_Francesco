package Lunedi_1205;

public class Motorino {
    private String colore;
    private double velocità;
    private String tipo;
    protected boolean antiFurto; 

    public Motorino(String colore, double velocità, String tipo){
        this.colore = colore;
        this.velocità = velocità;
        this.tipo = tipo;
    }

    public double getVelocita(){
        return velocità;
    }

    public void setVelocita(double velocità){
        this.velocità = velocità;
    }

    public void accelera(double piuVeloce){
        if (!antiFurto) {
            velocità += piuVeloce;
        }
    }

    public void inserisciAntifurto(){
        antiFurto = true;
    }
}