package initiation;

import java.util.Random;
import java.util.Scanner;

public class devoirAlgo {

	public static void main(String[] args) {
		Game(0,0,0);
 
	}
	
	public static void Game(int even,int win,int lose) {
        int playerChoice = 0;
        while (playerChoice != 1 && playerChoice !=2 && playerChoice !=3) {
        	Scanner scanner = new Scanner(System.in);
    		System.out.println("1 for pierre,2 for feuille,3 for ciseaux");			
    		playerChoice = scanner.nextInt();
    		System.out.println(playerChoice);            
                        
        }
        System.out.println("your choice is :" + playerChoice);
        Random r = new Random();
        int low = 1;
        int high = 4;
        int computerChoice = r.nextInt(high-low) + low;
        System.out.println(computerChoice);
       
        if((playerChoice == 1 && computerChoice == 2)|| (playerChoice == 2 && computerChoice == 3) || (playerChoice == 3 && computerChoice == 1)) {
        	System.out.println("computer won");
        	lose++;
        }else if(playerChoice == computerChoice) {
        	System.out.println("even");
        	even++;
        }else{
        
        	System.out.println("you won");
        	win ++;
        }
        // {enjoying part with math
        //1(p) 2(f) 3(c)
        // 1(1th payer) - 2(2nd player) = -1  ---> 2win
        // 1 - 3 = -2  ---> 1win
        // 2 - 1 = 1  ---> 1win
        // 2 - 3 = -1  ---> 2win
        // 3 - 1 = 2  ---> 2win
        // 3 - 2 =  1  ---> 1win
        //if p1 == p2 "eaglite"
        // p1 - p2 = result
        // if result = -2 || result = 1  ---> p1 win}
        //when finish the caculate then use the result for the code As like down code
//        int result = playerChoice - computerChoice;
//        if(playerChoice == computerChoice) {
//        	System.out.println("even");
//        	even++;
//        }else if(result == -2 || result == 1) {
//        	System.out.println("you won");
//        	win ++;
//        }else {
//        	System.out.println("Computer won");
//        	lose++;
//        }
        PlayAgain(even,win,lose);
	}
	
	public static void PlayAgain(int currentEven, int currentWin, int currentLose) {
		String playAgain = "t";
        while (!playAgain.equalsIgnoreCase("y") && !playAgain.equalsIgnoreCase("n")) {
        	Scanner scanner = new Scanner(System.in);
        	System.out.println("Do you want to play again? (y/n)");		
    		playAgain = scanner.next();
    		System.out.println(playAgain);                      
        }
        if (playAgain.equalsIgnoreCase("y")) {
        	Game(currentEven, currentWin, currentLose);
		} else {
			System.out.println("Thank you for playing. Bye Bye!");
			System.out.println("You won: " + currentWin + " times");
			System.out.println("You lost: " + currentLose + " times");
			System.out.println("You were even: " + currentEven + " times");
		}
	}
}
