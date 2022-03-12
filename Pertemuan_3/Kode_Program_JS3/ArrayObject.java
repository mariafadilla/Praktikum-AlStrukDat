//JS 3 Percobaan 2

//1. import Scanner
import java.util.Scanner;

class PersegiPanjang{
	public int panjang, lebar;
}
	
public class ArrayObject{
	public static void main (String[] args){
		PersegiPanjang[] ppArray = new PersegiPanjang[3];
	
	/**2. Membuat objek Scanner untuk menerima input, 
	kemudian melakukan looping untuk menerima input:**/
	
	Scanner sc = new Scanner(System.in);
	
	for(int i=0; i<3; i++)
	{
	ppArray[i] = new PersegiPanjang();
	System.out.println("Persegi Panjang ke-" +i);
	System.out.print("Masukkan panjang: ");
	ppArray[i].panjang = sc.nextInt();
	System.out.print("Masukkan lebar: ");
	ppArray[i].lebar = sc.nextInt();
	}
	
	//3. Cetak semua atribut menggunakan looping
	for(int i=0; i<3; i++)
	{
	System.out.println("Persegi Panjang ke-" +i);
	System.out.println("Panjang: " + ppArray[i].panjang + ", Lebar: " + ppArray[i].lebar);
	}
	
	}
}
	
	
	
	