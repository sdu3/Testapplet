import java.util.Scanner;

public class Helloworld
{
//main method
	public static void main(String[] args)
	{
		/*int x = 5;
		String y = " dollars for a salad ";
		double z = 5.5;
		System.out.println(x + z + y);
		*/
		Scanner scan = new Scanner(System.in);
		System.out.println("years");
		int years = scan.nextInt();
		System.out.println("Does your mouse need a battery? (enter no if you don't have a mouse): ");
		boolean mouse = scan.nextBoolean();
		/*String yn = scan.nextLine();
		if (yn=yes)
		{
			mouse=true;
		}
		*/
		int mBattery;
		mBattery=0;
	
		if (mouse=true)
		{
			mBattery=2*(years*12-2);
			System.out.println(mBattery);
		}
	}
}
