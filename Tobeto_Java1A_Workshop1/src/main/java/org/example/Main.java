package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        String ortaMetin = "ilginizi cekebilir";
        String altMetin = "vade suresi";

        System.out.println(ortaMetin);

        int vade = 12;

        double dolarDun = 18.14;
        double dolarBugun = 18.10;

        boolean dolarDustuMu = true;

        String okYonu = "down.svg";

        if (dolarBugun<dolarDun){
            okYonu = "down.svg";
            System.out.println(okYonu);
        }else if(dolarBugun>dolarDun){
            okYonu = "up.svg";
            System.out.println(okYonu);
        }else{
            okYonu = "equal.svg";
            System.out.println(okYonu);
        }

        String[] krediler = {"Hizli Kredi", "Maasini Halkbanktan", "Mutlu Emekli"};

        for (int i = 0; i < krediler.length; i++){
            System.out.println(krediler[i]);
        }
    }
}
