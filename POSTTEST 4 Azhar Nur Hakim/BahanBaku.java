// Kelas Induk (Superclass)
public class BahanBaku {
    private String nama;
    private int stok;
    private String satuan;

    public BahanBaku(String nama, int stok, String satuan) {
        this.nama = nama;
        this.stok = stok;
        this.satuan = satuan;
    }

    // getters dan setters
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public String getSatuan() {
        return satuan;
    }

    public void setSatuan(String satuan) {
        this.satuan = satuan;
    }

    // Fungsi overloading untuk menambahkan stok secara absolut
    public void tambahStok(int jumlah) {
        this.stok += jumlah;
    }

    // Fungsi overloading untuk menambahkan stok secara relatif
    public void tambahStok(double persentase) {
        this.stok += (int) (this.stok * persentase);
    }
}
