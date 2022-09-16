package pertemuan_2;

public class MataKuliahSemester1 {
	String Teori1, Praktikum1;
    public static void main(String[] args) {
        MataKuliahSemester1 sem1 = new MataKuliahSemester1();
        sem1.Teori1 = "pengkondisian";
        sem1.Praktikum1 = "mata kuliah DKP.";

        System.out.println("Saya belajar " + sem1.Teori1 + " pada " + sem1.Praktikum1);
    }
}

