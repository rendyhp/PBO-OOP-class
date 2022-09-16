package pertemuan_3;

public class contoh_continue {
	public static void main(String args[]) { 
		 int i=0; 
		 do { 
		 i++;
		 if (i==3) continue; 
		 System.out.println("iterasi ke : "+i); 
		 if (i==5) break; 
		 
		 }
		 while(i <= 9); 
	} 

}
