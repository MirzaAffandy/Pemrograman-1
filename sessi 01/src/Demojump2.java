//Perintah contoh flow/struktur control
//Perintah kelima - control05
package latihan01.sesi1.bin;
import java.util.Random;

public class Demojump2
{
    public static void main(String[]Xx)
	{
	    Integer Faktor=7;
		Integer jumlahFaktorDiinginkan=4;
		Integer batasAtas=1000000;
		
		System.out.println("Mencari kelipatan"+Faktor+"dengan break dan Conntinue");
		Integer jumlahFaktorDitemukan=0;
		while(true)
		{
		   Integer random=new Random().nextInt();
		   System.out.println("Bilangan Random : "+random);
		   
		   if(random > batasAtas)
		    {
		        System.out.println("Melewatibatasatas.langsungselesai");
				return;
			}
			
			if(random % Faktor==0)
			{
                System.out.println("Kelipatan" +Faktor+"ditemukan,yaitu :"+random);
				jumlahFaktorDitemukan++;
				
				if(jumlahFaktorDitemukan < jumlahFaktorDiinginkan)
				{
				System.out.println("Baru menemukan" +jumlahFaktorDitemukan+"faktor");
				System.out.println("dari" +jumlahFaktorDiinginkan+"Yang diminta.lanjut lagi");
				continue;
				}
				else
				{
				System.out.println("Sudah menemukan" +jumlahFaktorDiinginkan+"selesai Looping");
				    break;
				}
			}
		}
System.out.println("selesai mencari kelipatan");
    }
}
				
			