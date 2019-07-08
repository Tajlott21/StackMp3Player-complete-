package MP3Project;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Stackmp3Player {
	
	//Create album
	final static String[] MFDoom = new String[] {"Beef Rap", "Hoe Cakes", "Potholderz", "One Beer", 	
			"Deep Fried Frenz", "Poo-Putt Platter", "Fillet-O-Rapper", "Gumbo", 
			"Fig Leaf Bi-Carbonate", "Kon Karne", 	"Guinnesses", "Kon Queso", 
			"Rapp Snitch Knishes", "VomitSpit", "Kookies"};
	
	static Stack<String> Mp3Player = new Stack<String>();
	
	static int Tracknum;
	
	
	
	protected static void Mp3Player() {
		
		System.out.println("Welcome to the Stack Mp3Player!");
		System.out.println();
		System.out.println("Your current album: " + "Mm..Food by MFDoom");
		System.out.println();
		System.out.println("Songlist: " + Arrays.toString(MFDoom));
		System.out.println();
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Track number you would like to listen to: ");
		
		try {
		int Tracknum = sc.nextInt();
		
		for ( int i = Tracknum; i < MFDoom.length; i++) {
			
			Mp3Player.push(MFDoom[i]); //Doing this through Stack and not the array makes the time complexity much smoother since it only processes one iteration at a time
		
			
		}
		
		displaySong(Tracknum);
		
		
		}catch (Exception e) {
		
			
			System.out.println("Not a valid song. Please Try Again");
			System.out.println();
			System.out.println();
			System.out.println();
			Mp3Player();
		}
		
		
		
		//Create next song option
		sc.close();
		
	}
	
	
	protected static void displaySong(int Tracknum) {
		
		
		/* This if statement will trigger right before the array goes out of bounds. 
		 * This will allow the user to listen to "Beef Rap" if their current option is "Hoe Cakes"
		 * as opposed to getting an ArrayOutOfBounds Error
		
		*/
		

		
		
		if (Tracknum == 1) {
			
			System.out.println();
			System.out.println("Current song: " + MFDoom[Tracknum-1] + " by MF Doom");  //Minus one because array naturally starts at 0. Obviously, this is not conducive to music so I made it so that their chosen Track is equal to the proper index on the array, so that Track 1 is actually Track 0 and so on.
			System.out.println();
			System.out.println("This is the most previous song within this album");
			System.out.println();
			System.out.println("Up Next: ");
			System.out.println(Mp3Player); //Will print all songs after the chosen one in the stack
			System.out.println();
			userChoice(Tracknum);
			
		}else if (Tracknum == 15) {
			

			System.out.println();
			System.out.println("Current song: " + MFDoom[Tracknum-1] + " by MF Doom");  //Minus one because array naturally starts at 0. Obviously, this is not conducive to music so I made it so that their chosen Track is equal to the proper index on the array, so that Track 1 is actually Track 0 and so on.
			System.out.println();
			System.out.println("Previous song: " + MFDoom[Tracknum-2] + " by MF Doom");
			System.out.println();
			System.out.println("Up Next: ");
			System.out.println("This is the last song within this album"); //Will print all songs after the chosen one in the stack
			System.out.println();
			userChoice(Tracknum);
		}
				
				
			
			
		else {
		
		System.out.println();
		System.out.println("Current song: " + MFDoom[Tracknum-1] + " by MF Doom");  //Minus one because array naturally starts at 0. Obviously, this is not conducive to music so I made it so that their chosen Track is equal to the proper index on the array, so that Track 1 is actually Track 0 and so on.
		System.out.println();
		System.out.println("Previous song: " + MFDoom[Tracknum-2] + " by MF Doom");
		System.out.println();
		System.out.println("Up Next: ");
		System.out.println(Mp3Player); //Will print all songs after the chosen one in the stack
		System.out.println();
		userChoice(Tracknum);
		
		
		}
		
		
	}
	
	protected static void userChoice(int Tracknum) {
		
		
		Scanner s = new Scanner(System.in);
		System.out.println("Press 1 to play previous song  " + "Press 2 to play next song");
		System.out.println("Press 3 to play repeat song  " + "Press 4 to exit program");
		System.out.print("Your Choice: ");
	
		
		try {
			
			int userSelection = s.nextInt();
			
			if (userSelection == 1) {
				
				System.out.println(Tracknum);
				
				previousSong(Tracknum);
			}
			
			else if (userSelection == 2) {
				
				nextSong(Tracknum);
			}
			
			else if (userSelection == 3) {
				
				displaySong(Tracknum);
			}
			
			else if (userSelection == 4) {
				
				
				System.out.println("Thank you for using the StackMp3Player!");
				System.exit(0);
			}
			
		}catch (Exception e) {
			
			System.out.println("Not a valid selection. Please Try Again");
			System.out.println();
			System.out.println();
			Mp3Player();
		}
		
		s.close();
	}
	
	protected static void nextSong(int Tracknum) {
		

		//This will erase the stack, and the next loop will replace the stack

		for ( int i = Tracknum; i< MFDoom.length; i++) {
			
			Mp3Player.pop();
			
		}
		
		Tracknum++;
		

		
		for ( int i = Tracknum; i< MFDoom.length; i++) {
			
			Mp3Player.push(MFDoom[i]); //Doing this through Stack and not the array makes the time complexity much smoother since it only processes one iteration at a time
			
		}
		
		
		displaySong(Tracknum);
		
		
		
	}
	
	
	protected static void previousSong(int Tracknum) {
		
		//This will erase the stack, and the next loop will replace the stack

		for ( int i = Tracknum; i< MFDoom.length; i++) {
			
			Mp3Player.pop();
			
		}
		
		Tracknum--;
		
		
		for ( int i = Tracknum; i< MFDoom.length; i++) {
			
			Mp3Player.push(MFDoom[i]); //Doing this through Stack and not the array makes the time complexity much smoother since it only processes one iteration at a time
			
		}
		
			
		displaySong(Tracknum);
		
		}
	

	public static void main(String[] args) {
		
		
		Mp3Player();
		
		

	}

}
