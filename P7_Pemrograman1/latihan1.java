package P7_Pemrograman1;
import java.util.Scanner;
import java.util.Arrays;

public class latihan1 {
    public static void main(String args []){
        Scanner input = new Scanner(System.in);
        int jumlah;

        System.out.print("Masukkan jumlah mahasiswa: ");
        jumlah = input.nextInt();
        int[] nilai = new int[jumlah];
        int total = 0;
        System.out.println("\nMasukkan nilai mahasiswa: ");
        for (int i = 0; i < jumlah; i++) {
            System.out.print("Nilai ke-" + (i + 1) + "= ");
            nilai[i] = input.nextInt();
            total += nilai[i];
        }
        System.out.println("\n Data Nilai: ");
        for (int i = 0; i < jumlah; i++) {
            System.out.println("Nilai ke-" + (i + 1) + "=" + nilai[i]);
        }
        int max = nilai[0];
        int min = nilai[0];
        for (int i = 1; i < jumlah; i++){
            if (nilai[i] > max){
                max = nilai[i];
            }
        }
        double rata = (double) total/jumlah;
        System.out.println("\nNilai Tertinggi = " + max);
        System.out.println("Nilai Terendah = " + min);
        System.out.println("Rata-Rata =" + rata);

        Arrays.sort(nilai);
        System.out.println("\nNilai setelah diurutkan: ");
        for (int i = 0; i < jumlah; i++){
            System.out.print(nilai[i] + " ");
        }
        input.close();
    }
}
