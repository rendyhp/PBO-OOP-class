package pertemuan_3;

public class contoh_switch_3 {
	public static void main(String[] args){
		int a= 2; int b;
		switch (a) {
			case 1: b = a + 1;
			case 2: b = a + 2;
			case 3: b = a + 3;
			case 4: b = a + 4;
			case 5: b = a + 5;
			default: b = 0; 
		}
		System.out.println("Nilai b: " + b);
	}
}

	/*	Penjelasan hasil program
		Mula-mula program akan mengeksekusi nilai konstan 2.
		Karena tidak terdapat statemen break, maka program akan
		meneruskan eksekusi ke statemen yang terdapat pada nilai
		konstan 3,4,5, dan default. Pada bagian default, nilai b = 0
		sehingga nilai b terakhir yang di panggil adalah 0 
	 */
