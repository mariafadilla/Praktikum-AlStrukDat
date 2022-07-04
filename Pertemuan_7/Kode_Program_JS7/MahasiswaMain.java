//JS 7 - Percobaan 6.2.1 - Sequential Search

import java.util.Scanner;

//3. buat class Mahasiswa dan deklarasi atribut
class Mahasiswa{
	int nim;
	String nama;
	int umur;
	double ipk;

//4. buat konstruktor Mahasiswa dg parameter (int ni, String n, int u, double i)
	Mahasiswa(int ni, String n, int u, double i){
		nim = ni;
		nama = n;
		umur = u;
		ipk = i;
	}

//5. buat method tampil() bertipe void 
	void tampil(){
		System.out.println("Nim = " + nim);
		System.out.println("Nama = " + nama);
		System.out.println("Umur = " + umur);
		System.out.println("IPK = " + ipk);
	}
}
	
//6. buat class baru PencarianMhs
class PencarianMhs{
	Mahasiswa listMhs[] = new Mahasiswa[5];
	int idx;

//7. buat method tambah() u/ +objek dr class Mahasiswa ke dlm atribut listMhs
	void tambah(Mahasiswa m){
		if(idx < listMhs.length){
			listMhs[idx] = m;
			idx++;
		} else{
			System.out.println("Data sudah penuh !!");
		}
	}
	
//8. buat method tampil() di dlm class PencarianMhs u/ tampil semua data mhs yg ada
	void tampil(){
		for(Mahasiswa m : listMhs){
			m.tampil();
			System.out.println("-----------------------------");
		}
	}
	
/*9. tambah method FindSeqSearch tipe int dg parameter cari tipe int
lalu deklarasi isi method dg teknik sequential searching*/
	public int FindSeqSearch(int cari){
		int posisi = -1;
		for(int j=0; j<listMhs.length; j++){
			if(listMhs[j].nim == cari){
				posisi = j;
				break;
			}
		}
		return posisi;
	}

//JS 7 - Percobaan 6.3.1 - Binary Seacrh
/*1. tambah method FindBinarySearch tipe int pd class PencarianMhs 
lalu deklarasi isi method dg teknik binary searching*/
	public int FindBinarySearch(int cari, int left, int right){
		int mid;
		if(right >= left){
			mid = (left+right)/2;
			if(cari == listMhs[mid].nim){
				return (mid);
			} else if(listMhs[mid].nim > cari){
				return FindBinarySearch(cari, left, mid-1);
			} else{
				return FindBinarySearch(cari, mid+1, right);
			}
		}
		return -1;
	}

//10. buat method Tampilposisi tipe void dan deklarasi isi method
	public void Tampilposisi(int x, int pos){
		if(pos != -1){
			System.out.println("data : " + x + " ditemukan pada indeks " + pos);
		} else{
			System.out.println("data : " + x + " tidak ditemukan");
		}
	}

//11. buat method TampilData tipe void dan deklarasi isi method
	public void TampilData(int x, int pos){
		if(pos != -1){
			System.out.println("Nim\t : " + x);
			System.out.println("Nama\t : " + listMhs[pos].nama);
			System.out.println("Umur\t : " + listMhs[pos].umur);
			System.out.println("IPK\t : " + listMhs[pos].ipk);
		} else{
			System.out.println("data : " + x + " tidak ditemukan");
		}
	}
}

//12. buat class baru MahasiswaMain +method main
public class MahasiswaMain{
	public static void main(String[] args){
		
/*13. buat objek PencarianMhs + 5 objek Mahasiswa 
+semua obj mhs tsb. dg memanggil fungsi tambah pd obj PencarianMhs*/
	Scanner s = new Scanner(System.in);
	Scanner s1 = new Scanner(System.in);
	
	PencarianMhs data = new PencarianMhs();
	int jumMhs = 5;
	
	System.out.println("-------------------------------------------------------");
	System.out.println("Masukkan data mahasiswa secara urut dari Nim terkecil :");
	for(int i=0; i<jumMhs; i++){
		System.out.println("--------------------------------");
		System.out.print("Nim\t: ");
		int nim = s.nextInt();
		System.out.print("Nama\t: ");
		String nama = s1.nextLine();
		System.out.print("Umur\t: ");
		int umur = s.nextInt();
		System.out.print("IPK\t: ");
		double ipk = s.nextDouble();
		
		Mahasiswa m = new Mahasiswa(nim, nama, umur, ipk);
		data.tambah(m);
	}

//14. panggil method tampil() u/ melihat smeua input data
	System.out.println("-----------------------------------------------------------");
	System.out.println("Data Keseluruhan Mahasiwa : ");
	data.tampil();

/**15. buat variabel cari lalu panggil method FindSeqSearch dg parameter variabel cari
u/ cari berdasarkan nim**/
	System.out.println("___________________________________________________________");
	System.out.println("___________________________________________________________");
	System.out.println("Pencarian Data");
	System.out.println("Masukkan Nim Mahasiswa yang dicari: ");
	System.out.print("NIM : ");
	int cari = s.nextInt();
	System.out.println("= menggunakan Sequential Search =");
	int posisi = data.FindSeqSearch(cari);
	
//16. panggil method Tampilposisi dr class PencarianMhs
	data.Tampilposisi(cari, posisi);
	
//17. panggil method TampilData dr class PencarianMhs
	data.TampilData(cari, posisi);
	
//JS 7 - Percobaan 6.3.1
/*Panggil method FindBinarySearch pd class PencarianMhs di kelas Mahasiswamain
lalu panggil method tampilposisi dan tampilData*/
	System.out.println("========================================");
	System.out.println("= menggunakan Sequential Search =");
	posisi = data.FindBinarySearch(cari, 0, jumMhs - 1);
	data.Tampilposisi(cari, posisi);
	data.TampilData(cari, posisi);
	}
}
	
	
	