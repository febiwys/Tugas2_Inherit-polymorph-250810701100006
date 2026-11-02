
package soal4;

/**
 * Kelas untuk merepresentasikan produk digital.
 */
public class Digital extends Product {
    private double ukuranFile;
    private String formatFile;

    /**
     * Membuat produk digital.
     *
     * @param id ID produk
     * @param nama nama produk
     * @param harga harga produk
     * @param ukuranFile ukuran file dalam MB
     * @param formatFile format file
     */
    public Digital(String id, String nama, double harga,
                   double ukuranFile, String formatFile) {
        super(id, nama, harga);

        if (ukuranFile <= 0) {
            throw new IllegalArgumentException("Ukuran file harus lebih dari 0");
        }
        if (formatFile == null || formatFile.isBlank()) {
            throw new IllegalArgumentException("Format file tidak boleh kosong");
        }

        this.ukuranFile = ukuranFile;
        this.formatFile = formatFile;
    }

    /**
     * Menghitung harga akhir produk digital.
     * @return harga akhir produk
     */
    @Override
    public double hitungHargaAkhir() {
        return getHarga();
    }

    /**
     * Menampilkan informasi produk digital.
     * @return informasi produk
     */
    @Override
    public String toString() {
        return super.toString()
                + ", Ukuran File: " + ukuranFile + " MB"
                + ", Format: " + formatFile;
    }
}
