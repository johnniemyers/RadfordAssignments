/** 
StoryDriver.java

Author:Johnnie Myers
Version 2015-Sep-8
*/
import java.util.Scanner;
public class Relay2

{

	public static void main (String[] args)
	
	{
	
	Scanner StoryDriver = new Scanner(System.in);
	
		String color;
		String liquid;
		String pluralNoun1;
		String adjective1;
		String presentTenseVerb1;
		String pluralNoun2;
		String singularNoun1;
		String adjective2;
		String presentTenseVerb2;
		String presentTenseVerb3;
		String singularNoun2;
		
		System.out.println("Hello Welcome "
		+ "to the Wacky Web Tales Java " 
		+ "Application. Please fill in a "
		+ "few blanks and then you can view "
		+ "your Wacky Web Tale!")
		
		System.out.print("Color: ");
		color = StoryDriver.nextLine();
		
		System.out.print("Liquid: ");
		liquid = StoryDriver.nextLine();
		
		System.out.println("Plural Noun: ");
		pluralNoun1 = StoryDriver.nextLine();
		
		System.out.println("Adjective: ");
		adjective1 = StoryDriver.nextLine();
	
		System.out.println("Present Tense Verb: ");
		presentTenseVerb1 = StoryDriver.nextLine();
		
		System.out.println("Plural Noun: ");
		pluralNoun2 = StoryDriver.nextLine();
		
		System.out.println("Singular Noun: ");
		singularNoun1 = StoryDriver.nextLine();
		
		System.out.println("Adjective: ");
		adjective2 = StoryDriver.nextLine();
		
		System.out.println("Present Tense Verb: ");
		presentTenseVerb2 = StoryDriver.nextLine();
		
		System.out.println("Present Tense Verb: ");
		presentTenseVerb3 = StoryDriver.nextLine();
		
		System.out.println("Singular Noun: ");
		singularNoun2 = StoryDriver.nextLine();
		
		System.out.print("Each spring, the sky turns " + 
		color + ". Giant drops of " + liquid + " fall from " +
		"the sky. All this " + liquid + " helps the grass " + "
		"and the " + pluralNoun1 + " to grow, but it can make " +
		"things really " + adjective1 + " too. Some places get " + 
		"so much " + liquid ", that rivers " + presentTenseVerb1 + 
		" into the streets. Driving can be tricky when this happens, " + 
		"so some people put special " + pluralNoun2 + "on their cars. " + "
		"And when the liquid is falling, don't forget your " + 
		singularNoun1 +". Otherwise, your feet might get " + adjective2 + 
		"if you " + presentTenseVerb2 + "in puddles! After all the " + 
		liquid + "has fallen, the skies begin to " + presentTenseVerb3 +
		". If you are lucky, you might see a huge " +singularNoun2 +
		"stretched across the sky.")
	}
}
