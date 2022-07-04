//Maria Fadilla TI 1G - JS 6 Percobaan 5.2.1
 
import java.util.Scanner;

class Mahasiswa {
	//deklarasi atribut
    String nama;
    int thnMasuk, umur;
    double ipk;
	
	//membuat konstruktor berparameter
    Mahasiswa(String n, int t, int u, double i){
        nama = n;
        thnMasuk = t;
        umur = u;
        ipk = i;
    }
	
	//membuat fungsi atau method tampil
    void tampil(){
        System.out.println("Nama = "+nama);
        System.out.println("Tahun Masuk = "+thnMasuk);
        System.out.println("Umur = "+umur);
        System.out.println("IPK = "+ipk);
    }
}

class DaftarMahasiswaBerprestasi {
	
	//deklarasi dan instansiasi objek array 
    Mahasiswa listMhs[] = new Mahasiswa[5];
    int idx;
	
	/*menambahkan method tambah() u/ menambahkan objek 
	dr class Mahasiswa ke dlm atribut listMhs*/
        void tambah(Mahasiswa m){
        if(idx < listMhs.length){
            listMhs[idx] = m;
            idx++;
        }else{
			System.out.println("Data sudah penuh!");
        }
    }  
	
	/*menambahkan method tampil() untuk menampilkan 
	semua data mahasiswa yg ada di dlm class*/
    void tampil(){
        for(Mahasiswa m : listMhs){
            m.tampil();
            System.out.println("-------------------");
        }
    }
	
	//menambahkan method bubbleSort()
    void bubbleSort(){
        for(int i = 0; i < listMhs.length-1; i++){
            for(int j = 1; j < listMhs.length-i; j++){
                if(listMhs[j].ipk > listMhs[j-1].ipk){
                    //dibawah ini proses swap atau penukaran
                    Mahasiswa tmp = listMhs[j];
                    listMhs[j] = listMhs[j-1];
                    listMhs[j-1] = tmp;
                }
            }
        }
    }
	
	//menambahkan method selectionSort()
    void selectionSort(){
        for (int i = 0; i < listMhs.length-1; i++){
            int idxMin = i;
            for(int j = i+1; j < listMhs.length; j++){
                if(listMhs[j].ipk < listMhs[idxMin].ipk){
                    idxMin = j;
                }
            }
            Mahasiswa tmp = listMhs[idxMin];
            listMhs[idxMin] = listMhs[i];
            listMhs[i] = tmp;
        }
    }
	
	//menambahkan method insertionSort()
    void insertionSort(boolean asc){
       for (int i = 1; i < listMhs.length; i++){
            Mahasiswa temp = listMhs[i];
            int j = i;
            if (asc){
                while(j > 0 && listMhs[j - 1].ipk > temp.ipk){
                listMhs[j] = listMhs[j - 1];
                j--;
				}
            }else{
                while(j > 0 && listMhs[j - 1].ipk < temp.ipk){
                listMhs[j] = listMhs[j - 1];
                j--;
				}
            }
            listMhs[j] = temp;
        }
    }
}

public class MahasiswaMain {
	public static void main(String[] args) {
		DaftarMahasiswaBerprestasi list = new DaftarMahasiswaBerprestasi();
		Mahasiswa m1 = new Mahasiswa("Nusa", 2017, 25, 3);
		Mahasiswa m2 = new Mahasiswa("Rara", 2012, 19, 4);
		Mahasiswa m3 = new Mahasiswa("Dompu", 2018, 19, 3.5);
		Mahasiswa m4 = new Mahasiswa("Abdul", 2017, 23, 2);
		Mahasiswa m5 = new Mahasiswa("Ummi", 2019, 21, 3.75);
		
		/*menambahkan semua objek mahasiswa dan memanggil 
		fungsi tambah untuk mengecek apakah data yg ada sesuai*/
		list.tambah(m1);
		list.tambah(m2);
		list.tambah(m3);
		list.tambah(m4);
		list.tambah(m5);
		
		System.out.println("Data mahasiswa sebelum sorting = ");
		list.tampil();
		
		//memanggil method bubble sort
		System.out.println("Data mahasiswa setelah sorting desc berdasarkan ipk");
		list.bubbleSort();
		list.tampil();
		
		//memanggil method selection sort
		System.out.println("Data mahasiswa setelah sorting asc berdasarkan ipk");
		list.selectionSort();
		list.tampil();
		
		/*memanggil method insertion sort
		System.out.println("Data mahasiswa setelah sorting asc berdasarkan ipk");
		list.insertionSort();
		list.tampil();*/
		
		//memanggil method insertion sort modifikasi jawaban pertanyaan 5.4.3
		System.out.println("Data mahasiswa setelah sorting asc berdasarkan ipk");
		Scanner sc = new Scanner(System.in);
		System.out.print("Apakah ascending? (true/false) : ");
		boolean asc = sc.nextBoolean();
		list.insertionSort(asc);
		list.tampil();
	}
}


