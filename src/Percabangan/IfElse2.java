package Percabangan;

import java.util.Scanner;

public class IfElse2 {

    public static void main(String[] args) {


        // deklarasi variabel dan scanner
        String nama;
        double nilaiHarian, nilaiMingguan, nilaiUas, nilaiAkhir;
        Scanner scan = new Scanner(System.in);

        // masukkan nilai variabel yang dibutuhkan
        System.out.println("Masukkan nama: ");
        nama = scan.nextLine();
        System.out.println("Masukkan nilai Harian: ");
        nilaiHarian=  scan.nextInt();
        System.out.println("Masukkan nilai Mingguan: ");
        nilaiMingguan = scan.nextInt();
        System.out.println("Masukkan nilai UAS: ");
        nilaiUas = scan.nextInt();

        nilaiAkhir = nilaiHarian*0.2 + nilaiMingguan*0.3 + nilaiUas*0.5;

        if (nilaiAkhir >= 75){
            if(nilaiAkhir >= 85){
                System.out.println("Anda masuk IPA 1");
            }
            else if (nilaiAkhir>= 80){
                System.out.println("Anda masuk IPA 2");
            }
            else{
                System.out.println("Anda masuk IPA 3");
            }
        }
        else {
            if(nilaiAkhir <45 ){
                System.out.println("Anda masuk IPS 3");
            }
            else if (nilaiAkhir< 50){
                System.out.println("Anda masuk IPS 2");
            }
            else{
                System.out.println("Anda masuk IPS 1");
            }
        }




    }



}
