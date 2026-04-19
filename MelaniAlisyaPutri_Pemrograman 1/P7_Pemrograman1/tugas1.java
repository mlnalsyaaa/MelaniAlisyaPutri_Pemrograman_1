package P7_Pemrograman1;
import java.util.Scanner;
public class tugas1 {
    public static void main(String args []) {
        Scanner input = new Scanner(System.in);
        boolean running = true;

        while (running) {
        System.out.println("===== MENU UTAMA =====");
        System.out.println("1. Sistem Nilai");
        System.out.println("2. Sistem Keuangan");
        System.out.println("3. Keluar");
        System.out.print("Pilih Menu: ");
        int pilihan = input.nextInt();

        switch (pilihan) {
            case 1:
                 System.out.print("Masukkan Kehadiran: ");
                 int jmlHadir = input.nextInt();

                 System.out.print("Masukkan Nilai Akhir: ");
                 int nilaiAkhir = input.nextInt();

                 String grade;
                 if (nilaiAkhir >= 80) {
                    grade = "A";
                 } else if (nilaiAkhir >= 70){
                    grade = "B";
                 } else if (nilaiAkhir >= 60) {
                    grade = "C";
                 } else if (nilaiAkhir >= 55) {
                    grade = "D";
                 } else {
                    grade = "E";
                 }
                double kehadiran = 21 * 75.0 / 100.0;

                System.out.println("\n===== HASIL NILAI =====");
                if (jmlHadir >= kehadiran) {
                    System.out.println("Nilai: " + nilaiAkhir);
                    System.out.println("Grade: " + grade);
                } else {
                    if (nilaiAkhir >= 55) {
                        System.out.println("Nilai: 55");
                        System.out.println("Grade: D");
                    } else {
                        System.out.println("Nilai: " + nilaiAkhir);
                        System.out.println("Grade: E");
                    }
                }
                break;

            case 2:
                int total_makan = 0, total_transport = 0, total_belanja = 0;
                int total_semua = 0;

                for (int i = 1; i <= 7; i ++) {
                    System.out.println("\n===== HARI KE-" + i + "=====");
                    System.out.print("Makan: ");
                    int makan = input.nextInt();

                    System.out.print("Transport: ");
                    int transport = input.nextInt();

                    System.out.print("Belanja: ");
                    int belanja = input.nextInt();

                    int total_harian = makan + transport + belanja;

                    System.out.println("Total Hari Ke-" + i + " :" + total_harian);
                    System.out.println("> % Makan: " + (makan * 100.0 / total_harian) + "%");
                    System.out.println("> % Transport: " + (transport * 100.0 / total_harian) + "%");
                    System.out.println("> % Belanja: " + (belanja * 100.0 / total_harian) + "%");

                    total_makan += makan;
                    total_transport += transport;
                    total_belanja += belanja;
                    total_semua += total_harian;
                }

                System.out.println("\n===== REKAP MINGGUAN =====");
                System.out.println("Total Pengeluaran: " + total_semua);
                System.out.println("% Makan: " + (total_makan * 100.0 / total_semua) + "%");
                System.out.println("% Transport: " + (total_transport * 100.0 / total_semua) + "%");
                System.out.println("% Belanja: " + (total_belanja * 100.0 / total_semua) + "%");
                break;
            case 3: 
                running = false;
                System.out.println("Terima Kasih!");
                break;

            default:
                System.out.println("Pilihan Tidak Valid");
        }
        }
        input.close();
    }
}