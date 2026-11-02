
package soal4;

/**
 * Kelas pengujian untuk mini project toko digital.
 */
public class TesSoal4 {

    /**
     * Menjalankan pengujian produk dan keranjang belanja.
     *
     * @param args argumen command line
     */
    public static void main(String[] args) {
        Keranjang keranjang = new Keranjang();

        // Menambahkan tiga jenis produk.
        keranjang.tambah(
            new ProdukFisik("F01", "Keyboard Mekanik", 500000, 1.5)
        );

        keranjang.tambah(
            new ProdukDigital("D01", "Ebook Java", 100000, 20)
        );

        keranjang.tambah(
            new Langganan("L01", "Kelas Online", 150000, 20, 12)
        );

        // Menampilkan struk dan jumlah produk.
        System.out.println("=== STRUK BELANJA ===");
        keranjang.cetakStruk();

        System.out.println();
        keranjang.hitungPerJenis();

        // Menguji penanganan kode produk duplikat.
        System.out.println();
        System.out.println("=== UJI EXCEPTION ===");

        try {
            keranjang.tambah(
                new ProdukFisik("F01", "Mouse", 100000, 0.2)
            );
        } catch (IllegalStateException e) {
            System.out.println("Gagal: " + e.getMessage());
        }
    }
}
