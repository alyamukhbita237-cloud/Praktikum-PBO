package P2.Tugas;

public class RuangKelasUji {
    public static void main(String[] args) {
        RuangKelas ruang1 = new RuangKelas(
                "LPR-07",
                "Teknik Sipil",
                35,
                28);

        RuangKelas ruang2 = new RuangKelas(
                "LSI-1",
                "Teknologi Informasi",
                30,
                29);

        ruang1.tampilData();
        ruang2.tampilData();
    }

}
