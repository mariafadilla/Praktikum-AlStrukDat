public class Barang1 {
	String namaBarang, jenisBarang;
	int stok, hargaSatuan;
	
	//modifikasi pada 2.4.1 - konstruktor default dan berparameter
	Barang(){
	}
	Barang(String nm, String jn, int st, int hs){
		namaBarang = nm;
		jenisBarang = jn;
		stok = st;
		hargaSatuan = hs;
	}
	
	void tampilBarang(){
		System.out.println("Nama Barang: " + namaBarang);
		System.out.println("Jenis Barang: " + jenisBarang);
		System.out.println("Stok: " + stok);
		System.out.println("Harga Satuan: " + hargaSatuan);
	}
	
	void tambahStok(int n){
		stok=stok+n;
	}
	
	//modifikasi pada 2.2.3
	void kurangiStok(int n){
		if(stok > n){
		stok=stok-n;
		}
		else{
			System.out.println("Stok Kosong");
		}
	}
	
	int hitungHargaTotal(int jumlah){
		return jumlah*hargaSatuan;
	}
}



