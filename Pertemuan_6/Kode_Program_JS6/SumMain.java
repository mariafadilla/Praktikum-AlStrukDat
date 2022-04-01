//JS 5 - Percobaan 4.4.1

import java.util.Scanner;

//membuat class baru dengan nama Sum
class Sum {

	//1. terdapat atribut jumlah elemen array, array, dan juga total. Tambahkan pula konstruktor pada class Sum
	public int elemen;
	public double keuntungan[];
	public double total;
	
	Sum(int elemen){
		this.elemen = elemen;
		this.keuntungan = new double[elemen];
		this.total = 0;
	}
	
	//2. tambahkan method TotalBF() yang akan menghitung total nilai array dengan cara iterative
	double totalBF(double arr[]){
		for (int i = 0; i < elemen; i++) {
			total = total + arr[i];
		}
		return total;
	}

	//3. tambahkan method TotalDC() untuk implementasi perhitungan nilai total array menggunakan algoritma Divide and Conquer
	double totalDC(double arr[], int l, int r){
		if(l==r){
			return arr[l];
		} else if(l<r){
			int mid = (l+r)/2;
			double lsum = totalDC(arr, l, mid-1);
			double rsum = totalDC(arr, mid+1, r);
			return lsum + rsum + arr[mid];
		}
		return 0;
	}
}

//membuat class baru berisi method Main
public class SumMain {
	public static void main(String[] args) {
	
	//4. input user bulan keuntungan yg dihitung. Dalam kelas ini dibuat instansiasi objek u/ memanggil atribut /pun fungsi pd class Sum
	Scanner sc = new Scanner(System.in);
	System.out.println("=====================================================");
	System.out.println("Program Menghitung Keuntungan Total (Satuan Juta, Misal 5.9)");
	System.out.print("Masukkan jumlah bulan : ");
	int elm = sc.nextInt();
	
	//5. pembuatan objek Sum
	Sum sm = new Sum(elm);
	System.out.println("=====================================================");
	for(int i =0; i<sm.elemen; i++){
		System.out.print("Masukkan untung bulan ke-"+(i+1)+" = ");
		sm.keuntungan[i]= sc.nextDouble();
	}

	//6. tampilkan hasil perhitungan melalui objek yg telah dibuat u/ kedua cara yg ada (Brute Force dan Divide and Conquer)
	System.out.println("=====================================================");
	System.out.println("Algoritma Brute Force");
	System.out.println("Total keuntungan perusahaan selama "+sm.elemen+" bulan adalah = "+sm.totalBF(sm.keuntungan));
	System.out.println("=====================================================");
	System.out.println("Algoritma Divide and Conquer");
	System.out.println("Total keuntungan perusahaan selama "+sm.elemen+" bulan adalah = "+sm.totalDC(sm.keuntungan, 0, sm.elemen-1));
	}
}