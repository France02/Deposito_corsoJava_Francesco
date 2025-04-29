public class ProveMath {
    public static void main(String[] args) {
        
        System.out.println(Math.max(5, 10)); //RESTITUISCE IL NUMERO MAX
        System.out.println(Math.min(10, 20)); // 10 RESTITUISCE IL MINOR NUMERO
        System.out.println(Math.sqrt(14)); // RADICE QUADRATA
        System.out.println(Math.abs(-4.7)); // VALORE ASSOLUTO POSITIVO
        System.out.println(Math.random()); //NUMERO CASUALE
        
        int randomNum = (int)(Math.random() * 100); //NUMERO CASUALE DA 0 A 100;
        System.out.println(randomNum);
    }
}
