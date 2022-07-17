package Percabangan;

import java.util.Scanner;

public class NestedIf {
    public static void main(String[] args) {
        int belanja, diskon, totalBelanjaan;
        String kartu;
        Scanner scan = new Scanner(System.in);

        // masukkan belanja dan kartu
        System.out.println("Apakah anda punya kartu: ");
        kartu = scan.nextLine();
        System.out.println("Masukka total belanjaan: ");
        belanja = scan.nextInt();

        if ( kartu.equalsIgnoreCase("Ya")){
            if ( belanja > 1000000){
                diskon = 50000;
            }
            else if ( belanja > 500000){
                diskon = 25000;
            }
            else {
                diskon = 0;
            }
        }

        else{
            if ( belanja > 1000000){
                diskon = 25000;
            }
            else{
                diskon =0;
            }
        }


        totalBelanjaan = belanja - diskon;

        System.out.println("Maka total belanjaan anda adalah: "  + totalBelanjaan);






    }



}
