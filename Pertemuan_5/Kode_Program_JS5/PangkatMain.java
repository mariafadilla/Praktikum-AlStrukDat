//JS 5 - Percobaan 4.3.1

import java.util.Scanner;

//membuat class baru dengan nama Pangkat
class Pangkat{
	
	//1. buat atribut angka yang akan dipangkatkan sekaligus dg angka pemangkatnya
	public int nilai, pangkat;
	
	//2. tambahkan method PangkatBF()
	public int PangkatBF(int a , int n){
		int hasil =1;
		for(int i =1; i<=n; i++){
			hasil = hasil * a;
		}
		return hasil;
	}
	
	//3. tambahkan method PangkatDC()
	public int PangkatDC(int a , int n){
		if(n ==0){
			return 1;
		} else {
			if(n%2==1){ //bilangan ganjil
				return (PangkatDC(a,n/2)*PangkatDC(a,n/2)*a);
			}
			else{ //bilangan genap
				return (PangkatDC(a,n/2)*PangkatDC(a,n/2));
			}
		}
	}
}

//membuat class baru yg terdapat method main
public class PangkatMain {
	public static void main(String[] args){
	
	//5. tambahkan kode untuk menginputkan jumlah nilai yg akan dihitung pangkatnya
	Scanner input = new Scanner(System.in);
	System.out.println("==================================================");
	System.out.print("Masukkan jumlah elemen yang ingin dihitung: ");
	int elemen = input.nextInt();
	
	//6. tambahkan proses pengisian beberapa nilai yg akan dipangkatkan sekaligus dg pemangkatnya (instansiasi ArrofObj)
	Pangkat[] png = new Pangkat[elemen];
	for(int i = 0; i< elemen; i++){
		png[i]= new Pangkat();
		System.out.print("Masukkan Nilai yang akan dipangkatkan ke- "+(i+1)+" : ");
		png[i].nilai = input.nextInt();
		System.out.print("Masukkan Nilai Pemangkat ke- "+(i+1)+" : ");
		png[i].pangkat = input.nextInt();
	}
	
	//7. panggil hasil dg mengeluarkan return value dari method PangkatBF() dan PangkatDC().
	System.out.println("==================================================");
	System.out.println("Hasil Faktorial dengan Brute Force");
	for(int i = 0; i < elemen; i++){
		System.out.println("Faktorial dari Nilai"+png[i].nilai+" Adalah : "+png[i].PangkatBF(png[i].nilai,png[i].pangkat));
	}
	System.out.println("==================================================");
	System.out.println("Hasil Faktorial dengan Divide and Conquer");
	for(int i = 0; i < elemen; i++){
		System.out.println("Faktorial dari Nilai"+png[i].nilai+" Adalah : "+png[i].PangkatDC(png[i].nilai,png[i].pangkat));
	}
	System.out.println("==================================================");
	}
}

