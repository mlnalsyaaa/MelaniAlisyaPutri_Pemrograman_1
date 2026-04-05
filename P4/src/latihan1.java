package P4_Pemrograman1;
import java.util.Scanner;
public class latihan1 {
    public static void main(String args []){
        Scanner input = new Scanner(System.in);
        int realisasi; int presensi; int tugas; int UTS; int UAS;

        System.out.print;n("Masukkan Realisasi Kehadiran: ");
        realisasi = input.nextInt();
        System.out.println("Masukkan Kehadiran: ");
        presensi = input.nextInt();
        System.out.println("Masukkan Nilai UTS: ");
        UTS = input.nextInt();
        System.out.println("Masukkan Nilai UAS: ");
        UAS = input.nextInt();

        double hasil_presensi; double hasil_tugas; double hasil_UTS; double hasil_UAS;
        double total;
        hasil_presensi = presensi/realisasi * 10;
        hasil_tugas = tugas * 20 / 100;
        hasil_UTS = UTS * 30 / 100;
        hasil_UAS = UAS * 40 / 100;
        total = hasil_presensi + hasil_tugas + hasil_UTS + hasil_UAS;

        System.out.println("==========");
        System.out.println("Nilai Akhir Mahasiswa");
        System.out.println("Realisasi Kehadiran: " + realisasi);
        System.out.println("Kehadiran Kamu: " + presensi);
        System.out.println("Nilai UTS Kamu: " + UTS);
        System.out.println("Nilai UAS Kamu: " + UAS);
        System.out.println("Total: " + total);
        
    }    
}
