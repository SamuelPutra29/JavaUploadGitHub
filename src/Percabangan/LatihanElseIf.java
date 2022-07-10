package Percabangan;

import java.util.Scanner;

public class LatihanElseIf {
    public static void main(String[] args) {

        // deklarasi variabel dan scanner
        int nilai;
        String nama;
        Scanner scan = new Scanner(System.in);


        // masukkan nilai
        System.out.println("Nama siswa adalah: ");
        nama = scan.nextLine();
        System.out.println("Masukkan nilai: ");
        nilai = scan.nextInt();

        if (nilai >= 90) {
            System.out.println("Selamat " + nama + " mendapat nilai A");
        } else if (nilai >= 80) {
            System.out.println("Selamat " + nama + " mendapat nilai B");
        } else  {
            System.out.println("Selamat " + nama + " mendapat nilai C");
        }


    }

}
