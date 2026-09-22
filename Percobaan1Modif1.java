import java.util.Scanner;
public class Percobaan1Modif1 {
    public static void main(String[] args) {
        Scanner absen = new Scanner(System.in);

        System.out.print("Masukkan Tahun : ");
        int tahun = absen.nextInt();

        if ((tahun % 4) == 0) {
            if ((tahun % 100) != 0) {
                System.out.println("Tahun Kabisat");
            } else {
                System.out.println("Bukan Tahun Kabisat"); 
            }
        } else {
            System.out.println("Bukan Tahun Kabisat");
        }
    }
}