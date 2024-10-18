// Don't delete any comments below!!!
// Todo : Create private attribute of MakananKering (nama, jumlah, harga, and brand)
public class MakananKering extends Makanan {
    private String brand;
// Todo : Create private attribute of MakananKering (nama, jumlah, harga, and brand)
    public MakananKering(String nama, int jumlah, double harga, String brand) {
        super(nama, jumlah, harga);
        this.brand = brand;
    }
    // Todo : Create Getter and Setter
    @Override
    public void tampilkanData() {
    // Todo :Create Method ShowData  
        super.tampilkanData();
        System.out.println("Brand: " + brand);
    }
}