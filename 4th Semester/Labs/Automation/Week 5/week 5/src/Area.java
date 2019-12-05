import java.text.DecimalFormat;

class Area {
public static void main(String args[]) 
{    
DecimalFormat df = new DecimalFormat("#.00000000");
double r, pi, a;
r = 9.8;
pi = 3.14;
a = pi * r * r;
System.out.println(df.format(a));
} 
}