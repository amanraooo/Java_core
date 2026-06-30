import java.util.HashMap;
import java.util.Map;

public class UserService {

	private Map<String,User> userMap = new HashMap<>();

	private User currentUser = null;

	public boolean registerUser(String username, String password, String fullname, String contact){
		if (userMap.containsKey(username)) {

			System.out.println("Username already taken, please choose another username");
		}

		User user = new User(username, password, fullname, contact);
		userMap.put(username,user);
		System.out.println("Registration Succesfull : )");

		return true;
	}
}
