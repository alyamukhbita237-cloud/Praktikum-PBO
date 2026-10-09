package P7.Tugas.Overriding;

public class Main {
    public static void main(String[] args) {
        Manusia m1 = new Dosen();
        Manusia m2 = new Mahasiswa();

        System.out.println("=== Objek Dosen ===");
        m1.bernafas();
        m1.makan();

        System.out.println("\n=== Objek Mahasiswa ===");
        m2.bernafas();
        m2.makan();
    }
}
