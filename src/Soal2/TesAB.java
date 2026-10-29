
package soal2;

/**
 * Menguji pewarisan dan polimorfisme kelas A dan B.
 */
public class TesAB {

    /**
     * Menjalankan pengujian kelas A dan B.
     *
     * @param args argumen command line
     */
    public static void main(String[] args) {
        A objekA = new A();
        A objekB = new B();

        objekA.tampilkan();
        objekB.tampilkan();
    }
}
