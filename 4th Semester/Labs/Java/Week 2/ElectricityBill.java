class ElectricityBill
{
    public static void main(String[] args) {
        double     cr = 330, pr = 110, rental = 50, total, count = 0;
        double   cost = 0, net;
        System.out.println("Electricity Bill :");
        System.out.println("Previous Reading : "+pr);
        System.out.println("Current Reading : "+cr); 
        total = cr - pr;
        System.out.println(("Total Reading : "+total));
        
        if (total == 0)
        {
            net = 0;
        }

        if (total >= 1 && total <= 99) 
        {
            cost = cost + (total * 1.20);
        }
        cost = cost + 118.8;
        count = count + 1;

        if (total >= 100 && total <= 199)
        {
            total = total - 100;
            cost = cost + (total * 2.10);
        }
        cost = cost + 207.9;
        count = count + 1;

        if (total >= 200 && total <= 299)
        {
            total = total - 200;
            cost = cost + (total * 3.50);
        }
        cost = cost + 346.5;
        count = count + 1;

        if (total >= 300)
        {
            total = total - (count * 99);
            cost = cost + (total * 4.20);
        }

        net = cost + rental;

        System.out.println("Total Bill Amount = "+net);
    }
}