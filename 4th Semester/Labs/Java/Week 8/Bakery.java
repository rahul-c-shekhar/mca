import java.util.Scanner;

interface Billing {
    public void getOrder();
    public void billing();
}

class Rates {
    final static  int blackForest = 390;
    final static int chocolateMars = 450;
    final static int chocolateCheese = 500;
    final static int blueBerryCheeseCake = 550;
}

class Counter extends Rates implements Billing{

    Scanner sc = new Scanner(System.in);

    String username = "admin", password = "admin", newPassword;
    String user, pass;
    int ch, qty, total, count = 0;

    void getPayment() {
        System.out.println("Payment accepted.");
    }

    void showMenu() {
        System.out.println("\t\t Menu \t");
        System.out.println("Sl. \t Name \t\t\t Price (1kg)");
        System.out.println("1. \t Black Forest \t\t "+blackForest);
        System.out.println("2. \t Chocolate Mars \t "+chocolateMars);
        System.out.println("3. \t Chocolate Cheese \t "+chocolateCheese);
        System.out.println("4. \t Blue Berry Cheese Cake  "+blueBerryCheeseCake);
    }

    void setUser() {
        System.out.println("Enter the username : ");
        username = sc.nextLine();
        System.out.println("Enter the password : ");
        password = sc.nextLine();
        System.out.println("Username and Password are set.");
    }

    void resetPassword() {
        System.out.println("Enter the username : ");
        user = sc.nextLine();
        System.out.println("Enter the password : ");
        pass = sc.nextLine();
        
        if ((user.equals(username)) && (pass.equals(password))) {
            System.out.println("Enter the new password : ");
            newPassword = sc.nextLine();
            password = newPassword;
        }
        else {
            System.out.println("You have entered the wrong password.");
        }
    }

    public void getOrder() {
        System.out.println("Enter your choice of the cake : ");
        ch = sc.nextInt();
        System.out.println("Enter the quantity (in kgs) : ");
        qty = sc.nextInt();

        switch(ch) {
            case 1 : total = qty * blackForest;
                     break;
            case 2 : total = qty * chocolateMars;
                     break;
            case 3 : total = qty * chocolateCheese;
                     break;
            case 4 : total = qty * blueBerryCheeseCake;
                     break;
            default : System.out.println("Wrong choice!!!");
                      break;
        }
    }

    public void billing() {
        count++;
        getOrder();
        System.out.println("\t Bill \t");
        System.out.println("Bill No. : "+count);
        System.out.println("Customer Sl. No. : "+count);
        System.out.println("Your cake choice : "+ch);
        System.out.println("Quantity : "+qty+"kgs");
        System.out.println("Total cost : "+total);
    }

    void startBreak() {
        System.out.println("Break Time!!!");
        System.out.println("Billing counters are closed.");

        billing();
    }

    void endBreak() {
        String ans;
        
        System.out.println("Break time has ended.");
        System.out.println("Should we continue with the billing : ");
        ans = sc.nextLine();

        if (ans.equals("Yes")) {
            System.out.println("Billing continued.");
        }
        else if (ans.equals("No")) {
            System.out.println("Billing is not being continued.");
        }
        else {
            System.out.println("You have entered the wrong choice!!");
        }
    }

    void welcomeNote() {
        System.out.println("Welcome to Amma's Pastries.");
    }

    void thankYouNote() {
        System.out.println("Thank you for visiting us.");
    }
}

class Bakery {
    public static void main(String[] args) {
        Counter c = new Counter();
        c.welcomeNote();
        c.showMenu();
        c.billing();
        c.thankYouNote();
    }
}