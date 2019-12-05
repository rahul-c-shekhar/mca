import java.util.Scanner;

interface Treatment {
    public void inPatientTreatment();
    public void outPatientTreatment();
}

class Hospital implements Treatment {
    public void inPatientTreatment() {

    }
    public void outPatientTreatment() {

    }
}

class Doctor1 extends Hospital {
    public void inPatientTreatment() {
        System.out.println("The patient's case is severe.");
        System.out.println("The patient has to be admitted immediately.");
    }
}

class Doctor2 extends Hospital {
    public void outPatientTreatment() {
        System.out.println("The patients's case is not serious.");
        System.out.println("The patient is here for a checkup");
    }
}

class Patient {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Select the patient's condition : ");
        System.out.println("1. Serious.");
        System.out.println("2. Normal");
        System.out.print("Enter your choice : ");
        int condition = sc.nextInt();

        switch(condition) {
            case 1 : Doctor1 d1 = new Doctor1();
                     d1.inPatientTreatment();
                     break;
            case 2 : Doctor2 d2 = new Doctor2();
                     d2.outPatientTreatment();
                     break;
            default : System.out.println("You have selected the wrong choice!!!!");
        }
    }
}