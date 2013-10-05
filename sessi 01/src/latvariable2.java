//latihan variabe
package latihan01.sesi02.bin;

public class latvariabel2 {
    public static void main (String[] qq){
	    int x=10;
		System.out.println("Nilai X adalah " +x);
		
		char z='a';
		System.out.println("Nilai Z adalah " +z);
		
		//isi data ke tipe yang tidak tepat
		int y=z;
		System.out.println("Nilai y adalah " +y);
		
		
		//Type casting
		 int v=2;
		 System.out.println("Nilai V adalah " +v);
		 System.out.println("Baris Selanjutnya");
		 
		 coba();
		 
		 System.out.println("Setelah menjelankan coba");
	}
	static char v;
		 
		
		 public static void coba () {
		     int v=12;
			 System.out.println("Nilai V adalah " +v);
			 //variabel v tidak boleh dihapus karena masih dipakai dan masih berada didalam scope
			 short d=15; // variabel d boleh di hapus dibaris 23, karena life timenya sudah habis
			 System.out.println("D adalah "+d); // variabel d boleh di hapus di baris 22
			 }
		}