interface Functionalities
{
	void create();
	void retrieve();
	void update();
	void delete();
}

class HomePC implements Functionalities
{
	public void create()
	{
		System.out.println("Used to create Resume,documents");
	}

	public void retrieve()
	{
		System.out.println("Used to retrieve documents,ppt");
	}

	public void update()
	{
		System.out.println("Used to update resume,documents");

	}

	public void delete()
	{
		System.out.println("Used to delete unwanted documents");
	}

	public void spcl()
	{
		System.out.println("Dual OS");
	}
}

class WebServer implements Functionalities
{
	public void create()
	{
		System.out.println("Used to add details of the client,node,MAC address");
	}

	public void retrieve()
	{
		System.out.println("Used to retrieve details of the client database");
	}

	public void update()
	{
		System.out.println("Used to update details of the client");

	}

	public void delete()
	{
		System.out.println("Used to delete details of the client");
	}

	public void spcl()
	{
		System.out.println("Can inter-connect multiple clients,resource sharing");
	}
}

class SmartPhone implements Functionalities
{
	public void create()
	{
		System.out.println("Used to add contacts");
	}

	public void retrieve()
	{
		System.out.println("Used to retrieve pictures,video,contact number");
	}

	public void update()
	{
		System.out.println("Used to update smartphone");

	}

	public void delete()
	{
		System.out.println("Used to delete pictures,videos");
	}

	public void spcl()
	{
		System.out.println("Front flash light,Potrait mode camera");
	}
}

class Computer
{
	public static void main(String[] args) {
		HomePC h=new HomePC();
		WebServer w=new WebServer();
		SmartPhone s= new SmartPhone();
		System.out.println("HomePC");
		h.create();
		h.update();
		System.out.println("*******************");
		System.out.println("WebServer");
		w.delete();
		w.spcl();
		System.out.println("*******************");
		System.out.println("Smartphone");
		s.update();
		s.spcl();

	}
}