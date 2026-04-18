package P5_Pemrograman1;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class latihan1 {
    public static void main(String args []){
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        String BacaInput = "";
        int JmlData = 0;
        int DataArray[];

        System.out.print("Jumlah Data: ");
        try {
            BacaInput = dataIn.readLine();
            JmlData = Integer.parseInt(BacaInput);
        } catch (IOException e) { 
            System.out.println("Ada Kesalahan!");
        }
        if (JmlData <= 0) {
            System.out.println("Jumlah Data harus lebih dari 0!");
            return;
        }

       DataArray = new int[JmlData];
       System.out.println();
       for (int i = 0; i < JmlData; i++){
        System.out.print("DataArray[" + i + "] = ");
        try {
            BacaInput = dataIn.readLine();
            DataArray[i] = Integer.parseInt(BacaInput);
        } catch (IOException e) {
            System.out.println("Ada Kesalahan!");
        }
       }
       System.out.println("\nData yang dimasukkan: ");
       for (int i = 0; i < JmlData; i++){
        System.out.println("DataArray[" + i + "] = " + DataArray[i]);
       }
       int max = DataArray[0];
       int min = DataArray[0];

       for (int i = 1; i < JmlData; i++){
        if (DataArray[i] > max){
            max = DataArray[i];
        } 
        if (DataArray[i] < min){
            min = DataArray[i];
        }
       }
       System.out.println("\nNilai Maksimum = " + max);
       System.out.println("Nilai Minimum = " + min);

       for (int i = 0; i < JmlData; i++){
        for (int j = 0; j < JmlData - i - 1; j++){
            if (DataArray[j] > DataArray[j + 1]){
                int temp = DataArray[j];
                DataArray[j] = DataArray[j + 1];
                DataArray[j + 1] = temp;
            }
        }
       }
       System.out.println("\nData setelah diurutkan: ");
       for (int i = 0; i < JmlData; i++){
        System.out.println("DataArray[" + i + "] = " + DataArray[i]);
       }
    }
}