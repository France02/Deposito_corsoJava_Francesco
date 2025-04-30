package Mercoledi_3004;

public class EserciziNumeri {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 30;
        int somma = num1 + num2;
        System.out.println(somma);

        double numdec = 20.89;
        double numdec2 = 10.11;
        double differenzadec = numdec - numdec2;
        System.out.println(differenzadec);

        int num3 = 10;
        int num4 = 40;
        int num5 = 50;
        int moltipl = num3 * num4 * num5;
        System.out.println(moltipl);

        int base = 2;
        int esponente = 5;
        int potenza = (int) Math.pow(base, esponente);
        System.out.println("La potenza è: " + potenza);

        double numdec3 = 30.00;
        double radicequadrata = Math.sqrt(numdec3);
        System.out.println(radicequadrata);

        System.out.println(Math.max(base, esponente)); //Trovo il maggior valore di alcune variabili scritte in precedenza

        System.out.println((int)(Math.random() * 101));

    }
}
