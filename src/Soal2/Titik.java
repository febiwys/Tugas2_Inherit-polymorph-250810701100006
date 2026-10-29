
package soal2;

/**
 * Merepresentasikan titik pada bidang dua dimensi.
 */
public class Titik extends Lingkaran {
    private double x;
    private double y;

    /**
     * Membuat titik dengan koordinat x dan y.
     *
     * @param x koordinat horizontal
     * @param y koordinat vertikal
     */
    public Titik(double x, double y) {
        super(0);
        this.x = x;
        this.y = y;
    }

    /**
     * Mengembalikan koordinat horizontal.
     *
     * @return koordinat x
     */
    public double getX() {
        return x;
    }

    /**
     * Mengembalikan koordinat vertikal.
     *
     * @return koordinat y
     */
    public double getY() {
        return y;
    }
}
