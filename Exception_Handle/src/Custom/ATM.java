package Custom;

public class ATM {
	public static void main(String[] args) {
		try {
			withdraw(1000,1500);
		} catch (InsufficentBalException e) {
			System.out.println("Exception Bal ins");
			System.out.println(e);
		}
	}

	public static void withdraw(double bal,double amt) throws InsufficentBalException {
		if(amt>bal)
		{
			throw new InsufficentBalException("Insufficient Bal : " +
					"Available bal "+bal+ "requested "+amt);

		}
		System.out.println("withdrawal of amount "+amt+" successfull");
	}
}