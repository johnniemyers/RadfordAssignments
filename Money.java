/** 
Money.java

Author:Johnnie Myers
Version 2015-Sep-9
*/
import java.util.Scanner;
public class Money

{

	public static void main (String[] args)
	
	{
	double dollarAmt = 0;
	int wholeDollar = 0;
	int cents = 0;
	int twenties = 0;
	int tens = 0;
	int fives = 0;
	int ones = 0;
	int remaining = 0;
	int quarters = 0;
	int dimes = 0;
	int nickels = 0;
	int pennies = 0;
	
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter an amount of money: $");
	
	dollarAmt = input.nextDouble();
	wholeDollar = (int) dollarAmt;
	
	twenties = wholeDollar/20;
	remaining = wholeDollar - (twenties * 20);
	tens = remaining/10;
	remaining = remaining - (tens * 10);
	fives = remaining/5;
	remaining = remaining - (fives * 5);
	ones = remaining /1;
	remaining = remaining - (ones * 1);
	
	dollarAmt = dollarAmt * 100;
	wholeDollar = wholeDollar * 100;
	cents = (int) dollarAmt - wholeDollar;
	
	quarters = cents/25;
	remaining = cents - (25 * quarters);
	dimes = remaining/10;
	remaining = remaining - (10 * dimes);
	nickels = remaining/05;
	remaining = remaining - (05 * nickels);
	pennies = remaining/01;
	
	dollarAmt = dollarAmt / 100;
	
	System.out.println("\n");
	
	System.out.println("$" + dollarAmt + 
	" dollars is:\n\n\t" +twenties + 
	" twenty dollar bills\n\t" + tens +
	" ten dollar bills\n\t" + fives + " five dollar" +
	"bills\n\t" + ones + " one dollar bills\n\t" + 
	quarters + " quarters\n\t" + dimes + " dimes\n\t" +
	nickels + " nickels\n\t" + pennies + " pennies");
	}
}
