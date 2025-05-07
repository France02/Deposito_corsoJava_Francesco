package Mercoledi_0705.EserciziArray;

public class IndividuaElementoArray {
    public static void main(String[] args) {
        int numeri[] = {1, 5, 3, 4, 10};
        int trovatello = 10;
        boolean condizione = false;

        for(int numero : numeri){
            if(numero == trovatello){
                condizione = true;
                break;
            }
        }
        
        System.out.println("Il trovatello è stato trovato?: " + condizione);
    }
}
