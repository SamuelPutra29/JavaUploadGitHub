package OOP.Latihan1;

public class PersegiPanjang extends BangunDatar  {

    float panjang, lebar;

    @Override
    float luas(){
        float luas = panjang * lebar;
        System.out.println("Luas persegi panjang adalah: " + luas);
        return luas;


    }

    @Override
    float keliling(){
        float keliling = (panjang + lebar) *2;
        System.out.println("Keliling persegi panjang adalah: " + keliling);
        return keliling;
    }



}
