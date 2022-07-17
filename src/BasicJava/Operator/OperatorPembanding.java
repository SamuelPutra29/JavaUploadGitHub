package BasicJava.Operator;

import java.util.Scanner;

public class OperatorPembanding {
    public static void main(String[] args) {


        // deklarasi variabel dan scanner

        int a,b;
        boolean hasil;
        Scanner scan = new Scanner(System.in);

        // masukkan nilai a dan b
        System.out.println("Masukkan nilai a: ");
        a = scan.nextInt();
        System.out.println("Masukkan nilai b: ");
        b = scan.nextInt();


        // apakah nilai a lebih besar dari nilai b
        hasil = a > b;
        System.out.println(hasil);

        // apakah nilai a lebih kecil dari nilai b
        hasil = a < b;
        System.out.println(hasil);

        // apakah nilai a sama dengan nilai b
        hasil = a == b;
        System.out.println(hasil);

        // apakah nilai a tidak sama dengan nilai b
        hasil = a != b;
        System.out.println(hasil);






    }
}
