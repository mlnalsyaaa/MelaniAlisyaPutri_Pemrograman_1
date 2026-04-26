package P8_Pemrograman1;
import java.util.Scanner;
public class soal2 {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        char ulang;
        int total = 0;

        do {
            System.out.print("Masukkan nilai mahasiswa: ");
            int nilai = input.nextInt();
            total += nilai;

            System.out.print("Ingin input lagi? (y/t): ");
            ulang = input.next().charAt(0);
        } while (ulang == 'y' || ulang == 'Y');

        System.out.println("Total nilai yang diinput: " + total);
        input.close();
    }
}