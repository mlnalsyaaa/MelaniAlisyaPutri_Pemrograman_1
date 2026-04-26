package P8_Pemrograman1;
import java.util.Scanner;
public class soal3 {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        char ulang;
        int total = 0;
        int jumlahData = 0;

        do {
            System.out.print("Masukkan nilai mahasiswa: ");
            int nilai = input.nextInt();
            total += nilai;
            jumlahData++;
            System.out.print("Ingin input lagi? (y/t): ");
            ulang = input.next().charAt(0);
        } while (ulang == 'y' || ulang == 'Y');

        double rataRata = (double) total / jumlahData;
        System.out.println("Total nilai: " + total);
        System.out.println("Jumlah data: " + jumlahData);
        System.out.println("Rata-rata: " + rataRata);
        input.close();
    }
}