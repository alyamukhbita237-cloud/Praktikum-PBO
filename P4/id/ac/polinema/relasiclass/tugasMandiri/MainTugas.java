package P4.id.ac.polinema.relasiclass.tugasMandiri;

public class MainTugas {
    public static void main(String[] args) {

        // Membuat perpustakaan
        Perpustakaan perpustakaan =
                new Perpustakaan("Perpustakaan Polinema", 3);

        // Membuat anggota dari luar Petugas
        Anggota anggota =
                new Anggota("Alya");

        // Membuat petugas dan memberikan anggota
        Petugas petugas =
                new Petugas("Budi", anggota);

        // Menampilkan buku
        perpustakaan.tampilkanBuku();

        System.out.println();

        // Dependency: Anggota menggunakan Buku
        // Buku diambil dari perpustakaan
        System.out.println("Peminjaman buku:");
        Buku buku = new Buku(
                "Pemrograman Java",
                "Andi"
        );

        anggota.pinjamBuku(buku);

        System.out.println();

        // Aggregation
        petugas.layaniAnggota();
    }
}
