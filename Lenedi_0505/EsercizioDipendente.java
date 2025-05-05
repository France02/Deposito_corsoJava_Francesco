package Lenedi_0505;

class Dipendente{
    String nome;
    double stipendio;

    public Dipendente(){
        nome = "";
        stipendio = 0;
    }

    public Dipendente(String nome, double stipendio){
        this.nome = nome;
        this.stipendio = stipendio;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public double getStipendio(){
        return stipendio;
    }

    public void setStipendio( double stipendio){
        this.stipendio = stipendio;
    }

    public void aumento(double percentuale){
        stipendio = stipendio + ((stipendio * percentuale) / 100);
    }
}

public class EsercizioDipendente {
    
    public static void main(String[] args) {
        Dipendente dipendente = new Dipendente();

        dipendente.setStipendio(1000.00);
        dipendente.setNome("Francesco");
        dipendente.aumento(10.00);

        System.out.println("Il dipendente è : " + dipendente.getNome() + " " + dipendente.getStipendio());
    }
    

}
