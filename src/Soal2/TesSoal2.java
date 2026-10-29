
package soal2;

/**
 * Kelas pengujian untuk contoh pewarisan dan polimorfisme.
 */
public class TesSoal2 {

    /**
     * Menjalankan seluruh contoh pengujian Soal 2.
     *
     * @param args argumen command line
     */
    public static void main(String[] args) {
        System.out.println("=== Hewan dan Kucing ===");
        Hewan hewan = new Hewan();
        Hewan kucing = new Kucing();
        hewan.suara();
        kucing.suara();

        System.out.println("\n=== Kelas A dan B ===");
        A objekA = new A();
        A objekB = new B();
        objekA.tampilkan();
        objekB.tampilkan();

        System.out.println("\n=== Lingkaran dan Titik ===");
        Lingkaran lingkaran = new Lingkaran(7);
        Titik titik = new Titik(3, 4);
        System.out.printf("Luas lingkaran: %.2f%n",
                lingkaran.hitungLuas());
        System.out.println("Koordinat titik: ("
                + titik.getX() + ", " + titik.getY() + ")");
    }
}
