// created by Rani Nabilla Putri_21343034
import java.util.Scanner;

public class Job6Lat3_PercabanganIfElseIf {
    public static void main (String []args){
        double grade = 92.0;

        if(grade >= 90) {
            System.out.println("Excellent!");
        }
        /*Untuk menentukan kondisi yang mempunyai nilai rentangan maka
        tentukan nilai batas atas dan batas bawah setelah itu digabungkan
        dengan logika AND (&&)*/

        else if((grade < 90) && (grade >= 80)) { // 80 s.d 89
            System.out.println("Good job!");
        }
        else if((grade < 80) && (grade >= 60)) { // 60 s.d 79
            System.out.println("Study harder!");
        }
        else {
            System.out.println("Sorry, you failed.");
        }
    }
}