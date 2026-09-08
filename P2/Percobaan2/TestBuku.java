package P2.Percobaan2;

public class TestBuku {
    public static void main(String[] args) {
        Buku buku1 = new Buku();
        buku1.isbn = "978-979-29-6104-2";
        buku1.judul = "Dasar Pemrograman Berbasis Objek";
        buku1.penulis = "Abdul Kadir";
        buku1.tahunTerbit = 2021;

        try {
            buku1.tampilInfoBuku();
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan");
        }
        System.out.println();

        Buku buku2 = new Buku();
        buku2.isbn = "978-979-29-6104-3";
        buku2.judul = "Algoritma dan Struktur Data";
        buku2.penulis = "Budi Santoso";
        buku2.penerbit = "Gramedia";
        buku2.tahunTerbit = 2020;
        buku2.tampilInfoBuku();
        System.out.println();

        Buku buku3 = new Buku();
        buku3.isbn = "978-979-29-6104-4";
        buku3.judul = "Sistem Operasi";
        buku3.penulis = "Andi Wijaya";
        buku3.penerbit = "Sinar Terang Media";
        buku3.tahunTerbit = 2019;
        buku3.tampilInfoBuku();
    }
}
