//Praktikum ASD JS 2 Tugas No.1

class Barang{
		String nama;
		int hargaSatuan, jumlah;

		int hitungHargaTotal(){
			return jumlah*hargaSatuan;
		}

		int hitungDiskon(){
			int ht = hitungHargaTotal();
			double diskon;
			if (ht>100000){
				diskon=0.10;
			} else if (ht>=50000 && ht<=100000){
				diskon=0.05;
			} else{
				diskon=0;
			}
			return (int) (diskon*ht);
		}

		int hitungHargaBayar(){
			return hitungHargaTotal() - hitungDiskon();
		}
		
		void tampilBarang(){
			System.out.println("Nama Barang: " +nama);
			System.out.println("Harga Satuan: " +hargaSatuan);
			System.out.println("Jumlah:" +jumlah);
			System.out.println("Harga Total: " +hitungHargaTotal());
			System.out.println("Diskon: " +hitungDiskon());
			System.out.println("Total Bayar: " +hitungHargaBayar());
		}
}

public class BarangMainTugas1{
	public static void main (String[] args){
		Barang b1 = new Barang();
		b1.nama = "Baju";
		b1.hargaSatuan = 65000;
		b1.jumlah = 2;
		b1.tampilBarang();
	}
}

