
package soal2;

/**
 * Merepresentasikan lingkaran berdasarkan jari-jari.
 */
public class Lingkaran {
    protected double jariJari;

    /**
     * Membuat lingkaran baru.
     *
     * @param jariJari jari-jari lingkaran
     */
    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

    /**
     * Menghitung luas lingkaran.
     *
     * @return luas lingkaran
     */
    public double hitungLuas() {
        return Math.PI * jariJari * jariJari;
    }
}
