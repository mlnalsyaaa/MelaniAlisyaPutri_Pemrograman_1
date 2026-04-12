package P3_Pemrograman1;
import java.util.Scanner;
public class latihan1 {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama barang: ");
        String namaBarang = input.nextLine();
        System.out.print("Masukkan harga barang: ");
        int harga = input.nextInt();
        System.out.print("Masukkan jumlah beli: ");
        int jumlah = input.nextInt();
        int total = harga * jumlah;
        double diskon = 0;

        if (total > 100000){
            diskon = total * 0.1;
        }
        double totalBayar = total - diskon;

        System.out.println("\n==== STRUK BELANJA ===");
        System.out.println("Barang: " + namaBarang);
        System.out.println("Total: " + total);
        System.out.println("Diskon: " + diskon);
        System.out.println("Total Bayar: " + totalBayar);

        input.close();
    }
    
}
