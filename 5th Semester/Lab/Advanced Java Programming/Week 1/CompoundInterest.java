import java.util.Scanner;

public class CompoundInterest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float	p, t, r, n;
		int ci;
		
		System.out.println("Enter the value of Principal Amount : ");
		p = sc.nextFloat();
		System.out.println("Enter the value of Annual Interest Rate : ");
		r = sc.nextFloat();
		System.out.println("Enter the value of Time : ");
		t = sc.nextFloat();
		System.out.println("Enter the value of N : ");
		n = sc.nextFloat();
		
		ci = (int) ((p * Math.pow((1 + r/n), (n*t))) - p);
		
		System.out.println("Compound Interest = Rs." +ci);
		sc.close();
	}

}
