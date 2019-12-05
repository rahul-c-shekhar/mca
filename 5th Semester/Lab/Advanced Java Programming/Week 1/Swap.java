import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m, n;
        
        System.out.print("Enter the first number : ");
        m = sc.nextInt();
        System.out.print("Enter the second number : ");
        n = sc.nextInt();

        m = m ^ n;
        n = m ^ n;
        m = m ^ n;

        System.out.println("After Swapping");
        System.out.println("First number : "+m);
        System.out.println("Second number : "+n);
        
        sc.close();

	}

}
