import java.util.Scanner;
public class Tugas211 { 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String hari, jenis_buku;
        int jumlah_buku;
        double diskon = 0;

        System.out.print("Masukkan hari pembelian : ");
        hari = input.nextLine();
        System.out.print("Masukkan jenis buku (Kamus / Novel / Lainnya) : ");
        jenis_buku = input.nextLine();
        System.out.print("Masukkan jumlah buku yang dibeli : ");
        jumlah_buku = input.nextInt();

        if (hari.equalsIgnoreCase("rabu")) {
            if (jenis_buku.equalsIgnoreCase("kamus")) {
                diskon = 10;
                if (jumlah_buku > 2) {
                    diskon += 2; 
                }
            } 

            else if (jenis_buku.equalsIgnoreCase("novel")) {
                diskon = 7;
                if (jumlah_buku > 3) {
                    diskon += 2; 
                } else {
                    diskon += 01; 
                }
            } 
          
            else {
                if (jumlah_buku > 3) {
                    diskon = 5;
                } else {
                    diskon = 0;
                }
            }

        } else {
            diskon = 0; 
        }

        System.out.println("Besar diskon yang didapat = " + diskon + "%");
    }
}