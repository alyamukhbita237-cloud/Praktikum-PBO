package P1;

public class Demo {
    public static void main(String[] args) {
        Jam jam = new Jam();
        JamTangan jamTangan = new JamTangan();
        JamDinding jamDinding = new JamDinding();
        TV televisi = new TV();
        Printer print = new Printer();

        System.out.println("===== Jam =====");
        jam.setJam("Casio", "Cokelat");
        jam.tampilkanWaktu();
        jam.aturWaktu();
        jam.printInfo();
        System.out.println();

        System.out.println("===== Jam Tangan =====");
        jamTangan.setJam("Casio", "Cokelat");
        jamTangan.SetJamTangan("Kulit", "Quartz");
        jamTangan.tampilkanWaktu();
        jamTangan.pakai();
        jamTangan.lepas();
        jamTangan.printInfo();
        System.out.println();

        System.out.println("===== Jam Dinding =====");
        jamDinding.setJam("Seiko", "Biru Putih");
        jamDinding.SetJamDinding("Bulat", 30);
        jamDinding.tampilkanWaktu();
        jamDinding.gantungkan();
        jamDinding.berdetak();
        jamDinding.printInfo();
        System.out.println("");

        System.out.println("===== TV =====");
        televisi.setTV(50, "4K");
        televisi.nyalakan();
        televisi.gantiChannel();
        televisi.aturVolume();
        televisi.printInfo();
        System.out.println();

        System.out.println("===== Printer =====");
        print.setPrinter("Epson", "L3110");
        print.cetakDokumen();
        print.isiTinta();
        print.printInfo();
        System.out.println();

    }
    
}
