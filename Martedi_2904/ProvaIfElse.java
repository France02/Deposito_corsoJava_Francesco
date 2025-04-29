public class ProvaIfElse {
    public static void main(String[] args) {
        int num1 = 20;
        int num2 = 15;
        if(num1 > num2){
            System.out.println("num1 è piu grande di num2");
        } else{
            System.out.println("num1 è piu piccolo di num2");
        }
        // ALTRO ESEMPIO
        int time = 12;
        if(time > 12){
            System.out.println("Good evening");

        } else{
            System.out.println("Good moorning");
        }

        // PROVA ELSE IF 
        int timePasti = 13;
        if(timePasti == 9){
            System.out.println("Breakfast");
        }else if(timePasti == 13){
            System.out.println("Launch");
        } else{
            System.out.println("Cena");
        }
        
        // PROVA CONDIZIONI CON ? 
        int num3 = 30;
        String result = (num3 < 30) ? "Il numero è minore di 30" : "Il numero è maggiore di 30";
        System.out.println(result);
    }
    
   
}
