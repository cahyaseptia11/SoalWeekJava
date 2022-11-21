package soaljavaweek;

import java.util.Scanner;

public class FindMinValue {
    public static void main(String[] args) {
        int jumlahData, i, arrayValue[];
        float min;

        Scanner minValue = new Scanner(System.in);
        System.out.print("Input jumlah data : ");
        jumlahData = minValue.nextInt();
        arrayValue = new int[jumlahData];


        for (i=0; i<jumlahData; i++){
            System.out.print("Nilai : " );
            arrayValue[i] = minValue.nextInt();
        }
        min = arrayValue[0];

       for (i=0; i<jumlahData; i++){
           if (arrayValue[i] < min){
               min = arrayValue[i];
           }
       }

        System.out.println("Nilai minimum-nya adalah : " + min);
    }
}
