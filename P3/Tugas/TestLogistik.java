package P3.Tugas;

import java.util.Scanner;

public class TestLogistik {
    public static void main(String[] args) {
        Scanner alya = new Scanner(System.in);
        Kontainer kontainerAlfa = new Kontainer("REQ-9988","PT. Maju Bersama", 5000);

        System.out.println("===SISTEM MANAJEMEN KONTAINER===");
        System.out.println("Nomor Resi : " + kontainerAlfa.getNomorResi());
        System.out.println("Nama Pemilik : " + kontainerAlfa.getNamaPemilik());
        System.out.println("Kapasitas Maksimal : " + kontainerAlfa.getKapasitasMaksimal()+ " kg");

        System.out.print("\nMasukkan berat muatan yang ditambah(kg) : ");
        double tambah = alya.nextDouble();
        kontainerAlfa.tambahMuatan(tambah);
        System.out.print("Muatan saat ini : "+ kontainerAlfa.getBeratMuatanSaatIni()+" kg");

        System.out.println();
        System.out.print("\nMasukkan berat muatan yang dibongkar(kg) : ");
        double turun = alya.nextDouble();
        kontainerAlfa.turunkanMuatan(turun);
        System.out.print("Muatan saat ini : "+ kontainerAlfa.getBeratMuatanSaatIni()+" kg");

        alya.close();
    }
    
}
