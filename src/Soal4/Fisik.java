
package soal4;

/**
 * Kelas untuk merepresentasikan produk fisik.
 */
public class Fisik extends Product {
    private double berat;
    private double biayaPengiriman;

    /**
     * Membuat produk fisik.
     *
     * @param id ID produk
     * @param nama nama produk
     * @param harga harga produk
     * @param berat berat produk dalam kilogram
     * @param biayaPengiriman biaya pengiriman
     */
    public Fisik(String id, String nama, double harga,
                 double berat, double biayaPengiriman) {
        super(id, nama, harga);

        if (berat <= 0) {
            throw new IllegalArgumentException("Berat harus lebih dari 0");
        }
        if (biayaPengiriman < 0) {
            throw new IllegalArgumentException("Biaya pengiriman tidak boleh negatif");
        }

        this.berat = berat;
        this.biayaPengiriman = biayaPengiriman;
    }

    /**
     * Menghitung harga produk beserta biaya pengiriman.
     * @return total harga
     */
    @Override
    public double hitungHargaAkhir() {
        return getHarga() + biayaPengiriman;
    }

    /**
     * Menampilkan informasi produk fisik.
     * @return informasi produk
     */
    @Override
    public String toString() {
        return super.toString()
                + ", Berat: " + berat + " kg"
                + ", Biaya Pengiriman: Rp" + biayaPengiriman;
    }
}
