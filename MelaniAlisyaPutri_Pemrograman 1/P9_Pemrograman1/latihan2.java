package P9_Pemrograman1;
abstract class LivingThing {
    public void breath() {
        System.out.println("Breathing...");
    }

    public void eat() {
        System.out.println("Eating...");
    }

    public abstract void walk();
}

class Human extends LivingThing {
    public void walk() {
        System.out.println("Human walks with 2 legs");
    }
}

class Cat extends LivingThing {
    public void walk() {
        System.out.println("Cat walks with 4 legs");
    }
}

class LembagaPendidikan {
    protected String nama;
    protected String alamat;
    protected String telepon;
    protected String jenis;

    public LembagaPendidikan(String nama, String alamat, String telepon, String jenis) {
        this.nama = nama;
        this.alamat = alamat;
        this.telepon = telepon;
        this.jenis = jenis;
    }

    public String toString() {
        return "Nama: " + nama + "\nAlamat: " + alamat + "\nTelepon: " + telepon + "\nJenis: " + jenis;
    }
}

class Universitas extends LembagaPendidikan {
    public Universitas(String nama, String alamat, String telepon, String jenis) {
        super(nama, alamat, telepon, jenis);
    }
}

class SMA extends LembagaPendidikan {
    public SMA(String nama, String alamat, String telepon, String jenis) {
        super(nama, alamat, telepon, jenis);
    }
}

public class latihan2 {
    public static void main(String [] args) {
        Human manusia = new Human();
        Cat kucing = new Cat();

        System.out.println("...Manusia..");
        manusia.breath();
        manusia.eat();
        manusia.walk();

        System.out.println("\n...Kucing...");

        kucing.breath();
        kucing.eat();
        kucing.walk();

        Universitas univ = new Universitas ("Universitas Pamulang", "Jl. Surya Kencana", "021xxxxx", "Universitas");

        SMA sma = new SMA ("SMA Negeri 1 Pamulang", "Jl.Puspitek", "021xxxxx", "SMA");

        System.out.println("\n...Lembaga...");
        System.out.println(univ);
        System.out.println();
        System.out.println(sma);
    }
}