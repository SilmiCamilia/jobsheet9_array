import java.util.Scanner;

public class ArrayNilai23 {
    public static void main(String[] args) {
        Scanner uwo = new Scanner(System.in);
        int[] nilaiAkhir = new int[10];
        for (int i = 0; i < nilaiAkhir.length; i++) {
            System.out.println("Masukkan nilai akhir ke-"+i+" : ");
            nilaiAkhir[i]=uwo.nextInt();
        }
        for (int i = 0; i < nilaiAkhir.length; i++) {
            if(nilaiAkhir[i]>=78){
                System.out.println("Nilai akhir ke-"+i+" lulus!");
            }
            else if(nilaiAkhir[i]<78){
                System.out.println("Nilai akhir ke-"+i+" Tidak Lulus!");
            }
        }
    }
}
