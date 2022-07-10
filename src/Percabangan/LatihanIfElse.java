package Percabangan;

import java.util.Scanner;

public class LatihanIfElse {

    public static void main(String[] args) {
        // deklarasi variabel dan scanner

        int nilai;
        Scanner scan = new Scanner(System.in);

        System.out.println("Masukkan nilai: ");
        nilai = scan.nextInt();

        if (nilai > 75){
            System.out.println("Selamat anda lulusssss!!");

        }
        else{
            System.out.println("Silahkan coba lagi!!!!");
        }






    }
}
