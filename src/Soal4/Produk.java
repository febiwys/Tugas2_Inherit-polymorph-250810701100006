
package soal4;

/**
 * Kelas induk abstrak untuk seluruh jenis produk.
 */
public abstract class Produk {
    private String kode;
    private String nama;
    private double hargaDasar;

    /**
     * Membuat objek produk.
     *
     * @param kode kode produk
     * @param nama nama produk
     * @param hargaDasar harga dasar produk
     * @throws IllegalArgumentException jika data tidak valid
     */
    public Produk(String kode, String nama, double hargaDasar) {
        if (kode == null || kode.trim().isEmpty()) {
            throw new IllegalArgumentException("Kode tidak boleh kosong");
        }
        if (nama == null || nama.trim().isEmpty()) {
            throw new IllegalArgumentException("Nama tidak boleh kosong");
        }
        if (hargaDasar < 0) {
            throw new IllegalArgumentException("Harga dasar tidak boleh negatif");
        }

        this.kode = kode;
        this.nama = nama;
        this.hargaDasar = hargaDasar;
    }

    /** @return kode produk */
    public String getKode() {
        return kode;
    }

    /** @return nama produk */
    public String getNama() {
        return nama;
    }

    /** @return harga dasar produk */
    public double getHargaDasar() {
        return hargaDasar;
    }

    /** @return harga akhir produk */
    public abstract double hitungHargaAkhir();

    /** @return deskripsi produk */
    public abstract String deskripsi();
}
