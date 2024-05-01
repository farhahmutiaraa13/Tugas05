import java.util.Scanner;

public class PesanTiketApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Selamat datang di program pemesanan tiket!");

        // Do your magic here
        // Meminta input dari pengguna
        System.out.print("Masukkan nama pembeli: ");
        String nama = scanner.nextLine();

        // Menampilkan opsi tahap pembelian
        System.out.println("\nPilih tahap pembelian :");
        System.out.println("1. Presale");
        System.out.println("2. Reguler");
        System.out.print("Pilih tahap pembelian (1/2) : ");
        String tahap = scanner.nextLine();

        Tiket tiket = null;
        // Memilih tahap pembelian dan menyesuaikan opsi jenis tiket
        switch (tahap) {
            case "1": // Presale
                System.out.println("\nPilih jenis tiket :");
                System.out.println("1. VIP");
                System.out.println("2. VVIP");
                System.out.print("Pilih jenis tiket (1/2) : ");
                String jenisTiketPresale = scanner.nextLine();
                switch (jenisTiketPresale) {
                    case "1":
                        tiket = new VIP(150);
                        break;
                    case "2":
                        tiket = new VVIP(200);
                        break;
                    default:
                        System.out.println("Jenis tiket tidak valid!");
                        System.exit(0);
                }
                break;
            case "2": // Reguler
                System.out.println("\nPilih jenis tiket :");
                System.out.println("1. Festival");
                System.out.println("2. VIP");
                System.out.println("3. VVIP");
                System.out.print("Pilih jenis tiket (1/2/3) : ");
                String jenisTiketReguler = scanner.nextLine();
                switch (jenisTiketReguler) {
                    case "1":
                        tiket = new Festival(100);
                        break;
                    case "2":
                        tiket = new VIP(150);
                        break;
                    case "3":
                        tiket = new VVIP(200);
                        break;
                    default:
                        System.out.println("Jenis tiket tidak valid!");
                        System.exit(0);
                }
                break;
            default:
                System.out.println("Tahap pembelian tidak valid!");
                System.exit(0);
        }

        // Meminta input jumlah tiket yang ingin dibeli
        System.out.print("\nMasukkan jumlah tiket yang ingin dibeli : ");
        int jumlahTiket = Integer.parseInt(scanner.nextLine());

        Pemesanan pemesanan = new Pemesanan(nama, tahap.equals("1") ? "Presale" : "Reguler", tiket, jumlahTiket);
        pemesanan.cetakNota();

        // Menutup scanner
        scanner.close();
    }
}