public class ProvaVariabili {   
    public static void main(String[] args) {
        // Stampa i numeri nella console
        System.out.println(3);  
        System.out.println(3 + 3);
        System.out.println(3*8);

        int provaNumero = 12;   // Varie prove con le varibili
        String provaTesto = " Topolino";
        Boolean provaBoolean = true;
        
        System.out.println("Il suo nome è " + provaTesto);
        String fullPart = provaNumero + provaTesto; //Unire sia int + Sting
        System.out.println(fullPart);

        //Per i valori numeri il + funziona come un operatore matematico
        int num1 = 5;
        int num2 = 10;
        System.out.println(x + y);

        int num_c1 = 10, num_c2 = 20, num_c3 = 30;  
        System.out.println(num_c1 + num_c2 + num_c3);
    }
}
