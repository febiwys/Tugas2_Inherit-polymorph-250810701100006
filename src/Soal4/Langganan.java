
package soal4;

/**
 * Merepresentasikan produk langganan digital
 * dengan durasi penggunaan dalam bulan.
 */
public class Langganan extends ProdukDigital {
    private static final double DISKON_LANGGANAN = 0.20;
    private static final int BATAS_DISKON_BULAN = 12;

    private int durasiBulan;

    /**
     * Membuat produk langganan.
     *
     * @param kode kode produk
     * @param nama nama produk
     * @param hargaDasar harga dasar per bulan
     * @param ukuranMb ukuran file dalam MB
     * @param durasiBulan durasi langganan dalam bulan
     * @throws IllegalArgumentException jika durasi tidak positif
     */
    public Langganan(String kode, String nama, double hargaDasar,
                     double ukuranMb, int durasiBulan) {
        super(kode, nama, hargaDasar, ukuranMb);

        if (durasiBulan <= 0) {
            throw new IllegalArgumentException(
                "Durasi langganan harus lebih dari 0 bulan"
            );
        }

        this.durasiBulan = durasiBulan;
    }

    /**
     * Menghitung harga langganan berdasarkan durasi.
     * Diskon 20 persen berlaku untuk durasi minimal 12 bulan.
     *
     * @return total harga langganan
     */
    @Override
    public double hitungHargaAkhir() {
        double total = getHargaDasar() * durasiBulan;

        if (durasiBulan >= BATAS_DISKON_BULAN) {
            total *= (1 - DISKON_LANGGANAN);
        }

        return total;
    }

    /**
     * Menghasilkan deskripsi produk langganan.
     *
     * @return deskripsi durasi langganan
     */
    @Override
    public String deskripsi() {
        return "langganan " + durasiBulan + " bulan";
    }
}
