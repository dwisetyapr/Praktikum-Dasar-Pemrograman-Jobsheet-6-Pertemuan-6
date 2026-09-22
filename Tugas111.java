import java.util.Scanner;
public class Tugas111 { 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int bil1, bil2, bil3, terbesar;

        System.out.print("Masukkan bilangan 1 : ");
        bil1 = input.nextInt();
        System.out.print("Masukkan bilangan 2 : ");
        bil2 = input.nextInt();
        System.out.print("Masukkan bilangan 3 : ");
        bil3 = input.nextInt();

        terbesar = bil1;

        if (bil2 > terbesar) {
            terbesar = bil2;
        } else if (bil3 > terbesar) {
            terbesar = bil3;
        }

        System.out.println("Bilangan terbesar adalah : " + terbesar);
    }
}