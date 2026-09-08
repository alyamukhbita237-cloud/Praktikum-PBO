package P1;

public class TV {

    private int ukuranLayar;
    private String resolusi;

    public void setTV(int ukuranLayar, String resolusi) {
        this.ukuranLayar = ukuranLayar;
        this.resolusi = resolusi;
    }

    public void nyalakan() {
        System.out.println("TV dihidupkan");
    }

    public void gantiChannel() {
        System.out.println("Channel diganti");
    }

    public void aturVolume() {
        System.out.println("Volume sedang diatur");
    }

    public void printInfo() {
        System.out.println("Ukuran Layar : " + ukuranLayar + " inch");
        System.out.println("Resolusi : " + resolusi);
    }

}
