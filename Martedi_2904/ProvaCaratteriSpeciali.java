import java.util.Arrays;

public class ProvaCaratteriSpeciali {
    public static void main(String[] args) {
        String text = "We are the so-called \"Vikings\" from the north. ";
        String text2 = "Non lo so frase a \'caso\'";
        String text3 = "Sto usando un carattere \\speciale\\";
        String text4 = "Questa frase dovrebbe \n essere a capo";
        String text5 =  "We are the so-called \r Vikings from the north.";
        String text6 =  "We are the so-called \t Vikings from the north.";
        String text7 =  "We are the so-called \b Vikings from the north.";
        String text8 =  "We are the so-called \f Vikings from the north.";
        
        System.out.println(text);
        System.out.println(text2);
        System.out.println(text3);
        System.out.println(text4);
        System.out.println(text5);
        System.out.println(text6);
        System.out.println(text7);
        System.out.println(text8);

        String str = "Hello World";
        String[] words = str.split("\\s");     
        System.out.println(Arrays.toString(words));




        
    }
}
