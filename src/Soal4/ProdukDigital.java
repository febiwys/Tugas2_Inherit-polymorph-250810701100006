
package soal4;

/**
 * Merepresentasikan produk digital yang memiliki ukuran file
 * dan mendapatkan diskon digital.
 */
public class ProdukDigital extends Produk {
    private static final double DISKON_DIGITAL = 0.10;

    private double ukuranMb;

    /**
     * Membuat produk digital.
     *
     * @param kode kode produk
     * @param nama nama produk
     * @param hargaDasar harga dasar produk
     * @param ukuranMb ukuran file dalam MB
     * @throws IllegalArgumentException jika ukuran file tidak positif
     */
    public ProdukDigital(String kode, String nama, double hargaDasar,
                         double ukuranMb) {
        super(kode, nama, hargaDasar);

        if (ukuranMb <= 0) {
            throw new IllegalArgumentException(
                "Ukuran file harus lebih dari 0"
            );
        }

        this.ukuranMb = ukuranMb;
    }

    /**
     * Mengambil ukuran file produk digital.
     *
     * @return ukuran file dalam MB
     */
    public double getUkuranMb() {
        return ukuranMb;
    }

    /**
     * Menghitung harga setelah diskon digital 10 persen.
     *
     * @return harga setelah diskon
     */
    @Override
    public double hitungHargaAkhir() {
        return getHargaDasar() * (1 - DISKON_DIGITAL);
    }

    /**
     * Menghasilkan deskripsi produk digital.
     *
     * @return deskripsi ukuran file
     */
    @Override
    public String deskripsi() {
        return "digital " + ukuranMb + " MB";
    }
}
