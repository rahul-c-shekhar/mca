class Mobile
{
	void commonFeatures()
	{
		System.out.println("The common features of Smartphone are:");
		System.out.println("1.Long-lasting battery");
		System.out.println("2.Crystal clear display");
		System.out.println("3.NFC");
		System.out.println("4.Multiple windows");
		System.out.println("5.Infrared Remote control");
		System.out.println("-----------------------------------------");

	}

}

class Brand extends Mobile
{
	void samsungFeatures()
	{
		System.out.println("Features of Samsung phone");
		System.out.println("1. 4GB RAM");
		System.out.println("2. 12MP Primary Camera");
		System.out.println("3. Android 8.0");
		System.out.println("----------------------------");
	}

	void micromaxFeatures()
	{
		System.out.println("Features of Micromax phone");
		System.out.println("1. 1GB RAM");
		System.out.println("2. 8MP Primary Camera");
		System.out.println("3. Android 8.0");
		System.out.println("------------------------------");
	}
}

class SamsungS10 extends Brand
{
	void specifications()
	{
		System.out.println("Features of Samsung S10+ phone");
		System.out.println("Price: Rs.55,900/-");
		System.out.println("nfinity-O Display - Cinematic, minimized-bezel Dynamic AMOLED display");
		System.out.println("Pro-grade Camera - Intelligent Dual Camera with super steady video capture.");
		System.out.println("Wireless PowerShare - Device-to-device charging with Wireless PowerShare");
		System.out.println("-------------------------------------------------------------------------------");

	}
}

class MicromaxInfinity12 extends Brand
{
	void specifications()
	{
		System.out.println("Features of Micromax Infinity12 phone");
		System.out.println("Price: Rs.9,999/-");
		System.out.println("6.19 inches display with a HD resolution and a 18:9:9 aspect ratio");
		System.out.println("powered by MediaTek Helio P22 (MT6762) chipset and 4x 2.0 GHz ARM Cortex-A53, 4x 1.5 GHz ARM Cortex-A53, Cores: 8 processor.");
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------");

	}

}

public class Buy
{
	public static void main(String[] args) {
		SamsungS10 s=new SamsungS10();
		s.commonFeatures();
		s.specifications();
		MicromaxInfinity12 m=new MicromaxInfinity12();
		m.commonFeatures();
		m.specifications();
	}
}





