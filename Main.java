// Don't delete any comments below!!!
// Todo: Import Scanner
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ManajemenInventaris manajemen = new ManajemenInventaris();
        Scanner input = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Menu:");
            System.out.println("1. Tambah Makanan Kering");
            System.out.println("2. Tambah Makanan Basah");
            System.out.println("3. Tampilkan Semua Makanan");
            System.out.println("4. Keluar");
            System.out.print("Pilih: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    manajemen.tambahMakananKering();
                    break;
                case 2:
                    manajemen.tambahMakananBasah();
                    break;
                case 3:
                    manajemen.tampilkanSemuaMakanan();
                    break;
                case 4:
                    System.out.println("Keluar...");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (choice != 4);
    }
}
