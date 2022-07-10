package Array;

import java.util.Scanner;

public class LatihanArrayBuah {

    public static void main(String[] args) {
        // membuat array

        String[] buah = new String[3];

        Scanner scan = new Scanner(System.in);

        //Masukkan nama buah
        for(int i =0; i < buah.length; i++){
            System.out.println("Masukkan nama buah " + i + ": ");
            buah[i] = scan.nextLine();
        }

        System.out.println("==================");

        for( String b : buah){
            System.out.println(b);
        }





    }



}
