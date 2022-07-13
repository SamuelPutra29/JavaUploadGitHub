package OOP.Latihan1;

public class Segitiga extends BangunDatar {


    float a, t;

    @Override
    float luas() {
        float luas = (a * t) / 2;
        System.out.println("Luas segitiga adalah: " + luas);
        return luas;
    }


}