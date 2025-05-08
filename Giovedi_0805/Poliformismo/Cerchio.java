package Giovedi_0805.Poliformismo;

public class Cerchio extends Figura {

    // Creare una classe Cerchio che estende la classe Figura e 
    // implementa il metodo calcolaArea per calcolare l'area del cerchio:
    private double raggio;

    public Cerchio(double raggio){
        this.raggio = raggio;
    }

    @Override
    public double calcolaArea(){
        return Math.PI *raggio*raggio;
    }

    public static void main(String[] args) {
        Cerchio cerchio = new Cerchio(5.0);
        double area = cerchio.calcolaArea();

        System.out.println("Area cerchio: " + area);
    }
}
