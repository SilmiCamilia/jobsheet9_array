import java.util.Scanner;

public class ArrayRataNilai23 {
    public static void main(String[] args) {
        Scanner iyup = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa : ");
        int jumlah = iyup.nextInt();

        int[] nilaiMhs = new int[jumlah];
        int totalLulus = 0, totalTidakLulus = 0;
        int jmlLulus = 0, jmlTidakLulus = 0;

        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + " : ");
            nilaiMhs[i] = iyup.nextInt();

            if (nilaiMhs[i] >= 70) {
                totalLulus += nilaiMhs[i];
                jmlLulus++;
            } else {
                totalTidakLulus += nilaiMhs[i];
                jmlTidakLulus++;
            }
        }

        double rataLulus = (jmlLulus > 0) ? (double) totalLulus / jmlLulus : 0;
        double rataTidakLulus = (jmlTidakLulus > 0) ? (double) totalTidakLulus / jmlTidakLulus : 0;

        System.out.println("Jumlah mahasiswa yang lulus = "+jmlLulus);
        System.out.println("Rata-rata nilai lulus = " + rataLulus);
        System.out.println("Rata-rata nilai tidak lulus = " + rataTidakLulus);
    }
}
