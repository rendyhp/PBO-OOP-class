package pertemuan_3;

public class contoh_whileBersarang {
	public static void main(String[] args) {	 
		   int i=1, j;
		   while (i<=5) {
		    	j=1;
		    	while (j<=i) {
		    	  System.out.print(i*j + " ");
		    	  j++;
		    	}    	
		    	System.out.println();
		    	i++;
		    }
	}
}
