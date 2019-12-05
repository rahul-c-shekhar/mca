public class AException 
{
  public static void main(String args[]) 
  {
    int a = 10, b = 0, c;
    System.out.println("Hello 1");
    try {
    	c = a/b;
	} catch (Exception e) {
		System.out.println(e);
	}
    //System.out.println(c);
 
    System.out.println("Hello 2");
    System.out.println("Hello 3");
  }
}