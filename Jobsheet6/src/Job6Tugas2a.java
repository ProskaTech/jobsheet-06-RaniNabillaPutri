//created by Rani Nabilla Putri_21343034
import javax.swing.JOptionPane;

public class Job6Tugas2a {
     public static void main(String[] args) {
        String angka = "";
        angka = JOptionPane.showInputDialog("Silahkan masukkan angka ");
        int input = Integer.valueOf(angka).intValue();
        String hasil = "";

        hasil += "Angka yang dimasukkan  : " +angka +"\n" ;
        if (input >= 1 && input <= 10) {
            hasil += "Valid number";

        } else {
            hasil += "Invalid Number";

        }

        JOptionPane.showMessageDialog(null, hasil);
    }
}