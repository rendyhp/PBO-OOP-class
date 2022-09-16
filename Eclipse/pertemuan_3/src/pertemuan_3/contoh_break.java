package pertemuan_3;

public class contoh_break {
	  public static void main(String[] args) {
		  for (int i=0; i<20; i++) {
			  if (i == 5) {
				  break;	// keluar dari blok pengulangan
			  }
		      System.out.println("baris ke-" + i);
		  }
		  System.out.println("Statemen setelah blok pengulangan");    
	  }
}
