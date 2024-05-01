// Kelas untuk menyimpan informasi pemesanan tiket
class Pemesanan {
    private String nama;
    private String tahap;
    private Tiket tiket;
    private int jumlah;

    public Pemesanan(String nama, String tahap, Tiket tiket, int jumlah) {
        this.nama = nama;
        this.tahap = tahap;
        this.tiket = tiket;
        this.jumlah = jumlah;
    }

    public void cetakNota() {
        // Do your magic here
        int totalHarga = hitungTotalHarga();

        System.out.println("\n===== NOTA PEMESANAN =====");
        System.out.println("Nama Pembeli: " + nama);
        System.out.println("Tahap Pembelian: " + tahap);
        System.out.println("Jenis Tiket: " + tiket.getJenis());
        System.out.println("Jumlah Tiket: " + jumlah);
        System.out.println("Total Harga: Rp " + String.format("%.1f", (double) totalHarga));
        System.out.println("==========================");
    }

    // Metode untuk menghitung total harga pemesanan
    private int hitungTotalHarga() {
        int totalHarga = tiket.getHarga() * jumlah;
        if (tahap.equalsIgnoreCase("presale")) {
            // Diskon 20% untuk tahap presale
            totalHarga = (int) (totalHarga * 0.8);
        }
        return totalHarga;
    }
}