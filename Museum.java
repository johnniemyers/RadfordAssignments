/** 
Museum.java

Author:Johnnie Myers
Version 2015-Sep-9
*/
import java.util.Scanner;
public class Museum

{

	public static void main (String[] args)
	
	{
	
		Scanner input = new Scanner(System.in);
		
		final int youth = 18;
		final int children = 12;
		final int seniors = 65;
		final int childPrice = 0;
		final int youthPrice = 14;
		final int seniorPrice = 18;
		final int studentPrice = 14;
		final int adultPrice = 20;
		final int studentMembershipPrice = 40;
		final int membershipPrice = 75;
		String member;
		String membership;
		String student;
		
		
		System.out.println("Welcome to the Radford Museum of Fine Art!");
		System.out.println("Are you a member? (Y or N): ");
		
		member = input.next();
		
		if (member.equals("Y")) 
		{
			
			System.out.println("Your admission today will be Free.\n\n" +
			"Enjoy your day at the Radford Museum of Fine Art!"); 
		}
		else 	
		{
			
			System.out.println("Would you like to become a member today? (Y or N); ");
			membership = input.next();
			
			if (membership.equals("Y"))
			{
				
				System.out.println("Are you a Student (with valid ID)? (Y or N): ");
				student = input.next();
				
				if (student.equals("Y")) 
				{
					
					System.out.println("Your admission today will be free with your paid membership .\n\n" +
					"Your membership today is " + studentMembershipPrice + "$" +
					"\n\nEnjoy your day at the Radford Museum of Fine Art!"); 
				}
					
				else 
				{
					
					System.out.println("Your admission today will be free with your purchase of membership\n" +
					"Your membership fee is: " + membershipPrice + "$" +
					"\nEnjoy your day at the Radford Museum of Fine Art!");
					
				}
			}
			
			else 	
			{
				System.out.println("What is your age? ");
		
				int age = 0;
				age = input.nextInt();
			
				if  (age <= 12) 
				{
				
					System.out.println("Your admission today will be " + childPrice + "$\n\n" +
					"Enjoy your day at the Radford Museum of Fine Art!");
				}
				
				else if (age <= 18) 
				{
					System.out.println("Your admission today will be " + youthPrice + "$\n\n" +
					"Enjoy your day at the Radford Museum of Fine Art!");
				}
				
				else if (age >= 65) 
				{
					System.out.println("Your admission today will be " + seniorPrice + "$\n\n" +
					"Enjoy your day at the Radford Museum of Fine Art!");
				}
				
				else
				{ 
					System.out.println("Are you a student (with a valid ID)? (Y or N): ");
					student = input.next();
					
					if (student.equals("Y"))
					{
						System.out.println("Your admission today will be free " + studentPrice + "$\n\n" +
						"Enjoy your day at the Radford Museum of Fine Art!");
					}
					else 
					{
						System.out.println("Your admission today will be " + adultPrice + "$\n\n" +
						"Enjoy your day at the Radford Museum of Fine Art!");
					}
				}
			}
		}
	}
}
