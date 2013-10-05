//latihan variabel
package latihan02.sesi02.bin;

public class variabel {
    public static void main (String[] qq){
	    int x=10;
		System.out.println("Nilai X adalah " +x);
		
		char z='a';
		System.out.println("Nilai Z adalah " +z);
		
		//isi data ke tipe yang tidak tepat
		int y=z;
		System.out.println("Nilai y adalah " +y);
		
		//tidak bisa compile (error)
		//char w=x;
		//System.out.println ("Nilai w adalah " +x);
		
		//Type casting
		char v=(char) x;
		System.out.println ("Nilai V adalah " +v);
		System.out.println ("Baris Selanjutnya ");
	
	}
	public static void coba() { 
	   // System.out.println("Nilai V adalah " +v);
	}
}

		