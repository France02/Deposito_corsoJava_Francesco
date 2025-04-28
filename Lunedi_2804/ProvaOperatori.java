public class ProvaOperatori {
    public static void main(String[] args) {
        int num1 = 5;
        num1 += 20; // 25 (5 + 20)
        System.out.println(num1);

        int num2 = 10;
        num2 += num1;
        System.out.println(num2);

        num1++;// INCREMENTO DI 1
        num2--;// DECRESCE DI 1
        System.out.println(num1);
        System.out.println(num2);
        
        // OPERATORI DI CONFRONTO 
        int x = 20;
        int y = 20;
        System.out.println(x > y); //VALORE BOOLEANO 

        //UGUALE UGUALE E NON UGUALE
        System.out.println(x == y); // I VALORI SONO DELL'ESEMPIO PRECEDENTE 
        System.out.println(x != y);

        // OPERATORI LOGICI 
        int num3 = 10;
        int num4 = 13;
        int num5 = 20;
        System.out.println(num3 < 20 || num3 > 20);
        System.out.println(num4 < 15 && num4 > 10);
        System.out.println(!(num3 > num5)); 
    }
}
