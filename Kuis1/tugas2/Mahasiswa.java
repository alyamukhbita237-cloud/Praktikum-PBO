package Kuis1.tugas2;

public class Mahasiswa {
    private final String nim;
    private final String nama;

    public Mahasiswa(String nim, String nama) {
        this.nama = nama;
        this.nim = nim;
    }

    public String getNim() {
        return nim;
    }
    public String getNama() {
        return nama;
    }
}
