import java.util.Scanner;

public class UserManager {
	public static void main(String[] args) {
		
	int options;
	Scanner s =new Scanner(System.in);
	PersonList perList=new PersonList();
	
	
	do {
		Menu();
		options=s.nextInt();
		s.nextLine();
		switch (options) {
		case 1:
			System.out.println("Enter first name: ");
			String firstName=s.nextLine();
			System.out.println("Enter last name: ");
			String lastName=s.nextLine();
			System.out.println("Enter email address: ");
			String emailAddress=s.nextLine();
			perList.addPerson(new PersonCode(firstName,lastName,emailAddress));
			break;
		case 2:
			perList.listPeople();
			break;
		case 3:
			System.out.println("Thank you for using User Manager, Goodbye!");
			System.exit(0);
		default:
			System.out.println("Invalid Choice, Try Again!");
			break;
		}
	}while (options!=4);
	}

	private static void Menu() {
	System.out.println("1 - Register User");
	System.out.println("2 - List Users");
	System.out.println("3 - Exit");
	System.out.println("\nPlease Enter Your Choice: ");
	}

}
