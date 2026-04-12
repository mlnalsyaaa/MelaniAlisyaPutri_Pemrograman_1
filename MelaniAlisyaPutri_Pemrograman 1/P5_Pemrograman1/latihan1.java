package P5_Pemrograman1;
import java.util.Scanner;
public class latihan1 {
    public static void main(String args []){
        Scanner input = new Scanner(System.in);
        int hari;
        System.out.print("Masukkan angka hari (1-7: ");
        hari = input.nextInt();

        switch (hari){
            case 1:
                System.out.println("Senin");
                break;
            case 2:
                System.out.println("Selasa");
                break;
            case 3:
                System.out.println("Rabu");
                break;
            case 4:
                System.out.println("Kamis");
                break;
            case 5:
                System.out.println("Jumat");
                break;
            case 6:
                System.out.println("Sabtu");
                break;
            case 7:
                System.out.println("Minggu");
                break;
            default:
                System.out.println("Input tidak valid");
        }
        input.close();
    }
}