//123180144
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nilai[] = new int[5];
        int max = 0;
        int min = 100;
        float jum = 0;
        float avg;
        
        System.out.print("Nama: ");
        String nama = scanner.nextLine();
        
        for (int i = 0; i < nilai.length ; i++) {
            System.out.print("Nilai ke-" + (i+1) + " : ");
            nilai[i] = scanner.nextInt();
            if(nilai[i] >= max){
                max = nilai[i];
            }
            if(nilai[i] <= min){
                min = nilai[i];
            }
            jum = jum += nilai[i];
        }
        avg = jum / nilai.length;
        
        System.out.println(" ");
        System.out.println("Nama: " + nama);
        System.out.println("Nilai Tertinggi: " + max);
        System.out.println("Nilai Terendah: " + min);
        System.out.println("Rata-rata: " + avg);
    }
}