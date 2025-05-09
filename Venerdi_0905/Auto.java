package Venerdi_0905;

import java.util.ArrayList;

public class Auto {
    private String marca;
    private int anno;

    public Auto(String marca, int anno) {
        this.marca = marca;
        this.anno = anno;
    }

    public String getMarca() {
        return marca;
    }

    public int getAnno() {
        return anno;
    }

    @Override
    public String toString() {
        return marca + " (" + anno + ")";
    }

    public static void main(String[] args) {
        ArrayList<Auto> autoList = new ArrayList<>();
        autoList.add(new Auto("Fiat", 2000));
        autoList.add(new Auto("Ford", 2025));

        for (Auto auto : autoList) {
            System.out.println(auto);
        }
    }
}