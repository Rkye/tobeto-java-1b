package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        // java'da değişken isimleri camelCase yazılır.
        String ortaMetin = "İlginizi çekebilir!";
        String altMetin = "Vade Süresi";

        System.out.println(ortaMetin);

        // int variable
        int vade = 12;

        // double variable
        double dunDolar = 18.20;
        double bugunDolar = 18.20;

        // boolean variable
        boolean dolarDustuMu = false;

        String okYonu = "";

        if(dunDolar > bugunDolar){
            okYonu = "down.svg";
            System.out.println(okYonu);
        } else if (dunDolar == bugunDolar) {
            okYonu = "equal.svg";
            System.out.println(okYonu);
        } else {
            okYonu = "up.svg";
            System.out.println(okYonu);
        }

        // array
        String[] krediler = new String[]{"Hızlı Kredi", "Emekli Kredi", "Mutlu Kredi"};

        for(int i = 0; i < krediler.length; i++){
            System.out.println(krediler[i]);
        }

    }
}