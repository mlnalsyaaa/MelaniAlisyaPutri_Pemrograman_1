package P4_Pemrograman1;
import java.util.Scanner;
public class latihan2 {
    public static void main(String args []){
        Scanner input = new Scanner(System.in);

        int total_makan_minggu = 0, total_transport_minggu = 0, total_belanja_minggu = 0;
        int total_semua_minggu = 0;

        for (int i = 1; i <=7; i++){
            System.out.println("\n====== HARI KE-" + i + " ======");
            System.out.print("Makan: ");
            int makan = input.nextInt();
            System.out.print("Transport: ");
            int transport = input.nextInt();
            System.out.print("Belanja: ");
            int belanja = input.nextInt();

            int total_harian = makan + transport + belanja;

            System.out.println("Total Hari Ke-" + i + ":" + total_harian);
            System.out.println("> % Makan: " + (makan * 100 / total_harian + "%"));
            System.out.println("> % Transport: " + (transport * 100 / total_harian + "%"));
            System.out.println("> % Belanja: " + (belanja * 100 / total_harian + "%"));

            total_makan_minggu += makan;
            total_transport_minggu += transport;
            total_belanja_minggu += belanja;
            total_semua_minggu += total_harian;

            System.out.println("\n ===== REKAP MINGGUAN =====");
            System.out.println("Total: " + total_semua_minggu);
            System.out.println("% Makan: " + (total_makan_minggu * 100 / total_semua_minggu) + "%");
            System.out.println("% Transport: " + (total_transport_minggu * 100 / total_semua_minggu) + "%");
            System.out.println("% Belanja: " + (total_belanja_minggu * 100 / total_semua_minggu) + "%");
            input.close();
        }
    }
}