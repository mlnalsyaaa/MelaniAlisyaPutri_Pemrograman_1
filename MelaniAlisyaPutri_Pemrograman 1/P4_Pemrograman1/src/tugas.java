package P4;
import java.util.Scanner;
public class tugas {
    public static void main(String args []){
        Scanner input = new Scanner (System.in);

        System.out.print("Masukkan biaya makan: ");
        double makan = input.nextDouble();
        System.out.print("Masukkan biaya transport: ");
        double transport = input.nextDouble();
        System.out.print("Masukkan biaya belanja: ");
        double belanja = input.nextDouble();

        double total = makan + transport + belanja;

        double persenMakan = (makan / total) * 100;
        double persenTransport = (transport / total) * 100;
        double persenBelanja = (belanja / total) * 100;

        System.out.println(\n=== HASIL ===);
        System.out.println("Makan = " + persenMakan + "%");
        System.out.println("Transport = " + persenTransport + "%");
        System.out.print("Belanja = " + persenBelanja + "%");
        input.close();
    }    
}