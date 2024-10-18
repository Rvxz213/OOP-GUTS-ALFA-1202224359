// Don't delete any comments below!!!
// Todo : Import Arraylist and Scanner
import java.util.ArrayList;
import java.util.Scanner;

public class ManajemenInventaris {
    private ArrayList<MakananKering> daftarMakananKering = new ArrayList<>();
    private ArrayList<MakananBasah> daftarMakananBasah = new ArrayList<>();

    public void tambahMakananKering() {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Nama Makanan Kering: ");
        String nama = input.nextLine();
        System.out.print("Masukkan Jumlah: ");
        int jumlah = input.nextInt();
        System.out.print("Masukkan Harga: ");
        double harga = input.nextDouble();
        input.nextLine();  // consume newline
        System.out.print("Masukkan Brand: ");
        String brand = input.nextLine();

        MakananKering makananKering = new MakananKering(nama, jumlah, harga, brand);
        daftarMakananKering.add(makananKering);
        System.out.println("Makanan Kering berhasil ditambahkan!\n");
    }

    public void tambahMakananBasah() {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Nama Makanan Basah: ");
        String nama = input.nextLine();
        System.out.print("Masukkan Jumlah: ");
        int jumlah = input.nextInt();
        System.out.print("Masukkan Harga: ");
        double harga = input.nextDouble();
        input.nextLine();  // consume newline
        System.out.print("Masukkan Bahan: ");
        String bahan = input.nextLine();

        MakananBasah makananBasah = new MakananBasah(nama, jumlah, harga, bahan);
        daftarMakananBasah.add(makananBasah);
        System.out.println("Makanan Basah berhasil ditambahkan!\n");
    }

    public void tampilkanSemuaMakanan() {
        System.out.println("Daftar Makanan Kering:");
        for (MakananKering mk : daftarMakananKering) {
            mk.tampilkanData();
            System.out.println();
        }

        System.out.println("Daftar Makanan Basah:");
        for (MakananBasah mb : daftarMakananBasah) {
            mb.tampilkanData();
            System.out.println();
        }
    }
}
