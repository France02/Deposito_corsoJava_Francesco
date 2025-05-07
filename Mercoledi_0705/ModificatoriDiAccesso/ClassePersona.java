package Mercoledi_0705.ModificatoriDiAccesso;

// Creare una classe Persona con un campo nome privato e un metodo getNome pubblico per accedere al valore del campo:
class Persona{
    private String nome;

    public Persona(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }
}


public class ClassePersona {
    public static void main(String[] args) {
        Persona persona = new Persona("Francesco");
        System.out.println(persona.getNome());
    }
}
