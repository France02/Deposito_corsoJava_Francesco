public class ProvaStringe {
    public static void main(String[] args) {
        String text = "Francesco";
        System.out.println("la lunghezza: " + text.length()); //RESTITUISCE LA LUNGHEZZA
        // TRASFORMA TUTTO IN MAIUSCOLO 
        System.out.println(text.toUpperCase());

        String text2 = "Please locate where 'locate' occurs!";
        System.out.println(text2.indexOf("locate")); // OUTPUT 7 
        
        // CONCATENAZIONE TRA STRINGHE 
        String firstName = "Francesco ";
        String lastName = "Golino";
        System.out.println(firstName + " " + lastName); //QUI LO SPAZZIO LO ABBIAMO INSERITO TRAMITE ""
        System.out.println(firstName.concat(lastName)); // QUI LO SPAZIO LO ABBIAMO NELLA DICHIARAZIONE STRING

        // ALTRI METODI PER LA CODIFICA 
        String pippo = "Pippo";
        String topolino = "Topolino";
        System.out.println(pippo.equals(topolino)); //FALSE CONTROLLA SE E UGUALE ALLA STRINGA TOPOLINO
        System.out.println(pippo.contains("pirla")); //TRUE CONTROLLA SE HA LA LETTERA SPECIFICATA
        System.out.println(pippo.isEmpty()); //DA FALSE PERCHE' VERIFICA SE LA STRINGA PIPPO E' VUOTA

    }
}
