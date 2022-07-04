//Maria Fadilla TI 1G - JS 6 Latihan Praktikum 5.5

import java.util.Scanner;  

class TiketPesawat {
	//deklarasi variabel
    String maskapai, tujuan, asal;
    int harga;
	
	//membuat konstruktor berparameter
    TiketPesawat(String m, int h, String a, String t){
        maskapai = m;
        harga = h;
        asal = a;
        tujuan = t;          
    }
	
    void tampil(){
        System.out.println("Nama Maskapai = " + maskapai);
        System.out.println("Harga Tiket   = " + harga);
        System.out.println("Asal          = " + asal);
        System.out.println("Tujuan        = " + tujuan);
    }
}

class LayananTiketPesawat {
   TiketPesawat tkt[] = new TiketPesawat[5];
    int qty;
	
	//method tambah tiket 
    void tambah(TiketPesawat t){
        if(qty < tkt.length){
            tkt[qty] = t;
            qty++;
        }else{
            System.out.println("Tiket Pesawat Max!");
        }
    }
	
	//method tampil semua data
    void tampil(){
        for (TiketPesawat t : tkt){
            t.tampil();
			System.out.println("------------------------------------------------");
        }
    }
	
	//method filter tiket dengan bubble sort
    void bubbleSort(){
        for(int i = 0; i < tkt.length; i++){
            for(int j = i+1; j < tkt.length; j++){
                if(tkt[j].harga > tkt[j-1].harga){
                    // swap dari kecil ke besar (asc)
                    TiketPesawat tmp = tkt[j];
                    tkt[j] = tkt[j-1];
                    tkt[j-1] = tmp;
                }
            }
        }
    }
	
	//method filter tiket dengan selection sort 
    void selectionSort(){
        for(int i = 0; i < tkt.length; i++){
            int idxMin = i;
            for(int j = i+1; j<tkt.length; j++){
                if(tkt[j].harga < tkt[idxMin].harga){
                    idxMin = j;
                }
				//swap 
                TiketPesawat tmp = tkt[idxMin];
                tkt[idxMin] = tkt[i];
                tkt[i] = tmp;
            }          
        }
    }                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          
}

public class TiketPesawatMain {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//membuat objek daftar tiket pesawat
        LayananTiketPesawat daftar = new LayananTiketPesawat();
		
		//instansiasi objek 
        TiketPesawat tkt1 = new TiketPesawat("Lion Air \t", 850000, "Surabaya", "Jakarta");
        TiketPesawat tkt2 = new TiketPesawat("Citilink \t\t", 1130000, "Jakarta", "Balikpapan");
        TiketPesawat tkt3 = new TiketPesawat("Garuda Indonesia \t", 3200000, "Kendari", "Lombok");
        TiketPesawat tkt4 = new TiketPesawat("Batik Air\t", 2890000, "Jakarta", "Sorong");
        TiketPesawat tkt5 = new TiketPesawat("Lion Air \t", 600000, "Denpasar", "Palangkaraya");
		
		//memanggil method tambah
        daftar.tambah(tkt1);
        daftar.tambah(tkt2);
        daftar.tambah(tkt3);
        daftar.tambah(tkt4);
        daftar.tambah(tkt5);
        
		System.out.println("====== Daftar Tiket Pesawat Sebelum di Filter (Sorting) ======");
		daftar.tampil();
        System.out.println();
        System.out.println("Termahal - Termurah : ");
        System.out.println("====== Tiket Penerbangan Domestik (Bubble Sort) ======");
		daftar.bubbleSort();
        daftar.tampil();
        System.out.println();
        System.out.println("Termurah - Termahal : ");
        System.out.println("======= Tiket Penerbangan Domestik (Selection Sort) =======");
		daftar.selectionSort();
        daftar.tampil();
    }
}

