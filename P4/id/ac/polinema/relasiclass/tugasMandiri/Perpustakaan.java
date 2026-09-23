package P4.id.ac.polinema.relasiclass.tugasMandiri;

public class Perpustakaan {
    private String nama;
    private Buku[] daftarBuku;

    public Perpustakaan(String nama, int jumlahBuku) {
        this.nama = nama;
        this.daftarBuku = new Buku[jumlahBuku];

        // Composition: Perpustakaan membuat objek Buku
        for (int i = 0; i < daftarBuku.length; i++) {
            daftarBuku[i] = new Buku(
                    "Buku " + (i + 1),
                    "Penulis " + (i + 1));
        }
    }

    public void tampilkanBuku() {
        System.out.println("Perpustakaan: " + nama);
        for (Buku buku : daftarBuku) {
            System.out.println(buku.info());
        }
    }
}
