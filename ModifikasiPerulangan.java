import java.util.Scanner;
public class ModifikasiPerulangan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nilai, lulus = 0, tidak_lulus = 100;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ");
            nilai = sc.nextDouble();
            if (nilai > lulus) {
                lulus = nilai;
            }
            if (nilai < tidak_lulus) {
                tidak_lulus = nilai;
            }
        }
        System.out.println("Lulus: " + lulus);
        System.out.println("Tidak lulus: " + tidak_lulus);
    }
    
}
