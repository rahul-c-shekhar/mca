abstract class CmdBtn
{
	
	final void commandBtn()
	{ 
	  System.out.println("Pre-defined features of Command button:");
	  System.out.println("Color:Green");
	  System.out.println("Size:11");
	  System.out.println("Font style:Veranda");
	  System.out.println("Border outline color:black");
	  System.out.println("Style:Bold");
	  System.out.println("Width:4cm");
	  System.out.println("Height:1cm");
	}
	abstract void caption();

}

class Reservation extends CmdBtn
{
	void caption()
	{
		System.out.println("Caption=Reservation");

	}
}

class Cancellation extends CmdBtn
{
	void caption()
	{
		System.out.println("Caption=Cancellation");

	}
}

class SoftwareComp
{
	public static void main(String args[])
	{
		Reservation r=new Reservation();
		Cancellation c=new Cancellation();
		r.commandBtn();
		r.caption();
        System.out.println("----------------------");
		c.commandBtn();
		c.caption();

	}
}