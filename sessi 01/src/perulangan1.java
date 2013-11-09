//D:>cd D:\pemrograman 01\latihan
//D:\pemrograman 01\latihan> javac -d bin -cp bin src/Ulangn01.java
//D:\pemrograman 01\latihan> java -cp bin latihan01.sesi1.bin.Ulangn01
//perintah control flow/struktur kontrol
//perintah pertama - contoh01
package latihan01.sesi1.bin;

public class Ulangn01
{

    public static void main(string[] Xx)
	{
	    int [] daftar={20, 30, 40};
		for(int x=0; x<3; x++)
		    system.out.println("Isi Elemen ke-" +x +" = " +daftar[x]);
	}
}