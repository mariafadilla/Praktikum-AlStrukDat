//JS 7 - Percobaan 6.4.1 - Merge Sort

//2. tambah class MergeSoring
//3. membuat method mergeSort yg menerima parameter data array yg akan diurutkan
class MergeSorting{
	public void mergeSort(int[] data){
		sort(data, 0, data.length-1);
	}

//4. membuat method merge u/ melakukan proses penggabungan data dari kiri dan kanan
//5. implementasi proses merge
	public void merge(int data[], int left, int middle, int right){
		int[] temp = new int[data.length];
		for(int i=left; 1<=right; i++){
			temp [i] = data[i];
		}
		int a = left;
		int b = middle + 1;
		int c = left;
		
		//membandingkan setiap bagian 
		while(a<=middle && b<=right){
			if(temp[a] <= temp[b]){
				data[c] = temp[a];
				a++;
			} else{
				data[c] = temp[b];
				b++;
			}
			c++;
		}
		int s = middle-a;
		for(int i=0; i<=s; i++){
			data[c+i] = temp[a+i];
		}
	}

//6. membuat method sort
//7. implementasi kode pada method sort
	//membagi menjadi 2 bagian dan dibagi kembali hingga tidak dapat dibagi kembali
	private void sort(int data[], int left, int right){
		if(left < right){
			int middle = (left+right)/2;
			sort(data, left, middle);
			sort(data, middle+1, right);
			merge(data, left, middle, right);
		}
	}
	
//9. tambah method printArray
	public void printArray(int arr[]){
		int n = arr.length;
		for(int i=0; i<n; i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}

//10.  deklarasi data yg akan diurutkan lalu panggil proses sorting pd class SortMain
public class SortMain{
	public static void main(String[] args){
		int data[] = {10, 40, 30, 50, 70, 20, 100, 90};
			System.out.println("= Sorting dengan Merge Sort =");
			MergeSorting mSort = new MergeSorting();
			System.out.println("Data Awal");
			mSort.printArray(data);
			mSort.mergeSort(data);
			System.out.println("Data Setelah Diurutkan: ");
			mSort.printArray(data);
	}
}