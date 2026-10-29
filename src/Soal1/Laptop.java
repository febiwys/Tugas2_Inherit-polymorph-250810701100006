package soal1;
/**
 * Merepresentasikan laptop sebagai perangkat elektronik.
 */
public class Laptop extends Perangkat {
    private int ramGb;
    private double ukuranLayarInci;

    /**
     * Membuat laptop baru.
     *
     * @param merek merek laptop
     * @param harga harga laptop
     * @param garansiBulan masa garansi
     * @param ramGb kapasitas RAM dalam GB
     * @param ukuranLayarInci ukuran layar dalam inci
     */
    public Laptop(String merek, double harga, int garansiBulan,
                  int ramGb, double ukuranLayarInci) {
        super(merek, harga, garansiBulan);

        if (ramGb <= 0 || ukuranLayarInci <= 0) {
            throw new IllegalArgumentException(
                "RAM dan ukuran layar harus lebih dari nol."
            );
        }

        this.ramGb = ramGb;
        this.ukuranLayarInci = ukuranLayarInci;
    }

    /**
     * Menghitung harga laptop setelah diskon.
     *
     * @param diskonPersen persentase diskon dari 0 sampai 100
     * @return harga laptop setelah diskon
     * @throws IllegalArgumentException jika diskon di luar rentang
     */
    public double hitungHargaPromo(double diskonPersen) {
        if (diskonPersen < 0 || diskonPersen > 100) {
            throw new IllegalArgumentException(
                "Diskon harus antara 0 dan 100 persen."
            );
        }

        return harga * (1 - diskonPersen / 100);
    }

    /**
     * Mengembalikan informasi singkat laptop.
     *
     * @return informasi laptop
     */
    @Override
    public String infoSingkat() {
        return super.infoSingkat()
            + " | RAM " + ramGb + " GB"
            + " | layar " + ukuranLayarInci + " inci";
    }
}
