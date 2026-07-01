import java.util.List;
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
			else{
				showUserMenu();
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

	public void login(){
		System.out.println("Enter Username: ");
		String username = scanner.next();

		System.out.println("Enter Password: ");
		String password = scanner.next();

		userService.loginUser(username,password);
	}

	private void showUserMenu(){
		while(userService.isLoggedIn()){
			System.out.println("\n----- User Menu -----");
			System.out.println("1. Search Trains:");
			System.out.println("2. Book Ticket:");
			System.out.println("3. View My Tickets:");
			System.out.println("4. Cancel Tickets:");
			System.out.println("5. View All Trains:");
			System.out.println("6. Logout:");
			System.out.println("Enter Choice:");
			int choice=scanner.nextInt();
			switch (choice)
			{
				case 1 -> searchTrain();
				case 2 -> bookTicket();
				case 3 -> viewMyTicket();
				case 4 -> cancelTicket();
				case 5 -> bookingService.listAllTrains();
				case 6 -> userService.logOutUser();
				default -> System.out.println("Invalid Choice.");

			}
	    }
	}

	private void searchTrain(){
		System.out.println("Enter source station: ");
		String source= scanner.next();

		System.out.println("Enter destination station: ");
		String destination= scanner.next();

		List<Train> trains = bookingService.searchTrain(source,destination);
		if(trains.isEmpty()){
			System.out.println("No trains found between "+ source + " and "+ destination);
			return;
		}

		System.out.println("Trains found:");
		for(Train train: trains){
			System.out.println(train);
		}

		//booking
		System.out.println("Do you want to book ticket? (yes/no)");
		String choice = scanner.next();

		if(choice.equalsIgnoreCase("yes")){

			System.out.println("Enter Train ID to book:");
			int trainId= scanner.nextInt();

			System.out.println("Enter number of seats to book:");
			int seats = scanner.nextInt();

			Ticket ticket = bookingService.bookTicket(userService.getCurrentUser(),trainId,seats);

			if(ticket!=null){
				System.out.println("Booking successfull");
				System.out.println(ticket);
			}
		}
		else{
			System.out.println("Returning to user menu....");
		}
	}

		private void exitApp()
		{
			System.out.println("Thank you for using IRTCT App.");
			System.exit(0);
		}
}
