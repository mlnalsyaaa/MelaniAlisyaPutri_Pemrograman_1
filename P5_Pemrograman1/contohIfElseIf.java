package P5_Pemrograman1;
public class contohIfElseIf {
    public static void main(String [] args){
        int nilai = 85;

        if (nilai == 100) {
            System.out.println("Kategori Sempurna!");
        } else if (nilai >= 95){
            System.out.println("Kategori Sangat Memuaskan!");           
        } else if (nilai >= 80){
            System.out.println("Kategori Baik!");
        } else {
            System.out.println("Maaf Anda Belum Lulus!");
        }
    }
}