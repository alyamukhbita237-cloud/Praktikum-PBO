package P1;

public class JamDinding extends Jam {

    private String bentuk;
    private int ukuran;

    public void SetJamDinding(String bentuk, int ukuran) {
        this.bentuk = bentuk;
        this.ukuran = ukuran;
    }

    public void gantungkan() {
        System.out.println("Jam dinding digantung di dinding");
    }

    public void berdetak () {
        System.out.println("Jam dinding sedang berdetak");
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Bentuk : " + bentuk);
        System.out.println("Ukuran : " + ukuran + " cm");
    }
}
