//JS 5 - Latihan Praktikum 4.5

import java.util.Scanner;

class Pemilu {
	String Kandidat;
	int jumlah;
	int votingPemilihan(int[] pilih, int low, int high){
		if(high - low == 1){
			if (pilih[low] >= pilih[high]){
				return pilih[low];
			}else {
				return pilih[high];
			}
		}else if(high > low){
			int tng = (high - low)/2 + low;
			int kanan = votingPemilihan(pilih, tng + 1, high);
			int kiri = votingPemilihan(pilih, low, tng);
			if(kiri != 0){
				return kiri;
		} else if(kanan != 0){
			return kanan;
		}
		return high;
		}
		return 0;
	}
}

//class Main
public class PemiluMain{
	public static void main(String[] args) {
	System.out.println();
	Scanner sc = new Scanner(System.in);
	Pemilu vote = new Pemilu();
	System.out.print("Masukkan Jumlah: ");
	vote.jumlah = sc.nextInt();
	int pilih[] = new int[vote.jumlah];
	
	System.out.println();
	String kandidat = "";
	System.out.println("===============================================================");
	System.out.println("      		   PEMILIHAN KETUA BEM 2022 ");
	System.out.println("===============================================================");
	System.out.println("---- KANDIDAT -----");
	System.out.println("1. Haris");
	System.out.println("2. Dian");
	System.out.println("3. Rani");
	System.out.println("4. Bisma");
	
	
	for(int i = 0; i < vote.jumlah ; ++i){
		System.out.print("Pilih Kandidat (1/2/3/4): ");
		pilih[i] = sc.nextInt();
	}
	System.out.println();
	
	int suara = vote.votingPemilihan(pilih, 0, vote.jumlah);
	if(suara == 1){
		vote.Kandidat = "Haris";
	} else if(suara == 2){
		vote.Kandidat = "Dian";
	} else if(suara == 3){
	vote.Kandidat = "Rani";
	} else if (suara == 4){
	vote.Kandidat = "Bisma";
	} else {
		System.out.println("Nomor Kandidat yang anda masukkan tidak tersedia");
	}
	
	System.out.println("_______________________________________________________________");
	System.out.println("Kandidat yang memiliki mayoritas suara adalah " + vote.Kandidat + " dengan nomor " + suara);
	System.out.println("===============================================================");
	}
}