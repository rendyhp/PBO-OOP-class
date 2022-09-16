package pertemuan_3;

/*
 Buatlah program konversi angka ke nilai huruf: 
	100 >= nilai > 80 A 
	  80 >= nilai > 60 B 
	  60 >= nilai > 40 C 
	  40 >= nilai > 20 D 
	  20 >= nilai > 0 E

 */
public class Tugas_pertemuan3 {
	public static void main(String[] args) {
		int nilai;
		nilai = 90;
		
		if (nilai<= 100 && nilai>80){
            	System.out.println("Nilai Anda A");
            }else if (nilai<= 80 && nilai>60){
            	System.out.println("Nilai Anda B");
            }else if (nilai <= 60 && nilai>40){
            	System.out.println("Nilai Anda C");
            }else if (nilai <= 40 && nilai > 20 ){
            	System.out.println("Nilai Anda D");
            }else{
              System.out.println("Nilai Anda E");
            }
	}
}
