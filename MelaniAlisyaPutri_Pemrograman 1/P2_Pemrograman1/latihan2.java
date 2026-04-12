package P2_Pemrograman1;
import java.util.Scanner;
public class latihan2 {
    public static void main(String args []) {
        Scanner input = new Scanner (System.in);

        String nama, tempat_lahir, tanggal_lahir, alamat, nama_ortu;
        int usia;

        System.out.print("input nama: ");
        nama = input.nextLine();
        System.out.print("input usia: ");
        usia = input.nextInt();
        input.nextLine();
        System.out.print("input tempat lahir: ");
        tempat_lahir = input.nextLine();
        System.out.print("input tanggal lahir: ");
        tanggal_lahir = input.nextLine();
        System.out.print("input alamat: ");
        alamat = input.nextLine();
        System.out.print("input nama orang tua: ");
        nama_ortu = input.nextLine();

        System.out.println("\n==== DATA DIRI MAHASISWA ====");
        System.out.println("Nama: " + nama);
        System.out.println("Usia: " + usia);
        System.out.println("TTL: " + tempat_lahir + "," + tanggal_lahir);
        System.out.println("Alamat: " + alamat);
        System.out.println("Nama Orang Tua: " + nama_ortu);
        input.close();
        }
}
