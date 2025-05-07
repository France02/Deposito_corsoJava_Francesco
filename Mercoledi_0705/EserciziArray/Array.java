package Mercoledi_0705.EserciziArray;

import java.util.Scanner;

public class Array {
    
    public static void main(String[] args) throws Exception {     
        
        try{   
        //FACCIO DEFINIRE ALL'UTENTE LA LUNGHEZZA DEL VETTORE
        Scanner scanner=new Scanner(System.in); 
        System.out.println("Quanti elementi vuoi inserire nel vettore?");
        int lunghezza=scanner.nextInt();
        int [] vettore=new int[lunghezza];
        int [] vettore2=vettore;
        
        //RICHIAMO METODI
        riempiVettore(vettore);
        stampaVettore(vettore);
        stampaCopiaVettore(vettore,vettore2);
        sommaElementi(vettore);
        ricercaMassimo(vettore);
        ricercaMinimo(vettore);
        scambiaPosizioni(vettore);
        
        scanner.close();
        }catch(ArrayIndexOutOfBoundsException e){};
    }

    //METODO PER POPOLARE IL VETTORE
    public static void riempiVettore(int [] vettore){    
        for(int i=0;i<vettore.length;i++){    
            Scanner scanner=new Scanner(System.in);
            System.out.println(String.format("Inserisci il valore alla posizione %d: ",i));
            vettore[i]=scanner.nextInt();   
        }
    }
    //METODO PER STAMPARE A VIDEO IL VETTORE
    public static void stampaVettore(int [] vettore){
        System.out.println("Ecco il vettore: ");
        for(int j=0;j<vettore.length;j++){
            System.out.print(vettore[j]+" ");
        }
    }
    //METODO PER SOMMARE GLI ELEMENTI DI UN VETTORE
    public static void sommaElementi(int [] vettore){
        int somma=0;
        System.out.println("\nEcco la somma degli elementi: ");
        for(int i=0;i<vettore.length;i++){
            somma+=vettore[i];
        }
        System.out.println(somma);
    }
    //METODO PER RICERCARE IL MASSIMO IN UN VETTORE
    public static void ricercaMassimo(int [] vettore){
        int max=vettore[0];
        for(int i=0;i<vettore.length;i++){
            if(vettore[i]>max){
                max=vettore[i];
            }
        }
        System.out.println("Massimo del vettore: "+max);
    }
    //METODO PER RICERCARE IL MINIMO IN UN VETTORE
    public static void ricercaMinimo(int [] vettore){
        int min=vettore[0];
        for(int i=0;i<vettore.length;i++){
            if(vettore[i]<min){
                min=vettore[i];
            }
        }
        System.out.println("Minimo del vettore: "+min);
    }
    //METODO PER STAMPARE LA COPIA DI UN VETTORE
    public static void stampaCopiaVettore(int [] vettore, int [] vettore2){
        vettore=vettore2;
        System.out.println("\nEcco il vettore copiato: ");
        for(int i=0;i<vettore2.length;i++){
            System.out.print(vettore2[i]+" ");
        }
    }
    //METODO PER RIBALTARE LE POSIZIONI DI UN VETTORE
    public static void scambiaPosizioni(int [] vettore){
        for(int i=0;i<vettore.length/2;i++){
            int temp=vettore[i];
            vettore[i]=vettore[vettore.length-1-i];
            vettore[vettore.length-1-i]=temp;
        }
        System.out.println("Vettore invertito: ");
        for(int i=0;i<vettore.length;i++){
            System.out.print(vettore[i]+" ");
        }

    }
    
    
}
