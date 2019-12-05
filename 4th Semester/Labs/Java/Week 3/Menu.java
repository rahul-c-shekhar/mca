import java.util.Scanner;

class Menu
{
    void factorial(int  n)
    {
        int     i, fact = 1;

        for(i = 1; i <= n; i++)
        {
            fact = fact * i;
        }
        System.out.println("Factorial of " +n+ " is = "+fact);
    }
    void fibonacci(int   x)
    {
        int     t1 = 0, t2 = 1;
        
        for(int i = 1; i <= x; i++)
        {
            System.out.print(t1 + " ");
            int     sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
        System.out.println("\n");
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Menu m = new Menu();
        int     ch;
        System.out.println("Menu Driven Program :");
        System.out.println("1. Factorial of a Number.");
        System.out.println("2. Fibonacci Series.");
        System.out.print("Enter your choice : ");
        ch = in.nextInt();
        switch(ch)
        {
            case 1 : System.out.println("To find the Factorial of a number : ");
                     System.out.print("Enter the value of n : ");
                     int    a = in.nextInt();
                     m.factorial(a);
                     break;
            case 2 : System.out.println("To print the Fibonacci Series : ");
                     System.out.print("Enter the value for n : ");
                     int    b = in.nextInt();
                     m.fibonacci(b);
                     break;
            default : System.out.println("You have entered the wrong choice!!!");
        }

    }
}