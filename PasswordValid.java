package soaljavaweek;
import java.util.Scanner;

public class PasswordValid {
    public static final int PASSWORD_LENGTH = 8;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print(
                "1. Kata sandi harus memiliki setidaknya delapan karakter.\n" +
                "2. Kata sandi hanya terdiri dari huruf dan angka.\n" +
                "3. Kata sandi harus berisi setidaknya dua digit.\n" +
                "Masukkan kata sandi : ");
        String pw = input.nextLine();

        if (isPasswordValid(pw)){
            System.out.println("Kata sandi valid : " + pw);
        } else {
            System.out.println("Kata sandi tidak valid : " + pw);
        }
    }
    public static boolean isPasswordValid(String password){
        if (password.length() < PASSWORD_LENGTH) return false;

        int charCount = 0;
        int numCount = 0;

        for (int i=0; i<password.length(); i++){
            char ch = password.charAt(i);

            if (nm_Number(ch)) numCount++;
            else if (nm_letter(ch)) charCount++;
            else return false;
        }
        return (charCount >= 2 && numCount >=2);
    }

    public static boolean nm_letter (char ch){
       ch = Character.toUpperCase(ch);
        return (ch >= 'A' && ch <= 'Z');
    }

    public static boolean nm_Number(char ch){
        return (ch >= '0' && ch <= '9');
    }
}
