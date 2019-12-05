import java.util.Scanner;

public class CustomExceptions {

	public static void validateAge(int age) throws InvalidAgeException {
		if (age < 0) 
			throw new InvalidAgeException("Not a valid age.");
		else
			System.out.print("Age : "+age);
	}
	
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			
			int age;
			
			System.out.println("Enter the age : ");
			age = sc.nextInt();
			
			validateAge(age);
			
			sc.close();
		}
		catch (Exception e) {
			System.out.println("Exception occured : "+e);
		}

	}

}
