package pertemuan_3;

public class contoh_for_3 {
	public static void main(String[] args) {		
		int n = 7;  // 7 bilangan positif pertama 	
			
		int hasil = 0;
		System.out.print("Hasil yang diperoleh dari program ContohFor adalah : ");
		System.out.println("------------------\n");
	    for (int i=1; i<=n; i++) {
	    	hasil += i;
	    	if (i != n) {
	    		
	    		System.out.print(i + " + ");
	    	}
	    	else {
	    		System.out.print(i+" = ");
	    	}
	    }
	    System.out.println(hasil);
	}
}
