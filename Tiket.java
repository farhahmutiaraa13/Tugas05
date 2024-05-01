// Kelas abstrak untuk semua jenis tiket
abstract class Tiket {
    // Do your magic here
    private String jenis;
    private int harga;

    // konstruktor
    public Tiket(String jenis, int harga) {
        this.jenis = jenis;
        this.harga = harga;
    }

    public int getHarga() {
        return harga;
    }

    public String getJenis() {
        return jenis;
    }
}
