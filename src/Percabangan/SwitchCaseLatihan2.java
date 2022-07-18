package Percabangan;

import java.util.Scanner;

public class SwitchCaseLatihan2 {
    public static void main(String[] args) {
        // deklarasi variabel dan scanner
        String lampu;
        Scanner scan =new Scanner(System.in);


        // masukkan variabel yang dibutuhkan
        System.out.println("Masukkan warna lampu: ");
        lampu= scan.nextLine();

        //proses menggunakan switch case
        switch (lampu){
            case "Merah":
                System.out.println("Anda harus berhenti");
                break;
            case "Kuning":
                System.out.println("Anda harus hati-hati");
                break;
            case "Hijau":
                System.out.println("Silahkan jalan");
                break;
            default:
                System.out.println("Anda salah memasukkan lampu");
        }
    }
}
