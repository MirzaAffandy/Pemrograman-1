//perintah Inheritance
//kelas turunanya

package Latihan04.sesi1.bin;

public class TesKucingBesar
{
    public static void main(String[] Xx)
	{
	   Singa mySinga = new Singa("SIMBABA SURAI");
	   System.out.println("Singa merupakan " +Singa.nama);
	   mySinga.Makan();
	   
	   Harimau myHarimau = new Harimau("HARIMAU SUMATERA");
	   System.out.println("Harimau merupakan " +Harimau.nama);
	   myHarimau.Makan();
	}
}
	   