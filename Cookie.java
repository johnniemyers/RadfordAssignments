import java.util.Scanner;
public class Cookie

{

	public static void main (String[] args)
	
	{
		Scanner input = new Scanner(System.in);
		
		int batches = 0;
		int flourCupsNeeded = 0;
		int sugarCupsNeeded = 0;
		int butterCupsNeeded = 0;
		int eggsNeeded = 0;
		int flourOuncesNeeded = 0;
		int sugarOuncesNeeded = 0;
		int butterSticksNeeded = 0;
		int dozensOfEggsNeeded = 0;
		int flourPoundsNeeded = 0;
		int sugarPoundsNeeded = 0;
		int butterPoundsNeeded = 0;
		final int flourCupsPerBatch = 3;
		final int sugarCupsPerBatch = 2;
		final int butterCupsPerBatch = 1;
		final int eggsPerBatch = 2;
		final int ouncesPerpound = 16;
		final int ouncesPerFlourCup = 5;
		final int ouncesPerSugarCup = 7;
		final int sticksPerButterCup = 2;
		final int sticksPerButterPound = 4;
		final int eggsPerDozen = 12;
		
		
		System.out.println("One recipe for a batch of cookies calls for:\n" +
		"         3 cups of flour\n         2 cups of sugar\n" +
		"         1cup of butter\n         2 eggsn");
		
		System.out.println("How many batches of cookies will you be making? ");
		
		batches = input.nextInt();
		
		flourCupsNeeded = batches * flourCupsPerBatch;
		sugarCupsNeeded = batches * sugarCupsPerBatch;
		butterCupsNeeded = batches * butterCupsPerBatch;	
		eggsNeeded = batches * eggsPerBatch;
		
		flourOuncesNeeded = flourCupsNeeded * ouncesPerFlourCup;
		sugarOuncesNeeded = sugarCupsNeeded * ouncesPerSugarCup;
		butterSticksNeeded = butterCupsNeeded * sticksPerButterCup;
		
		
		flourPoundsNeeded = flourOuncesNeeded / ouncesPerpound;
		sugarPoundsNeeded = sugarOuncesNeeded / ouncesPerpound;
		butterPoundsNeeded = butterSticksNeeded / sticksPerButterPound;
		dozensOfEggsNeeded = eggsNeeded / eggsPerDozen;
		
		flourOuncesNeeded = flourOuncesNeeded - (flourPoundsNeeded * ouncesPerpound);
		sugarOuncesNeeded = sugarOuncesNeeded - (sugarPoundsNeeded * ouncesPerpound);
		butterSticksNeeded = butterSticksNeeded - (butterPoundsNeeded * sticksPerButterPound);
		eggsNeeded = eggsNeeded - (dozensOfEggsNeeded * eggsPerDozen);
		
		System.out.println("You will need:\n\n" +
		flourPoundsNeeded + " pounds and " + flourOuncesNeeded +
		" ounces of flour\n" + sugarPoundsNeeded + " pounds of sugar and " +
		sugarOuncesNeeded + " ounces of sugar\n" + butterPoundsNeeded +
		" pounds of butter and " + butterSticksNeeded + " sticks of butter\n" +
		dozensOfEggsNeeded + " dozen plus " + eggsNeeded + " eggs");
	}
}
