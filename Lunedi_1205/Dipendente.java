package Lunedi_1205;

public class Dipendente {
    protected String matricola;
    private double stipendio;
    private double straordinario;

    public Dipendente(String matricola, double stipendio, double straordinario){
        this.matricola = matricola;
        this.stipendio = stipendio;
        this.straordinario = straordinario;

    }

    public double getStipendio(){
        return stipendio;
    }

    public double paga(int oreStraodinario){
        return stipendio + oreStraodinario * straordinario;
    }

    @Override
    public String toString(){
        return "Matricola: " + matricola +  " Stipendio: " + stipendio + " Straordinario: " + straordinario;
    }
    
}
