package P2_Pemrograman1;
import java.util.Scanner;
public class latihan1 {
    public static void main(String args []){
        Scanner input = new Scanner (System.in);
        String nama; int usia;
        System.out.print("input nama: ");
        nama = input.nextLine();
        System.out.print("input usia: ");
        usia = input.nextLine();
        System.out.print("nama: " + nama);
        System.out.print("usia: " + usia);
    }    
}