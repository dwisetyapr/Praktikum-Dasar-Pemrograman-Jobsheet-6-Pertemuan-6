import java.util.Scanner;
public class Tugas311 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String merk, kategori;
        int ukuran;
        double harga = 0;

        System.out.print("Masukkan merk sepatu (Converse / Sketcher / Nike) : ");
        merk = input.nextLine();
        System.out.print("Masukkan kategori : ");
        kategori = input.nextLine();
        System.out.print("Masukkan ukuran : ");
        ukuran = input.nextInt();
        System.out.println("-----------------------------------------");

        if (merk.equalsIgnoreCase("converse")) {
            if (kategori.equalsIgnoreCase("slip on")) {
                if (ukuran >= 36) {
                    if (ukuran <= 40) {
                        harga = 800000;
                    }
                }
            } else if (kategori.equalsIgnoreCase("high top")) {
                if (ukuran >= 40) {
                    if (ukuran <= 44) {
                        harga = 1200000;
                    }
                }
            }
        } else if (merk.equalsIgnoreCase("sketcher")) {
            if (kategori.equalsIgnoreCase("woman")) {
                if (ukuran >= 36) {
                    if (ukuran <= 41) {
                        harga = 1000000;
                    }
                }
            } else if (kategori.equalsIgnoreCase("man")) {
                if (ukuran >= 41) {
                    if (ukuran <= 44) {
                        harga = 1800000;
                    }
                }
            }
        } else if (merk.equalsIgnoreCase("nike")) {
            if (kategori.equalsIgnoreCase("kids")) {
                if (ukuran >= 36) {
                    if (ukuran <= 40) {
                        harga = 750000;
                    }
                }
            } else if (kategori.equalsIgnoreCase("adult")) {
                if (ukuran >= 40) {
                    if (ukuran <= 44) {
                        harga = 1500000;
                    }
                }
            }
        }

        if (harga > 0) {
            System.out.println("Harga sepatu = " + harga);
        } else {
            System.out.println("Maaf, merk, kategori, atau ukuran tidak valid.");
        }
    }
}