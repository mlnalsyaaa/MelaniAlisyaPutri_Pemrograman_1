package P6_Pemrograman1;
import java.util.Scanner;
class latihan2 {
    double luas(double sisi) {
        return sisi * sisi;
    }
    double luas(double panjang, double lebar) {
        return panjang * lebar;
    }
    double luas(double alas, double tinggi, boolean segitiga) {
        return 0.5 * alas * tinggi;
    }
}
public class latihan {
    public static void main(String args []) {
        Scanner input = new Scanner(System.in);
        latihan2 obj = new latihan2();
        System.out.println("========== PILIH MENU ==========");
        System.out.println("1. Luas Persegi");
        System.out.println("2. Luas Persegi Panjang");
        System.out.println("3. Luas Segitiga");
        System.out.print("Pilihan: ");

        int pilih = input.nextInt();
        switch (pilih) {
            case 1:
                System.out.print("Masukkan sisi: ");
                double sisi = input.nextDouble();
                System.out.println("Luas Persegi: " + obj.luas(sisi));
                break;

            case 2: 
                System.out.print("Masukkan panjang: ");
                double panjang = input.nextDouble();
                System.out.print("Masukkan Lebar: ");
                double lebar = input.nextDouble();
                System.out.println("Luas Persegi Panjang: " + obj.luas(panjang, lebar));
                break;
            case 3: 
                System.out.print("Masukkan alas: ");
                double alas =input.nextDouble();
                System.out.print("Masukkan tinggi: ");
                double tinggi = input.nextDouble();
                System.out.println("Luas = " + obj.luas(alas, tinggi, true));
                break;
            default:
                System.out.println("Pilihan Tidak Valid");            
        }
        input.close();
    }
}