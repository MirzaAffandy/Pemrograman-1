//perintah Inheritance
//kelas turunanya

package Latihan04.sesi1.bin;

class Harimau extends KucingBesar
{
    //konstruktor untuk class Harimau
	public Harimau(String namaHarimau)
	{
	//Mengisi pengubah yang di warisi oleh kelas abstract
	Harimau.nama = namaHarimau;
	}
	//implementasi metode yang diwarisi dari kelas abstract
	public void Makan()
	{
	System.out.println("Harimau makan daging dan minum susu");
	System.out.println();
	}
}