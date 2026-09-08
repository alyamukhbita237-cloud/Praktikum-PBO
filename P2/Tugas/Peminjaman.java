package P2.Tugas;

public class Peminjaman {
    private String idTransaksi;
    private String namaPeminjam;
    private String judulBuku;
    private int jumlahKeterlambatan;
    private int denda;

    public Peminjaman(String idTransaksi,
            String namaPeminjam,
            String judulBuku,
            int jumlahKeterlambatan) {
        this.idTransaksi = idTransaksi;
        this.namaPeminjam = namaPeminjam;
        this.judulBuku = judulBuku;
        this.jumlahKeterlambatan = jumlahKeterlambatan;
        this.denda = 0;
    }

    public int hitungDenda() {
        denda = jumlahKeterlambatan * 1000;
        return denda;
    }

    public void tampilData() {
        System.out.println();
        System.out.println("ID Transaksi        : " + idTransaksi);
        System.out.println("Nama Peminjam       : " + namaPeminjam);
        System.out.println("Judul Buku          : " + judulBuku);
        System.out.println("Hari Keterlambatan  : " + jumlahKeterlambatan + " hari");
        System.out.println("Denda               : Rp " + hitungDenda());
    }

}
