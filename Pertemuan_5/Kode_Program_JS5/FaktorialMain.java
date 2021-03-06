//Jobsheet 5 - Percobaan 4.2.1

import java.util.Scanner;

//membuat class baru dengan nama Faktorial
class Faktorial{

	//a. tambahkan atribut nilai
	public int nilai;
	
	//b. tambahkan method faktorialBF() nilai
	int faktorialBF(int n){
		int fakto = 1;
		for(int i=1; i<=n; i++){
		fakto *= i;
		}
		return fakto;
	}
	
	//c. tambahkan method faktorialDC() nilai
	int faktorialDC(int n){
		if(n == 1){
			return 1;
		} else {
			int fakto = n * faktorialDC(n-1);
			return fakto;
		}
	}
}

//membuat class baru FaktorialMain
public class FaktorialMain{
	public static void main(String[] args){
	
		//a.input jumlah angka yg akan dicari faktorialnya dai user
		Scanner sc = new Scanner(System.in);
		System.out.println("===============================================");
		System.out.print("Masukkan jumlah elemen yang ingin dihitung: ");
		int elemen = sc.nextInt();
	
		//b. buat Array of Objek, input beberapa nilai yg akan dihitung faktorialnya
		Faktorial [] fk = new Faktorial[elemen];
		for(int i=0; i<elemen; i++){
			fk[i] = new Faktorial();
			System.out.println("Masukkan data ke-" +(i+1)+ " : ");
			fk[i].nilai = sc.nextInt();
		}
		
		//c. tampilkan hasil pemanggilan method faktorialDC() dan faktorialBF()
		System.out.println("==============================================");
		System.out.println("Hasil faktorial dengan Brute Force");
		for(int i=0; i<elemen; i++){
			System.out.println("Faktorial dari nilai " +fk[i].nilai+ " adalah: " +fk[i].faktorialBF(fk[i].nilai));
		}
		System.out.println("==============================================");
		System.out.println("Hasil faktorial dengan Divide and Conquer");
		for(int i=0; i<elemen; i++){
			System.out.println("Faktorial dari nilai " +fk[i].nilai+ " adalah: " +fk[i].faktorialDC(fk[i].nilai));
		}
		System.out.println("==============================================");
	}
}


