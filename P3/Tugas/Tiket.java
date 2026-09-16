package P3.Tugas;

public class Tiket {
    private String judulFilm;
    private double hargaDasar;
    private boolean StatusPembayaran;

    public Tiket(String judulFilm, double hargaDasar) {
        this.judulFilm = judulFilm;
        this.StatusPembayaran = false;
        if (hargaDasar < 0) {
            this.hargaDasar = 35000;
        } else {
            this.hargaDasar = hargaDasar;
        }
    }

    public String getJudulFilm() {
        return judulFilm;
    }

    public void setJudulFilm(String judulFilm) {
        this.judulFilm = judulFilm;
    }

    public double getHargaDasar() {
        return hargaDasar;
    }

    public void setHargaDasar(double hargaDasar) {
        if (hargaDasar < 0) {
            this.hargaDasar = 35000;
        } else {
            this.hargaDasar = hargaDasar;
        }
    }

    public boolean isStatusPembayaran() {
        return StatusPembayaran;
    }

    public void lakukanPembayaran() {
        StatusPembayaran = true;
    }

}
