public class Temp {
	public int x = 10;	
	public static void main(String[] args) {
		Temp t = initT();		
		int i = t.x;
		System.out.println(i);
	}
	private static Temp initT() {
		Temp t = new Temp();
		return t;
	}

}