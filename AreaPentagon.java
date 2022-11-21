package soaljavaweek;

import java.util.Scanner;

public class AreaPentagon {
    public static void main(String[] args) {
        int jumlahSisi, sisi;

        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Sisi : ");
        jumlahSisi = input.nextInt();
        System.out.print("Masukkan sisi : ");
        sisi = input.nextInt();
        float pentagon = (float)(5.0/2.0)*jumlahSisi*sisi;
        System.out.print("Area dari pentagon adalah : " + pentagon);
    }
}
