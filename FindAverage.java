package soaljavaweek;

import java.util.Scanner;

public class FindAverage {
    public static void main(String[] args) {
        int i, total = 0, jumlahData, nilai;
        float rata;
        Scanner avg = new Scanner(System.in);
        System.out.print("Input jumlah data : ");
        jumlahData = avg.nextInt();

        for (i=0; i<jumlahData; i++){
            System.out.print("Nilai : ");
            nilai = avg.nextInt();
            total += nilai;
        }

        rata = total/jumlahData;
        System.out.println("Rata-rata nilainya adalah : " + rata);
    }
}
