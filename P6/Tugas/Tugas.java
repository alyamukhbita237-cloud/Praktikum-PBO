package P6.Tugas;

public class Tugas {
    public static void main(String[] args) {

        Dosen dosen1 = new Dosen(
                "001",
                "Budi",
                "Malang");

        dosen1.setSKS(12);

        Dosen dosen2 = new Dosen(
                "002",
                "Siti",
                "Surabaya");

        dosen2.setSKS(16);

        DaftarGaji daftar = new DaftarGaji(2);

        daftar.addPegawai(dosen1);
        daftar.addPegawai(dosen2);

        daftar.printSemuaGaji();
    }
}
