import java.util.Scanner;
public class JS1Tugas2{
    public static void main(String[] args){
        int menu;
        double v, s, t;
        do{
            Scanner sc = new Scanner(System.in);
			System.out.println();
			System.out.println("=============== PRAKTIKUM TUGAS 2 ===============");
			System.out.println();
			System.out.println("----- Menghittung Kecepatan - Jarak - Waktu -----");
            System.out.println("Pilih Menu : ");
            System.out.println("1. Rumus Kecepatan");
            System.out.println("2. Rumus Jarak");
            System.out.println("3. Rumus Waktu");
            System.out.println("4. Quit");
            System.out.print("Pilihan Menu (1/2/3/4) : ");
            menu = sc.nextInt();
			System.out.println();
            switch(menu){
                case 1 : {
                    System.out.println("Menu 1. Perhitungan Rumus Kecepatan");
                    kecepatan();
                }break;
                case 2 : {
                    System.out.println("Menu 2. Perhitungan Rumus Jarak");
                    jarak();
                }break;
                case 3 : {
                    System.out.println("Menu 3. Perhitungan Rumus Waktu");
                    waktu();
                }break;
                case 4 : {
                    System.out.println("Menu 4. QUIT - Terimakasih^^");
                }break;
                default : {
                    System.out.println("Maaf Input Menu Anda Salah!");
                }
            }
        }while(menu > 0 && menu < 3);
    }
	
	private static void kecepatan(){
        double v, s, t, hasil;
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jarak (km)\t     : ");
        s = sc.nextDouble();
        System.out.print("Masukkan waktu (jam)\t     : ");
        t = sc.nextDouble();
        hasil = s/t;
        System.out.print("=> Kecepatan Yang Dihasilkan : " + hasil + (" km/jam") );
        System.out.println();
    }

    private static void jarak(){
        double v, s, t, hasil;
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Kecepatan (km/jam)  : ");
        v = sc.nextDouble();
        System.out.print("Masukkan waktu (jam)\t     : ");
        t = sc.nextDouble();
        hasil = v*t;
        System.out.println("=> Jarak Yang Ditempuh\t     : " + hasil + " km");
        System.out.println();
    }
	
	 private static void waktu(){
        double v, s, t, hasil;
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jarak (km)\t     : ");
        s = sc.nextDouble();
        System.out.print("Masukkan kecepatan (km/jam)  : ");
        v = sc.nextDouble();
        hasil = s/v;
        System.out.println("=> Waktu Yang Ditempuh\t     : " + hasil + " jam");
        System.out.println();
    }
}
