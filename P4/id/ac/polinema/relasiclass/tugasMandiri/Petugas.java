package P4.id.ac.polinema.relasiclass.tugasMandiri;

public class Petugas {
    private String nama;
    private Anggota anggotaDilayani;

    public Petugas(String nama, Anggota anggotaDilayani) {
        this.nama = nama;
        this.anggotaDilayani = anggotaDilayani;
    }

    public void layaniAnggota() {
        System.out.println(
            nama + " melayani anggota "
            + anggotaDilayani.getNama()
        );
    }
}

