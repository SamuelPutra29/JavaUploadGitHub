package Constructor;

public class User {

    public String username;
    public String password;

    /*Membuat konstructor : konstructor adalah= method khusus yang akan dieksekusi pada saat pembuatan objek.
    Biasanya method ini digunakan untuk inisialiasi atau mempersiapkan data untuk objek.*/
    public User(String username, String password){
            this.username = username;
            this.password = password;

    }
}

class DemoConstructor{

    public static void main(String[] args) {
        User petani = new User("Petanikode", "kopi");
        System.out.println("Username: " + petani.username);
        System.out.println("Password: " + petani.password);
    }



}
