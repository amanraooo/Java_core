import java.util.ArrayList;
import java.util.List;

public class BookingService {

	private List<Train> trainList= new ArrayList<>();
	private List<Ticket> ticketList= new ArrayList<>();

	public BookingService(){
		trainList.add(new Train(101,"Rajdhaani Express","Delhi", "Nagpur",100));
		trainList.add(new Train(102,"Vande Bharat","Delhi", "Mumbai",60));
		trainList.add(new Train(103,"Tejas Express","Delhi", "Pune",60));
		trainList.add(new Train(104,"Jhelum Express","Kolkata", "Bengaluru",10));
		trainList.add(new Train(105,"Local Express","Delhi", "Agra",87));

	}

	public List<Train> searchTrain(String source, String destination){

		List<Train> searchResult = new ArrayList<>();

		for (Train train : trainList){

			if(train.getSource().equalsIgnoreCase(source) && train.getDestination().equalsIgnoreCase(destination)){
				searchResult.add(train);
			}
		}
		return searchResult;
	}

	private Ticket bookTicket(User user, int trainId, int seatCount){

		for (Train train : trainList){

			if(train.getTrainId()==trainId){

				if(train.bookSeats(seatCount)){

					Ticket ticket = new Ticket(user, train , seatCount);
					ticketList.add(ticket);
					return ticket;
				}
				else{
					System.out.println("No enough seats available");
					return  null;
				}
			}
		}
		System.out.println("Train ID not found");
		return null;
	}
}
