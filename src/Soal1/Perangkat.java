package soal1;
/**
 * Merepresentasikan perangkat elektronik.
 * Menyimpan merek, harga, dan masa garansi perangkat.
 */
public class Perangkat {
    private String merek;
    protected double harga;
    private int garansiBulan;

    private static final double TARIF_PAJAK = 0.10;

    /**
     * Membuat perangkat elektronik baru.
     *
     * @param merek merek perangkat, tidak boleh kosong
     * @param harga harga perangkat, tidak boleh negatif
     * @param garansiBulan masa garansi dalam bulan
     * @throws IllegalArgumentException jika merek kosong,
     * harga negatif, atau garansi negatif
     */
    public Perangkat(String merek, double harga, int garansiBulan) {
        if (merek == null || merek.trim().isEmpty()) {
            throw new IllegalArgumentException("Merek tidak boleh kosong.");
        }
        if (harga < 0) {
            throw new IllegalArgumentException("Harga tidak boleh negatif.");
        }
        if (garansiBulan < 0) {
            throw new IllegalArgumentException("Garansi tidak boleh negatif.");
        }

        this.merek = merek;
        this.harga = harga;
        this.garansiBulan = garansiBulan;
    }

    /**
     * Mengembalikan merek perangkat.
     *
     * @return merek perangkat
     */
    public String getMerek() {
        return merek;
    }

    /**
     * Mengembalikan masa garansi perangkat.
     *
     * @return masa garansi dalam bulan
     */
    public int getGaransiBulan() {
        return garansiBulan;
    }

    /**
     * Menghitung pajak sebesar 10 persen dari harga.
     *
     * @return nilai pajak perangkat
     */
    public double hitungPajak() {
        return harga * TARIF_PAJAK;
    }

    /**
     * Menampilkan informasi singkat perangkat.
     *
     * @return informasi merek dan masa garansi
     */
    public String infoSingkat() {
        return merek + " | garansi " + garansiBulan + " bulan";
    }
}
