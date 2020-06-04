import java.util.Scanner;

public class Client 
{
	private static String response;
	public static void main(String[]args)
	{
		System.out.println("Choose between a Sword, Axe, or Mace: ");
		Scanner sc = new Scanner(System.in);
		response = sc.next();
		
		// Calls the facade.
		Facade.blackSmith(response.toUpperCase());
		
	}

}
