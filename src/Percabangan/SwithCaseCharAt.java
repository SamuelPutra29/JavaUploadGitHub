package Percabangan;

import java.util.Scanner;

public class SwithCaseCharAt {

    // di class ini menggunakan method Char At. Fungsinya untuk memanggil input untuk variabel bertipe Char

    public static void main(String[] args) {

        char nilai;
        Scanner scan = new Scanner(System.in);

        System.out.println("Masukkan nilai dari (A-E): ");
        nilai= scan.next().charAt(0);

        // proses
        switch (nilai){
            case 'A':
                System.out.println("Pertahankan!!!!");
                break;
            case 'B':
                System.out.println("Tingkatkan terus ya!!!");
                break;
            case 'C':
                System.out.println("Jangan malas belajar!!");
                break;
            case 'D':
                System.out.println("Hayoooo siapa suruh main terus!!!");
                break;
            case 'E':
                System.out.println("Mau tidak naik kelas!!!!");
            default:
                System.out.println("Maaf formatnya tidak sesuai!!!");
        }




    }
}
