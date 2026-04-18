package P7_Pemrograman1;
import java.util.Scanner;
public class latihan1 {
    public static void main(String args []){
        Scanner input = new Scanner(System.in);
      
        System.out.print("Masukkan Kehadiran Kamu: ");
        int jmlHadir = input.nextInt();
        System.out.print("Masukkan Nilai Akhir Kamu: ");
        int nilaiAkhir = input.nextInt();

        String grade;
        if (nilaiAkhir >= 80){
                grade = "A";
            } else if (nilaiAkhir >= 70){
                grade = "B";
            } else if (nilaiAkhir >= 60){
                grade = "C";
            } else if (nilaiAkhir >= 55){
                grade = "D";
            } else {
                grade = "E";
            }
            double kehadiran = 21 * (75.0 / 100.0);

            if (jmlHadir >= kehadiran){
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

                input.close();
            }
        }
    }
