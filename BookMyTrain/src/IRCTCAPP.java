import java.util.Scanner;

public class IRCTCAPP {
	public static void main(String[] args) {

	}

	private final Scanner scanner = new Scanner();
	private final UserService userService= new UserService();
	private final BookingService bookingService =  new BookingService();


	//start method
	public void start(){

		while(true){

			System.out.println("----Welcome to IRCTC app----");

			if(!userService.isLoggedIn()){
				System.out.println("1. Register");
				System.out.println("2. LogIn");
				System.out.println("3. Exit");
				System.out.println("Enter Choice");

				int choice=scanner.nextInt();

				switch (choice){
					case 1 -> register();
					case 2 -> login();
					case 3 -> exitApp();
					default -> System.out.println("Invalid choice");
				}
			}
		}
	}

	public void register(){
		System.out.println("Enter Username: ");
		String username = scanner.next();

		System.out.println("Enter Password: ");
		String password = scanner.next();

		System.out.println("Enter full name: ");
		scanner.nextLine();
		String fullname = scanner.nextLine();

		System.out.println("Enter contact: ");
		String contact = scanner.next();

		userService.registerUser(username,password, fullname, contact);
	}


}
