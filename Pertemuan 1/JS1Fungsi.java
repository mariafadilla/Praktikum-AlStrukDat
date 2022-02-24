import java.util.Scanner;
	public class JS1Fungsi{
		static int total;
		static int stokBunga [][] = {
			{10,5,15,7},
			{6,11,9,12},
			{2,10,10,5},
			{5,7,12,9}
		};
    public static void main(String[] args){
		System.out.println();
        System.out.println("================================ PRAKTIKUM FUNGSI ================================");
		System.out.println();
		String bunga[]={"Aglonema", "Keladi","Alocasia","Mawar"};
		String toko[]={"Royal Garden 1","Royal Garden 2","Royal Garden 3", "Royal Garden 4"};
		System.out.println("\t\t |   "+ bunga[0]+"\t|    "+ bunga[1]+"\t|    "+ bunga[2]+"\t|     "+ bunga[3]);
		printtabel(toko,stokBunga);
		System.out.println("=================================================================================");
		System.out.println("\t\t\t\tJumlah Stok Bunga");
		System.out.println("=================================================================================");
		System.out.println(bunga[0]+" : "+printstok(0));
		System.out.println(bunga[1]+"   : "+printstok(1));
		System.out.println(bunga[2]+" : "+printstok(2));
		System.out.println(bunga[3]+"    : "+printstok(3));
		System.out.println("_________________________________________________________________________________");
	}
	public static void printtabel(String array[], int jumlah[][]){
		for(int i=0;i<4;i++){
			System.out.print(array[i]+"   |"+"   ");
			for(int j=0;j<4;j++){
				System.out.print("\t"+jumlah[i][j]+"\t|");
			} 
			System.out.println();
		}
	}
	public static int printstok(int x){
        total=0;
        for(int j=0;j<stokBunga[0].length;j++){
			total += stokBunga[j][x];
        } 
		return total;
	}
}
