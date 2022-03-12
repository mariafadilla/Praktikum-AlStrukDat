//JS 3 - Praktikum No.1
import java.util.Scanner;

//Bangun Ruang 1
class kerucut {
    public double jariJariKerucut, tinggi, garisPelukis;
    public double phi = 3.14;
    public kerucut(double k, double t, double s){
        jariJariKerucut=k;
        tinggi=t;
        garisPelukis=s;
    }
    public double lpKerucut() {
        return phi*jariJariKerucut*(jariJariKerucut + garisPelukis);
    }
    public double vKerucut() {
        return (phi*jariJariKerucut*jariJariKerucut*tinggi)/3;
    }
}
//Bangun Ruang 2
class bola{
    public double jariJari;
    public double phi = 3.14;
    public bola(double r){
        jariJari=r;
    }
    public double lpBola(){
        return 4*phi*jariJari*jariJari;
    }
    public double vBola(){
        return (4*phi*jariJari*jariJari*jariJari)/3;
    }
}
//Bangun Ruang 3
class kubus{
    public int sisi;
    public kubus(int s){
        sisi = s;
    }
    public int lpKubus(){
        return 6*sisi*sisi;
    }
    public int vKubus(){
        return sisi*sisi*sisi;
    }
}
//Main class
public class BangunRuang{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(;;){
			System.out.println();
            System.out.println("====== MENGHITUNG LUAS PERMUKAAN DAN VOLUME BANGUN RUANG ======");
            System.out.println("\n1.Kerucut \n2.Bola \n3.Kubus \n4.Exit");
            System.out.print("Pilih (1/2/3/4): ");
            int pilih =sc.nextInt();
			System.out.println();
			
            if (pilih==1){
			System.out.print("Jumlah Kerucut: ");
                int nKerucut= sc.nextInt();
				
                kerucut[] arrKerucut = new kerucut[nKerucut];
                for(int k=0; k<nKerucut; k++){
                    System.out.print("Jari-jari Kerucut ke-"+(k+1)+": ");
                    double j = sc.nextDouble();
                    System.out.print("Tinggi Kerucut ke-"+(k+1)+": ");
                    double t = sc.nextDouble();
                    System.out.print("Garis pelukis Kerucut ke-"+(k+1)+": ");
                    double g = sc.nextDouble();
                    arrKerucut[k]=new kerucut(j, t, g);
                }
                for(int k=0; k<nKerucut; k++){
					System.out.println();
                    System.out.println(">> Luas Permukaan Kerucut " +(k+1)+": " + arrKerucut[k].lpKerucut());
                    System.out.println(">> Volume Kerucut "+(k+1)+": " + arrKerucut[k].vKerucut());
                }    
            }if(pilih==2){
                System.out.print("Jumlah bola: ");
                int nBola=sc.nextInt();

                bola[] arrBola = new bola[nBola];
                for(int j=0; j<nBola; j++){
                    System.out.print("Jari-jari Bola ke-"+(j+1)+": ");
                    double jr= sc.nextDouble();
                    arrBola[j]=new bola(jr);
                }
                for(int j=0; j<nBola; j++){
					System.out.println();
                    System.out.println(">> Luas Permukaan Bola " +(j+1)+": " + arrBola[j].lpBola());
                    System.out.println(">> Volume Bola "+(j+1)+": " + arrBola[j].vBola());
                }
			}if(pilih==3){
				System.out.print("Jumlah Kubus: ");
                int nKubus= sc.nextInt();

                kubus [] arrKubus = new kubus[nKubus];
                for(int i=0; i<nKubus; i++){
                    System.out.print("Panjang sisi Kubus ke-" +(i+1)+": ");
                    int si = sc.nextInt();
                    arrKubus[i]= new kubus(si);
                }
                for(int i=0; i<nKubus; i++){
					System.out.println();
                    System.out.println(">> Luas Permukaan Kubus " +(i+1)+": " + arrKubus[i].lpKubus());
                    System.out.println(">> Volume Kubus "+(i+1)+": " + arrKubus[i].vKubus());
                }
            }if(pilih==4){
                System.out.println("--- Exit - Selesai ---");
                break;
            }
        }
    }
}

