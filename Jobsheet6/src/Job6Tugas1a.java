//created by Rani Nabilla Putri_21343034
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Job6Tugas1a {
     public static void main(String[] args) {
        BufferedReader nilai = new BufferedReader(new InputStreamReader(System.in));
        String a = "";
        String b = "";
        String c = "";
        try {
            System.out.print("Masukkan nilai pertama Anda: ");
            a = nilai.readLine();
            System.out.print("Masukkan nilai kedua Anda: ");
            b = nilai.readLine();
            System.out.print("Masukkan nilai ketiga Anda: ");
            c = nilai.readLine();
        } catch (IOException e) {
            System.out.println("Kata yang Anda masukkan salah, silahkan coba lagi.");
        }
        int pertama;
        int kedua;
        int ketiga;
        pertama = Integer.parseInt(a);
        kedua = Integer.parseInt(b);
        ketiga = Integer.parseInt(c);
        int rata_rata = (pertama + kedua + ketiga) / 3;
        System.out.println("Rata-rata nilai Anda: " + rata_rata);
        if (rata_rata <= 60) {
            System.out.println(":-(");
        } else {
            System.out.println(":-)");
        }
    }
}