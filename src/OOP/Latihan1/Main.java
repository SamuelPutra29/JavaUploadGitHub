package OOP.Latihan1;

public class Main {
    public static void main(String[] args) {
        // membuat objek bangun datar
        BangunDatar bangunDatar = new BangunDatar();

         // membuat objek lingkaran dan mengisi nilai properti di class lingkaran yaitu nilai R
        Lingkaran lingkaran = new Lingkaran();
        lingkaran.r=22;

        // membuat objek Persegi dan mengisi nilai properti di class persegi yaitu nilai sisi
        Persegi persegi = new Persegi();
        persegi.sisi= 2;

        // membuat objek persegi panjang dan mengisi nilai properti
        PersegiPanjang persegiPanjang = new PersegiPanjang();
        persegiPanjang.lebar=4;
        persegiPanjang.panjang=8;

        // objek untuk segitiga
        Segitiga segitiga = new Segitiga();
        segitiga.a= 12;
        segitiga.t=8;

        //memanggil method luas dan keliling
        bangunDatar.luas();
        bangunDatar.keliling();

        lingkaran.luas();
        lingkaran.keliling();

        persegi.luas();
        persegi.keliling();

        persegiPanjang.luas();
        persegiPanjang.keliling();

        segitiga.luas();
        segitiga.keliling();





    }






}
