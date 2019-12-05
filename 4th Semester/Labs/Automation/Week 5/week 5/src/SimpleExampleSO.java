import java.time.Year;

public class SimpleExampleSO {
      public static void main(String args[]) {
            a();
      }
      public static void a() {
            int x = 0;
            b();
      }
    public static void b() {
            Car y = new Car();
            c();
      }
      public static void c() {
      float z = 0f;
      System.out.println("Hello");
      Car.disp();
      } 
}

 class Car {
	 public static void disp()
	 {
		 System.out.print("World");
	 }
}