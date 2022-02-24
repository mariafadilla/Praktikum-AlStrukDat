import java.util.Scanner;
public class JS1Perulangan{
    public static void main(String[] args) {
        int nim, hari;
        long hasil;
        Scanner sc = new Scanner(System.in);
		System.out.println();
        System.out.println("======== PROGRAM PERULANGAN HARI ========");
        System.out.println();
        System.out.print("Masukkan NIM: ");
        hasil = sc.nextInt();
		System.out.println("=========================================");
        nim = (int) (hasil % 100);
        if (nim < 10) {
            System.out.println(nim += 10);
        } else {
            System.out.println("n : " + nim);
        }

        hari = 0;
        for (int i = 0; i < nim; i++) {
            hari++;
            if (hari >= 7) {
                hari = 0;
            }
            if (hari % 7 == 0) {
                System.out.print("Minggu ");
            } else if (hari % 6 == 0) {
                System.out.print("Sabtu ");
            } else if (hari % 5 == 0) {
                System.out.print("Jumat ");
            } else if (hari % 4 == 0) {
                System.out.print("Kamis ");
            } else if (hari % 3 == 0) {
                System.out.print("Rabu ");
            } else if (hari % 2 == 0) {
                System.out.print("Selasa ");
            } else {
                System.out.print("Senin ");
            }
        }
		System.out.println();
    }
}
