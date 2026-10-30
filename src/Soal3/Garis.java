
package soal3;

/**
 * Merepresentasikan garis yang memiliki dua titik ujung.
 */
public class Garis {
    private Titik titikAwal;
    private Titik titikAkhir;

    /**
     * Membuat garis berdasarkan dua titik.
     *
     * @param titikAwal titik awal garis
     * @param titikAkhir titik akhir garis
     */
    public Garis(Titik titikAwal, Titik titikAkhir) {
        this.titikAwal = titikAwal.salinan();
        this.titikAkhir = titikAkhir.salinan();
    }

    /**
     * Mengambil salinan titik awal.
     *
     * @return salinan titik awal
     */
    public Titik getTitikAwal() {
        return titikAwal.salinan();
    }

    /**
     * Mengambil salinan titik akhir.
     *
     * @return salinan titik akhir
     */
    public Titik getTitikAkhir() {
        return titikAkhir.salinan();
    }

    /**
     * Menghitung panjang garis.
     *
     * @return panjang garis
     */
    public double hitungPanjang() {
        double dx = titikAkhir.getX() - titikAwal.getX();
        double dy = titikAkhir.getY() - titikAwal.getY();

        return Math.sqrt(dx * dx + dy * dy);
    }

    @Override
    public String toString() {
        return "Garis dari " + titikAwal + " ke " + titikAkhir;
    }
}
