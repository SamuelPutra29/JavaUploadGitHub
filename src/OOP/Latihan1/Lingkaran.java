package OOP.Latihan1;



public class Lingkaran extends BangunDatar{

    float r;

    @Override
    float luas(){
        float luas = (float) (Math.PI * r * r);
        System.out.println("Luas lingkaran: " + luas);
        return luas;



    }

    @Override
    float keliling(){
        float keliling = (float) (2*Math.PI *r);
        System.out.println("Keliling lingkaran: " + keliling);
        return keliling;

    }



}
