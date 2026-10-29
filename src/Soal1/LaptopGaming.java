package soal1;
/**
 * Merepresentasikan laptop gaming dengan garansi tambahan.
 */
public class LaptopGaming extends Laptop {
    private String kartuGrafis;

    private static final int TAMBAHAN_GARANSI_BULAN = 6;

    /**
     * Membuat laptop gaming baru.
     *
     * @param merek merek laptop
     * @param harga harga laptop
     * @param garansiBulan masa garansi awal
     * @param ramGb kapasitas RAM dalam GB
     * @param ukuranLayarInci ukuran layar dalam inci
     * @param kartuGrafis jenis kartu grafis
     */
    public LaptopGaming(String merek, double harga, int garansiBulan,
                        int ramGb, double ukuranLayarInci,
                        String kartuGrafis) {
        super(merek, harga, garansiBulan + TAMBAHAN_GARANSI_BULAN,
              ramGb, ukuranLayarInci);

        if (kartuGrafis == null || kartuGrafis.trim().isEmpty()) {
            throw new IllegalArgumentException(
                "Kartu grafis tidak boleh kosong."
            );
        }

        this.kartuGrafis = kartuGrafis;
    }

    /**
     * Mengembalikan informasi singkat laptop gaming.
     *
     * @return informasi laptop gaming beserta kartu grafis
     */
    @Override
    public String infoSingkat() {
        return super.infoSingkat() + " | GPU " + kartuGrafis;
    }
}
