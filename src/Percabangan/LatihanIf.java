package Percabangan;

import java.util.Scanner;

public class LatihanIf {
    public static void main(String[] args) {
         // membuat variabel dan scanner
        int belanja;
        Scanner scan = new Scanner(System.in);

        System.out.println("Masukkan jumlah belanjaan: ");
        belanja = scan.nextInt();

        if (belanja >= 100000){
            System.out.println("Selamat anda mendapatkan hadiah 10 ribu!!!");

        } else {
            System.out.println("Silahkan belanja lebih banyak lagi!!!!");
        }


    }



}
