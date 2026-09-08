package P1;

public class Printer {
    
    private String merk;
    private String tipe;

    public void setPrinter(String merk, String tipe) {
        this.merk = merk;
        this.tipe = tipe;
    }

    public void cetakDokumen(){
        System.out.println("Printer mencetak dokumen");
    }

    public void isiTinta() {
        System.out.println("Tinta sedang diisi");
    }

    public void printInfo() {
        System.out.println("Merk : " + merk);
        System.out.println("Tipe : " + tipe);
    }
}
