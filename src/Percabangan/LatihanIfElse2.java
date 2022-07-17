package Percabangan;

import java.util.Scanner;

public class LatihanIfElse2 {

    public static void main(String[] args) {

        double hasil, nilaiHarian, nilaiMingguan, nilaiUas;
        String nama,grade;
        Scanner scan = new Scanner(System.in);

        System.out.println("Masukkan nama siswa: ");
        nama = scan.nextLine();
        System.out.println("Masukkan nilai harian: ");
        nilaiHarian = scan.nextInt();
        System.out.println("Masukkan nilai mingguan: ");
        nilaiMingguan = scan.nextInt();
        System.out.println("Masukkan nilai UAS: ");
        nilaiUas= scan.nextInt();

        // rumus mendapatkan nilai rata-rata
        hasil = nilaiHarian * 0.2 + nilaiMingguan*0.3 + nilaiUas*0.5;

        // proses mendapatkan grade dari siswa tersebut

        if (hasil >= 90){
            grade = "A";
        } else if ( hasil >= 80){
            grade = "B";
        } else if ( hasil >= 70){
            grade = "C";
        } else if ( hasil >= 60 ){
            grade = "D";
        } else{
            grade = "E";
        }


        // print hasil nilai di rapot
        System.out.println(nama + " mendapatkan grade: " + hasil);











    }
}
