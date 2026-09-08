package P2.Tugas;

public class MataKuliahUji {
    public static void main(String[] args) {
        MataKuliah mk1 = new MataKuliah(
                "BD001",
                "Basis Data",
                4,
                3.5);

        MataKuliah mk2 = new MataKuliah(
                "BDL002",
                "Basis Data Lanjut",
                5,
                3.8);

        MataKuliah mk3 = new MataKuliah(
                "DP001",
                "Dasar Pemrograman",
                3,
                3.75);

        System.out.println("=== Data Mata Kuliah ===");
        mk1.tampilData();
        mk2.tampilData();
        mk3.tampilData();

        double totalBobot = mk1.hitungBobotNilai()
                + mk2.hitungBobotNilai()
                + mk3.hitungBobotNilai();

        System.out.println("Total Bobot Nilai : " + totalBobot);
    }

}
