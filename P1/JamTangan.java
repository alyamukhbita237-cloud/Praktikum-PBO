package P1;

public class JamTangan extends Jam {
    
    private String bahanTali;
    private String tipeMesin;

    public void SetJamTangan(String bahanTali, String tipeMesin) {
        this.bahanTali = bahanTali;
        this.tipeMesin = tipeMesin;
    }

    public void pakai() {
        System.out.println("Jam tangan sedang dipakai");
    }

    public void lepas() {
        System.out.println("Jam tangan dilepas");
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Bahan Tali : " + bahanTali);
        System.out.println("Tipe Mesin : " + tipeMesin);
    }
}
