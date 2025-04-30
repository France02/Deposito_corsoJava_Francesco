package Mercoledi_3004;

public class EserciziTypeCasting {
    public static void main(String[] args) {
        // dichiariamo un numero
        int numero = 20;
        double numero2 = (double) numero; 
        System.out.println(numero2);  
        
        double numerDecimale = 20.00;
        int numeroIntero = (int) numerDecimale;
        System.out.println(numeroIntero);

        int numero3 = 10;
        String numeroStringa = String.valueOf(numero3);
        System.out.println(numeroStringa);

        String numerTesto = "30";
        int numeroInt = Integer.parseInt(numerTesto);
        System.out.println(numeroInt);

    
    
    }
    
}
