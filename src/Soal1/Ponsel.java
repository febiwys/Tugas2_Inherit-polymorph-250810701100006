package soal1;
/**
 * Merepresentasikan ponsel sebagai perangkat elektronik.
 */
public class Ponsel extends Perangkat {
    private int kapasitasGb;
    private int jumlahKamera;

    /**
     * Membuat ponsel baru.
     *
     * @param merek merek ponsel
     * @param harga harga ponsel
     * @param garansiBulan masa garansi dalam bulan
     * @param kapasitasGb kapasitas penyimpanan dalam GB
     * @param jumlahKamera jumlah kamera
     */
    public Ponsel(String merek, double harga, int garansiBulan,
                  int kapasitasGb, int jumlahKamera) {
        super(merek, harga, garansiBulan);

        if (kapasitasGb <= 0 || jumlahKamera <= 0) {
            throw new IllegalArgumentException(
                "Kapasitas dan jumlah kamera harus lebih dari nol."
            );
        }

        this.kapasitasGb = kapasitasGb;
        this.jumlahKamera = jumlahKamera;
    }

    /**
     * Mengembalikan informasi singkat ponsel.
     *
     * @return informasi ponsel
     */
    @Override
    public String infoSingkat() {
        return super.infoSingkat()
            + " | " + kapasitasGb + " GB"
            + " | " + jumlahKamera + " kamera";
    }
}
