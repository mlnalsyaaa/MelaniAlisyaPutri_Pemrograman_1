package P5_Pemrograman1;
import java.util.Scanner;
class latihan {
    int data[];
    int n;

    latihan(int n){
        this.n = n;
        data = new int[n];
    }
    void inputData(Scanner sc){
        for (int i = 0; i < n; i++){
            System.out.print("Data ke-" + i + "=");
            data[i] = sc.nextInt();
        }
    }
    void tampilData(){
        System.out.println("\nData: ");
        for (int i = 0; i < n; i++){
            System.out.println("Data[" + i + "] = " + data[i]);
        }
    }
    void max(){
        int max = data[0];
        for (int i = 1; i < n; i++){
            if (data[i] > max){
                max = data[i];
            }
        }
        System.out.println("Nilai Maksimum = " + max);
    }
    void min(){
        int min = data[0];
        for (int i = 1; i < n; i++){
            if (data[i] < min){
                min = data[i];
            }
        }
        System.out.println("Nilai Minimum = " + min);
    }
    void sorting(){
        for (int i = 0; i < n - 1; i++){
            for (int j = 0; j < n -i - 1; j++){
                if (data[j] > data[j + 1]){
                    int temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }
        System.out.println("Data berhasil diiurutkan");
    }
}
public class latihan2 {
    public static void main(String args []){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah data: ");
        int n = input.nextInt();
        if (n <= 0){
        System.out.println("Jumlah data harus > 0");
        return;
        }
        latihan obj = new latihan(n);
        obj.inputData(input);
        int pilihan;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Tampil Data");
            System.out.println("2. Nilai Maksimum");
            System.out.println("3. Nilai Minimum");
            System.out.println("4. Sorting");
            System.out.println("5. Keluar");
            System.out.print("Pilihan: ");
            pilihan = input.nextInt();
            switch (pilihan) {
                case 1:
                    obj.tampilData();
                    break;
                case 2:
                    obj.max();
                    break;
                case 3:
                    obj.min();
                    break;
                case 4:
                    obj.sorting();
                    break;
                case 5:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 5);
    }
}