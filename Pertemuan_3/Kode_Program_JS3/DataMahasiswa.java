//JS 3 - Praktikum No.3
import java.util.Scanner;
class Data{
    public String nama, jenisKelamin;
    public int nim;
    public double ipk;
}
//Main class 
public class DataMahasiswa{
    public static void main(String[] args){
        Data[] dmArray = new Data[3];
        Scanner sc = new Scanner (System.in);

		System.out.println("======== INPUT DATA MAHASISWA ========");
        
		for(int i = 0; i < 3; i++){
            dmArray[i] = new Data(); 
				System.out.println();
				System.out.println("Masukkan data mahasiswa ke-"+ (i+1));
				System.out.print("Masukkan Nama\t\t: ");
            dmArray[i].nama = sc.next();
				System.out.print("Masukkan NIM\t\t: ");
            dmArray[i].nim = sc.nextInt();
				System.out.print("Masukkan Jenis Kelamin  : ");
            dmArray[i].jenisKelamin = sc.next();
				System.out.print("Masukkan IPK\t\t: ");
            dmArray[i].ipk = sc.nextDouble();
        }
		
        System.out.println();
        System.out.println("======== DATA MAHASISWA ========");
        
        for (int i = 0; i < 3; i++){
			System.out.println();
            System.out.println("Data Mahasiswa ke-"+ (i+1));
            System.out.println("Nama\t\t: " + dmArray[i].nama);
            System.out.println("NIM\t\t: " + dmArray[i].nim);
            System.out.println("Jenis Kelamin\t: " + dmArray[i].jenisKelamin);
            System.out.println("Nilai IPK\t: " + dmArray[i].ipk);
        }
    } 
}

