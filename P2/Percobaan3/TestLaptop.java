package P2.Percobaan3;

public class TestLaptop {
    public static void main(String[] args) {
        Laptop lab1 = new Laptop();
        lab1.kodeInventaris = "LAB-JTI-017";
        lab1.merk = "Lenovo ThinkPad E14";
        lab1.ramGB = 8;
        lab1.tampilSpesifikasi();
        // memanggil method dengan argumen dan nilai balik
        System.out.println("RAM setelah upgrade : "
                + lab1.upgradeRam(8) + "8");

        System.out.println("Harga sewa 3 hari : RP "
                + lab1.hitunHargaSewa(3));
    }

}
