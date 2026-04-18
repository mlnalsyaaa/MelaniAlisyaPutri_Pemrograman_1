package P6_Pemrograman1;
import java.util.Scanner;
import java.util.Arrays;

public class latihan1 {
    private double tinggi;
    private double alas;

    public void settinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public void setalas(double alas) {
        this.alas = alas;
    }

    public double gettinggi() {
        return tinggi;
    }

    public double getalas() {
        return alas;
    }

    public double getluas() {
        return 0.5 * alas * tinggi;
    }

    public static void main(String args []) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Jumlah Segitiga: ");
        int n = input.nextInt();

        latihan1 S[] = new latihan1[n];
        double luasArray[] = new double[n];

        for (int i = 0; i < n; i++) {
            S[i] = new latihan1();

            System.out.println("\nSegitiga ke-" + (i + 1));
            System.out.print("Tinggi = ");
            double tinggi = input.nextDouble();
            S[i].settinggi(tinggi);

            System.out.print("Alas = ");
            double alas = input.nextDouble();
            S[i].setalas(alas);
        }
        for (int i = 0; i < n; i ++) {
            System.out.println("\nSegitiga ke-" + ( i + 1));
            System.out.println("Tinggi = " + S[i].gettinggi());
            System.out.println("Alas = " + S[i].getalas());
            
            luasArray[i] = S[i].getluas();
            System.out.println("Luas = " + luasArray[i]);
        }

        double max = luasArray[0];
        double min = luasArray[0];

        for (int i = 1; i < n; i++) {
            if (luasArray[i] > max) {
                max = luasArray[i];
            }
            if (luasArray[i] < min) {
                min = luasArray[i];
            }
        }
            System.out.println("\nLuas Maksimum = " + max);
            System.out.println("Luas Minimum = " + min);

            Arrays.sort(luasArray);

            System.out.println("\nLuas setelah diurutkan: ");
            for (int j = 0; j < n; j++) {
                System.out.println(luasArray[j]);
            }
            input.close();
        }
    }
