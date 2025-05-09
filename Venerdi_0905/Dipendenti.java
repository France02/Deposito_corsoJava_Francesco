package Venerdi_0905;

public class Dipendenti {

    private String nome;
    private double stipendio;
    private String dipartimento;

    public Dipendenti(String nome, double stipendio, String dipartimento){
        this.nome = nome;
        this.dipartimento = dipartimento;
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

    public void setStipendio(double stipendio){
        this.stipendio = stipendio;
    }

    public String getDipartimento(){
        return dipartimento;
    }

    public void setDipartimento(String dipartimento){
        this.dipartimento = dipartimento;
    }
    
    @Override
    public String toString(){
        return "Nome: " + nome + " Stipendio: $" + stipendio + " Dipartimento: " + dipartimento;
    }
}
