import java.util.Scanner;

public class SearchNilai23 {
    public static void main(String[] args) {
        Scanner ingput = new Scanner(System.in);
        System.out.print("Masukkan banyak nilai yg ingin diinput = ");
        int z = ingput.nextInt();
        int nilai[] = new int[z];
        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+" =");
            nilai[i]=ingput.nextInt();
        }
        System.out.print("Masukkan nilai yg dicari = ");
        int key = ingput.nextInt();
        boolean ditemukan = false;
        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] == key) {
                System.out.println("\nNilai " + key + " ketemu, merupakan nilai mahasiswa ke-" + (i + 1));
                ditemukan = true;
                break;
            }
        }

        if (!ditemukan) {
            System.out.println("\nNilai yang dicari tidak ditemukan.");
        }

    }
}
