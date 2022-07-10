package Percabangan;

import java.util.Scanner;

public class LatihanSwitchCase {
    public static void main(String[] args) {

        // deklarasi variabel dan scanner
        String lampu;
        Scanner scan = new Scanner(System.in);

        // mengambil input
        System.out.println("Masukkan warna lampu: ");
        lampu = scan.nextLine();

        switch (lampu){
            case "merah":
                System.out.println("Mohon untuk berhenti");
                break;
            case "kuning":
                System.out.println("Tolong berhati-hati");
                break;
            case "hijau":
                System.out.println("Silahkan jalan");
                break;



        }






    }



}
