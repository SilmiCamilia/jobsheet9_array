import java.util.Scanner;

public class SearchNilai23 {
    public static void main(String[] args) {
        Scanner ingput = new Scanner(System.in);
        int[] nilai = {80, 85, 78, 96, 90, 82, 86};
        int key = 90;
        int hasil = 0;
        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] == key) {
                hasil=i;
                break;
            }
        }
        System.out.println();
        System.out.println("Nilai "+key+" Ketemu di indeks ke-"+hasil);
        System.out.println();

    }
}
