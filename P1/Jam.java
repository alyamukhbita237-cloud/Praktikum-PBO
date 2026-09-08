package P1;

public class Jam {

    private String merk;
    private String warna;

    public void setJam(String merk, String warna) {
        this.merk = merk;
        this.warna = warna;
    }

    public void tampilkanWaktu() {
        System.out.println("Jam sedang menampilkan waktu.");
    }

    public void aturWaktu() {
        System.out.println("Waktu sedang diatur");
    }

    public void printInfo() {
        System.out.println("Merk : " + merk);
        System.out.println("Warna : " + warna);
    }

}
