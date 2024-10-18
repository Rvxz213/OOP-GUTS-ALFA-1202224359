// Don't delete any comments below!!!
public class Makanan {
    private String nama;
    private int jumlah;
    private double harga;
// Todo : Create private attribute of Makanan (nama, jumlah, and harga)
    public Makanan(String nama, int jumlah, double harga) {
        this.nama = nama;
        this.jumlah = jumlah;
        this.harga = harga;
    }
// Todo : Create Constructor of Makanan
    public String getNama() {
        return nama;
    }

    public int getJumlah() {
        return jumlah;
    }

    public double getHarga() {
        return harga;
    }
// Todo : Create Getter and Setter
    public void tampilkanData() {
        System.out.println("Nama: " + nama);
        System.out.println("Jumlah: " + jumlah);
        System.out.println("Harga: " + harga);
    }
}
