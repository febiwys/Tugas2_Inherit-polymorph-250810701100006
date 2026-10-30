
package soal4;

/**
 * Kelas induk abstrak untuk semua jenis produk.
 */
public abstract class Product {
    private String id;
    private String nama;
    private double harga;

    /**
     * Membuat produk baru.
     *
     * @param id identitas produk
     * @param nama nama produk
     * @param harga harga produk
     */
    public Product(String id, String nama, double harga) {
        if (id == null || id.isBlank()) {
            throw new IllegalArgumentException("ID tidak boleh kosong");
        }
        if (nama == null || nama.isBlank()) {
            throw new IllegalArgumentException("Nama tidak boleh kosong");
        }
        if (harga < 0) {
            throw new IllegalArgumentException("Harga tidak boleh negatif");
        }

        this.id = id;
        this.nama = nama;
        this.harga = harga;
    }

    /**
     * Mengambil ID produk.
     * @return ID produk
     */
    public String getId() {
        return id;
    }

    /**
     * Mengambil nama produk.
     * @return nama produk
     */
    public String getNama() {
        return nama;
    }

    /**
     * Mengambil harga produk.
     * @return harga produk
     */
    public double getHarga() {
        return harga;
    }

    /**
     * Menghitung harga akhir produk.
     * @return harga akhir
     */
    public abstract double hitungHargaAkhir();

    /**
     * Menampilkan informasi produk.
     * @return informasi produk
     */
    @Override
    public String toString() {
        return nama + " (ID: " + id + "), Harga: Rp" + harga;
    }
}
