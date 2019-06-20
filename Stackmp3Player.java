import java.util.Scanner;
import java.util.Stack;

public class Stackmp3Player {
	
	//Create album
	final static String[] MFDoom = new String[] {"Beef Rap", "Hoe Cakes", "Potholderz", "One Beer", 	
			"Deep Fried Frenz", "Poo-Putt Platter", "Fillet-O-Rapper", "Gumbo", 
			"Fig Leaf Bi-Carbonate", "Kon Karne", 	"Guinnesses", "Kon Queso", 
			"Rapp Snitch Knishes", "VomitSpit", "Kookies"};
	
	
	
	private static void Mp3Player() {
		
		Stack<String> Mp3Player = new Stack<String>();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Track number you would like to listen to: ");
		
		try {
		int Tracknum = sc.nextInt();
		
		for ( int i = Tracknum; i < MFDoom.length; i++) {
			
			Mp3Player.push(MFDoom[i]); //Doing this through Stack and not the array makes the time complexity much smoother since it only processes one iteration at a time
		
			
		}
		
		
		System.out.println();
		System.out.println("Current song: ");
		System.out.println(MFDoom[Tracknum-1] + " by MF Doom");
		System.out.println();
		System.out.println("Previous song: ");
		System.out.println(MFDoom[Tracknum-2] + " by MF Doom");
		System.out.println();
		System.out.println("Up Next: ");
		System.out.println(Mp3Player); //Will print all songs after the chosen one in the stack
		
		
		}catch (Exception e) {
			
			System.out.println("Not a valid song");
		}
		
		
		//Create next song option
		sc.close();
		
	}
	
	private static void nextSong() {
		
		
		
	}
	
	
	private static void previousSong() {
		
		
	}

	public static void main(String[] args) {
		
		
		Mp3Player();
		
		

	}

}
