
package soal2;

/**
 * Menguji pewarisan dan polimorfisme pada kelas Hewan.
 */
public class TesHewan {

    /**
     * Menjalankan pengujian suara hewan.
     *
     * @param args argumen dari command line
     */
    public static void main(String[] args) {
        Hewan hewan = new Hewan();
        Hewan kucing = new Kucing();

        hewan.suara();
        kucing.suara();
    }
}
