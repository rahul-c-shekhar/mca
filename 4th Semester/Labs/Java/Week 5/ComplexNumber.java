import java.util.Scanner;

class ComplexNumber
{
    int     real, img;
    ComplexNumber(int r, int i)
    {
        this.real = r;
        this.img = i;
    }

    public static ComplexNumber mul(ComplexNumber c1, ComplexNumber c2)
    {
        ComplexNumber temp = new ComplexNumber(0, 0);
        temp.real = c1.real * c2.real - c1.img * c2.img;
        temp.img = c1.real * c2.img + c1.img * c2.real;
        return temp;
    }

    public static void main(String[] args) {
        int     a, b, c, d;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Complex Numbers : ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();

        ComplexNumber c1 = new ComplexNumber(a, b);
        ComplexNumber c2 = new ComplexNumber(c, d);
        ComplexNumber c3;

        c3 = mul(c1, c2);

        System.out.print("Product of the two Complex Numbers is : ");
        System.out.print(c3.real+" + "+c3.img+"i");
        System.out.println("\n");

        sc.close();
    }
}