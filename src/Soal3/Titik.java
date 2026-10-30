
package soal3;

/**
 * Merepresentasikan titik pada bidang dua dimensi.
 */
public class Titik {
    private double x;
    private double y;

    /**
     * Membuat titik berdasarkan koordinat x dan y.
     *
     * @param x koordinat horizontal
     * @param y koordinat vertikal
     */
    public Titik(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Mengambil koordinat x.
     *
     * @return koordinat x
     */
    public double getX() {
        return x;
    }

    /**
     * Mengambil koordinat y.
     *
     * @return koordinat y
     */
    public double getY() {
        return y;
    }

    /**
     * Mengubah koordinat titik.
     *
     * @param x koordinat horizontal baru
     * @param y koordinat vertikal baru
     */
    public void setKoordinat(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Membuat salinan titik.
     *
     * @return objek Titik baru
     */
    public Titik salinan() {
        return new Titik(x, y);
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
