import java.util.Scanner;

class Bank {
    int loanAmt;

    public void createAccount() {
        System.out.println("Account created\n");
    }
}

class Loan extends Bank{
    int period;

    public void reqLoan() {
        System.out.println("\nLoan request accepted\n");
    }
}

class VLoan extends Loan {
    String  vType;

    public void reqVLoan() {
        System.out.println("Vehicle Loan sanctioned : ");
        System.out.println("Loan Amount : "+loanAmt);
        System.out.println("Time Period : "+period+" years");
        System.out.println("Vehicle Type : "+vType+"\n");
    }
}

class HomeLoan extends Loan {
    String  hType;

    public void reqHLoan() {
        System.out.println("Home Loan sanctioned : ");
        System.out.println("Loan Amount : "+loanAmt);
        System.out.println("Time Period : "+period+" years");
        System.out.println("Home Type : "+hType+"\n");
    }
}

class PersonalLoan extends Loan {
    String  pType;

    public void reqPLoan() {
        System.out.println("Personal Loan sanctioned : ");
        System.out.println("Loan Amount : "+loanAmt);
        System.out.println("Time Period : "+period+" years");
        System.out.println("Requirement Type : "+pType+"\n");
    }
}

class Customer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        
        System.out.println("Types of Loans : ");
        System.out.println("1. Vehicle Loan");
        System.out.println("2. Home Loan");
        System.out.println("3. Personal Loan");
        System.out.println("\nSelect the type of Loan : ");
        choice = sc.nextInt();

        switch(choice)
        {
            case 1 : VLoan vl = new VLoan();
                     vl.createAccount();
                     System.out.println("Enter loan amount : ");
                     vl.loanAmt = sc.nextInt();
                     System.out.println("Enter the time period : ");
                     vl.period = sc.nextInt();
                     System.out.println("Enter the vehicle type : ");
                     vl.vType = sc.next();
                     vl.reqLoan();
                     vl.reqVLoan();
                     break;

            case 2 : HomeLoan hl = new HomeLoan();
                     hl.createAccount();
                     System.out.println("Enter loan amount : ");
                     hl.loanAmt = sc.nextInt();
                     System.out.println("Enter the time period : ");
                     hl.period = sc.nextInt();
                     System.out.println("Enter the home type : ");
                     hl.hType = sc.next();
                     hl.reqLoan();
                     hl.reqHLoan();
                     break;

            case 3 : PersonalLoan pl = new PersonalLoan();
                     pl.createAccount();
                     System.out.println("Enter loan amount : ");
                     pl.loanAmt = sc.nextInt();
                     System.out.println("Enter the time period : ");
                     pl.period = sc.nextInt();
                     System.out.println("Enter the requirement type : ");
                     pl.pType = sc.next();
                     pl.reqLoan();
                     pl.reqPLoan();
                     break;
            default : System.out.println("You have entered the wrong choice !!!!");
                      break;
        }        
    }
}