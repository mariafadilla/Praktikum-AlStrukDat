//JS 3 Percobaan 1

//2. Membuat Class Persegi Panjang
public class PersegiPanjang{
	public int panjang;
	public int lebar;
	
	//3. Membuat Array Persegi Panjang berisi 3 elemen
	public static void main (String[] args){
		PersegiPanjang[] ppArray = new PersegiPanjang[3];
	
	//4. Mengisikan masing-masing atributnya
	ppArray[0] = new PersegiPanjang();
	ppArray[0].panjang = 110;
	ppArray[0].lebar = 30;
	
	ppArray[1] = new PersegiPanjang();
	ppArray[1].panjang = 80;
	ppArray[1].lebar = 40;
	
	ppArray[2] = new PersegiPanjang();
	ppArray[2].panjang = 100;
	ppArray[2].lebar = 20;
	
	//5. Cetak semua atribut dari objek ppArray
	System.out.println("Persegi Panjang ke-0, panjang: " + ppArray[0].panjang + ", lebar: " + ppArray[0].lebar);
	System.out.println("Persegi Panjang ke-1, panjang: " + ppArray[1].panjang + ", lebar: " + ppArray[1].lebar);
	System.out.println("Persegi Panjang ke-2, panjang: " + ppArray[2].panjang + ", lebar: " + ppArray[2].lebar);
	}
}
	
	
	
	