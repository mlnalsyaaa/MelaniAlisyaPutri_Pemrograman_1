package P7_Pemrograman1;
import java.util.Scanner;
public class tugas1 {
    public static void main(String args []) {
        Scanner input = new Scanner(System.in);
        boolean running = true;

        while (running) {
        System.out.println("===== MENU UTAMA =====");
        System.out.println("1. Hitung Nilai Akhir");
        System.out.println("2. Sistem Nilai");
        System.out.println("3. Keluar");
        System.out.print("Pilih Menu: ");
        int pilihan = input.nextInt();

        switch (pilihan) {
            case 1:
                System.out.print("Masukkan Realisasi Kehadiran: ");
                int realisasi = input.nextInt();

                System.out.print("Masukkan Kehadiran Kamu: ");
                int presensi = input.nextInt();

                System.out.print("Masukkan Nilai Tugas: ");
                int tugas = input.nextInt();

                System.out.print("Masukkan Nilai UTS: ");
                int UTS = input.nextInt();

                System.out.print("Masukkan Nilai UAS: ");
                int UAS = input.nextInt();

                double hasil_presensi = (double) presensi / realisasi * 10;
                double hasil_tugas = tugas * 0.2;
                double hasil_UTS = UTS * 0.3;
                double hasil_UAS = UAS * 0.4;

                double total = hasil_presensi + hasil_tugas + hasil_UTS + hasil_UAS;

                String grade;
                if (total >= 80) {
                    grade = "A";
                } else if (total >= 70) {
                    grade = "B";
                } else if (total >= 60) {
                    grade = "C";
                } else if (total >= 55) {
                    grade = "D";
                } else {
                    grade = "E";
                }   

                double syarat = realisasi * 75.0 / 100.0;
                System.out.println("\n===== HASIL NILAI =====");
                if (presensi >= syarat) {
                    System.out.printf("Nilai Akhir: %.2f\n" , total);
                    System.out.println("Grade: " + grade);
                } else {
                    if (total >= 55) {
                        System.out.println("Nilai Akhir: 55");
                        System.out.println("Grade: D");
                    } else {
                        System.out.printf("Nilai Akhir: %.2f\n" , total);
                        System.out.println("Grade: E");
                    }
                }
                break;

            case 2:
                 System.out.print("Masukkan Kehadiran: ");
                 int jmlHadir = input.nextInt();

                 System.out.print("Masukkan Nilai Akhir: ");
                 int nilaiAkhir = input.nextInt();

                 String grade2;
                 if (nilaiAkhir >= 80) {
                    grade2 = "A";
                 } else if (nilaiAkhir >= 70){
                    grade2 = "B";
                 } else if (nilaiAkhir >= 60) {
                    grade2 = "C";
                 } else if (nilaiAkhir >= 55) {
                    grade2 = "D";
                 } else {
                    grade2 = "E";
                 }
                double kehadiran = 21 * 75.0 / 100.0;

                System.out.println("\n===== HASIL NILAI =====");
                if (jmlHadir >= kehadiran) {
                    System.out.println("Nilai: " + nilaiAkhir);
                    System.out.println("Grade: " + grade2);
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