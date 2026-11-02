
package soal4;

import java.util.ArrayList;

/**
 * Mengelola kumpulan produk dalam keranjang belanja.
 */
public class Keranjang {
    private final ArrayList<Produk> daftarProduk;

    /**
     * Membuat keranjang belanja kosong.
     */
    public Keranjang() {
        daftarProduk = new ArrayList<>();
    }

    /**
     * Menambahkan produk ke dalam keranjang.
     *
     * @param produk produk yang akan ditambahkan
     * @throws IllegalArgumentException jika produk null
     * @throws IllegalStateException jika kode produk sudah ada
     */
    public void tambah(Produk produk) {
        if (produk == null) {
            throw new IllegalArgumentException("Produk tidak boleh null");
        }

        for (Produk item : daftarProduk) {
            if (item.getKode().equals(produk.getKode())) {
                throw new IllegalStateException(
                    "Kode produk " + produk.getKode()
                    + " sudah ada di keranjang"
                );
            }
        }

        daftarProduk.add(produk);
    }

    /**
     * Menghitung total harga seluruh produk.
     *
     * @return total harga keranjang
     */
    public double hitungTotal() {
        double total = 0;

        for (Produk produk : daftarProduk) {
            total += produk.hitungHargaAkhir();
        }

        return total;
    }

    /**
     * Mencetak struk belanja dan total pembayaran.
     */
    public void cetakStruk() {
        for (Produk produk : daftarProduk) {
            System.out.printf(
                "%s | %s | %s | Rp%.0f%n",
                produk.getKode(),
                produk.getNama(),
                produk.deskripsi(),
                produk.hitungHargaAkhir()
            );
        }

        System.out.printf("TOTAL: Rp%.0f%n", hitungTotal());
    }

    /**
     * Menghitung jumlah produk berdasarkan jenisnya.
     * Langganan diperiksa terlebih dahulu karena merupakan
     * turunan dari ProdukDigital.
     */
    public void hitungPerJenis() {
        int jumlahFisik = 0;
        int jumlahDigital = 0;
        int jumlahLangganan = 0;

        for (Produk produk : daftarProduk) {
            if (produk instanceof Langganan) {
                Langganan langganan = (Langganan) produk;
                jumlahLangganan++;
            } else if (produk instanceof ProdukFisik) {
                ProdukFisik fisik = (ProdukFisik) produk;
                jumlahFisik++;
            } else if (produk instanceof ProdukDigital) {
                ProdukDigital digital = (ProdukDigital) produk;
                jumlahDigital++;
            }
        }

        System.out.printf(
            "Fisik: %d, Digital: %d, Langganan: %d%n",
            jumlahFisik, jumlahDigital, jumlahLangganan
        );
    }
}
