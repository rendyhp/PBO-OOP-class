package pertemuan_3;

public class contoh_ifElseif {
	public static void main(String[] args) {		
		   int bilangan = 4;
		   if (bilangan < 0) {
			   System.out.println(bilangan +  " merupakan bilangan NEGATIF.");
		   } else if (bilangan == 0) {    	
			   System.out.println("Nilai yang dimasukkan adalah NOL");
		   } else {    // (bilangan > 0)
		       System.out.println(bilangan +   " merupakan bilangan   POSITIF.");
		   }
	}
}
