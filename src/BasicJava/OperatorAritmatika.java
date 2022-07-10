package BasicJava;

import java.util.Scanner;

public class OperatorAritmatika {

    public static void main(String[] args) {

        // deklarasi variabel dan scanner
        int angka1, angka2, hasil;
        Scanner scan = new Scanner(System.in);


        // masukkan nilai
        System.out.println("Masukkan angka pertama: " );
        angka1 = scan.nextInt();
        System.out.println("Masukkan angka kedua: " );
        angka2 = scan.nextInt();

        // penjumlahan
        hasil= angka1 + angka2;
        System.out.println("Hasil penjumlahan adalah: "  + hasil);


        // pengurangan
        hasil= angka1 -angka2;
        System.out.println("Hasil pengurangan adalah: " + hasil);

        // perkalian
        hasil = angka1*angka2;
        System.out.println("Hasil perkalian adalah: " + hasil);





    }
}
