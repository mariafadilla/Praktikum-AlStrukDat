public class JS1Array{
    public static void main(String[] args) {
		System.out.println();
        System.out.println("======== PRAKTIKUM ARRAY ========");
		System.out.println();
        System.out.println("--- Toko Bunga Royale Garden ---");
        int[][] bunga = {
                {10, 5, 15, 7},
                {6, 11, 9, 12},
                {2, 10, 10, 5},
                {5, 7, 12, 9}
        };
        int algonema = 0, keladi = 0, alocasia = 0, mawar = 0, pendapatan;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (j == 0) {
                    algonema += bunga[i][j];
                } else if (j == 1) {
                    keladi += bunga[i][j];
                } else if (j == 2) {
                    alocasia += bunga[i][j];
                } else {
                    mawar += bunga[i][j];
                }
            }
        }
		
        System.out.println("| Jumlah Bunga di Seluruh Cabang |");
        System.out.println("| Jumlah Bunga Algonema: " + algonema + "\t |");
        System.out.println("| Jumlah Bunga Keladi  : " + keladi + "\t |");
        System.out.println("| Jumlah Bunga Alocasia: " + alocasia + "\t |");
        System.out.println("| Jumlah Bunga Mawar   : " + mawar + "\t |");
		System.out.println("__________________________________");
		System.out.println();
        pendapatan = ((10 -1)* 75000) + ((5-2)*50000) + (15*60000) + ((7-5)*10000);
        System.out.println("=> Total Pendapatan Royale Gareden 1 \n  Jika Semua Bunga Terjual Habis : Rp " + pendapatan);
    }
}