
package soal3;

/**
 * Menguji komposisi dan defensive copy pada kelas Titik dan Garis.
 */
public class TesSoal3 {

    /**
     * Menjalankan pengujian kelas Titik dan Garis.
     *
     * @param args argumen command line
     */
    public static void main(String[] args) {
        Titik awal = new Titik(2, 3);
        Titik akhir = new Titik(6, 6);

        Garis garis = new Garis(awal, akhir);

        System.out.println("=== Pengujian Garis ===");
        System.out.println(garis);
        System.out.printf("Panjang garis: %.2f%n",
                garis.hitungPanjang());

        System.out.println("\n=== Pengujian Defensive Copy ===");

        // Mengubah titik asli setelah garis dibuat.
        awal.setKoordinat(100, 100);

        System.out.println("Titik awal asli setelah diubah: " + awal);
        System.out.println("Titik awal dalam garis: "
                + garis.getTitikAwal());

        // Mengubah titik yang diperoleh dari getter.
        Titik salinan = garis.getTitikAkhir();
        salinan.setKoordinat(200, 200);

        System.out.println("Titik akhir hasil perubahan salinan: "
                + salinan);
        System.out.println("Titik akhir dalam garis: "
                + garis.getTitikAkhir());
    }
}
