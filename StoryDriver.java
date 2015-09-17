/** 
StoryDriver.java

Author:Johnnie Myers
Version 2015-Sep-8
*/
import java.util.Scanner;
public class StoryDriver

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
		
		System.out.println("");
			
		System.out.println("Hello Welcome "
		+ "to the Wacky Web Tales Java " 
		+ "Application.\nPlease fill in a "
		+ "few blanks and then you can view "
		+ "your Wacky Web Tale!");
		
		System.out.println("");
		
		System.out.print("Color: ");
		color = StoryDriver.nextLine();
		
		System.out.println("");
		
		System.out.print("Liquid: ");
		liquid = StoryDriver.nextLine();
		
		System.out.println("");
		
		System.out.print("Plural Noun: ");
		pluralNoun1 = StoryDriver.nextLine();
		
		System.out.println("");
		
		System.out.print("Adjective: ");
		adjective1 = StoryDriver.nextLine();
		
		System.out.println("");
	
		System.out.print("Present Tense Verb: ");
		presentTenseVerb1 = StoryDriver.nextLine();
		
		System.out.println("");
		
		System.out.print("Plural Noun: ");
		pluralNoun2 = StoryDriver.nextLine();
		
		System.out.println("");
		
		System.out.print("Singular Noun: ");
		singularNoun1 = StoryDriver.nextLine();
		
		System.out.println("");
		
		System.out.print("Adjective: ");
		adjective2 = StoryDriver.nextLine();
		
		System.out.println("");
		
		System.out.print("Present Tense Verb: ");
		presentTenseVerb2 = StoryDriver.nextLine();
		
		System.out.println("");
		
		System.out.print("Present Tense Verb: ");
		presentTenseVerb3 = StoryDriver.nextLine();
		
		System.out.println("");
		
		System.out.print("Singular Noun: ");
		singularNoun2 = StoryDriver.nextLine();
		
		System.out.println("");
		
		System.out.print("The Sky Is Falling!\n\nEach spring, the sky turns " + 
		color + ". Giant drops of " + liquid + " fall from " +
		"the sky. \nAll this " + liquid + " helps the grass " +
		"and the " + pluralNoun1 + " to grow, but it can make \n" +
		"things really " + adjective1 + " too.\n\nSome places get " + 
		"so much " + liquid + ", that rivers " + presentTenseVerb1 + 
		"\ninto the streets. Driving can be tricky when this happens, " + 
		"\nso some people put special " + pluralNoun2 + " on their cars.\n\n" + 
		"And when the liquid is\nfalling, don't forget your " + 
		singularNoun1 +". Otherwise, your feet might get " + adjective2 + 
		" \nif you " + presentTenseVerb2 + " in puddles!\n\nAfter all the " + 
		liquid + " has fallen, the skies begin to " + presentTenseVerb3 +
		".\nIf you are lucky, you might see a huge " +singularNoun2 +
		" stretched across the sky.");
		
		System.out.println("");
	}
}
