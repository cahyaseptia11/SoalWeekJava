package soaljavaweek;

import com.oracle.xmlns.internal.webservices.jaxws_databinding.SoapBindingParameterStyle;

import java.util.Scanner;

public class CountVocal {
    public static void main(String[] args) {
        String data = "hellooghhii";

        Scanner scan = new Scanner(System.in);
        int hurufHidup = 0;
        int panjangTeks = data.length();
        for (int i=0; i<panjangTeks; i++){
            char kar = Character.toLowerCase(data.charAt(i));
            if (kar == 'a' || kar == 'e' || kar == 'i' || kar == 'o' || kar == 'u')
                hurufHidup ++;
        }
        System.out.println("Jumlah huruf vokal : " + hurufHidup);

    }
}
