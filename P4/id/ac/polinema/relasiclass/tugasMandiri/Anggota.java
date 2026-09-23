package P4.id.ac.polinema.relasiclass.tugasMandiri;

public class Anggota {
    private String nama;

    public Anggota(String nama) {
        this.nama = nama;
    }

    public void pinjamBuku(Buku buku) {
        System.out.println(
            nama + " meminjam " + buku.info()
        );
    }

    public String getNama() {
        return nama;
    }
}

