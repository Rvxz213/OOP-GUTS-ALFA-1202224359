// Don't delete any comments below!!!
// Todo : Create private attribute of MakananKering (nama, jumlah, harga, and bahan)
public class MakananBasah extends Makanan {
    private String bahan;
    // Todo : Create Constructor of MakananBasah
    public MakananBasah(String nama, int jumlah, double harga, String bahan) {
        super(nama, jumlah, harga);
        this.bahan = bahan;
    }
    // Todo : Create Getter and Setter
    @Override
    public void tampilkanData() {
   // Todo : Create Method ShowData
        super.tampilkanData();
        System.out.println("Bahan: " + bahan);
    }
}
