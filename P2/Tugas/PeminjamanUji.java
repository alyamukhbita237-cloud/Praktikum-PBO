package P2.Tugas;

public class PeminjamanUji {
    public static void main(String[] args) {
        Peminjaman peminjaman1 = new Peminjaman(
            "P001", 
            "Alya", 
            "Dasar Pemrograman", 
            0);

        Peminjaman peminjaman2 = new Peminjaman(
            "P002", 
            "Athia", 
            "Metode Numerik", 
            3);

        Peminjaman peminjaman3 = new Peminjaman(
            "P003", 
            "Cindy", 
            "Sistem Operasi", 
            10);

        System.out.println("=== Data Peminjaman ===");
        peminjaman1.tampilData();
        peminjaman2.tampilData();
        peminjaman3.tampilData();
    }
    
}
