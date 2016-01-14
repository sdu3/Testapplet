import java.util.*;

public class Tester
{
	 public static void main(String args[]) 
	 {
		//Ask for CPU speed, number of cores, CPU brand. Should we have them enter this all at once and store it in a list somehow??
		 Scanner scan = new Scanner(System.in);
		 
		System.out.println("a: Intel Low End CPU Core i3 (2 cores)");
		System.out.println("Select your computer from the list above and enter the corresponding letter:");
		String CPUtype=scan.next();

			double SpeedCoreBrand=0;
			
			if (CPUtype=="a") 
			{
				System.out.println("hi");
				SpeedCoreBrand=64.00;
				System.out.println(SpeedCoreBrand);
			}
			System.out.println(CPUtype);
	 }
 }
