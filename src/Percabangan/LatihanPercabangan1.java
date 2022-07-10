package Percabangan;

import java.util.Scanner;

public class LatihanPercabangan1 {


    public static void main(String[] args) {

        // deklarasi variable dan scanner
        Scanner scan = new Scanner(System.in);
        String kartu;
        int belanja, diskon, totalBelanjaan;

        System.out.println("Apakah kamu punya kartu: ");
        kartu = scan.nextLine();
        System.out.println("Masukkan jumlah belanjaan: ");
        belanja = scan.nextInt();


        if (kartu.equalsIgnoreCase("ya")){
            if(belanja >= 500000){
                diskon = 20000;
            } else if (belanja >= 250000){
                diskon = 10000;
            } else{
                diskon = 0;
            }
        }
        else{
            if (belanja >= 500000){
                diskon = 10000;
            }
            else if (belanja >= 250000){
                diskon = 5000;
            }else{
                diskon = 0;
            }
        }

        totalBelanjaan = belanja - diskon;

        System.out.println("Total belanjaan yang harus dibayar adalah: " + totalBelanjaan);





    }
}
