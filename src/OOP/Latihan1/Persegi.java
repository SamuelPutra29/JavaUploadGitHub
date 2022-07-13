package OOP.Latihan1;

public class Persegi extends BangunDatar{

    float sisi;

    @Override
    float luas(){
        float luas = sisi * sisi;
        System.out.println("Luas persegi adalah: " + luas);
        return luas;
    }

    @Override
    float keliling(){
        float keliling = sisi * 4;
        System.out.println("Keliling persegi adalah: " + keliling);
        return keliling;
    }
}
