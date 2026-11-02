
package soal4;

/**
 * Merepresentasikan produk fisik yang memiliki berat
 * dan dikenakan biaya pengiriman.
 */
public class ProdukFisik extends Produk {
    private static final double ONGKOS_KIRIM_PER_KG = 10000.0;

    private double beratKg;

    /**
     * Membuat produk fisik.
     *
     * @param kode kode produk
     * @param nama nama produk
     * @param hargaDasar harga dasar produk
     * @param beratKg berat produk dalam kilogram
     * @throws IllegalArgumentException jika berat tidak positif
     */
    public ProdukFisik(String kode, String nama, double hargaDasar,
                       double beratKg) {
        super(kode, nama, hargaDasar);

        if (beratKg <= 0) {
            throw new IllegalArgumentException(
                "Berat produk harus lebih dari 0"
            );
        }

        this.beratKg = beratKg;
    }

    /**
     * Menghitung harga produk beserta biaya pengiriman.
     *
     * @return harga dasar ditambah biaya pengiriman
     */
    @Override
    public double hitungHargaAkhir() {
        return getHargaDasar() + (beratKg * ONGKOS_KIRIM_PER_KG);
    }

    /**
     * Menghasilkan deskripsi produk fisik.
     *
     * @return deskripsi berat produk
     */
    @Override
    public String deskripsi() {
        return "fisik " + beratKg + " kg";
    }
}
