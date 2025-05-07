package Mercoledi_0705.ModificatoriDiAccesso;

// Creare una classe ContoBancario con un campo saldo privato e un metodo deposita pubblico per accedere al campo e depositare denaro:
class ContoBancario{
    private double saldo;

    public ContoBancario(double saldo){
        this.saldo = saldo;
    }

    public void deposita(double importo){
        saldo += importo;
        System.out.println("Questo è il tuo saldo attuale: " + saldo);
    }
}

public class ClasseContoBancario {
    public static void main(String[] args) {
        ContoBancario conto = new ContoBancario(0);

        conto.deposita(100.00);
    }
}
